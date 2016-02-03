package cheng.msdp.basic.model;

import arch.util.lang.SuperModel;

public class MetaDataTypeModel extends SuperModel {

	
	private static final long serialVersionUID = 1L;
	private String pk_metadata_type;
	private String type_name ;
	private String type_code ;
	private String remark ;
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	private String ts ;
	private int dr ;
	private String vdef1 ;
	private String vdef2 ;
	private String vdef3 ;
	private String vdef4 ;
	private String vdef5 ;
	
	
	@Override
	public String getParentPKFieldName() {
		return null;
	}

	@Override
	public String getPKFieldName() {
		return "pk_metadata_type";
	}

	@Override
	public String getTableName() {
		return "pub_metadata_type";
	}

	public String getPk_metadata_type() {
		return pk_metadata_type;
	}

	public void setPk_metadata_type(String pk_metadata_type) {
		this.pk_metadata_type = pk_metadata_type;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public String getType_code() {
		return type_code;
	}

	public void setType_code(String type_code) {
		this.type_code = type_code;
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

}
