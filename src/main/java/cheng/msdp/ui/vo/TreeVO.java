package cheng.msdp.ui.vo;

import java.util.List;

public class TreeVO {

	public static final String Tree_Type_treeCheck ="treeCheck" ;
	public static final String Tree_Type_treeRadio ="treeRadio" ;
	public static final String Tree_Type_treeUrl ="url" ;
	private String treetype ;
	private List<TreeNodeVO>  nodelist ;
	public String getTreetype() {
		return treetype;
	}
	public void setTreetype(String treetype) {
		this.treetype = treetype;
	}
	public List<TreeNodeVO> getNodelist() {
		return nodelist;
	}
	public void setNodelist(List<TreeNodeVO> nodelist) {
		this.nodelist = nodelist;
	}
}
