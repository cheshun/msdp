package cheng.pipp.access.model;

import com.application.module.jdbc.model.NewSuperModel;

public class RoleModel extends NewSuperModel {
	
	private static final long serialVersionUID = 1L;
	private String pk_role ;
	private String pk_parent_role ;
	private String role_name ;
	private String role_code ;
	private String role_remark ;
	private String ts ;
	private int dr ;
	
	public String getParentPKFieldName() {
		return null;
	}
	
	public String getPKFieldName() {
		return "pk_role";
	}
	
	public String getTableName() {
		return "sm_role";
	}
	public String getPk_role() {
		return pk_role;
	}
	public void setPk_role(String pk_role) {
		this.pk_role = pk_role;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getRole_code() {
		return role_code;
	}
	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}
	public String getRole_remark() {
		return role_remark;
	}
	public void setRole_remark(String role_remark) {
		this.role_remark = role_remark;
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
	public String getPk_parent_role() {
		return pk_parent_role;
	}
	public void setPk_parent_role(String pk_parent_role) {
		this.pk_parent_role = pk_parent_role;
	}
	
}
