package cheng.pipp.basic.util;

import arch.util.lang.ClassUtil;
import arch.util.lang.PageVO;
import cheng.lib.lang.IDataType;
import cheng.pipp.basic.model.RefModel;
import cheng.pipp.basic.vo.JsonData;
import cheng.pipp.basic.vo.TableDataVO;
import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.ui.model.ButtonModel;
import cheng.pipp.ui.model.UIItemTempletModel;
import cheng.pipp.ui.vo.ComboxData;
import cheng.pipp.ui.vo.uitemplate.TableInfo;
import cheng.pipp.ui.vo.uitemplate.TableTemplateVO;
import com.application.common.exception.BusinessException;
import com.application.module.jdbc.JdbcPersistenceManager;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.model.BeanHelper;
import com.application.module.jdbc.model.NewSuperModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataTableUtil {

	/**
	 * 初始化列表数据
	 * @param pagevo
	 * @param itemlist
	 * @param listdata
	 * @param button
	 * @return
	 */
	public static TableTemplateVO initTableData(PageVO pagevo ,List<UIItemTempletModel> itemlist,
			List<NewSuperModel> listdata, List<ButtonModel> button) {
		TableTemplateVO tabletemplatevo =new TableTemplateVO();
		//初始化表格头
		String[] fields = getFiledsCodes(itemlist);
		List<JsonData> tablehead = inithead(fields);
		//初始化表格数据
		List<TableDataVO> tabledata = initdate(itemlist,tablehead, listdata);
		//设置表格按钮
		TableInfo tableinfo = initTableinfo(itemlist);
		
		tabletemplatevo.setListbuttons(button);
		//设置分页信息
		tabletemplatevo.setPagevo(pagevo);
		//设置表格信息
		tabletemplatevo.setTableinfo(tableinfo);
		tabletemplatevo.setTabledata(tabledata);
		tabletemplatevo.setTablehead(tablehead);
		return tabletemplatevo;
	}
	
	
	
	
	private static TableInfo initTableinfo(List<UIItemTempletModel> itemlist) {
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




	/**
	 * 初始化数据表格的表头 
	 * @param fieldCodenames
	 * names name:code;name:code
	 * @return
	 */
	public static List<JsonData> inithead(String[] fieldCodenames) {
		List<JsonData> refheadlist = new ArrayList<JsonData>();
		for(int i=0;i<fieldCodenames.length;i++){
			JsonData t = new JsonData();
			String[] field = fieldCodenames[i].split(":");
			t.setName(field[0]);
			t.setCode(field[1]);
			refheadlist.add(t);
		}
		return refheadlist;
	}
	/**
	 * 初始化数据表的表体数据 
	 * @param itemlist 
	 * @param head 数据表格的表头 
	 * @param refdata 表体数据 
	 * @return 
	 */
	public static List<TableDataVO> initdate(List<UIItemTempletModel> itemlist, List<JsonData> head,List<NewSuperModel> refdata){
		List<TableDataVO> refvaluelist = new ArrayList<TableDataVO>();
		Map<String,UIItemTempletModel> map = createMap(itemlist);
		for(int i =0;i<refdata.size();i++){
			NewSuperModel supervo = (NewSuperModel) refdata.get(i);
			TableDataVO TableDataVO = initdata(map,supervo,head);
			List<JsonData> bringlist = initBring(supervo);
			TableDataVO.setBringlist(bringlist);
			refvaluelist.add(TableDataVO);
		}
		return refvaluelist;
	}
	
	/**
	 * 
	 * @param itemlist
	 * @return
	 */
	private static Map<String,UIItemTempletModel> createMap(List<UIItemTempletModel> itemlist) {
		Map<String,UIItemTempletModel> m = new HashMap<String,UIItemTempletModel>();
		for(int i=0;i<itemlist.size();i++){
			m.put(itemlist.get(i).getItemkey(), itemlist.get(i));
		}
		return m;
	}




	/**
	 * 初始化行选中状态数据
	 * @param supervo
	 * @return
	 */
	private static List<JsonData> initBring(NewSuperModel supervo) {
		List<JsonData> bring = new ArrayList<JsonData>();
		JsonData j1 = new JsonData();
		j1.setCode("target");
		j1.setValue(supervo.getPKFieldName());
		JsonData j2 = new JsonData();
		j2.setCode("rel");
		j2.setValue(supervo.getPrimaryKey());
		bring.add(j1);
		bring.add(j2);
		return bring;
	}
	/**
	 * 解析表格的一行数据
	 * @param map
	 * @param supervo
	 * @param refheadlist
	 * @return
	 */
	private static TableDataVO initdata(Map<String,UIItemTempletModel> map , NewSuperModel supervo, List<JsonData> refheadlist) {
		TableDataVO fefDataVO = new TableDataVO();
		List<String> datastr = new ArrayList<String>();
		for(int i=0;i<refheadlist.size();i++){
			JsonData json = refheadlist.get(i);
			UIItemTempletModel item = map.get(json.getCode());
			String value = createValue(supervo,json,item);
			datastr.add(value);
//			Object obj = BeanHelper.getProperty(supervo, json.getCode());
//			datastr.add(createValue(item,obj));
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
	private static String createValue(NewSuperModel supervo, JsonData json,
			UIItemTempletModel item) {
		if(item.getDatatype().equals(IDataType.SELECT)){
			return createSelectValue(supervo, json,item);
		} else if(item.getDatatype().equals(IDataType.REF)){
			return createRefValue(supervo, json,item);
		}
		return createValue(item, BeanHelper.getProperty(supervo, json.getCode())) ;
	}


	/**
	 * 解析参照格式数据
	 * @param supervo
	 * @param json
	 * @param item
	 * @return
	 */
	private static String createRefValue(NewSuperModel supervo, JsonData json,
			UIItemTempletModel item) {
		Object obj = BeanHelper.getProperty(supervo, json.getCode());
		//参照类型 通过该类型查找参照信息 需要指出数据库操作
		IDataBaseService query = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
		JdbcPersistenceManager b = new JdbcPersistenceManager();
		String reftype = item.getReftype();
		try {
			List<RefModel> reflist = (List<RefModel>)query.queryByClause(RefModel.class, RefModel.RefType+"='"+reftype+"'");
			RefModel ref = reflist.get(0);
			String modelclass = ref.getModelclass();
			NewSuperModel model = (NewSuperModel) ClassUtil.initClass(modelclass);
			NewSuperModel tarsupervo = (NewSuperModel)query.queryByPK(model.getClass(), obj.toString());
			Object o = tarsupervo.getAttributeValue(ref.getShowfield());
			if(o!=null){
				return o.toString();
			}
			return "";
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return null;
	}




	/**
	 * 解析 表格下拉 的显示数据
	 * @param supervo
	 * @param json
	 * @param item
	 * @return
	 */
	private static String createSelectValue(NewSuperModel supervo, JsonData json,
			UIItemTempletModel item) {
		Object obj = BeanHelper.getProperty(supervo, json.getCode());
		String itemvalue ="";
		if(obj!=null){
			itemvalue = obj.toString();
		}
		String reftype = item.getReftype();
		String[] v1 = reftype.split(";");
		if(ComboxData.TYPE_IV.equals(v1[0])){
			int i = Integer.valueOf(itemvalue);
			return v1[i];
			
		}
		if(ComboxData.TYPE_VV.equals(v1[0])){
			return itemvalue ;
		}
		if(ComboxData.TYPE_CV.equals(v1[0])){
			for(int i=1;i<v1.length;i++){
				String [] v2 = v1[i].split(",");
				if(itemvalue.equals(v2[0])){
					return v2[1];
				}
			}
		}
		return "";
	}




	/**
	 * 除了下拉 和 参照 其他数据解析
	 * @param item
	 * @param obj
	 * @return
	 */
	private static String createValue(UIItemTempletModel item, Object obj) {
		if(obj!=null){
			return obj.toString();
		}else{
			return "";
		}
	}




	private static String[] getFiledsCodes(List<UIItemTempletModel> itemlist) {
		List<String> fildslist = new ArrayList<String>();
		for(int i=0;i<itemlist.size();i++){
			if(itemlist.get(i).getIslistshow().booleanValue()){
				fildslist.add(itemlist.get(i).getDefaultshowname()+":"+itemlist.get(i).getItemkey());
			}
		}
		return fildslist.toArray(new String[0]);
	}
}
