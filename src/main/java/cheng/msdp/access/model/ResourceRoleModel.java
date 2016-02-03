package cheng.msdp.access.model;


import arch.util.lang.SuperModel;

public class ResourceRoleModel extends SuperModel {

	private static final long serialVersionUID = 1L;

	private String pk_resourcerole ;
	private String pk_role ;//角色主键
	private String pk_user ;//用户主键
	private String pk_resource ;//资源主键
	private String pk_resourcetype ;//资源类型主键
	private String resourcetype ;//参照类型
	private String resourcetable ;//参照的表
	
	private String ts ;
	private int dr ;
	
	private String vdef1 ;
	private String vdef2 ;
	private String vdef3 ;
	private String vdef4 ;
	private String vdef5 ;
	private String vdef6 ;
	private String vdef7 ;
	private String vdef8 ;
	private String vdef9 ;
	
	@Override
	public String getParentPKFieldName() {
		return null;
	}

	@Override
	public String getPKFieldName() {
		return "pk_resourcerole";
	}

	@Override
	public String getTableName() {
		return "sm_resourcerole";
	}

	public String getPk_resourcerole() {
		return pk_resourcerole;
	}

	public void setPk_resourcerole(String pk_resourcerole) {
		this.pk_resourcerole = pk_resourcerole;
	}

	public String getPk_role() {
		return pk_role;
	}

	public void setPk_role(String pk_role) {
		this.pk_role = pk_role;
	}

	public String getPk_user() {
		return pk_user;
	}

	public void setPk_user(String pk_user) {
		this.pk_user = pk_user;
	}

	public String getPk_resource() {
		return pk_resource;
	}

	public void setPk_resource(String pk_resource) {
		this.pk_resource = pk_resource;
	}

	public String getResourcetype() {
		return resourcetype;
	}

	public void setResourcetype(String resourcetype) {
		this.resourcetype = resourcetype;
	}

	public String getResourcetable() {
		return resourcetable;
	}

	public void setResourcetable(String resourcetable) {
		this.resourcetable = resourcetable;
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

	public String getVdef1() {
		return vdef1;
	}

	public void setVdef1(String vdef1) {
		this.vdef1 = vdef1;
	}

	public String getVdef2() {
		return vdef2;
	}

	public void setVdef2(String vdef2) {
		this.vdef2 = vdef2;
	}

	public String getVdef3() {
		return vdef3;
	}

	public void setVdef3(String vdef3) {
		this.vdef3 = vdef3;
	}

	public String getVdef4() {
		return vdef4;
	}

	public void setVdef4(String vdef4) {
		this.vdef4 = vdef4;
	}

	public String getVdef5() {
		return vdef5;
	}

	public void setVdef5(String vdef5) {
		this.vdef5 = vdef5;
	}

	public String getVdef6() {
		return vdef6;
	}

	public void setVdef6(String vdef6) {
		this.vdef6 = vdef6;
	}

	public String getVdef7() {
		return vdef7;
	}

	public void setVdef7(String vdef7) {
		this.vdef7 = vdef7;
	}

	public String getVdef8() {
		return vdef8;
	}

	public void setVdef8(String vdef8) {
		this.vdef8 = vdef8;
	}

	public String getVdef9() {
		return vdef9;
	}

	public void setVdef9(String vdef9) {
		this.vdef9 = vdef9;
	}

	public String getPk_resourcetype() {
		return pk_resourcetype;
	}

	public void setPk_resourcetype(String pk_resourcetype) {
		this.pk_resourcetype = pk_resourcetype;
	}

}
