package cheng.msdp.ui.util;

public class TemplateUtil {
	/**
	 * 
	 * cheng
	 * 2013-12-11
	 * @param actiontype
	 * @param vo
	 * @param supervo
	 * @return
	 * TemplateVO
	 */
	 
//	public static TemplateTableVO initListUI(String actiontype,UITempletModel templet, List<AggregatedValueObject> aggvo){
//		TemplateTableVO tvo = initTableListTab(templet);
//		if(aggvo!=null){
//			tvo = initTableListvalue(tvo,aggvo);
//		}
//		tvo.setButtons(templet.getButtonlist());
//		initCombox(tvo);
//		initItem(actiontype,tvo);
//		return tvo;
//	}
//
//	private static TemplateTableVO initTableListvalue(TemplateTableVO tvo,
//			List<AggregatedValueObject> aggvo) {
//		
//		return null;
//	}
	/**
	 * 根据状态初始化界面
	 * cheng
	 * 2013-12-11
	 * @param actiontype
	 * @param tvo
	 * void
	 */
//	private static void initItem(String actiontype, TemplateVO tvo) {
//		for(int i=0;i<tvo.getHeadItems().size();i++){
//			if(actiontype.equals("view")){
//				tvo.getHeadItems().get(i).setIsedit(false);
//			}
//		} 
//	}

	/**
	 * 初始化下拉
	 * cheng
	 * 2013-12-11
	 * @param tvo
	 * void
	 */
//	private static void initCombox(TemplateVO tvo) {
//		for(int i=0;i<tvo.getHeadItems().size();i++){
//			if(tvo.getHeadItems().get(i).getDatatype().equals("select")){
//				String[] dateArr = tvo.getHeadItems().get(i).getReftype().split(";");
//				List<ComboxData> typedate = createTypeData(dateArr);
//				tvo.getHeadItems().get(i).setReftype_data(typedate);
//			}
//		}
//	}

	/**
	 * 初始化默认值
	 * cheng
	 * 2013-12-11
	 * @param vo
	 * @param supervo
	 * @return
	 * TemplateVO
	 */
//	private static TemplateVO initCardDefaultvalue(TemplateVO vo, SuperVO supervo) {
//		//反射得到字段和值得map
//		org.cheng.util.Reflect r = new org.cheng.util.Reflect(supervo);
//		Map<String,Object> vmap = r.getFieldNameAndValue();
//		//匹配相应的字段
//		List<UIItemTempletModel> comlist= vo.getHeadItems();
//		for(int i=0;i<comlist.size();i++){
//			UIItemTempletModel com= comlist.get(i);
//			Object value = vmap.get(com.getItemkey());
//			if(value!=null){
//				setDefaultvalue(com,value);
//			}
//		}
//		vo.setHeadItems(comlist);
//		return vo;
//	}
//
//	private static TemplateVO initTab(UITempletModel vo) {
//		TemplateVO tvo = new TemplateVO();
//		List<UITabTempletModel> tabs =  vo.getTemplettabs();
//		for(int i=0;i<tabs.size();i++){
//			UITabTempletModel tab = tabs.get(i);
//			if(tab.getTabpos().intValue()==1){
//				tvo.setHeadItems(tab.getTempletitems());
//			}else if(tab.getTabpos().intValue()==2){
//				tvo.addBodyItem(tab.getTabname(),tab.getTempletitems());
//			}else{
//				tvo.setTailItems(tab.getTempletitems());
//			}
//		}
//		return tvo;
//	}
//	private static TemplateTableVO initTableListTab(UITempletModel vo) {
//		TemplateTableVO tvo = new TemplateTableVO();
//		List<UITabTempletModel> tabs =  vo.getTemplettabs();
//		TableData headtabledata = new TableData();
//		headtabledata.setButtons(vo.getButtonlist());
//		
//		TableData bodytabledata = new TableData();
//		for(int i=0;i<tabs.size();i++){
//			UITabTempletModel tab = tabs.get(i);
//			if(tab.getTabpos().intValue()==1){
//				headtabledata.setHeadlist(tab.getTempletitems());
//			}else if(tab.getTabpos().intValue()==2){
//				bodytabledata.getHeadlist();
//				bodytabledata.addBodyItem(tab.getTabname(),tab.getTempletitems());
//			} 
//		}
//		return tvo;
//	}

	/**
	 * 设置默认值
	 * cheng
	 * 2013-12-11
	 * @param com
	 * @param value
	 * void
	 */
//	private static void setDefaultvalue(UIItemTempletModel com, Object value) {
//		String oStrArr = value.toString();
//		com.setDefaultvalue(oStrArr);
//		if(com.getDatatype().equals("select")){
//			String[] dateArr = com.getReftype().split(";");
//			List<ComboxData> typedate = createTypeData(dateArr);
//			com.setReftype_data(typedate);
//		}
//	}

	/**
	 * 构建下拉框
	 * cheng
	 * 2013-12-11
	 * @param dateArr
	 * @return
	 * List<ComboxData>
	 */
//	private static List<ComboxData> createTypeData(String[] dateArr) {
//		List<ComboxData> typedate = new ArrayList<ComboxData> ();
//		for(int i=1;i<dateArr.length;i++){
//			ComboxData t = new ComboxData();
//			if(ComboxData.TYPE_IV.equals(dateArr[0])){
//				t.setValue(String.valueOf(i));
//				t.setName(dateArr[i]);
//			}
//			if(ComboxData.TYPE_CV.equals(dateArr[0])){
//				String[] tm = dateArr[i].split(",");
//				t.setValue(tm[0]);
//				t.setName(tm[1]);
//			}
//			if(ComboxData.TYPE_VV.equals(dateArr[0])){
//				t.setValue(dateArr[i]);
//				t.setName(dateArr[i]);
//			}
//			typedate.add(t);
//		}
//		return typedate;
//	}

	/**
	 *  根据节点主键得到模板信息
	 * cheng
	 * 2013-12-11
	 * @param bs
	 * @param nodeid
	 * @return
	 * UITempletModel
	 */
//	@SuppressWarnings("unchecked")
//	public static UITempletModel getUITempletModel(DataBaseService bs,String nodeid) {
//		List<UITempletModel> t = (List<UITempletModel>) bs.query(UITempletModel.class, " node.pk_node='"+nodeid+"'");
//		UITempletModel  templet = t.get(0);
//		
//		List<UITabTempletModel> tt = (List<UITabTempletModel>) bs.query(UITabTempletModel.class, " templet.pk_templet='"+templet.getPk_templet()+"'");
//		
//		List<ButtonModel> buttons = (List<ButtonModel>) bs.query(ButtonModel.class, " templet.pk_templet='"+templet.getPk_templet()+"'");
//		
//		List<UIItemTempletModel> ttt = (List<UIItemTempletModel>) bs.query(UIItemTempletModel.class, " templettab.pk_templet_tab='"+tt.get(0).getPk_templet_tab()+"'");
//		
//		tt.get(0).setTempletitems(ttt);
//		
//		templet.setTemplettabs(tt);
//		templet.setButtonlist(buttons);
//		return templet;
//	}
}
