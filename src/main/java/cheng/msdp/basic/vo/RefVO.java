package cheng.msdp.basic.vo;

public class RefVO {
	private String reftype ;
	private String itemkey;
	private String numPerPage ;
	private String pageNum ;
	private String orderField ;
	private String orderDirection ;
	
	public String getReftype() {
		return reftype;
	}

	public void setReftype(String reftype) {
		this.reftype = reftype;
	}

	public String getNumPerPage() {
		return numPerPage;
	}

	public void setNumPerPage(String numPerPage) {
		this.numPerPage = numPerPage;
	}

	public String getPageNum() {
		return pageNum;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getOrderField() {
		return orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}

	public String getOrderDirection() {
		return orderDirection;
	}

	public void setOrderDirection(String orderDirection) {
		this.orderDirection = orderDirection;
	}

	public String getItemkey() {
		return itemkey;
	}

	public void setItemkey(String itemkey) {
		this.itemkey = itemkey;
	}
}
