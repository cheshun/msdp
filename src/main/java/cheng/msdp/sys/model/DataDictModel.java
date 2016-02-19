package cheng.msdp.sys.model;


import cheng.lib.lang.UFBoolean;
import cheng.lib.lang.SuperModel;

public class DataDictModel extends SuperModel {

	private static final long serialVersionUID = 1L;
	private String pk_module ;
	private String pk_datadict ;
	private String datatablename ;
	private String datatablecode ;
	private String pk_node ;//关联的节点
	private UFBoolean isbusi ;
	
	private String datatableremark ;
	private String ts ;
	private int dr ;
	
	private String vdef1 ;
	private String vdef2 ;
	private String vdef3 ;
	private String vdef4 ;
	
	public String getParentPKFieldName() {
		return "pk_module";
	}

	
	public String getPKFieldName() {
		return "pk_datadict";
	}

	
	public String getTableName() {
		return "sys_datadict";
	}

	public String getPk_module() {
		return pk_module;
	}

	public void setPk_module(String pk_module) {
		this.pk_module = pk_module;
	}

	public String getPk_datadict() {
		return pk_datadict;
	}

	public void setPk_datadict(String pk_datadict) {
		this.pk_datadict = pk_datadict;
	}

	public String getDatatablename() {
		return datatablename;
	}

	public void setDatatablename(String datatablename) {
		this.datatablename = datatablename;
	}

	public String getDatatablecode() {
		return datatablecode;
	}

	public void setDatatablecode(String datatablecode) {
		this.datatablecode = datatablecode;
	}

	public String getDatatableremark() {
		return datatableremark;
	}

	public void setDatatableremark(String datatableremark) {
		this.datatableremark = datatableremark;
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

	public UFBoolean getIsbusi() {
		return isbusi;
	}

	public void setIsbusi(UFBoolean isbusi) {
		this.isbusi = isbusi;
	}
 
}
