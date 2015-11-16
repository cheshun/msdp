package cheng.wechat.model;

import com.application.module.jdbc.model.NewSuperModel;

public class MenuModel extends NewSuperModel {
/**
 *自定义项1null
 */
	public static final String VDEF1="vdef1" ;
/**
 *自定义项2null
 */
	public static final String VDEF2="vdef2" ;
/**
 *自定义项3null
 */
	public static final String VDEF3="vdef3" ;
/**
 *自定义项4null
 */
	public static final String VDEF4="vdef4" ;
/**
 *自定义项5null
 */
	public static final String VDEF5="vdef5" ;
/**
 *tsnull
 */
	public static final String TS="ts" ;
/**
 *drnull
 */
	public static final String DR="dr" ;
/**
 *微信菜单主键null
 */
	public static final String PK_WECHAT_MENU="pk_wechat_menu" ;
/**
 *菜单类型
 */
	public static final String MENUTYPE="menutype" ;
/**
 *菜单名称
 */
	public static final String MENUNAME="menuname" ;
/**
 *keyname
 */
	public static final String KEYNAME="keyname" ;
/**
 *keyvalue
 */
	public static final String KEYVALUE="keyvalue" ;
/**
 *上级菜单
 */
	public static final String PK_PARENT="pk_parent" ;
/**
 *排序
 */
	public static final String MORDER="morder" ;
/**
 *自定义项1null
 */
	private String vdef1 ;
/**
 *自定义项2null
 */
	private String vdef2 ;
/**
 *自定义项3null
 */
	private String vdef3 ;
/**
 *自定义项4null
 */
	private String vdef4 ;
/**
 *自定义项5null
 */
	private String vdef5 ;
/**
 *tsnull
 */
	private String ts ;
/**
 *drnull
 */
	private int dr ;
/**
 *微信菜单主键null
 */
	private String pk_wechat_menu ;
	private String pk_wechat_account ;
/**
 *菜单类型
 */
	private String menutype ;
/**
 *菜单名称
 */
	private String menuname ;
/**
 *keyname
 */
	private String keyname ;
/**
 *keyvalue
 */
	private String keyvalue ;
/**
 *上级菜单
 */
	private String pk_parent ;
/**
 *排序
 */
	private int morder ;
	public String getParentPKFieldName() {
		return null;
	}
	public String getPKFieldName() {
		return "pk_wechat_menu";
	}
	public String getTableName() {
		return "wechat_menu";
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

	public int getDr() {
		return dr;
	}

	public void setDr(int dr) {
		this.dr = dr;
	}

	public String getPk_wechat_menu() {
		return pk_wechat_menu;
	}

	public void setPk_wechat_menu(String pk_wechat_menu) {
		this.pk_wechat_menu = pk_wechat_menu;
	}

	public String getPk_wechat_account() {
		return pk_wechat_account;
	}

	public void setPk_wechat_account(String pk_wechat_account) {
		this.pk_wechat_account = pk_wechat_account;
	}

	public String getMenutype() {
		return menutype;
	}

	public void setMenutype(String menutype) {
		this.menutype = menutype;
	}

	public String getMenuname() {
		return menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

	public String getKeyname() {
		return keyname;
	}

	public void setKeyname(String keyname) {
		this.keyname = keyname;
	}

	public String getKeyvalue() {
		return keyvalue;
	}

	public void setKeyvalue(String keyvalue) {
		this.keyvalue = keyvalue;
	}

	public String getPk_parent() {
		return pk_parent;
	}

	public void setPk_parent(String pk_parent) {
		this.pk_parent = pk_parent;
	}

	public int getMorder() {
		return morder;
	}

	public void setMorder(int morder) {
		this.morder = morder;
	}
}
