package cheng.pipp.ui.model;


import com.application.module.jdbc.model.NewSuperModel;

public class ReportTemplateModel extends NewSuperModel {

	private String pk_reporttemplate ;
	private String pk_node ;
	
	private String templatename ;
	private String templatecode ;
	private String templatetypecode ;
	private String remark ;
	
	private String vdef1 ;
	private String vdef2 ;
	private String vdef3 ;
	private String vdef4 ;
	private String vdef5 ;
	
	private int dr ;
	private String ts ;
	
	@Override
	public String getParentPKFieldName() {
		return "pk_node";
	}

	@Override
	public String getPKFieldName() {
		return "pk_reporttemplate";
	}

	@Override
	public String getTableName() {
		return "sm_reporttemplate";
	}

	public String getPk_reporttemplate() {
		return pk_reporttemplate;
	}

	public void setPk_reporttemplate(String pk_reporttemplate) {
		this.pk_reporttemplate = pk_reporttemplate;
	}

	public String getPk_node() {
		return pk_node;
	}

	public void setPk_node(String pk_node) {
		this.pk_node = pk_node;
	}

	public String getTemplatename() {
		return templatename;
	}

	public void setTemplatename(String templatename) {
		this.templatename = templatename;
	}

	public String getTemplatecode() {
		return templatecode;
	}

	public void setTemplatecode(String templatecode) {
		this.templatecode = templatecode;
	}

	public String getTemplatetypecode() {
		return templatetypecode;
	}

	public void setTemplatetypecode(String templatetypecode) {
		this.templatetypecode = templatetypecode;
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
