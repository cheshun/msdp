package cheng.pipp.basic.model;


import arch.util.lang.SuperModel;

public class MetaDataModel extends SuperModel {

	
	private static final long serialVersionUID = 1L;
	private String pk_metadata_type;
	private String pk_metadata;
	private String metadata_name ;
	private String metadata_code ;
	private String remark ;
	
	private String ts ;
	private int dr ;
	private String vdef1 ;
	private String vdef2 ;
	private String vdef3 ;
	private String vdef4 ;
	private String vdef5 ;
	
	
	@Override
	public String getParentPKFieldName() {
		return "pk_metadata_type";
	}

	@Override
	public String getPKFieldName() {
		return "pk_metadata";
	}

	@Override
	public String getTableName() {
		return "pub_metadata";
	}

	public String getPk_metadata_type() {
		return pk_metadata_type;
	}

	public void setPk_metadata_type(String pk_metadata_type) {
		this.pk_metadata_type = pk_metadata_type;
	}

	public String getPk_metadata() {
		return pk_metadata;
	}

	public void setPk_metadata(String pk_metadata) {
		this.pk_metadata = pk_metadata;
	}

	public String getMetadata_name() {
		return metadata_name;
	}

	public void setMetadata_name(String metadata_name) {
		this.metadata_name = metadata_name;
	}

	public String getMetadata_code() {
		return metadata_code;
	}

	public void setMetadata_code(String metadata_code) {
		this.metadata_code = metadata_code;
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
	
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
