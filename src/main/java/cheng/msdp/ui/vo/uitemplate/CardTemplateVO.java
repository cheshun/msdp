package cheng.msdp.ui.vo.uitemplate;

import cheng.msdp.ui.model.ButtonModel;
import cheng.msdp.ui.model.UIItemTempletModel;

import java.util.List;

public class CardTemplateVO {
	
	private String actionType ;
	private List<ButtonModel> listbuttons ;
	private List<UIItemTempletModel> itemlist ;
	
	
	
	public List<ButtonModel> getListbuttons() {
		return listbuttons;
	}
	public void setListbuttons(List<ButtonModel> listbuttons) {
		this.listbuttons = listbuttons;
	}
	public List<UIItemTempletModel> getItemlist() {
		return itemlist;
	}
	public void setItemlist(List<UIItemTempletModel> itemlist) {
		this.itemlist = itemlist;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
}
