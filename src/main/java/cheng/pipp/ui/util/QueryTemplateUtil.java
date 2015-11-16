package cheng.pipp.ui.util;

import cheng.pipp.ui.model.QueryConditionTemplateModel;
import cheng.pipp.ui.vo.ComboxData;

import java.util.List;

public class QueryTemplateUtil {

	public static List<QueryConditionTemplateModel> initQueryTemplate(List<QueryConditionTemplateModel> itemlist){
		initCombox(itemlist);
		return itemlist;
	}
	
	private static void initCombox(List<QueryConditionTemplateModel> itemlist) {
		for(int i=0;i<itemlist.size();i++){
			String[] operateArr = itemlist.get(i).getOperatecode().split(";");
			List<ComboxData> operatedate = CardTemplateUtil.createTypeData(operateArr);
			itemlist.get(i).setOperatecode_data(operatedate);
			if(itemlist.get(i).getDatatype().equals("select")){
				String[] dateArr = itemlist.get(i).getReftype().split(";");
				List<ComboxData> typedate = CardTemplateUtil.createTypeData(dateArr);
				itemlist.get(i).setReftype_data(typedate);
			}
		}
	}
}
