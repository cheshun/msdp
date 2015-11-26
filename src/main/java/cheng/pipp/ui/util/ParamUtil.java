package cheng.pipp.ui.util;

import cheng.lib.lang.IDataType;
import cheng.pipp.ui.model.QueryConditionTemplateModel;
import cheng.pipp.ui.model.ReportItemTemplateModel;
import cheng.pipp.ui.vo.querytemplate.QueryParamVO;
import arch.util.lang.UFBoolean;
import arch.util.lang.UFDate;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.Map.Entry;

public class ParamUtil {

	/**
	 * 解析查询条件
	 * @param itemlist
	 * @param valuemap
	 * @return
	 */
	public static List<QueryParamVO> initQueryParam(List<QueryConditionTemplateModel> itemlist, Map<String, Object> valuemap){
		List<QueryParamVO> queryparam = new ArrayList<QueryParamVO>();
		Map<String,String> itemmap = createMap(itemlist);
		Iterator<Entry<String, String>> it = itemmap.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, String> entry = it.next();
			String itemkey =  entry.getKey();
			String datatype =  entry.getValue();
			Object itemvalue = valuemap.get(itemkey);
			if(itemvalue instanceof String[]){
				List<QueryParamVO> itemparam = createQueryParamVO(itemkey,(String[])itemvalue,datatype);
				queryparam.addAll(itemparam);
			}
		}
		return queryparam;
		
	}

	public static List<QueryParamVO> initReportQueryParam(List<ReportItemTemplateModel> itemlist, Map<String, Object> valuemap){
		List<QueryParamVO> queryparam = new ArrayList<QueryParamVO>();
		Map<String,String> itemmap = createMap1(itemlist);
		Iterator<Entry<String, String>> it = itemmap.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, String> entry = it.next();
			String itemkey =  entry.getKey();
			String datatype =  entry.getValue();
			Object itemvalue = valuemap.get(itemkey);
			if(itemvalue instanceof String[]){
				List<QueryParamVO> itemparam = createQueryParamVO(itemkey,(String[])itemvalue,datatype);
				queryparam.addAll(itemparam);
			}
		}
		return queryparam;
		
	}
	/**
	 * 把查询条件转成指定的类型
	 * @param itemkey
	 * @param itemvalue
	 * @param datatype
	 * @return
	 */
	private static List<QueryParamVO> createQueryParamVO(String itemkey,String[] itemvalue, String datatype) {
		List<QueryParamVO> itemparam = new ArrayList<QueryParamVO>();
		for(int i = 0;i<itemvalue.length;i=+2){
			 if(!StringUtils.isEmpty(itemvalue[i+1])){
				 QueryParamVO param = new QueryParamVO();
				 param.setDatatype(datatype);
				 param.setItemkey(itemkey);
				 param.setOperatecode(itemvalue[i]);
				 param.setSrc_value(itemvalue[i+1]);
				 param.setValue(createValue(datatype,itemvalue[i+1]));
				 itemparam.add(param);
			 }
		 }
		return itemparam;
	}

	/**
	 * 解析查询条件的值
	 * @param datatype
	 * @param itemvalue
	 * @return
	 */
	private static Object createValue(String datatype, String itemvalue) {
		Object returnvalue = "" ;
		if(datatype.equals(IDataType.TEXT)){
			returnvalue = itemvalue ;
		}
		if(datatype.equals(IDataType.DATE)){
			returnvalue = UFDate.getDate(itemvalue) ;
		}
		if(datatype.equals(IDataType.DIGTIS)){
			returnvalue = Integer.valueOf(itemvalue);
		}
		if(datatype.equals(IDataType.NUMBER)){
			returnvalue = UFBoolean.valueOf(itemvalue);
		}
		if(datatype.equals(IDataType.SELECT)){
			returnvalue = itemvalue ;
		}
		if(datatype.equals(IDataType.REF)){
			returnvalue = itemvalue ;
		}
		if(datatype.equals(IDataType.TEXTAREA)){
			returnvalue = itemvalue ;
		} 
		return returnvalue;
	}

	private static Map<String,String> createMap1(List<ReportItemTemplateModel> itemlist) {
		Map<String,String> m = new HashMap<String,String>();
		for(int i=0;i<itemlist.size();i++){
			m.put(itemlist.get(i).getItemcode(), itemlist.get(i).getDatatype());
		}
		return m;
	}
	private static Map<String,String> createMap(List<QueryConditionTemplateModel> itemlist) {
		Map<String,String> m = new HashMap<String,String>();
		for(int i=0;i<itemlist.size();i++){
			m.put(itemlist.get(i).getItemkey(), itemlist.get(i).getDatatype());
		}
		return m;
	}
	
	/**
	 * 获取查询条件的字符串表示
	 * @param queryparam
	 * @return
	 */
	public static String getConditionStr(List<QueryParamVO> queryparam){
		StringBuffer sb = new StringBuffer();
		sb.append(" 1=1 ");
		for(int i=0;i<queryparam.size();i++){
			QueryParamVO p = queryparam.get(i);
			sb.append(" and ").append(p.getItemkey()).append(" ").append(p.getOperatecode()).append(" ").append(getString(p.getOperatecode(),p.getValue()));
		}
		return sb.toString();
		
	}

	private static Object getString(Object operatecode, Object value) {
		
		if(value instanceof String){
			if("like".equals(operatecode)){
				return "'%"+value.toString()+"%'" ;
			}
			return "'"+value.toString()+"'" ;
		}
		return value;
	}
}
