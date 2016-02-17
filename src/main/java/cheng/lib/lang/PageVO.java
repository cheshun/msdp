package cheng.lib.lang;

import java.util.Collection;
import java.util.Map;

public class PageVO {

	public final static int PAGE_SHOW_COUNT = 20;


	private int pageNum = 1;
	private int pageSize = PAGE_SHOW_COUNT;
	private int totalCount = 0;
	private String condition;
	private Object[] paramsvalue;
	private String orderField ;
	private String[] selectedFields ;
	private Collection data = null ;
	private Map<String,Object> total =null ;

	public PageVO(){

	}
	public PageVO(int pageNum){
		this.pageNum = pageNum ;
	}
	public PageVO(int pageNum, int pageSize){
		this.pageNum = pageNum ;
		this.pageSize = pageSize ;
	}
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Object[] getParamsvalue() {
		return paramsvalue;
	}

	public void setParamsvalue(Object[] paramsvalue) {
		this.paramsvalue = paramsvalue;
	}

	public String getOrderField() {
		return orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}

	public String[] getSelectedFields() {
		return selectedFields;
	}

	public void setSelectedFields(String[] selectedFields) {
		this.selectedFields = selectedFields;
	}

	public Collection getData() {
		return data;
	}

	public void setData(Collection data) {
		this.data = data;
	}

	public Map<String, Object> getTotal() {
		return total;
	}

	public void setTotal(Map<String, Object> total) {
		this.total = total;
	}

	public int getStartIndex() {
		int pageNum = this.getPageNum() > 0 ? this.getPageNum() - 1 : 0;
		return pageNum * this.getPageSize();
	}
}
