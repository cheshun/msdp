package cheng.wechat.model;


import arch.util.lang.SuperModel;

import javax.enterprise.inject.New;

public class AccountModel extends SuperModel {
	/**
	 * 自定义项1null
	 */
	public static final String VDEF1 = "vdef1";
	/**
	 * 自定义项2null
	 */
	public static final String VDEF2 = "vdef2";
	/**
	 * 自定义项3null
	 */
	public static final String VDEF3 = "vdef3";
	/**
	 * 自定义项4null
	 */
	public static final String VDEF4 = "vdef4";
	/**
	 * 自定义项5null
	 */
	public static final String VDEF5 = "vdef5";
	/**
	 * tsnull
	 */
	public static final String TS = "ts";
	/**
	 * dr
	 */
	public static final String DR = "dr";
	/**
	 * 微信公众号主键null
	 */
	public static final String PK_WECHAT_ACCOUNT = "pk_wechat_account";
	/**
	 * appid
	 */
	public static final String APPID = "appid";
	/**
	 * appsecret
	 */
	public static final String APPSECRET = "appsecret";
	/**
	 * 微信号
	 */
	public static final String ACCOUNTCODE = "accountcode";
	/**
	 * 微信名称
	 */
	public static final String ACCOUNTNAME = "accountname";
	/**
	 * 原始id
	 */
	public static final String GHID = "ghid";
	/**
	 * 加密token
	 */
	public static final String ENCRYPTTOKEN = "encrypttoken";
	/**
	 * 自定义项1null
	 */
	private String vdef1;
	/**
	 * 自定义项2null
	 */
	private String vdef2;
	/**
	 * 自定义项3null
	 */
	private String vdef3;
	/**
	 * 自定义项4null
	 */
	private String vdef4;
	/**
	 * 自定义项5null
	 */
	private String vdef5;
	/**
	 * tsnull
	 */
	private String ts;
	/**
	 * dr
	 */
	private String dr;
	/**
	 * 微信公众号主键null
	 */
	private String pk_wechat_account;
	/**
	 * appid
	 */
	private String appid;
	/**
	 * appsecret
	 */
	private String appsecret;
	/**
	 * 微信号
	 */
	private String accountcode;
	/**
	 * 微信名称
	 */
	private String accountname;
	/**
	 * 原始id
	 */
	private String ghid;
	/**
	 * 加密token
	 */
	private String encrypttoken;

	public String getParentPKFieldName() {
		return null;
	}

	public String getPKFieldName() {
		return "pk_wechat_account";
	}

	public String getTableName() {
		return "wechat_account";
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

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getDr() {
		return dr;
	}

	public void setDr(String dr) {
		this.dr = dr;
	}

	public String getPk_wechat_account() {
		return pk_wechat_account;
	}

	public void setPk_wechat_account(String pk_wechat_account) {
		this.pk_wechat_account = pk_wechat_account;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getAppsecret() {
		return appsecret;
	}

	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}

	public String getAccountcode() {
		return accountcode;
	}

	public void setAccountcode(String accountcode) {
		this.accountcode = accountcode;
	}

	public String getAccountname() {
		return accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public String getGhid() {
		return ghid;
	}

	public void setGhid(String ghid) {
		this.ghid = ghid;
	}

	public String getEncrypttoken() {
		return encrypttoken;
	}

	public void setEncrypttoken(String encrypttoken) {
		this.encrypttoken = encrypttoken;
	}
}