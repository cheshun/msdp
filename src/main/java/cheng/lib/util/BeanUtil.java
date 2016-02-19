package cheng.lib.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

import cheng.lib.util.ClassUtil;
import cheng.lib.lang.SuperModel;
import com.alibaba.fastjson.JSON;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 希望有这么一个工具
 * 1 能够将map<String,Object> 转换 bean
 * 2 如果 对于字段的值和类型不一样 不进行转换 且 bean中的字段值有字段类型默认值进行填充
 * 3 只对bean 中的private 字段进行设置
 */
public class BeanUtil {
	protected static Logger logger = LoggerFactory.getLogger(BeanUtil.class);

	/**
	 * map 转 Bean
	 * 如果 map里对于字段的值和model里对应字段的值不是用一类型会提示类型转换错误
	 * @param map
	 * @param cls
	 * @return
	 */
	@Deprecated
	public static Object strMapToBean(Map<String, String> map, Class cls) {
		return JSON.parseObject(JSON.toJSONString(map), cls);
	}

	// Map --> Bean 2: 利用org.apache.commons.beanutils 工具类实现 Map --> Bean
	public static <T> T objMapToBean(Map<String, Object> map, Class<T> cls) {
		if (map == null || cls == null) {
			return null;
		}
		T obj = ClassUtil.initClass(cls);
		try {
			BeanUtils.populate(obj, map);
			return obj ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null ;
	}
//	public static SuperModel[] mapToBeanArray(List<Map<String,Object>> maps, Class modelclass) {
//		SuperModel[]  rdata = new SuperModel[maps.size()];
//		for(int i=0;i<maps.size();i++){
//			SuperModel superModel = (SuperModel)ClassUtil.initClass(modelclass);
//			transMap2Bean(maps.get(i),superModel );
//			rdata[i] =superModel;
//		}
//		return rdata;
//	}
//	public static List<SuperModel> mapToBeanList(List<Map<String,Object>> maps, Class modelclass) {
//		SuperModel[] superModels  = mapToBeanArray(maps,modelclass);
//		return Arrays.asList(superModels);
//	}
	public static Map<String, Object> getValueMap(Object obj) {
		Map<String, Object> map = new HashMap<String, Object>();
		// System.out.println(obj.getClass());
		// 获取f对象对应类中的所有属性域
		Field[] fields = obj.getClass().getDeclaredFields();
		for (int i = 0, len = fields.length; i < len; i++) {
			if(!Modifier.isPrivate(fields[i].getModifiers()) ){
				continue;
			}
			if(Modifier.isStatic(fields[i].getModifiers())){
				continue;
			}
			String varName = fields[i].getName();
			try {
				// 获取原来的访问控制权限
				boolean accessFlag = fields[i].isAccessible();
				// 修改访问控制权限
				fields[i].setAccessible(true);
				// 获取在对象f中属性fields[i]对应的对象中的变量
				Object o = fields[i].get(obj);
				if (o != null)
					map.put(varName, o);
				// System.out.println("传入的对象中包含一个如下的变量：" + varName + " = " + o);
				// 恢复访问控制权限
				fields[i].setAccessible(accessFlag);
			} catch (IllegalArgumentException ex) {
				ex.printStackTrace();
			} catch (IllegalAccessException ex) {
				ex.printStackTrace();
			}
		}
		return map;
	}


	public static Map<String, String> getDataTypes(Class modelclass) {
		SuperModel superModel = (SuperModel)ClassUtil.initClass(modelclass);
		Field[] fields = superModel.getClass().getDeclaredFields();
		for (int i = 0, len = fields.length; i < len; i++) {
			if(!Modifier.isPrivate(fields[i].getModifiers()) ){
				continue;
			}
			if(Modifier.isStatic(fields[i].getModifiers())){
				continue;
			}
			String varName = fields[i].getName();
			Class<?> type = fields[i].getType();
		}
		return null ;
	}

	// Bean --> Map 1: 利用Introspector和PropertyDescriptor 将Bean --> Map
	public static Map<String, Object> transBean2Map(Object obj) {
		if(obj == null){
			return null;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor property : propertyDescriptors) {
				String key = property.getName();
				// 过滤class属性
				if (!key.equals("class")) {
					// 得到property对应的getter方法
					Method getter = property.getReadMethod();
					Object value = getter.invoke(obj);
					map.put(key, value);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;

	}
}
