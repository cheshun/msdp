package cheng.msdp.ui.model;


import arch.util.lang.SuperModel;

public class ButtonNodeRoleModel extends SuperModel {

	private String pk_buttonnoderole ;
	private String pk_button ;
	private String pk_node ;
	private String pk_role ;
	private String pk_user ;
	private String ts ;
	private int dr ;
	
	public String getParentPKFieldName() {
		return null;
	}

	
	public String getPKFieldName() {
		return "pk_buttonnoderole";
	}

	
	public String getTableName() {
		return "sm_buttonnoderole";
	}

	public String getPk_buttonnoderole() {
		return pk_buttonnoderole;
	}

	public void setPk_buttonnoderole(String pk_buttonnoderole) {
		this.pk_buttonnoderole = pk_buttonnoderole;
	}

	public String getPk_button() {
		return pk_button;
	}

	public void setPk_button(String pk_button) {
		this.pk_button = pk_button;
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
