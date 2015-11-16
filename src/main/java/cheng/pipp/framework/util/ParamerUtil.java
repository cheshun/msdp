package cheng.pipp.framework.util;

import cheng.lib.util.PropertiesHelper;
import com.github.diamond.client.PropertiesConfiguration;

import java.io.IOException;



public class ParamerUtil extends PropertiesConfiguration {
	private static ParamerUtil instance = null;
	public static  ParamerUtil getInstance() {
		synchronized(ParamerUtil.class) {if (instance == null) {
			String[] config = getConfig();
			instance = new ParamerUtil(config[0],config[1]);
		}}
		return instance;
	}
	public ParamerUtil(final String projCode, final String profile) {
		super(projCode, profile);
	}
	public static String [] getConfig() {
		PropertiesHelper propHelper;
		try {
			propHelper = new PropertiesHelper(ParamerUtil.class.getResourceAsStream("/superdiamond.properties"));
			String projectCode = propHelper.getValue("projectCode");
			String profile = propHelper.getValue("profile");
			return new String[]{projectCode,profile};
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
