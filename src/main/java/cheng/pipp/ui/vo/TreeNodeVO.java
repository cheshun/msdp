package cheng.pipp.ui.vo;


import com.application.module.jdbc.lang.UFBoolean;
import com.application.module.jdbc.vo.CircularlyAccessibleValueObject;

import java.util.ArrayList;
import java.util.List;

public class TreeNodeVO {

	private Object showvalue ;
	private Object pk_node ;
	private Object pk_parentnode ;
	private UFBoolean isseaf ;
	private String url ;
	private Object value ;
	private UFBoolean ischeck ;
	private UFBoolean isicon ;
	
	private CircularlyAccessibleValueObject TreeData ;
	
	private List<TreeNodeVO> children  =new ArrayList<TreeNodeVO>();
	
	public Object getPk_node() {
		return pk_node;
	}
	public void setPk_node(Object pk_node) {
		this.pk_node = pk_node;
	}
	public Object getPk_parentnode() {
		return pk_parentnode;
	}
	public void setPk_parentnode(Object pk_parentnode) {
		this.pk_parentnode = pk_parentnode;
	}
	public UFBoolean getIsseaf() {
		return isseaf;
	}
	public void setIsseaf(UFBoolean isseaf) {
		this.isseaf = isseaf;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public CircularlyAccessibleValueObject getTreeData() {
		return TreeData;
	}
	public void setTreeData(CircularlyAccessibleValueObject treeData) {
		TreeData = treeData;
	}
	public Object getShowvalue() {
		return showvalue;
	}
	public void setShowvalue(Object showvalue) {
		this.showvalue = showvalue;
	}
	public List<TreeNodeVO> getChildren() {
		return children;
	}
	public void setChildren(List<TreeNodeVO> children) {
		this.children = children;
	}
	public void addChild(TreeNodeVO child) {
		this.children.add(child);
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public UFBoolean getIscheck() {
		return ischeck;
	}
	public void setIscheck(UFBoolean ischeck) {
		this.ischeck = ischeck;
	}
	public UFBoolean getIsicon() {
		return isicon;
	}
	public void setIsicon(UFBoolean isicon) {
		this.isicon = isicon;
	}
}
