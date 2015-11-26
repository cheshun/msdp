package cheng.pipp.ui.model;


import arch.util.lang.SuperModel;

public class TemplateNodeRoleModel  extends SuperModel {
	private static final long serialVersionUID = 1L;
	private String pk_temple_node_role ;
	private String pk_temple ;
	private String pk_user ;
	private String pk_role ;
	private String pk_node ;
	private String templeType ;
	private String ts;
	private int dr;
	
	public String getParentPKFieldName() {
		return null;
	}
	
	public String getPKFieldName() {
		return "pk_temple_node_role";
	}
	
	public String getTableName() {
		return "sm_temple_node_role";
	}
	public String getPk_temple_node_role() {
		return pk_temple_node_role;
	}
	public void setPk_temple_node_role(String pk_temple_node_role) {
		this.pk_temple_node_role = pk_temple_node_role;
	}
	public String getPk_temple() {
		return pk_temple;
	}
	public void setPk_temple(String pk_temple) {
		this.pk_temple = pk_temple;
	}
	public String getPk_user() {
		return pk_user;
	}
	public void setPk_user(String pk_user) {
		this.pk_user = pk_user;
	}
	public String getPk_role() {
		return pk_role;
	}
	public void setPk_role(String pk_role) {
		this.pk_role = pk_role;
	}
	public String getPk_node() {
		return pk_node;
	}
	public void setPk_node(String pk_node) {
		this.pk_node = pk_node;
	}
	public String getTempleType() {
		return templeType;
	}
	public void setTempleType(String templeType) {
		this.templeType = templeType;
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
	 
}
