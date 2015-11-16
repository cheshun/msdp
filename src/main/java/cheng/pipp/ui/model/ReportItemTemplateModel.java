package cheng.pipp.ui.model;


import com.application.module.jdbc.lang.UFBoolean;
import com.application.module.jdbc.model.NewSuperModel;

public class ReportItemTemplateModel extends NewSuperModel {

	private static final long serialVersionUID = 1L;
	private String pk_reportitemtemplate ;
	private String pk_reporttemplate ;
	
	private String itemname ;
	private String itemcode ;
	
	private int showorder;
	private String datatype;
	//是否列表显示
	private UFBoolean islistshow; 
	//是否列表
	private UFBoolean islist;
	//是否汇总
	private UFBoolean istotal;
	//字段宽度
	private int width ;
	
	private String remark ;
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
	@Override
	public String getParentPKFieldName() {
		return "pk_reporttemplate";
	}

	@Override
	public String getPKFieldName() {
		return "pk_reportitemtemplate";
	}

	@Override
	public String getTableName() {
		return "sm_reportitemtemplate";
	}

	public String getPk_reportitemtemplate() {
		return pk_reportitemtemplate;
	}

	public void setPk_reportitemtemplate(String pk_reportitemtemplate) {
		this.pk_reportitemtemplate = pk_reportitemtemplate;
	}

	public String getPk_reporttemplate() {
		return pk_reporttemplate;
	}

	public void setPk_reporttemplate(String pk_reporttemplate) {
		this.pk_reporttemplate = pk_reporttemplate;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getItemcode() {
		return itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	public int getShoworder() {
		return showorder;
	}

	public void setShoworder(int showorder) {
		this.showorder = showorder;
	}

	public String getDatatype() {
		return datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public UFBoolean getIslistshow() {
		return islistshow;
	}

	public void setIslistshow(UFBoolean islistshow) {
		this.islistshow = islistshow;
	}

	public UFBoolean getIslist() {
		return islist;
	}

	public void setIslist(UFBoolean islist) {
		this.islist = islist;
	}

	public UFBoolean getIstotal() {
		return istotal;
	}

	public void setIstotal(UFBoolean istotal) {
		this.istotal = istotal;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
