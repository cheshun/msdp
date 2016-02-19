package cheng.msdp.access.model;


import cheng.lib.lang.SuperModel;

public class UserRoleModel extends SuperModel {
	private static final long serialVersionUID = 1L;
	private String pk_user_role ;
	private String pk_user ;
	private String pk_role ;
	private String ts ;
	private int dr ;
	
	public String getParentPKFieldName() {
		return null;
	}
	
	public String getPKFieldName() {
		return "pk_user_role";
	}
	
	public String getTableName() {
		return "sm_user_role";
	}
	public String getPk_user_role() {
		return pk_user_role;
	}
	public void setPk_user_role(String pk_user_role) {
		this.pk_user_role = pk_user_role;
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
