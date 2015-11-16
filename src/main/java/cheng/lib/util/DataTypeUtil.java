package cheng.lib.util;

import java.util.HashMap;
import java.util.Map;

import cheng.lib.lang.IDataType;
import com.application.module.jdbc.lang.*;
import org.apache.commons.lang3.StringUtils;


public class DataTypeUtil {

	private static Map<String,String> datamap = new HashMap<String,String>();
	static{
		datamap.put(IDataType.LOGIC, UFBoolean.class.getSimpleName());
		datamap.put(IDataType.DATETIME, UFDateTime.class.getSimpleName());
		datamap.put(IDataType.DATE, UFDate.class.getSimpleName());
		datamap.put(IDataType.DIGTIS, "int");
		datamap.put(IDataType.NUMBER, UFDouble.class.getSimpleName());
		datamap.put(IDataType.PASSWORD, String.class.getSimpleName());
		datamap.put(IDataType.TEXT, String.class.getSimpleName());
		datamap.put(IDataType.SELECT, String.class.getSimpleName());
		datamap.put(IDataType.TEXTAREA, String.class.getSimpleName());
		datamap.put(IDataType.REF, String.class.getSimpleName());
	}
	 
	/**
	 * 根据字段界面类型和数据库表类型 返回ModelClass 类型
	 * @param uitype
	 * @param datatype
	 * @return
	 */
	public static String getModelDataType(String uitype,String datatype){
		if(uitype.startsWith(IDataType.SELECT) && datatype.equals("int") ){
			return datamap.get(IDataType.DIGTIS);
		}
		String temp = datamap.get(uitype);
		if(StringUtils.isEmpty(temp)){
			return datamap.get(IDataType.TEXT);
		}
		return temp;
	}
	
	public static int getInteger(Object defaultvalue,Object obj){
		if(obj!=null){
			return Integer.valueOf(obj.toString());
		}
		return Integer.valueOf(defaultvalue.toString());
	}
	
	public static int getInteger(Object obj){
		if(obj!=null){
			return Integer.valueOf(obj.toString());
		}
		return 0;
	}
	
	public static Double getDouble(Object defaultvalue,Object obj){
		if(obj!=null){
			return Double.valueOf(obj.toString());
		}
		return Double.valueOf(defaultvalue.toString());
	}
	public static Double getDouble(Object obj){
		if(obj!=null){
			return Double.valueOf(obj.toString());
		}
		return Double.valueOf("0");
	}
	
	public static Float getFloat(Object defaultvalue,Object obj){
		if(obj!=null){
			return Float.valueOf(obj.toString());
		}
		return Float.valueOf(defaultvalue.toString());
	}
	public static Float getFloat(Object obj){
		if(obj!=null){
			return Float.valueOf(obj.toString());
		}
		return Float.valueOf("0");
	}
	
	/**
     * 当浮点型数据位数超过10位之后，数据变成科学计数法显示。用此方法可以使其正常显示。
     * @param value
     * @return Sting
     */
    public static String formatDoubleNumber(double value) {
        if(value != 0.00){
            java.text.DecimalFormat df = new java.text.DecimalFormat("########.00");
            return df.format(value);
        }else{
            return "0.00";
        }

    }
    public static String formatDoubleNumber(Double value) {
    	return formatDoubleNumber(value.doubleValue());
    }
}
