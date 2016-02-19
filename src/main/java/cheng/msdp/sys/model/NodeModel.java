package cheng.msdp.sys.model;

import cheng.lib.lang.UFBoolean;
import cheng.lib.lang.SuperModel;

import java.util.ArrayList;
import java.util.List;

public class NodeModel  extends SuperModel {

	public static final String NodeType_Node ="node" ;
	public static final String NodeType_Report ="report" ;

	private static final long serialVersionUID = 1L;
	private String pk_node ; //节点主键 
	private String pk_parent_node ;  //节点父主键
	private String disp_code  ;    //显示编码 用于自定义菜单顺序
	private String fun_name  ;  //节点名称 
	private String fun_code   ;    //节点编码 能够体现出层级关系
	private String fun_desc  ;  //节点描述
	private int fun_level   ;  //节点级别 从1 开始
	private String fun_type  ;  //节点类型 node=功能节点 report=报表节点
	private int fun_property   ;  //节点属性
	private String url_name ;  //节点的链接
	private String treedata ;  //如果该节点为树 配置树数据的信息
	private String help_name   ;//帮助文件链接
	private String modelclass ;//节点模型类
	private UFBoolean isseaf ;//是否叶子节点
	private String ts ; 
	private int dr  ; 
	private String vdef1 ; //自定义项
	private String vdef2 ;
	private String vdef3 ;
	private String vdef4 ;
	private String vdef5 ;
	private String vdef6 ;
	private String vdef7 ;
	private String vdef8 ;
	private String vdef9 ;
	
	private List<NodeModel> chilren = new ArrayList<NodeModel>();
	
	public NodeModel() {
		 
	}

	/**
	 * 主键配置
	 * @return
	 */
	public String getPk_node() {
		return pk_node;
	}

	public String getDisp_code() {
		return disp_code;
	}

	public void setDisp_code(String dispCode) {
		disp_code = dispCode;
	}

	public String getFun_code() {
		return fun_code;
	}

	public void setFun_code(String funCode) {
		fun_code = funCode;
	}

	public String getFun_desc() {
		return fun_desc;
	}

	public void setFun_desc(String funDesc) {
		fun_desc = funDesc;
	}

	public int getFun_level() {
		return fun_level;
	}

	public void setFun_level(int funLevel) {
		fun_level = funLevel;
	}

	public String getFun_name() {
		return fun_name;
	}

	public void setFun_name(String funName) {
		fun_name = funName;
	}

	public int getFun_property() {
		return fun_property;
	}

	public void setFun_property(int funProperty) {
		fun_property = funProperty;
	}

	public String getUrl_name() {
		return url_name;
	}

	public void setUrl_name(String urlName) {
		url_name = urlName;
	}

	public String getHelp_name() {
		return help_name;
	}

	public void setHelp_name(String helpName) {
		help_name = helpName;
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



	public void setPk_node(String pkNode) {
		pk_node = pkNode;
	}

	
	public String toString() {
		return "NodeModel [disp_code=" + disp_code + ", dr=" + dr
				+ ", fun_code=" + fun_code + ", fun_desc=" + fun_desc
				+ ", fun_level=" + fun_level + ", fun_name=" + fun_name
				+ ", fun_property=" + fun_property + ", help_name=" + help_name
				+ ", pk_node=" + pk_node + ", ts=" + ts + ", url_name="
				+ url_name + "]";
	}

	public String getModelclass() {
		return modelclass;
	}

	public void setModelclass(String modelclass) {
		this.modelclass = modelclass;
	}

	
	public String getParentPKFieldName() {
		return "pk_parent_node";
	}

	
	public String getPKFieldName() {
		return "pk_node";
	}

	
	public String getTableName() {
		return "sm_node";
	}

	public String getPk_parent_node() {
		return pk_parent_node;
	}

	public void setPk_parent_node(String pk_parent_node) {
		this.pk_parent_node = pk_parent_node;
	}

	public List<NodeModel> getChilren() {
		return chilren;
	}

	public void setChilren(List<NodeModel> chilren) {
		this.chilren = chilren;
	}

	public UFBoolean getIsseaf() {
		return isseaf;
	}

	public void setIsseaf(UFBoolean isseaf) {
		this.isseaf = isseaf;
	}

	public String getTreedata() {
		return treedata;
	}

	public void setTreedata(String treedata) {
		this.treedata = treedata;
	}

	public String getFun_type() {
		return fun_type;
	}

	public void setFun_type(String fun_type) {
		this.fun_type = fun_type;
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
