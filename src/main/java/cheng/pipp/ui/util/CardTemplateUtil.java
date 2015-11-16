package cheng.pipp.ui.util;

import arch.util.lang.ClassUtil;
import arch.util.lang.SuperModel;
import cheng.lib.lang.IDataType;
import cheng.pipp.basic.model.RefModel;
import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.ui.model.UIItemTempletModel;
import cheng.pipp.ui.vo.ComboxData;
import com.application.common.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.lang.UFBoolean;
import com.application.module.jdbc.model.BeanHelper;
import com.application.module.jdbc.model.NewSuperModel;

import java.util.ArrayList;
import java.util.List;

public class CardTemplateUtil {

	public static List<UIItemTempletModel> initCardUI(String actiontype, NewSuperModel supervo, List<UIItemTempletModel> itemlist){
		//初始化下拉
		initCombox(itemlist);
		//设置卡片界面数据
		initCardDefaultvalue(supervo,itemlist);
		//设置字段编辑状态
		initItem(actiontype,itemlist);
		return itemlist;
		
	}

	private static void initItem(String actiontype,List<UIItemTempletModel> itemlist) {
		for (int i = 0; i < itemlist.size(); i++) {
			if (actiontype.equals("view")) {
				itemlist.get(i).setIsedit(UFBoolean.FALSE);
			}
		}

	}

	private static List<UIItemTempletModel> initCardDefaultvalue(NewSuperModel supervo,
			List<UIItemTempletModel> itemlist) {
		//反射得到字段和值得map
		//匹配相应的字段
		for(int i=0;i<itemlist.size();i++){
			UIItemTempletModel com= itemlist.get(i);
			Object value = BeanHelper.getProperty(supervo, com.getItemkey());
			if(value!=null){
				setDefaultvalue(com,value);
			}
		}
		return itemlist;
	}

	private static void setDefaultvalue(UIItemTempletModel item, Object value) {
		String oStrArr = value.toString();
		item.setDefaultvalue(oStrArr);
		if(item.getDatatype().equals(IDataType.REF)){
			setRefValue(item,oStrArr);
		}
	}
	/**
	 * 设置卡片界面参照字段的值
	 * @param item
	 * @param oStrArr
	 */
	private static void setRefValue(UIItemTempletModel item, String oStrArr) {
		IDataBaseService queryBS = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
		String reftype = item.getReftype();
		try {
			List<RefModel> reflist = (List<RefModel>)queryBS.queryByClause(RefModel.class, RefModel.RefType+"='"+reftype+"'");
			RefModel ref = reflist.get(0);
			String modelclass = ref.getModelclass();
			NewSuperModel model =(NewSuperModel) ClassUtil.initClass(modelclass);
			NewSuperModel tarsupervo = (NewSuperModel)queryBS.queryByPK(model.getClass(), oStrArr);
			Object o = tarsupervo.getAttributeValue(ref.getShowfield());
			if(o!=null){
				List<ComboxData> temp = new ArrayList<ComboxData>(1);
				ComboxData t = new ComboxData();
				t.setValue(o.toString());
				temp.add(t);
				item.setReftype_data(temp);
			}
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}

	private static void initCombox(List<UIItemTempletModel> itemlist) {
		for(int i=0;i<itemlist.size();i++){
			if(itemlist.get(i).getDatatype().equals("select")){
				String[] dateArr = itemlist.get(i).getReftype().split(";");
				List<ComboxData> typedate = createTypeData(dateArr);
				itemlist.get(i).setReftype_data(typedate);
			}
		}
	}
	
	public static List<ComboxData> createTypeData(String[] dateArr) {
		List<ComboxData> typedate = new ArrayList<ComboxData> ();
		for(int i=1;i<dateArr.length;i++){
			ComboxData t = new ComboxData();
			if(ComboxData.TYPE_IV.equals(dateArr[0])){
				t.setValue(String.valueOf(i));
				t.setName(dateArr[i]);
			}
			if(ComboxData.TYPE_CV.equals(dateArr[0])){
				String[] tm = dateArr[i].split(",");
				t.setValue(tm[0]);
				t.setName(tm[1]);
			}
			if(ComboxData.TYPE_VV.equals(dateArr[0])){
				t.setValue(dateArr[i]);
				t.setName(dateArr[i]);
			}
			typedate.add(t);
		}
		return typedate;
	}

	
}
