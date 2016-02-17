package cheng.lib.util;

import org.apache.commons.lang3.StringUtils;

public class ClassUtil {

	private static ClassUtil classUtil = new ClassUtil();
	public static ClassUtil getInstance(){
		if(classUtil==null){
			classUtil = new ClassUtil();
		}
		return classUtil ;
	}

	public static Class initClass1(String classname){
		try {
			if(StringUtils.isEmpty(classname)){
				return null;
			}
			return Class.forName(classname);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static <T> T initClass(Class<T> classs){
		try {
			return classs.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static Object initClass(String classname){
		try {
			if(StringUtils.isEmpty(classname)){
				return null;
			}
			return initClass1(classname).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
