package cheng.wechat.model;
import cheng.lib.lang.*;
import com.application.module.jdbc.lang.UFDate;
import com.application.module.jdbc.lang.UFDouble;
import com.application.module.jdbc.model.NewSuperModel;

public class UserlocationModel extends NewSuperModel {
/**
 *tsnull
 */
	public static final String TS="ts" ;
/**
 *drnull
 */
	public static final String DR="dr" ;
/**
 *微信用户地理主键null
 */
	public static final String PK_WECHAT_USERLOCATION="pk_wechat_userlocation" ;
/**
 *公众号
 */
	public static final String PK_WECHAT_ACCOUNT="pk_wechat_account" ;
/**
 *用户
 */
	public static final String PK_WECHAT_USER="pk_wechat_user" ;
/**
 *地理位置纬度
 */
	public static final String W_LATITUDE="w_latitude" ;
/**
 *地理位置经度
 */
	public static final String W_LONGITUDE="w_longitude" ;
/**
 *地理位置精度
 */
	public static final String W_PRECISION="w_precision" ;
/**
 *上报日期
 */
	public static final String REPORTDATE="reportdate" ;
/**
 *tsnull
 */
	private String ts ;
/**
 *drnull
 */
	private String dr ;
/**
 *微信用户地理主键null
 */
	private String pk_wechat_userlocation ;
/**
 *公众号
 */
	private String pk_wechat_account ;
/**
 *用户
 */
	private String pk_wechat_user ;
/**
 *地理位置纬度
 */
	private UFDouble w_latitude ;
/**
 *地理位置经度
 */
	private UFDouble w_longitude ;
/**
 *地理位置精度
 */
	private UFDouble w_precision ;
/**
 *上报日期
 */
	private UFDate reportdate ;
	public String getParentPKFieldName() {
		return null;
	}
	public String getPKFieldName() {
		return "pk_wechat_userlocation";
	}
	public String getTableName() {
		return "wechat_userlocation";
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

	public String getPk_wechat_userlocation() {
		return pk_wechat_userlocation;
	}

	public void setPk_wechat_userlocation(String pk_wechat_userlocation) {
		this.pk_wechat_userlocation = pk_wechat_userlocation;
	}

	public String getPk_wechat_account() {
		return pk_wechat_account;
	}

	public void setPk_wechat_account(String pk_wechat_account) {
		this.pk_wechat_account = pk_wechat_account;
	}

	public String getPk_wechat_user() {
		return pk_wechat_user;
	}

	public void setPk_wechat_user(String pk_wechat_user) {
		this.pk_wechat_user = pk_wechat_user;
	}

	public UFDouble getW_latitude() {
		return w_latitude;
	}

	public void setW_latitude(UFDouble w_latitude) {
		this.w_latitude = w_latitude;
	}

	public UFDouble getW_longitude() {
		return w_longitude;
	}

	public void setW_longitude(UFDouble w_longitude) {
		this.w_longitude = w_longitude;
	}

	public UFDouble getW_precision() {
		return w_precision;
	}

	public void setW_precision(UFDouble w_precision) {
		this.w_precision = w_precision;
	}

	public UFDate getReportdate() {
		return reportdate;
	}

	public void setReportdate(UFDate reportdate) {
		this.reportdate = reportdate;
	}
}
