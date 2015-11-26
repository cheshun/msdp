package cheng.pipp.access.model;


import arch.util.lang.SuperModel;

public class RoleNodeModel extends SuperModel {
	
	private static final long serialVersionUID = 1L;
	private String pk_role_node ;
	private String pk_role ;
	private String pk_node ;
	
	private String ts ; 
	private int dr  ; 
	
	public String getParentPKFieldName() {
		return null;
	}

	
	public String getPKFieldName() {
		return "pk_role_node";
	}

	
	public String getTableName() {
		return "sm_role_node";
	}

	public String getPk_role_node() {
		return pk_role_node;
	}

	public void setPk_role_node(String pk_role_node) {
		this.pk_role_node = pk_role_node;
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
