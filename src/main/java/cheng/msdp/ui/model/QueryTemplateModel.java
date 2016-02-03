package cheng.msdp.ui.model;


import arch.util.lang.SuperModel;

public class QueryTemplateModel  extends SuperModel {

	private static final long serialVersionUID = 1L;
	private String pk_querytemplate;
	private String pk_node;//节点
	private String name ;
	private String code ;
	private String templatetypecode ;
	private String remark ;
	
	public String ts;
	public int dr;
	
	
	public String getParentPKFieldName() {
		return null;
	}

	
	public String getPKFieldName() {
		return "pk_querytemplate";
	}

	
	public String getTableName() {
		return "sm_querytemplate";
	}

	public String getPk_querytemplate() {
		return pk_querytemplate;
	}

	public void setPk_querytemplate(String pk_querytemplate) {
		this.pk_querytemplate = pk_querytemplate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public int getDr() {
		return dr;
	}

	public void setDr(int dr) {
		this.dr = dr;
	}

	public String getTemplatetypecode() {
		return templatetypecode;
	}

	public void setTemplatetypecode(String templatetypecode) {
		this.templatetypecode = templatetypecode;
	}

	public String getPk_node() {
		return pk_node;
	}

	public void setPk_node(String pk_node) {
		this.pk_node = pk_node;
	}

}
