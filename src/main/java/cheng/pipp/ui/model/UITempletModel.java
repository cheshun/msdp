package cheng.pipp.ui.model;


import arch.util.lang.SuperModel;

/**
 * 界面模板信息 一个模板会有多个页签（包括表头和表体）
 */
public class UITempletModel extends SuperModel {

	private static final long serialVersionUID = 1L;
	private String pk_node;//节点
	// 主键字段
	private String pk_templet;
	// 模板名称
	private String templetuiname;
	// 模板类型编码 【默认SYSTEM】
	private String templatetypecode;
	// 模板描述
	private String templetuicaption;
	
	private String vdef1 ;
	private String vdef2 ;
	private String vdef3 ;
	private String vdef4 ;
	private String vdef5 ;
	private String vdef6 ;
	private String vdef7 ;
	private String vdef8 ;
	private String vdef9 ;
	public String ts;
	public int dr;


	public UITempletModel() {
		super();
	}

	public UITempletModel(String key) {
		super();
	}

	public String getPk_templet() {
		return pk_templet;
	}

	public void setPk_templet(String pkTemplet) {
		pk_templet = pkTemplet;
	}
    
	public String getTempletuiname() {
		return templetuiname;
	}

	public void setTempletuiname(String templetuiname) {
		this.templetuiname = templetuiname;
	}

	public String getTempletuicaption() {
		return templetuicaption;
	}

	public void setTempletuicaption(String templetuicaption) {
		this.templetuicaption = templetuicaption;
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

	
	public String getParentPKFieldName() {
		return "pk_node";
	}

	
	public String getPKFieldName() {
		return "pk_templet";
	}

	
	public String getTableName() {
		return "sm_templet";
	}

	public String getPk_node() {
		return pk_node;
	}

	public void setPk_node(String pk_node) {
		this.pk_node = pk_node;
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

	public String getTemplatetypecode() {
		return templatetypecode;
	}

	public void setTemplatetypecode(String templatetypecode) {
		this.templatetypecode = templatetypecode;
	}

}