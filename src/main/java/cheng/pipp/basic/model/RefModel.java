package cheng.pipp.basic.model;


import com.application.module.jdbc.lang.UFBoolean;
import com.application.module.jdbc.model.NewSuperModel;

public class RefModel extends NewSuperModel {

	private static final long serialVersionUID = -9182923634536100598L;
	public static final String RefType ="reftype" ;
	private String pk_module;
	private String pk_ref ;
	private String reftype ;
	private String refname;
	private String pk_field ;
	private String showfield ;
	private String field_codenames ;
	private String modelclass ;// 
	private String datatablename ;// 
	private UFBoolean isaccesscontrol;
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
	
	
	public String getPk_ref() {
		return pk_ref;
	}
	public void setPk_ref(String pkRef) {
		pk_ref = pkRef;
	}
	public String getField_codenames() {
		return field_codenames;
	}
	public void setField_codenames(String fieldCodenames) {
		field_codenames = fieldCodenames;
	}
	public String getModelclass() {
		return modelclass;
	}
	public void setModelclass(String modelclass) {
		this.modelclass = modelclass;
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
	

	public String getReftype() {
		return reftype;
	}
	public void setReftype(String reftype) {
		this.reftype = reftype;
	}
	public String getPk_field() {
		return pk_field;
	}
	public void setPk_field(String pkField) {
		pk_field = pkField;
	}
	public String getShowfield() {
		return showfield;
	}
	public void setShowfield(String showfield) {
		this.showfield = showfield;
	}
	
	public String getParentPKFieldName() {
		return "pk_module";
	}
	
	public String getPKFieldName() {
		 
		return "pk_ref";
	}
	
	public String getTableName() {
		return "sm_ref";
	}
	public String getPk_module() {
		return pk_module;
	}
	public void setPk_module(String pk_module) {
		this.pk_module = pk_module;
	}
	public String getDatatablename() {
		return datatablename;
	}
	public void setDatatablename(String datatablename) {
		this.datatablename = datatablename;
	}
	public UFBoolean getIsaccesscontrol() {
		return isaccesscontrol;
	}
	public void setIsaccesscontrol(UFBoolean isaccesscontrol) {
		this.isaccesscontrol = isaccesscontrol;
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
	public String getRefname() {
		return refname;
	}
	public void setRefname(String refname) {
		this.refname = refname;
	}
}
