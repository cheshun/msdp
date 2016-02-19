package cheng.msdp.ui.model;


import cheng.lib.lang.SuperModel;

public class QueryTemplateNodeRoleModel extends SuperModel {

	private static final long serialVersionUID = 1L;
	private String pk_querytemplatenoderole;
	private String pk_querytemplate;
	private String pk_node;
	private String pk_user;
	private String pk_role;
	
	private String ts;
	private int dr;
	
	
	
	public String getParentPKFieldName() {
		return null;
	}
	
	public String getPKFieldName() {
		return "pk_querytemplatenoderole";
	}
	
	public String getTableName() {
		return "sm_querytemplatenoderole";
	}
	public String getPk_querytemplatenoderole() {
		return pk_querytemplatenoderole;
	}
	public void setPk_querytemplatenoderole(String pk_querytemplatenoderole) {
		this.pk_querytemplatenoderole = pk_querytemplatenoderole;
	}
	public String getPk_querytemplate() {
		return pk_querytemplate;
	}
	public void setPk_querytemplate(String pk_querytemplate) {
		this.pk_querytemplate = pk_querytemplate;
	}
	public String getPk_node() {
		return pk_node;
	}
	public void setPk_node(String pk_node) {
		this.pk_node = pk_node;
	}
	public String getPk_role() {
		return pk_role;
	}
	public void setPk_role(String pk_role) {
		this.pk_role = pk_role;
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
	public String getPk_user() {
		return pk_user;
	}
	public void setPk_user(String pk_user) {
		this.pk_user = pk_user;
	}
}
