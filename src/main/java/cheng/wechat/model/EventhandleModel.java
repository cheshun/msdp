package cheng.wechat.model;

import arch.util.lang.SuperModel;

public class EventhandleModel extends SuperModel {
/**
 *tsnull
 */
	public static final String TS="ts" ;
/**
 *dr
 */
	public static final String DR="dr" ;
/**
 *微信事件处理主键null
 */
	public static final String PK_WECHAT_EVENTHANDLE="pk_wechat_eventhandle" ;
/**
 *公众号
 */
	public static final String PK_WECHAT_ACCOUNT="pk_wechat_account" ;
/**
 *事件类型
 */
	public static final String EVENTYPE="eventype" ;
/**
 *处理类
 */
	public static final String HANDLECLASS="handleclass" ;
/**
 *过滤器
 */
	public static final String EVENTFILTER="eventfilter" ;
/**
 *备注
 */
	public static final String REMARK="remark" ;
/**
 *tsnull
 */
	private String ts ;
/**
 *dr
 */
	private int dr ;
/**
 *微信事件处理主键null
 */
	private String pk_wechat_eventhandle ;
/**
 *公众号
 */
	private String pk_wechat_account ;
/**
 *事件类型
 */
	private String eventype ;
/**
 *处理类
 */
	private String handleclass ;
/**
 *过滤器
 */
	private String eventfilter ;
/**
 *备注
 */
	private String remark ;
	public String getParentPKFieldName() {
		return null;
	}
	public String getPKFieldName() {
		return "pk_wechat_eventhandle";
	}
	public String getTableName() {
		return "wechat_eventhandle";
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

	public String getPk_wechat_eventhandle() {
		return pk_wechat_eventhandle;
	}

	public void setPk_wechat_eventhandle(String pk_wechat_eventhandle) {
		this.pk_wechat_eventhandle = pk_wechat_eventhandle;
	}

	public String getPk_wechat_account() {
		return pk_wechat_account;
	}

	public void setPk_wechat_account(String pk_wechat_account) {
		this.pk_wechat_account = pk_wechat_account;
	}

	public String getEventype() {
		return eventype;
	}

	public void setEventype(String eventype) {
		this.eventype = eventype;
	}

	public String getHandleclass() {
		return handleclass;
	}

	public void setHandleclass(String handleclass) {
		this.handleclass = handleclass;
	}

	public String getEventfilter() {
		return eventfilter;
	}

	public void setEventfilter(String eventfilter) {
		this.eventfilter = eventfilter;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
