package cheng.msdp.access.model;


import arch.util.lang.SuperModel;

public class UserModel extends SuperModel {

	private static final long serialVersionUID = -2549770144649770858L;
	private String pk_role ;
	private String pk_user;
	private String user_code  ;
	private String user_name  ;
	private String user_mail ;
	private String user_type ;
	private String user_phone ;
	private String user_note  ;
	private String user_password ;
	private String birthDate;
	private String disable_date ;
	private String able_date  ;
	private Boolean locked_tag ;
	private int dr;
	private String ts;
	
	public String getParentPKFieldName() {
		return null;
	}
	
	public String getPKFieldName() {
		return "pk_user";
	}
	
	public String getTableName() {
		return "sm_user";
	}
	public String getPk_user() {
		return pk_user;
	}
	public void setPk_user(String pk_user) {
		this.pk_user = pk_user;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
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
	public String getUser_code() {
		return user_code;
	}
	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_mail() {
		return user_mail;
	}
	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
	public String getUser_note() {
		return user_note;
	}
	public void setUser_note(String user_note) {
		this.user_note = user_note;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getDisable_date() {
		return disable_date;
	}
	public void setDisable_date(String disable_date) {
		this.disable_date = disable_date;
	}
	public String getAble_date() {
		return able_date;
	}
	public void setAble_date(String able_date) {
		this.able_date = able_date;
	}
	public Boolean getLocked_tag() {
		return locked_tag;
	}
	public void setLocked_tag(Boolean locked_tag) {
		this.locked_tag = locked_tag;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getPk_role() {
		return pk_role;
	}
	public void setPk_role(String pk_role) {
		this.pk_role = pk_role;
	}
}
