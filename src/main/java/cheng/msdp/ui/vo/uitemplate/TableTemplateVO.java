package cheng.msdp.ui.vo.uitemplate;

import arch.util.lang.PageVO;
import cheng.msdp.basic.vo.JsonData;
import cheng.msdp.basic.vo.TableDataVO;
import cheng.msdp.ui.model.ButtonModel;

import java.util.List;

public class TableTemplateVO {

	private List<ButtonModel> listbuttons ;
	private List<JsonData> tablehead ;
	private List<TableDataVO> tabledata ;
	private PageVO pagevo ;
	private TableInfo tableinfo ;
	
	public List<ButtonModel> getListbuttons() {
		return listbuttons;
	}
	public void setListbuttons(List<ButtonModel> listbuttons) {
		this.listbuttons = listbuttons;
	}
	public List<JsonData> getTablehead() {
		return tablehead;
	}
	public void setTablehead(List<JsonData> tablehead) {
		this.tablehead = tablehead;
	}
	public List<TableDataVO> getTabledata() {
		return tabledata;
	}
	public void setTabledata(List<TableDataVO> tabledata) {
		this.tabledata = tabledata;
	}
	public PageVO getPagevo() {
		return pagevo;
	}
	public void setPagevo(PageVO pagevo) {
		this.pagevo = pagevo;
	}
	public TableInfo getTableinfo() {
		return tableinfo;
	}
	public void setTableinfo(TableInfo tableinfo) {
		this.tableinfo = tableinfo;
	}
}
