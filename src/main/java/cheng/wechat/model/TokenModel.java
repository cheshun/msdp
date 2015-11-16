package cheng.wechat.model;
import cheng.lib.lang.*;
import com.application.module.jdbc.lang.UFDateTime;
import com.application.module.jdbc.model.NewSuperModel;

public class TokenModel extends NewSuperModel {
/**
 *tsnull
 */
	public static final String TS="ts" ;
/**
 *drnull
 */
	public static final String DR="dr" ;
/**
 *微信token主键null
 */
	public static final String PK_WECHAT_TOKEN="pk_wechat_token" ;
/**
 *token类型
 */
	public static final String TOKENTYPE="tokentype" ;
/**
 *token值
 */
	public static final String TOKENVALUE="tokenvalue" ;
/**
 *创建时间
 */
	public static final String GETDATETIME="getdatetime" ;
/**
 *失效时间
 */
	public static final String EXPIREDATETIME="expiredatetime" ;
/**
 *tsnull
 */
	private String ts ;
/**
 *dr
 */
	private String dr ;
/**
 *微信token主键
 */
	private String pk_wechat_token ;
	private String pk_wechat_account ;
/**
 *token类型
 */
	private int tokentype ;
/**
 *token值
 */
	private String tokenvalue ;
/**
 *创建时间
 */
	private UFDateTime getdatetime ;
/**
 *失效时间
 */
	private UFDateTime expiredatetime ;
	public String getParentPKFieldName() {
		return null;
	}
	public String getPKFieldName() {
		return "pk_wechat_token";
	}
	public String getTableName() {
		return "wechat_token";
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

	public String getPk_wechat_token() {
		return pk_wechat_token;
	}

	public void setPk_wechat_token(String pk_wechat_token) {
		this.pk_wechat_token = pk_wechat_token;
	}

	public String getPk_wechat_account() {
		return pk_wechat_account;
	}

	public void setPk_wechat_account(String pk_wechat_account) {
		this.pk_wechat_account = pk_wechat_account;
	}

	public int getTokentype() {
		return tokentype;
	}

	public void setTokentype(int tokentype) {
		this.tokentype = tokentype;
	}

	public String getTokenvalue() {
		return tokenvalue;
	}

	public void setTokenvalue(String tokenvalue) {
		this.tokenvalue = tokenvalue;
	}

	public UFDateTime getGetdatetime() {
		return getdatetime;
	}

	public void setGetdatetime(UFDateTime getdatetime) {
		this.getdatetime = getdatetime;
	}

	public UFDateTime getExpiredatetime() {
		return expiredatetime;
	}

	public void setExpiredatetime(UFDateTime expiredatetime) {
		this.expiredatetime = expiredatetime;
	}
}
