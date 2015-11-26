package cheng.wechat.model;


import arch.util.lang.SuperModel;

public class MsghandleModel extends SuperModel {
/**
 *tsnull
 */
	public static final String TS="ts" ;
/**
 *drnull
 */
	public static final String DR="dr" ;
/**
 *微信消息处理主键null
 */
	public static final String PK_WECHAT_MSGHANDLE="pk_wechat_msghandle" ;
/**
 *消息类型
 */
	public static final String MSGTYPE="msgtype" ;
/**
 *处理类
 */
	public static final String HANDLECLASS="handleclass" ;
/**
 *过滤器
 */
	public static final String MSGFILTER="msgfilter" ;
/**
 *vdef1
 */
	public static final String VDEF1="vdef1" ;
/**
 *公众号
 */
	public static final String PK_WECHAT_ACCOUNT="pk_wechat_account" ;
/**
 *tsnull
 */
	private String ts ;
/**
 *drnull
 */
	private String dr ;
/**
 *微信消息处理主键null
 */
	private String pk_wechat_msghandle ;
/**
 *消息类型
 */
	private String msgtype ;
/**
 *处理类
 */
	private String handleclass ;
/**
 *过滤器
 */
	private String msgfilter ;
/**
 *vdef1
 */
	private String vdef1 ;
/**
 *公众号
 */
	private String pk_wechat_account ;
	public String getParentPKFieldName() {
		return null;
	}
	public String getPKFieldName() {
		return "pk_wechat_msghandle";
	}
	public String getTableName() {
		return "wechat_msghandle";
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

	public String getPk_wechat_msghandle() {
		return pk_wechat_msghandle;
	}

	public void setPk_wechat_msghandle(String pk_wechat_msghandle) {
		this.pk_wechat_msghandle = pk_wechat_msghandle;
	}

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public String getHandleclass() {
		return handleclass;
	}

	public void setHandleclass(String handleclass) {
		this.handleclass = handleclass;
	}

	public String getMsgfilter() {
		return msgfilter;
	}

	public void setMsgfilter(String msgfilter) {
		this.msgfilter = msgfilter;
	}

	public String getVdef1() {
		return vdef1;
	}

	public void setVdef1(String vdef1) {
		this.vdef1 = vdef1;
	}

	public String getPk_wechat_account() {
		return pk_wechat_account;
	}

	public void setPk_wechat_account(String pk_wechat_account) {
		this.pk_wechat_account = pk_wechat_account;
	}
}
