package cheng.msdp.sys.model;


import arch.util.lang.SuperModel;

public class ModuleModel  extends SuperModel {

	private static final long serialVersionUID = 1L;
	private String pk_module ;
	private String module_code ;
	private String module_name ;
	private String module_remark ;
	private String ts ;
	private int dr ;
	
	public String getParentPKFieldName() {
		return null;
	}
	
	public String getPKFieldName() {
		return "pk_module";
	}
	
	public String getTableName() {
		return "sys_module";
	}
	public String getPk_module() {
		return pk_module;
	}
	public void setPk_module(String pk_module) {
		this.pk_module = pk_module;
	}
	public String getModule_code() {
		return module_code;
	}
	public void setModule_code(String module_code) {
		this.module_code = module_code;
	}
	public String getModule_name() {
		return module_name;
	}
	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}
	public String getModule_remark() {
		return module_remark;
	}
	public void setModule_remark(String module_remark) {
		this.module_remark = module_remark;
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
