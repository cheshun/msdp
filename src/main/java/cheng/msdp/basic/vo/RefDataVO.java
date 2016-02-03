package cheng.msdp.basic.vo;

import java.util.List;
public class RefDataVO {
	private List<String> refdatalist ;
	private List<JsonData> bringlist ;
	public List<String> getRefdatalist() {
		return refdatalist;
	}
	public void setRefdatalist(List<String> refdatalist) {
		this.refdatalist = refdatalist;
	}
	public List<JsonData> getBringlist() {
		return bringlist;
	}
	public void setBringlist(List<JsonData> bringlist) {
		this.bringlist = bringlist;
	}

}
