package cheng.msdp.ui.model;

import cheng.msdp.ui.vo.ComboxData;
import arch.util.lang.UFBoolean;
import arch.util.lang.SuperModel;

import java.util.List;


/**
 * 页面字段信息
 * 他属于某个页签下面
 * @author cheng
 *
 */
public class UIItemTempletModel  extends SuperModel {

	private static final long serialVersionUID = 1L;

	private String pk_templet_item ;
	private String pk_templet ;
	private String group_code;//卡片界面的组编码
	//字段编码
	private String itemkey;
	//字段默认显示名称
	private String defaultshowname;
	//字段颜色 必输时红色 默认黑色
	private String itemcolor;
	//字段默认值
	private String defaultvalue;
	//字段显示位置
	private int itempos;
	private String tabcode ;
	//字段显示顺序
	private int showorder;
	//字段数据类型
	private String datatype;
	//字段css类型 input select textarea
	private String csstype;
	//字段参照类型
	private String reftype ;
	private List<ComboxData> reftype_data  ;
	//加载公式
	private String loadformula;
	//编辑公式
	private String editformula;
	//校验公式
	private String validateformula;
	//是否编辑
	private UFBoolean isedit;
	//是否为空
	private UFBoolean isnull;
	//是否卡片显示
	private UFBoolean iscardshow;
	//是否列表显示
	private UFBoolean islistshow; 
	//是否列表
	private UFBoolean islist;
	//是否卡片
	private UFBoolean iscard;
	//是否锁定
	private UFBoolean islock;//
	//是否汇总
	private UFBoolean istotal;
	
	//字段输入最大长度
	private int inputlength;//
	//字段宽度
	private int width ;
	private String vdef1 ;
	private String vdef2 ;
	private String vdef3 ;
	private String vdef4 ;
	private String vdef5 ;
	private String vdef6 ;
	private String vdef7 ;
	private String vdef8 ;
	private String vdef9 ;
	public String ts;
	public int dr;
	
	public UIItemTempletModel() {
		
	}
	
	
	public String getPk_templet_item() {
		return pk_templet_item;
	}
	public void setPk_templet_item(String pkTempletItem) {
		pk_templet_item = pkTempletItem;
	}
	 
	 
	public String getItemkey() {
		return itemkey;
	}
	public void setItemkey(String itemkey) {
		this.itemkey = itemkey;
	}
	public String getDefaultshowname() {
		return defaultshowname;
	}
	public void setDefaultshowname(String defaultshowname) {
		this.defaultshowname = defaultshowname;
	}
	public String getItemcolor() {
		return itemcolor;
	}
	public void setItemcolor(String itemcolor) {
		this.itemcolor = itemcolor;
	}
	public String getDefaultvalue() {
		return defaultvalue;
	}
	public void setDefaultvalue(String defaultvalue) {
		this.defaultvalue = defaultvalue;
	}
	public int getItempos() {
		return itempos;
	}
	public void setItempos(int itempos) {
		this.itempos = itempos;
	}
	public String getDatatype() {
		return datatype;
	}
	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}
	public String getLoadformula() {
		return loadformula;
	}
	public void setLoadformula(String loadformula) {
		this.loadformula = loadformula;
	}
	public String getEditformula() {
		return editformula;
	}
	public void setEditformula(String editformula) {
		this.editformula = editformula;
	}
	public UFBoolean getIsedit() {
		return isedit;
	}
	public void setIsedit(UFBoolean isedit) {
		this.isedit = isedit;
	}
	public UFBoolean getIsnull() {
		return isnull;
	}
	public void setIsnull(UFBoolean isnull) {
		this.isnull = isnull;
	}
	public UFBoolean getIscardshow() {
		return iscardshow;
	}
	public void setIscardshow(UFBoolean iscardshow) {
		this.iscardshow = iscardshow;
	}
	public UFBoolean getIslistshow() {
		return islistshow;
	}
	public void setIslistshow(UFBoolean islistshow) {
		this.islistshow = islistshow;
	}
	public UFBoolean getIslist() {
		return islist;
	}
	public void setIslist(UFBoolean islist) {
		this.islist = islist;
	}
	public UFBoolean getIscard() {
		return iscard;
	}
	public void setIscard(UFBoolean iscard) {
		this.iscard = iscard;
	}
	public int getInputlength() {
		return inputlength;
	}
	public void setInputlength(int inputlength) {
		this.inputlength = inputlength;
	}
	public int getShoworder() {
		return showorder;
	}
	public void setShoworder(int showorder) {
		this.showorder = showorder;
	}
	public UFBoolean getIslock() {
		return islock;
	}
	public void setIslock(UFBoolean islock) {
		this.islock = islock;
	}
	public UFBoolean getIstotal() {
		return istotal;
	}
	public void setIstotal(UFBoolean istotal) {
		this.istotal = istotal;
	}
	public String getValidateformula() {
		return validateformula;
	}
	public void setValidateformula(String validateformula) {
		this.validateformula = validateformula;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	public String getReftype() {
		return reftype;
	}
	public void setReftype(String reftype) {
		this.reftype = reftype;
	}
	
	public String getCsstype() {
		return csstype;
	}


	public void setCsstype(String csstype) {
		this.csstype = csstype;
	}


	public List<ComboxData> getReftype_data() {
		return reftype_data;
	}
	
	public void setReftype_data(List<ComboxData> reftypeData) {
		reftype_data = reftypeData;
	}


	public int getDr() {
		return dr;
	}


	public void setDr(int dr) {
		this.dr = dr;
	}


	
	public String getParentPKFieldName() {
		return "pk_templet";
	}


	
	public String getPKFieldName() {
		return "pk_templet_item";
	}


	
	public String getTableName() {
		return "sm_templet_item";
	}


	public String getPk_templet() {
		return pk_templet;
	}


	public void setPk_templet(String pk_templet) {
		this.pk_templet = pk_templet;
	}


	public String getGroup_code() {
		return group_code;
	}


	public void setGroup_code(String group_code) {
		this.group_code = group_code;
	}


	public String getTabcode() {
		return tabcode;
	}


	public void setTabcode(String tabcode) {
		this.tabcode = tabcode;
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


	public String getVdef6() {
		return vdef6;
	}


	public void setVdef6(String vdef6) {
		this.vdef6 = vdef6;
	}


	public String getVdef7() {
		return vdef7;
	}


	public void setVdef7(String vdef7) {
		this.vdef7 = vdef7;
	}


	public String getVdef8() {
		return vdef8;
	}


	public void setVdef8(String vdef8) {
		this.vdef8 = vdef8;
	}


	public String getVdef9() {
		return vdef9;
	}


	public void setVdef9(String vdef9) {
		this.vdef9 = vdef9;
	}

}
