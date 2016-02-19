package cheng.msdp.ui.model;
import cheng.msdp.ui.vo.ComboxData;
import cheng.lib.lang.UFBoolean;
import cheng.lib.lang.SuperModel;

import java.util.List;

public class QueryConditionTemplateModel extends SuperModel {

	private static final long serialVersionUID = 1L;
	private String pk_queryconditiontemplate;
	private String pk_querytemplate;
	// 字段编码
	private String itemkey;
	// 字段默认显示名称
	private String defaultshowname; 
	private String operatecode;
	private List<ComboxData> operatecode_data  ;
	// 字段默认值
	private String defaultvalue;
	// 字段显示位置
	private int itempos;
	// 字段数据类型
	private String datatype;
	// 字段css类型  
	private String csstype;
	// 字段参照类型
	private String reftype;
	private List<ComboxData> reftype_data;
	// 是否编辑
	private UFBoolean isedit;
	// 是否可以空
	private UFBoolean isnull;
	private UFBoolean isuse;
	private String vdef1 ;
	private String vdef2 ;
	private String vdef3 ;
	private String vdef4 ;
	private String vdef5;
	private String vdef6 ;
	private String vdef7 ;
	private String vdef8 ;
	private String vdef9 ;
	public String ts;
	public int dr;
	
	public String getParentPKFieldName() {
		return "pk_querytemplate";
	}
	
	public String getPKFieldName() {
		return "pk_queryconditiontemplate";
	}
	
	public String getTableName() {
		return "sm_queryconditiontemplate";
	}
	public String getPk_queryconditiontemplate() {
		return pk_queryconditiontemplate;
	}
	public void setPk_queryconditiontemplate(String pk_queryconditiontemplate) {
		this.pk_queryconditiontemplate = pk_queryconditiontemplate;
	}
	public String getPk_querytemplate() {
		return pk_querytemplate;
	}
	public void setPk_querytemplate(String pk_querytemplate) {
		this.pk_querytemplate = pk_querytemplate;
	}
	public String getItemkey() {
		return itemkey;
	}
	public void setItemkey(String itemkey) {
		this.itemkey = itemkey;
	}
	public String getDefaultshowname() {
		return defaultshowname;
	}
	public void setDefaultshowname(String defaultshowname) {
		this.defaultshowname = defaultshowname;
	}
	public String getDefaultvalue() {
		return defaultvalue;
	}
	public void setDefaultvalue(String defaultvalue) {
		this.defaultvalue = defaultvalue;
	}
	public int getItempos() {
		return itempos;
	}
	public void setItempos(int itempos) {
		this.itempos = itempos;
	}
	public String getDatatype() {
		return datatype;
	}
	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}
	public String getCsstype() {
		return csstype;
	}
	public void setCsstype(String csstype) {
		this.csstype = csstype;
	}
	public String getReftype() {
		return reftype;
	}
	public void setReftype(String reftype) {
		this.reftype = reftype;
	}
	public List<ComboxData> getReftype_data() {
		return reftype_data;
	}
	public void setReftype_data(List<ComboxData> reftype_data) {
		this.reftype_data = reftype_data;
	}
	public UFBoolean getIsedit() {
		return isedit;
	}
	public void setIsedit(UFBoolean isedit) {
		this.isedit = isedit;
	}
	public UFBoolean getIsnull() {
		return isnull;
	}
	public void setIsnull(UFBoolean isnull) {
		this.isnull = isnull;
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
	public String getOperatecode() {
		return operatecode;
	}
	public void setOperatecode(String operatecode) {
		this.operatecode = operatecode;
	}
	public List<ComboxData> getOperatecode_data() {
		return operatecode_data;
	}
	public void setOperatecode_data(List<ComboxData> operatecode_data) {
		this.operatecode_data = operatecode_data;
	}
	public UFBoolean getIsuse() {
		return isuse;
	}
	public void setIsuse(UFBoolean isuse) {
		this.isuse = isuse;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	 
}
