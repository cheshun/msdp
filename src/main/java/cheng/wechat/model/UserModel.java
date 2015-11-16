package cheng.wechat.model;

import com.application.module.jdbc.lang.UFDateTime;
import com.application.module.jdbc.model.NewSuperModel;

public class UserModel extends NewSuperModel {
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
	 * 微信用户主键null
	 */
	public static final String PK_WECHAT_USER = "pk_wechat_user";
	/**
	 * openid
	 */
	public static final String OPENID = "openid";
	/**
	 * unionid
	 */
	public static final String UNIONID = "unionid";
	/**
	 * 昵称
	 */
	public static final String NICKNAME = "nickname";
	/**
	 * 头像
	 */
	public static final String HEADIMGURL = "headimgurl";
	/**
	 * 省
	 */
	public static final String PROVINCE = "province";
	/**
	 * 市
	 */
	public static final String CITY = "city";
	/**
	 * 区县
	 */
	public static final String COUNTRY = "country";
	/**
	 * 性别
	 */
	public static final String SEX = "sex";
	/**
	 * 订阅时间
	 */
	public static final String SUBSCRIBE_TIME = "subscribe_time";
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
	 * 微信用户主键null
	 */
	private String pk_wechat_user;
	private String pk_wechat_account ;
	/**
	 * openid
	 */
	private String openid;
	/**
	 * unionid
	 */
	private String unionid;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 头像
	 */
	private String headimgurl;
	/**
	 * 省
	 */
	private String province;
	/**
	 * 市
	 */
	private String city;
	/**
	 * 区县
	 */
	private String country;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 订阅时间
	 */
	private UFDateTime subscribe_time;

	public String getParentPKFieldName() {
		return null;
	}

	public String getPKFieldName() {
		return "pk_wechat_user";
	}

	public String getTableName() {
		return "wechat_user";
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

	public String getPk_wechat_user() {
		return pk_wechat_user;
	}

	public void setPk_wechat_user(String pk_wechat_user) {
		this.pk_wechat_user = pk_wechat_user;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public UFDateTime getSubscribe_time() {
		return subscribe_time;
	}

	public void setSubscribe_time(UFDateTime subscribe_time) {
		this.subscribe_time = subscribe_time;
	}
}
