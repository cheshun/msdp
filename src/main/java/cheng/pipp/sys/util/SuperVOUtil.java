package cheng.pipp.sys.util;

import cheng.lib.util.DataTypeUtil;
import cheng.pipp.sys.model.DataDictItemModel;
import cheng.pipp.sys.model.DataDictModel;
import cheng.pipp.ui.util.FileToolkit;

import java.io.File;
import java.util.List;

public class SuperVOUtil {

	/**
	 * 生成vo
	 * @author cheng
	 * 2014年5月9日
	 * 下午1:25:36
	 * @param module_code
	 * @param datadict
	 * @param list
	 * @return 生成vo类的全名称
	 */
	public  static String createVO(String module_code, DataDictModel datadict,
			List<DataDictItemModel> list) {
		StringBuffer sb = new StringBuffer();
		sb.append("package cheng."+module_code+".model;").append("\n");
		sb.append("import cheng.lib.lang.*;").append("\n");
		sb.append("import cheng.lib.vo.SuperVO;").append("\n");
		sb.append("public class "+getClassName(module_code,datadict.getDatatablecode())+" extends SuperVO {").append("\n");
		String pk_key = null ;
		for(int i=0;i<list.size();i++){
			DataDictItemModel item = list.get(i);
			sb.append("/**").append("\n");
			sb.append(" *").append(item.getItemname()).append(item.getItemremark()).append("\n");
			sb.append(" */").append("\n");
			sb.append("	public static final String").append(" ");
			sb.append(item.getItemcode().toUpperCase()).append("=\"").append(item.getItemcode()).append("\" ;\n");
		}
		for(int i=0;i<list.size();i++){
			DataDictItemModel item = list.get(i);
			if(item.getIsprimary().booleanValue()){
				pk_key = item.getItemcode();
			}
			sb.append("/**").append("\n");
			sb.append(" *").append(item.getItemname()).append(item.getItemremark()).append("\n");
			sb.append(" */").append("\n");
			sb.append("	private ").append(DataTypeUtil.getModelDataType(item.getUitype(),item.getDatatype())).append(" ");
			sb.append(item.getItemcode()).append(" ;\n");
		}
		sb.append("	public String getParentPKFieldName() {\n");
		sb.append("		return null;\n");
		sb.append("	}\n");
		sb.append("	public String getPKFieldName() {\n");
		sb.append("		return \"" + pk_key + "\";\n");
		sb.append("	}\n");
		sb.append("	public String getTableName() {\n");
		sb.append("		return \"" + getTableName(module_code, datadict.getDatatablecode()));
		sb.append("\";\n");
		sb.append("	}\n");
		sb.append("}\n");
		System.out.println(sb);
		FileToolkit.writeFile(new File("c:/temp/"+getClassName(module_code,datadict.getDatatablecode())+".java"), new String[]{ sb.toString()}, false, FileToolkit.UTF_8);
		return "cheng."+module_code+".model."+getClassName(module_code,datadict.getDatatablecode());
	}
	/**
	 * 生成vo的短名称
	 * @author cheng
	 * 2014年5月9日
	 * 下午1:26:16
	 * @param datatablecode
	 * @param string 
	 * @return
	 */
	public static String getClassName(String module_code, String datatablecode){
		datatablecode = getTableName(module_code, datatablecode);
		if(datatablecode.startsWith(module_code+"_")){
			datatablecode = datatablecode.replace(module_code+"_", "");
		}
		StringBuffer sb = new StringBuffer();
		sb.append(datatablecode.substring(0, 1).toUpperCase());
		sb.append(datatablecode.substring(1, datatablecode.length()));
		sb.append("Model");
		return sb.toString();
	}
	private static String getTableName(String module_code, String datatablecode){
		if(!datatablecode.startsWith(module_code+"_")){
			datatablecode = module_code+"_"+datatablecode;
		}
		return datatablecode;
	}
}
