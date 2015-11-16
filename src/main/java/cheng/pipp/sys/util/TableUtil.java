package cheng.pipp.sys.util;

import cheng.lib.lang.IDataType;
import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.sys.model.DataDictItemModel;
import cheng.pipp.sys.model.DataDictModel;
import cheng.pipp.sys.model.ModuleModel;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.lang.UFBoolean;

import java.util.ArrayList;
import java.util.List;

public class TableUtil {


	public static String synchronousTable(ModuleModel modules, DataDictModel datadict ,List<DataDictItemModel> list ){
			
		String tablename = datadict.getDatatablecode();
		if(tablename.indexOf("_")==-1){
			tablename = modules.getModule_code()+"_"+tablename;
		}
		IDataBaseService query = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
		if(query.isTableExist(tablename)){
			return getUpdateTableSQL(tablename,list);
		}
		return getCreateTableSQL(tablename,list);
		
	}
	 
	private static String getUpdateTableSQL(String tablename,
			List<DataDictItemModel> list) {
		StringBuffer sql = new StringBuffer("ALTER TABLE `"+tablename+"` ");
		IDataBaseService query = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
		
		for(int i=0;i<list.size();i++){
			DataDictItemModel item = list.get(i);
			if(!query.isTableColmnExist(tablename, item.getItemcode())){
				sql.append("ADD COLUMN `"+item.getItemcode()+"`  "+item.getDatatype()+"("+item.getLength()+") NULL ,");
			}
		}
		sql.setLength(sql.length()-1);
		return sql.toString();
	}

	private static String getCreateTableSQL(String tablename,
			List<DataDictItemModel> list) {
		String primaryKey = null ;
		StringBuffer sb = new StringBuffer();
		sb.append(" CREATE TABLE `"+tablename+"` ( ");
		for(int i=0;i<list.size();i++){
			DataDictItemModel item = list.get(i);
			if(item.getItemcode().equals("tablename")){
				throw new RuntimeException("tablename is a key for sys ");
			}
			if(item.getIsprimary().booleanValue()){
				primaryKey = item.getItemcode();
				sb.append(item.getItemcode()).append(" ");
				sb.append(item.getDatatype());
				sb.append("(").append(item.getLength()).append(")");
				sb.append(" NOT NULL ,");
			}else{
				sb.append(item.getItemcode()).append(" ");
				sb.append(item.getDatatype());
				sb.append("(").append(item.getLength()).append(")");
				if("int".equals(item.getDatatype())){
					sb.append(" DEFAULT '0' ,");
				}else {
					sb.append(" NULL ,");
				}
			}
		}
		sb.append(" PRIMARY KEY (`"+primaryKey+"`) ");
		sb.append(") ");
		return sb.toString();
	}

	public static List<DataDictItemModel> initBusiFields(DataDictModel datadict) {
		List<DataDictItemModel> list = new ArrayList<DataDictItemModel>();
//		if(datadict.getIsbusi().booleanValue()){
//			list.addAll(createVdefFields(datadict.getPrimaryKey(),10));
//			list.addAll(createBusiFields(datadict.getPrimaryKey()));
//		}else{
//			list.addAll(createVdefFields(datadict.getPrimaryKey(),5));
//		}
		initTSDR(datadict.getPrimaryKey(),list);
		initPk(datadict,list);
		return list;
		
	}
	private static void initPk(DataDictModel datadict, List<DataDictItemModel> list) {
		DataDictItemModel pk = new DataDictItemModel();
		pk.setDatatype("char");
		pk.setLength(20);
		pk.setItemcode("pk_"+datadict.getDatatablecode());
		pk.setItemname(datadict.getDatatablename()+"主键");
		pk.setUitype(IDataType.TEXT);
		pk.setUitype(IDataType.TEXT);
		pk.setIsprimary(UFBoolean.TRUE);
		pk.setIsnull(UFBoolean.FALSE);
		pk.setIsBilltemplatesyn(UFBoolean.FALSE);
		pk.setIsQueryTemplatesyn(UFBoolean.FALSE);
		pk.setIsTablesyn(UFBoolean.FALSE);
		pk.setPk_datadict(datadict.getPrimaryKey());
		list.add(pk);
	}

	private static void initTSDR(String pk_datadict, List<DataDictItemModel> list) {
		DataDictItemModel ts = new DataDictItemModel();
		ts.setDatatype("varchar");
		ts.setItemcode("ts");
		ts.setItemname("ts");
		ts.setDatatype("varchar");
		ts.setLength(20);
		ts.setUitype(IDataType.TEXT);
		ts.setIsprimary(UFBoolean.FALSE);
		ts.setIsnull(UFBoolean.FALSE);
		ts.setIsBilltemplatesyn(UFBoolean.FALSE);
		ts.setIsQueryTemplatesyn(UFBoolean.FALSE);
		ts.setIsTablesyn(UFBoolean.FALSE);
		ts.setUitype(IDataType.TEXT);
		ts.setPk_datadict(pk_datadict);
		list.add(ts);
		DataDictItemModel dr = new DataDictItemModel();
		dr.setDatatype("int");
		dr.setItemcode("dr");
		dr.setItemname("dr");
		dr.setLength(11);
		dr.setUitype(IDataType.DIGTIS);
		dr.setUitype(IDataType.TEXT);
		dr.setIsprimary(UFBoolean.FALSE);
		dr.setIsnull(UFBoolean.FALSE);
		dr.setIsBilltemplatesyn(UFBoolean.FALSE);
		dr.setIsQueryTemplatesyn(UFBoolean.FALSE);
		dr.setIsTablesyn(UFBoolean.FALSE);
		dr.setPk_datadict(pk_datadict);
		list.add(dr);
		
	}

	private static List<DataDictItemModel>  createBusiFields(String pk_datadict) {
		return null;
	}

	private static List<DataDictItemModel> createVdefFields(String pk_datadict, int vdefnumber) {
		List<DataDictItemModel> temp = new ArrayList<DataDictItemModel>();
		for(int i=0;i<vdefnumber;i++){
			DataDictItemModel t = new DataDictItemModel();
			t.setItemcode("vdef"+(i+1));
			t.setItemname("自定义项"+(i+1));
			t.setDatatype("varchar");
			t.setUitype(IDataType.TEXT);
			t.setIsprimary(UFBoolean.FALSE);
			t.setIsnull(UFBoolean.FALSE);
			t.setLength(255);
			t.setIsBilltemplatesyn(UFBoolean.FALSE);
			t.setIsQueryTemplatesyn(UFBoolean.FALSE);
			t.setIsTablesyn(UFBoolean.FALSE);
			t.setPk_datadict(pk_datadict);
			temp.add(t);
		 }
		return temp;
	}
}
