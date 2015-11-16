package cheng.pipp.basic.vo;

import java.util.List;
public class TableDataVO {
	private List<String> datalist ;
	private List<JsonData> bringlist ;
	 
	public List<JsonData> getBringlist() {
		return bringlist;
	}
	public void setBringlist(List<JsonData> bringlist) {
		this.bringlist = bringlist;
	}
	public List<String> getDatalist() {
		return datalist;
	}
	public void setDatalist(List<String> datalist) {
		this.datalist = datalist;
	}

}
