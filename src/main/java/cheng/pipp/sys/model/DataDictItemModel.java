package cheng.pipp.sys.model;


import com.application.module.jdbc.lang.UFBoolean;
import com.application.module.jdbc.model.NewSuperModel;

public class DataDictItemModel extends NewSuperModel {

	private static final long serialVersionUID = -695229054883863918L;
	private String pk_datadict ;
	private String pk_datadictitem ;
	private String itemname ;
	private String itemcode ;
	private String datatype ;
	private String uitype ;//界面显示类型 日期 下拉 参照 
	private String typedata ;// 
	private int length ;
	private UFBoolean isprimary ;
	private UFBoolean isnull ;
	private UFBoolean isTablesyn;
	private UFBoolean isBilltemplatesyn;
	private UFBoolean isQueryTemplatesyn;
	private String itemremark ;
	private String ts ;
	private int dr ;
	
	private String vdef1 ; 
	private String vdef2 ; 
	private String vdef3 ; 
	private String vdef4 ; 
	private String vdef5 ; 
	
	public String getParentPKFieldName() {
		return "pk_datadict";
	}

	
	public String getPKFieldName() {
		return "pk_datadictitem";
	}

	
	public String getTableName() {
		return "sys_datadictitem";
	}

	public String getPk_datadict() {
		return pk_datadict;
	}

	public void setPk_datadict(String pk_datadict) {
		this.pk_datadict = pk_datadict;
	}

	public String getPk_datadictitem() {
		return pk_datadictitem;
	}

	public void setPk_datadictitem(String pk_datadictitem) {
		this.pk_datadictitem = pk_datadictitem;
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

	public String getDatatype() {
		return datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getItemremark() {
		return itemremark;
	}

	public void setItemremark(String itemremark) {
		this.itemremark = itemremark;
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

	public String getUitype() {
		return uitype;
	}

	public void setUitype(String uitype) {
		this.uitype = uitype;
	}

	public String getTypedata() {
		return typedata;
	}

	public void setTypedata(String typedata) {
		this.typedata = typedata;
	}

	public UFBoolean getIsprimary() {
		return isprimary;
	}

	public void setIsprimary(UFBoolean isprimary) {
		this.isprimary = isprimary;
	}

	public UFBoolean getIsTablesyn() {
		return isTablesyn;
	}

	public void setIsTablesyn(UFBoolean isTablesyn) {
		this.isTablesyn = isTablesyn;
	}

	public UFBoolean getIsBilltemplatesyn() {
		return isBilltemplatesyn;
	}

	public void setIsBilltemplatesyn(UFBoolean isBilltemplatesyn) {
		this.isBilltemplatesyn = isBilltemplatesyn;
	}

	public UFBoolean getIsQueryTemplatesyn() {
		return isQueryTemplatesyn;
	}

	public void setIsQueryTemplatesyn(UFBoolean isQueryTemplatesyn) {
		this.isQueryTemplatesyn = isQueryTemplatesyn;
	}

	public UFBoolean getIsnull() {
		return isnull;
	}

	public void setIsnull(UFBoolean isnull) {
		this.isnull = isnull;
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

}
