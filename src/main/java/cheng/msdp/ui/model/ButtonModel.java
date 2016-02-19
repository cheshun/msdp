package cheng.msdp.ui.model;


import cheng.lib.lang.SuperModel;

public class ButtonModel extends SuperModel {
	
	public static final String BUTTON_TYPE_BUSI_Y = "Y" ;
	public static final String BUTTON_TYPE_BUSI_N = "N" ;
	public static final String BUTTON_TYPE_BODY = "body" ;
	private static final long serialVersionUID = 1L;
	private String pk_node;
	private String pk_button ;
	private String btn_type ;//按钮的类型 ；业务 ；非业务；子表 按钮；
	private int btn_index ;//排序编号
	private String btn_name ;//名称
	private String btn_code ;//编码
	private String btn_class ;//css类型
	private String btn_href ;//链接
	private String btn_target ;//打开方式
	private String btn_title ;//鼠标覆盖时提示信息
	private String btn_status ;//按钮状态 可用，不可以
	private String actionclass ;
	private String ts ;
	private int dr ;
 
	
	public String getParentPKFieldName() {
		return "pk_node";
	}
	
	public String getPKFieldName() {
		return "pk_button";
	}
	
	public String getTableName() {
		return "sm_button";
	}
	public String getPk_node() {
		return pk_node;
	}
	public void setPk_node(String pk_node) {
		this.pk_node = pk_node;
	}
	public String getPk_button() {
		return pk_button;
	}
	public void setPk_button(String pk_button) {
		this.pk_button = pk_button;
	}
	public String getBtn_type() {
		return btn_type;
	}
	public void setBtn_type(String btn_type) {
		this.btn_type = btn_type;
	}
	public int getBtn_index() {
		return btn_index;
	}
	public void setBtn_index(int btn_index) {
		this.btn_index = btn_index;
	}
	public String getBtn_name() {
		return btn_name;
	}
	public void setBtn_name(String btn_name) {
		this.btn_name = btn_name;
	}
	public String getBtn_code() {
		return btn_code;
	}
	public void setBtn_code(String btn_code) {
		this.btn_code = btn_code;
	}
	public String getBtn_class() {
		return btn_class;
	}
	public void setBtn_class(String btn_class) {
		this.btn_class = btn_class;
	}
	public String getBtn_href() {
		return btn_href;
	}
	public void setBtn_href(String btn_href) {
		this.btn_href = btn_href;
	}
	public String getBtn_target() {
		return btn_target;
	}
	public void setBtn_target(String btn_target) {
		this.btn_target = btn_target;
	}
	public String getBtn_title() {
		return btn_title;
	}
	public void setBtn_title(String btn_title) {
		this.btn_title = btn_title;
	}
	public String getBtn_status() {
		return btn_status;
	}
	public void setBtn_status(String btn_status) {
		this.btn_status = btn_status;
	}
	public String getActionclass() {
		return actionclass;
	}
	public void setActionclass(String actionclass) {
		this.actionclass = actionclass;
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
	 
}
