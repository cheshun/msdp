package cheng.pipp.ui.util;

import arch.util.lang.BeanHelper;
import arch.util.lang.PageVO;
import cheng.pipp.basic.util.DataTableUtil;
import cheng.pipp.basic.vo.JsonData;
import cheng.pipp.basic.vo.TableDataVO;
import cheng.pipp.ui.model.ReportItemTemplateModel;
import cheng.pipp.ui.vo.uitemplate.TableInfo;
import cheng.pipp.ui.vo.uitemplate.TableTemplateVO;
import arch.util.lang.SuperModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportTableUtil {

	public static TableTemplateVO initdata(
			List<ReportItemTemplateModel> querylist, List<SuperModel> reportdata, PageVO pagevo) {
		TableTemplateVO tabletemplatevo =new TableTemplateVO();
		//初始化表格头
		String[] fields = getFiledsCodes(querylist);
		List<JsonData> tablehead = DataTableUtil.inithead(fields);
		//初始化表格数据
		List<TableDataVO> tabledata = initdate(querylist,tablehead, reportdata);
		//设置表格信息
		TableInfo tableinfo = initTableinfo(querylist);
		tabletemplatevo.setTableinfo(tableinfo);
		tabletemplatevo.setTabledata(tabledata);
		tabletemplatevo.setTablehead(tablehead);
		//设置分页信息
		tabletemplatevo.setPagevo(pagevo);
		return tabletemplatevo;		
	}

	private static String[] getFiledsCodes(List<ReportItemTemplateModel> itemlist) {
		List<String> fildslist = new ArrayList<String>();
		for(int i=0;i<itemlist.size();i++){
			if(itemlist.get(i).getIslistshow().booleanValue()){
				fildslist.add(itemlist.get(i).getItemname()+":"+itemlist.get(i).getItemcode());
			}
		}
		return fildslist.toArray(new String[0]);
	}
	
	/**
	 * 初始化数据表的表体数据 
	 * @param itemlist 
	 * @param head 数据表格的表头 
	 * @param refdata 表体数据 
	 * @return 
	 */
	public static List<TableDataVO> initdate(List<ReportItemTemplateModel> itemlist, List<JsonData> head,List<SuperModel> refdata){
		List<TableDataVO> refvaluelist = new ArrayList<>();
		Map<String,ReportItemTemplateModel> map = createMap(itemlist);
		for(int i =0;i<refdata.size();i++){
			SuperModel supervo =  refdata.get(i);
			TableDataVO TableDataVO = initdata(map,supervo,head);
			refvaluelist.add(TableDataVO);
		}
		return refvaluelist;
	}
	/**
	 * 
	 * @param itemlist
	 * @return
	 */
	private static Map<String,ReportItemTemplateModel> createMap(List<ReportItemTemplateModel> itemlist) {
		Map<String,ReportItemTemplateModel> m = new HashMap<>();
		for(int i=0;i<itemlist.size();i++){
			m.put(itemlist.get(i).getItemcode(), itemlist.get(i));
		}
		return m;
	}
	/**
	 * 解析表格的一行数据
	 * @param map
	 * @param supervo
	 * @param refheadlist
	 * @return
	 */
	private static TableDataVO initdata(Map<String,ReportItemTemplateModel> map , SuperModel supervo, List<JsonData> refheadlist) {
		TableDataVO fefDataVO = new TableDataVO();
		List<String> datastr = new ArrayList<String>();
		for(int i=0;i<refheadlist.size();i++){
			JsonData json = refheadlist.get(i);
			ReportItemTemplateModel item = map.get(json.getCode());
			String value = createValue(supervo,json,item);
			datastr.add(value);
		}
		fefDataVO.setDatalist(datastr);
		return fefDataVO;
	}
	/**
	 * 解析表格显示的数据
	 * @param supervo
	 * @param json
	 * @param item
	 * @return
	 */
	private static String createValue(SuperModel supervo, JsonData json,
			ReportItemTemplateModel item) {
		return createValue(item, BeanHelper.getProperty(supervo, json.getCode())) ;
	}


	/**
	 * 除了下拉 和 参照 其他数据解析
	 * @param item
	 * @param obj
	 * @return
	 */
	private static String createValue(ReportItemTemplateModel item, Object obj) {
		if(obj!=null){
			return obj.toString();
		}else{
			return "";
		}
	}
	private static TableInfo initTableinfo(List<ReportItemTemplateModel> itemlist) {
		TableInfo t = new TableInfo(1030);
		if(itemlist==null){
			return t;
		}
		
		int size = 0 ;
		for(int i=0;i<itemlist.size();i++){
			if(itemlist.get(i).getIslistshow().booleanValue()){
				size = size + itemlist.get(i).getWidth();
			}
		}
		if(size<1030){
			
			return t;
		}
		t.setWidth(size);
		return t;
	}


}
