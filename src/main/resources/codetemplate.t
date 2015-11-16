package cheng.pipp.#ModuleCode#.model;
import cheng.lib.lang.*;
import cheng.lib.vo.SuperVO;
public class #ClassName# extends SuperVO {
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
	public String getParentPKFieldName() {\n
        return null;
    }
	public String getPKFieldName() {
            return "#pk_key#";
	}
	public String getTableName() {
	    return "#TableName#" ;
	}
}