/**        
 * Copyright (c) 2013 by 苏州科大国创信息技术有限公司.    
 */
package com.github.diamond.client;

import com.github.diamond.client.config.ConfigurationInterpolator;
import com.github.diamond.client.config.PropertiesReader;
import com.github.diamond.client.config.PropertyConverter;
import com.github.diamond.client.event.EventSource;
import com.github.diamond.client.event.EventType;
import com.github.diamond.client.netty.ClientChannelInitializer;
import com.github.diamond.client.netty.Netty4Client;
import com.github.diamond.client.util.FileUtils;
import com.github.diamond.client.util.NamedThreadFactory;
import com.github.diamond.server.Constants;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.text.StrLookup;
import org.apache.commons.lang.text.StrSubstitutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Create on @2013-8-25 @下午1:17:38
 * 
 * @author bsli@ustcinfo.com
 */
public class PropertiesConfiguration extends EventSource {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesConfiguration.class);

	private StrSubstitutor substitutor;
	
	private Map<String, String> store = null;
	
	private Netty4Client client;
	
	private volatile boolean reloadable = true;
	
	private static final ExecutorService reloadExecutorService = Executors.newSingleThreadExecutor(new NamedThreadFactory("ReloadConfigExecutorService", true));
	
	public static void main(String[] args) {
		PropertiesConfiguration p = new PropertiesConfiguration("127.0.0.1", 8283, "cheng", "production");
	}
	
	protected PropertiesConfiguration() {
		substitutor = new StrSubstitutor(createInterpolator());
	}

	/**
	 * 从jvm参数中获取 host和port值
	 * 
	 * @param projCode
	 * @param profile
	 */
	public PropertiesConfiguration(final String projCode, final String profile) {
		String host = getHost();
		int port = getPort();
		
		connectServer(host, port, projCode, profile);
		substitutor = new StrSubstitutor(createInterpolator());
	}
	
	public PropertiesConfiguration(String host, int port, final String projCode, final String profile) {
		connectServer(host, port, projCode, profile);
		substitutor = new StrSubstitutor(createInterpolator());
	}
	
	protected void connectServer(String host, int port, final String projCode, final String profile) {
		final String clientMsg = "superdiamond," + projCode + "," + profile;
		try {
			client = new Netty4Client(host, port, new ClientChannelInitializer(clientMsg));
			
			if(client.isConnected()) {
				String message = client.receiveMessage();
				
				if(message != null) {
					String versionStr = message.substring(0, message.indexOf(Constants.PROFILE_separator));
					LOGGER.info("加载配置信息，项目编码："+projCode+"，Profile："+profile+", Version："+ versionStr.split(" = ")[1]);
					
					FileUtils.saveData(projCode, profile, message);
					load(new StringReader(message), false);
				}
			} else {
				String message = FileUtils.readConfigFromLocal(projCode, profile);
				if(message != null) {
					String versionStr = message.substring(0, message.indexOf(Constants.PROFILE_separator));
					LOGGER.info("加载本地备份配置信息，项目编码："+projCode+"，Profile："+profile+", Version："+ versionStr.split(" = ")[1]);
					
					load(new StringReader(message), false);
				} else
					throw new ConfigurationRuntimeException("本地没有备份配置数据，PropertiesConfiguration 初始化失败。");
			}
			
			reloadExecutorService.submit(new Runnable() {
				
				public void run() {
					while(reloadable) {
						try {
							if(client.isConnected()) {
								String message = client.receiveMessage();
								LOGGER.info("重新加载配置信息:"+message);
								if(message != null) {
									String versionStr = message.substring(0, message.indexOf(Constants.PROFILE_separator));
//									LOGGER.info("重新加载配置信息，项目编码："+projCode+"，Profile："+profile+", Version："+ versionStr.split(" = ")[1]);
									FileUtils.saveData(projCode, profile, message);
									load(new StringReader(message), true);
								}
							} else {
								TimeUnit.SECONDS.sleep(1);
							}
						} catch(Exception e) {
							
						}
					}
				}
			});
		} catch (Exception e) {
			if(client != null) {
				client.close();
			}
			throw new ConfigurationRuntimeException(e.getMessage(), e);
		}
	}
	
	public void close() {
		reloadable = false;
		
		if(client != null && client.isConnected())
			client.close();
	}
	
	public void load(String config) throws ConfigurationRuntimeException {
		load(new StringReader(config), false);
	}
	
	/**
	 * 加载配置文件
	 * 
	 * @param in
	 * @param reload 初次初始化加载为false，服务端推送加载为true。
	 * @throws Exception
	 */
	public void load(Reader in, boolean reload) throws ConfigurationRuntimeException {
		Map<String, String> tmpStore = new LinkedHashMap<String, String>();
		PropertiesReader reader = new PropertiesReader(in);
		try {
			while (reader.nextProperty()) {
				String key = reader.getPropertyName();
				String value = reader.getPropertyValue();
				tmpStore.put(key, value);
				if(reload) {
					String oldValue = store.remove(key);
					if(oldValue == null)
						fireEvent(EventType.ADD, key, value);
					else if(!oldValue.equals(value)) 
						fireEvent(EventType.UPDATE, key, value);
				}
			}
			if(reload) {
				for(String key : store.keySet()) {
					fireEvent(EventType.CLEAR, key, store.get(key));
				}
			}
		} catch (IOException ioex) {
			throw new ConfigurationRuntimeException(ioex);
		} finally {
			try {
				reader.close();
			} catch (IOException e) { }
		}
		if(store != null)
			store.clear();
		store = tmpStore;
	}
	
	private String getHost() {
		String value = System.getenv("SUPERDIAMOND_HOST");
		if(StringUtils.isBlank(value)) {
			return System.getProperty("superdiamond.host", "localhost");
		} else {
			return value;
		}
	}
	
	private int getPort() {
		String value = System.getenv("SUPERDIAMOND_PORT");
		if(StringUtils.isBlank(value)) {
			return Integer.valueOf(System.getProperty("superdiamond.port", "8283"));
		} else {
			return Integer.valueOf(value);
		}
	}
	
	// --------------------------------------------------------------------
	
	private String getProperty(String key) {
		return store.get(key);
	}
	
	public Properties getProperties() {
		Properties properties = new Properties();
		
		for(String key : store.keySet()) {
			properties.setProperty(key, getString(key));
		}
		return properties;
	}

	public boolean getBoolean(String key) {
		Boolean b = getBoolean(key, null);
		if (b != null) {
			return b.booleanValue();
		} else {
			throw new NoSuchElementException('\'' + key + "' doesn't map to an existing object");
		}
	}

	public boolean getBoolean(String key, boolean defaultValue) {
		return getBoolean(key, BooleanUtils.toBooleanObject(defaultValue))
				.booleanValue();
	}

	public Boolean getBoolean(String key, Boolean defaultValue) {
		String value = getProperty(key);

		if (value == null) {
			return defaultValue;
		} else {
			try {
				return PropertyConverter.toBoolean(interpolate(value));
			} catch (ConversionException e) {
				throw new ConversionException('\'' + key + "' doesn't map to a Boolean object", e);
			}
		}
	}

	public byte getByte(String key) {
		Byte b = getByte(key, null);
		if (b != null) {
			return b.byteValue();
		} else {
			throw new NoSuchElementException('\'' + key + " doesn't map to an existing object");
		}
	}

	public byte getByte(String key, byte defaultValue) {
		return getByte(key, new Byte(defaultValue)).byteValue();
	}

	public Byte getByte(String key, Byte defaultValue) {
		String value = getProperty(key);

		if (value == null) {
			return defaultValue;
		} else {
			try {
				return PropertyConverter.toByte(interpolate(value));
			} catch (ConversionException e) {
				throw new ConversionException('\'' + key + "' doesn't map to a Byte object", e);
			}
		}
	}

	public double getDouble(String key) {
		Double d = getDouble(key, null);
		if (d != null) {
			return d.doubleValue();
		} else {
			throw new NoSuchElementException('\'' + key
					+ "' doesn't map to an existing object");
		}
	}

	public double getDouble(String key, double defaultValue) {
		return getDouble(key, new Double(defaultValue)).doubleValue();
	}

	public Double getDouble(String key, Double defaultValue) {
		String value = getProperty(key);

		if (value == null) {
			return defaultValue;
		} else {
			try {
				return PropertyConverter.toDouble(interpolate(value));
			} catch (ConversionException e) {
				throw new ConversionException('\'' + key + "' doesn't map to a Double object", e);
			}
		}
	}

	public float getFloat(String key) {
		Float f = getFloat(key, null);
		if (f != null) {
			return f.floatValue();
		} else {
			throw new NoSuchElementException('\'' + key + "' doesn't map to an existing object");
		}
	}

	public float getFloat(String key, float defaultValue) {
		return getFloat(key, new Float(defaultValue)).floatValue();
	}

	public Float getFloat(String key, Float defaultValue) {
		String value = getProperty(key);

		if (value == null) {
			return defaultValue;
		} else {
			try {
				return PropertyConverter.toFloat(interpolate(value));
			} catch (ConversionException e) {
				throw new ConversionException('\'' + key + "' doesn't map to a Float object", e);
			}
		}
	}

	public int getInt(String key) {
		Integer i = getInteger(key, null);
		if (i != null) {
			return i.intValue();
		} else {
			throw new NoSuchElementException('\'' + key + "' doesn't map to an existing object");
		}
	}

	public int getInt(String key, int defaultValue) {
		Integer i = getInteger(key, null);

		if (i == null) {
			return defaultValue;
		}

		return i.intValue();
	}

	public Integer getInteger(String key, Integer defaultValue) {
		String value = getProperty(key);

		if (value == null) {
			return defaultValue;
		} else {
			try {
				return PropertyConverter.toInteger(interpolate(value));
			} catch (ConversionException e) {
				throw new ConversionException('\'' + key + "' doesn't map to an Integer object", e);
			}
		}
	}

	public long getLong(String key) {
		Long l = getLong(key, null);
		if (l != null) {
			return l.longValue();
		} else {
			throw new NoSuchElementException('\'' + key + "' doesn't map to an existing object");
		}
	}

	public long getLong(String key, long defaultValue) {
		return getLong(key, new Long(defaultValue)).longValue();
	}

	public Long getLong(String key, Long defaultValue) {
		String value = getProperty(key);

		if (value == null) {
			return defaultValue;
		} else {
			try {
				return PropertyConverter.toLong(interpolate(value));
			} catch (ConversionException e) {
				throw new ConversionException('\'' + key + "' doesn't map to a Long object", e);
			}
		}
	}

	public short getShort(String key) {
		Short s = getShort(key, null);
		if (s != null) {
			return s.shortValue();
		} else {
			throw new NoSuchElementException('\'' + key + "' doesn't map to an existing object");
		}
	}

	public short getShort(String key, short defaultValue) {
		return getShort(key, new Short(defaultValue)).shortValue();
	}

	public Short getShort(String key, Short defaultValue) {
		String value = getProperty(key);

		if (value == null) {
			return defaultValue;
		} else {
			try {
				return PropertyConverter.toShort(interpolate(value));
			} catch (ConversionException e) {
				throw new ConversionException('\'' + key + "' doesn't map to a Short object", e);
			}
		}
	}

	public String getString(String key) {
		String s = getString(key, null);
		if (s != null) {
			return s;
		} else {
			return null;
		}
	}

	public String getString(String key, String defaultValue) {
		String value = getProperty(key);

		if (value instanceof String) {
			return interpolate((String) value);
		} else {
			return interpolate(defaultValue);
		}
	}

	protected String interpolate(String value) {
		Object result = substitutor.replace(value);
		return (result == null) ? null : result.toString();
	}

	protected ConfigurationInterpolator createInterpolator() {
        ConfigurationInterpolator interpol = new ConfigurationInterpolator();
        interpol.setDefaultLookup(new StrLookup()
        {
            @Override
            public String lookup(String var)
            {
            	String prop = getProperty(var);
                return (prop != null) ? prop : null;
            }
        });
        return interpol;
    }
}
