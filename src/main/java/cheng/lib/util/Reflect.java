package cheng.lib.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Reflect {

	private Object object;
	/**
	 * 方法类型：get方法
	 */
	public static final int METHODType_GET = 1;
	/**
	 * 方法类型：set方法
	 */
	public static final int METHODType_SET = 0;

	public Reflect(Object object) {
		this.object = object;
	}

	/**
	 * 得到一个对象的各个字段及其值
	 * 
	 * @return 一个装有字段和值的map ， 字段和她的值一一对应
	 */
	public Map<String, Object> getFieldNameAndValue() {
		// 得到对象的各个字段
		Set<String> fieldNameSet = getFieldName();
		// 定义一个装字段及其值的map
		Map<String, Object> filedAndValue = new HashMap<String, Object>();
		Iterator<String> it = fieldNameSet.iterator();
		try {
			while (it.hasNext()) {
				/*
				 * 通过反射取得对象各个字段的值，并将他们撞到map中，字段名和值一一对应
				 */
			
				String filedName = it.next();
				Method method = object.getClass().getMethod(
						getMethodByFieldName(METHODType_GET, filedName));
				Class<?> returnType = method.getReturnType();
				if (returnType.getName().equals("java.lang.String")) {
					String returnValue = (String) method.invoke(object);
					filedAndValue.put(filedName, returnValue);
				} else if (returnType.getName().equals("int")) {
					Integer returnValue = (Integer) method.invoke(object);
					filedAndValue.put(filedName, returnValue);
				} else if (returnType.getName().equals("java.lang.Boolean")) {
					Boolean returnValue = (Boolean) method.invoke(object);
					filedAndValue.put(filedName, returnValue);
				} else if (returnType.getName().equals("java.lang.Integer")) {
					Integer returnValue = (Integer) method.invoke(object);
					filedAndValue.put(filedName, returnValue);
				} else if (returnType.getName().equals("boolean")) {
					Boolean returnValue = (Boolean) method.invoke(object);
					filedAndValue.put(filedName, returnValue);
				}
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return filedAndValue;
	}

	/**
	 * 将一个装有各个字段名及其值的map解析成一个对象
	 * 
	 * @param object
	 *            解析成的对象
	 * @param fieldValue
	 *            装有装有各个字段名及其值的map
	 */
	public Object setFieldNameAndValue(Object object,
			Map<String, Object> fieldValue) {
		try {
			/*
			 * 通过反射将map中值装到一个对象中
			 */
			Class<?> classType = object.getClass();
			Field[] fieldNames = object.getClass().getDeclaredFields();
			Method[] methods = object.getClass().getDeclaredMethods();
			
			for (int i = 0; i < fieldNames.length; i++) {
				String fieldName = fieldNames[i].getName();
				Object fieldvalue = fieldValue.get(fieldName);
				String methodName = getMethodByFieldName(METHODType_SET, fieldName);
				if(!methodexist(methodName,methods)){
					continue ;
				}
				if(fieldvalue==null){
					continue ;
				}
				//2011-9-26 修改过
				if (fieldNames[i].getType().getName().equals("int")) {
					Integer value = new Integer(fieldvalue.toString());
					Method setMethod = classType.getMethod(methodName,
							new Class[] { fieldNames[i].getType() });
					setMethod.invoke(object, new Object[] { value });
				} else {
					Method setMethod = classType.getMethod(methodName,
							new Class[] { fieldNames[i].getType() });
					setMethod.invoke(object, new Object[] {fieldvalue });
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;

	}

	private boolean methodexist(String methodName, Method[] methods) {
		for(int i=0;i<methods.length;i++){
			if(methodName.equals(methods[i].getName())){
				return true ;
			}
		}
		return false;
	}

	/**
	 * 得到一个实体对象的字段名
	 * 
	 * @return 各个字段名
	 */
	public Set<String> getFieldName() {
		Field[] fieldNames = object.getClass().getDeclaredFields();
		Set<String> s = new HashSet<String>();
		for (int i = 0; i < fieldNames.length; i++) {
			if (fieldNames[i].getModifiers() == 2) {
				String fieldName = fieldNames[i].getName();
				s.add(fieldName);
			}
		}
		return s;
	}

	/**
	 * 通过字段名得到相应的set，get方法名
	 * 
	 * @param methodType
	 *            要得到的方法的类型，get或者set
	 * @param fieldName
	 *            该字段名
	 * @return 方法名
	 */
	private String getMethodByFieldName(int methodType, String fieldName) {
		String methodName = "";
		if (methodType == METHODType_GET) {
			methodName = "get" + Character.toUpperCase(fieldName.charAt(0))
					+ fieldName.substring(1);
		} else if (methodType == METHODType_SET) {
			methodName = "set" + Character.toUpperCase(fieldName.charAt(0))
					+ fieldName.substring(1);
		}
		return methodName;
	}

	/**
	 * 打印一个map
	 * 
	 * @param mm
	 */
	public void print(Map<String, String> mm) {
		System.out.print("map");
		Iterator<String> it = mm.keySet().iterator();
		while (it.hasNext()) {
			String a = it.next();
			System.out.print("---key" + a + "------");
			System.out.println("value" + mm.get(a) + "---");
		}

	}
}
