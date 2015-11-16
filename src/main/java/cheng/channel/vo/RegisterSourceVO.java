package cheng.channel.vo;


import com.application.module.jdbc.model.NewSuperModel;

public class RegisterSourceVO extends NewSuperModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pk_registersource ;
	private int registersource ;
	private String sourcename ;
	private int dr ;
	private String ts ;
	private String remark ;
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
		return "pk_registersource";
	}

	@Override
	public String getTableName() {
		return "channel_registersource";
	}

	public String getPk_registersource() {
		return pk_registersource;
	}

	public void setPk_registersource(String pk_registersource) {
		this.pk_registersource = pk_registersource;
	}

	public int getRegistersource() {
		return registersource;
	}

	public void setRegistersource(int registersource) {
		this.registersource = registersource;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSourcename() {
		return sourcename;
	}

	public void setSourcename(String sourcename) {
		this.sourcename = sourcename;
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
