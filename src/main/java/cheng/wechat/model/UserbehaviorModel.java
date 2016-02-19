package cheng.wechat.model;
import cheng.lib.lang.SuperModel;
import cheng.lib.lang.UFDate;

public class UserbehaviorModel extends SuperModel {
/**
 *tsnull
 */
	public static final String TS="ts" ;
/**
 *drnull
 */
	public static final String DR="dr" ;
/**
 *微信用户行为主键null
 */
	public static final String PK_WECHAT_USERBEHAVIOR="pk_wechat_userbehavior" ;
/**
 *公众号
 */
	public static final String PK_WECHAT_ACCOUNT="pk_wechat_account" ;
/**
 *消息类型
 */
	public static final String MSGTYPE="msgtype" ;
/**
 *事件类型
 */
	public static final String EVENTTYPE="eventtype" ;
/**
 *事件值
 */
	public static final String EVENTKEY="eventkey" ;
/**
 *创建日期
 */
	public static final String CREATEDATE="createdate" ;
/**
 *tsnull
 */
	private String ts ;
/**
 *drnull
 */
	private String dr ;
/**
 *微信用户行为主键null
 */
	private String pk_wechat_userbehavior ;
/**
 *公众号
 */
	private String pk_wechat_account ;
/**
 *消息类型
 */
	private String msgtype ;
/**
 *事件类型
 */
	private String eventtype ;
/**
 *事件值
 */
	private String eventkey ;
/**
 *创建日期
 */
	private UFDate createdate ;
	public String getParentPKFieldName() {
		return null;
	}
	public String getPKFieldName() {
		return "pk_wechat_userbehavior";
	}
	public String getTableName() {
		return "wechat_userbehavior";
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

	public String getPk_wechat_userbehavior() {
		return pk_wechat_userbehavior;
	}

	public void setPk_wechat_userbehavior(String pk_wechat_userbehavior) {
		this.pk_wechat_userbehavior = pk_wechat_userbehavior;
	}

	public String getPk_wechat_account() {
		return pk_wechat_account;
	}

	public void setPk_wechat_account(String pk_wechat_account) {
		this.pk_wechat_account = pk_wechat_account;
	}

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public String getEventtype() {
		return eventtype;
	}

	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}

	public String getEventkey() {
		return eventkey;
	}

	public void setEventkey(String eventkey) {
		this.eventkey = eventkey;
	}

	public UFDate getCreatedate() {
		return createdate;
	}

	public void setCreatedate(UFDate createdate) {
		this.createdate = createdate;
	}
}
