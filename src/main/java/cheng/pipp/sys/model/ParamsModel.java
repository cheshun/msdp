package cheng.pipp.sys.model;

import arch.util.lang.SuperModel;

public class ParamsModel extends SuperModel {
/**
 *主键
 */
	public static final String PK_PARAMS="pk_params" ;
/**
 *参数名称
 */
	public static final String PARAMNAME="paramname" ;
/**
 *参数编码
 */
	public static final String PARAMCODE="paramcode" ;
/**
 *参数值
 */
	public static final String PARAMVALUE="paramvalue" ;
/**
 *备注
 */
	public static final String REMARK="remark" ;
/**
 *vdef1
 */
	public static final String VDEF1="vdef1" ;
/**
 *主键
 */
	private String pk_params ;
	/**
	 * 模块主键
	 */
		private String pk_module ;
/**
 *参数名称
 */
	private String paramname ;
/**
 *参数编码
 */
	private String paramcode ;
/**
 *参数值
 */
	private String paramvalue ;
/**
 *备注
 */
	private String remark ;
/**
 *vdef1
 */
	private String vdef1 ;
	
	private int dr ;
	private String ts ;
	
	public String getParentPKFieldName() {
		return "pk_module";
	}
	public String getPKFieldName() {
		return "pk_params";
	}
	public String getTableName() {
		return "sys_params";
	}
	public String getPk_params() {
		return pk_params;
	}
	public void setPk_params(String pk_params) {
		this.pk_params = pk_params;
	}
	public String getPk_module() {
		return pk_module;
	}
	public void setPk_module(String pk_module) {
		this.pk_module = pk_module;
	}
	public String getParamname() {
		return paramname;
	}
	public void setParamname(String paramname) {
		this.paramname = paramname;
	}
	public String getParamcode() {
		return paramcode;
	}
	public void setParamcode(String paramcode) {
		this.paramcode = paramcode;
	}
	public String getParamvalue() {
		return paramvalue;
	}
	public void setParamvalue(String paramvalue) {
		this.paramvalue = paramvalue;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getVdef1() {
		return vdef1;
	}
	public void setVdef1(String vdef1) {
		this.vdef1 = vdef1;
	}
	public int getDr() {
		return dr;
	}
	public void setDr(int dr) {
		this.dr = dr;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
}
