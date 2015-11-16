package cheng.pipp.ui.vo.uitemplate;

import cheng.pipp.ui.model.UIItemTempletModel;

import java.util.ArrayList;
import java.util.List;

public class BillTemplateVO {
	private TabVO tabvo;
	
	private List<UIItemTempletModel> listitem =new ArrayList<UIItemTempletModel>();

	public TabVO getTabvo() {
		return tabvo;
	}

	public void setTabvo(TabVO tabvo) {
		this.tabvo = tabvo;
	}

	public List<UIItemTempletModel> getListitem() {
		return listitem;
	}

	public void setListitem(List<UIItemTempletModel> listitem) {
		this.listitem = listitem;
	}
	public void addItem(UIItemTempletModel item) {
		this.listitem.add(item);
	}
}
