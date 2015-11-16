package cheng.pipp.ui.util;

import cheng.pipp.ui.vo.TreeNodeVO;
import cheng.pipp.ui.vo.TreeVO;
import cheng.pipp.ui.vo.param.TemplateParamVO;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TreeUtil {

	private static TreeUtil treeutil =null;
	public static TreeUtil getIntance(){
		if(treeutil==null){
			treeutil = new TreeUtil();
		}
		return treeutil;
	}
	/**
	 * 构建后台管理的主界面，主要是构建树
	 * @param mapnodes
	 */
	public  void createSysMenuTemplate(String adminindexpath,List<TreeNodeVO> mapnodes){
		String treecode = createSysMenuTree(mapnodes);
		writeSysMenuFile(true,new File(adminindexpath), treecode);
	}
	

	/**
	 * 创建系统菜单树
	 * @author cheng
	 * 2014年5月18日
	 * 下午3:03:17
	 * @param treenodevos 
	 * @return
	 */
	private String createSysMenuTree(List<TreeNodeVO> treenodevos) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<treenodevos.size();i++){
			createSysMenuMenuPage(sb,treenodevos.get(i));
		}
		return sb.toString();
	}
	private void createSysMenuMenuPage(StringBuffer sb,TreeNodeVO entry) {
		
		createProductHead(sb,entry.getShowvalue());
		createProductBody(sb,entry.getChildren());
		
	}
	/**
	 * 构建产品头
	 * @param sb
	 * @param prodecutname 
	 */
	private void createProductHead(StringBuffer sb, Object prodecutname) {
		sb.append("<div class=\"accordionHeader\">").append("\n");
		sb.append("<h2><span>Folder</span>"+prodecutname+"</h2>").append("\n");
		sb.append("</div>").append("\n");
	}
	/**
	 * 构建产品的节点
	 * cheng
	 * 2013-12-15
	 * @param sb
	 * @param value
	 * void
	 */
	private void createProductBody(StringBuffer sb, List<TreeNodeVO> value) {
		sb.append("<div class=\"accordionContent\">").append("\n");
		sb.append("<ul class=\"tree treeFolder collapse \">").append("\n");
		createSysMenuNode(sb,value);
		sb.append("</ul></div>").append("\n");
		
	}
	/**
	 * 创建系统菜单树节点
	 * cheng
	 * 2013-12-15
	 * @param sb
	 * @param value
	 * void
	 */
	private void createSysMenuNode(StringBuffer sb, List<TreeNodeVO> value) {
		for(int i=0;i<value.size();i++){
			TreeNodeVO node = value.get(i);
			if(node.getChildren().isEmpty()){
				sb.append("<li><a href=\"<c:url value='"+node.getUrl()+"?templateid="+node.getPk_node()+"\" target=\"navTab\" rel=\""+node.getPk_node()+"'/>\">"+node.getShowvalue()+"</a>");
				sb.append("</li>").append("\n");
			}else{
				sb.append("<li><a >"+node.getShowvalue()+"</a>").append("\n");
				sb.append("<ul>").append("\n");
				createSysMenuNode(sb, node.getChildren());
				sb.append("</ul>").append("\n");
				sb.append("</li>").append("\n");
			}
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * 构建树表 ，树卡界面 
	 * @param path
	 * @param nodelist
	 */
	public void createTreeNodeTemplate(File file, String prefix, TreeVO tree,TemplateParamVO paramvo) {
		String treecode = createTree(tree.getTreetype(), tree.getNodelist(),paramvo);
		writeTreeFile(tree.getTreetype(),prefix,file, treecode);
	}
	
	/**
	 * 构建一般树
	 * @author cheng
	 * 2014年5月18日
	 * 下午3:00:42
	 * @param treetype 树类型  {@link cheng.pipp.ui.vo.TreeVO}
	 * @param nodeslist 树节点
	 * @param paramvo 其他参数
	 * @return
	 */
	private String createTree(String treetype, List<TreeNodeVO>  nodeslist, TemplateParamVO paramvo) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<nodeslist.size();i++){
			createTreeNodes(treetype,sb,nodeslist.get(i),paramvo);
		}
		return sb.toString();
	}
	/**
	 * 创建树节点
	 * @author cheng
	 * 2014年5月18日
	 * 下午3:00:02
	 * @param treetype 树类型  {@link cheng.pipp.ui.vo.TreeVO}
	 * @param sb
	 * @param childnodes 树节点
	 * @param paramvo
	 */
	private void createTreeNodes(String treetype,StringBuffer sb, TreeNodeVO entry, TemplateParamVO paramvo) {
		List<TreeNodeVO> value = new ArrayList<TreeNodeVO>();
		value.add(entry);
		createTreeNode(treetype ,sb, value,paramvo);
		
	}
	/**
	 * 创建树节点
	 * @author cheng
	 * 2014年5月18日
	 * 下午3:00:02
	 * @param treetype  树类型  {@link cheng.pipp.ui.vo.TreeVO}
	 * @param sb
	 * @param childnodes 树节点
	 * @param paramvo
	 */
	private void createTreeNode(String treetype,StringBuffer sb, List<TreeNodeVO> childnodes, TemplateParamVO paramvo) {
		for(int i=0;i<childnodes.size();i++){
			TreeNodeVO node = childnodes.get(i);
			if(TreeVO.Tree_Type_treeCheck.equals(treetype)){
				if(node.getIscheck().booleanValue() &&node.getIsseaf().booleanValue()){
					sb.append("<li><a tname=\"value\" tvalue=\""+node.getValue()+"\" checked=\"true\">"+node.getShowvalue()+"</a>");
				}else{
					sb.append("<li><a tname=\"value\" tvalue=\""+node.getValue()+"\" >"+node.getShowvalue()+"</a>");
				}
			}else if(TreeVO.Tree_Type_treeUrl.equals(treetype)){
				sb.append("<li><a href=\"<c:url value='"+node.getUrl()+"'/>\" target=\"ajax\" rel=\""+paramvo.getTemplateid()+"_jbsxBox\">"+node.getShowvalue()+"</a>");
			}
			//没有子节点
			if(node.getChildren().isEmpty()){
				sb.append("</li>").append("\n");
			}else{
				sb.append("<ul>").append("\n");
				createTreeNode(treetype,sb, node.getChildren(),paramvo);
				sb.append("</ul>").append("\n");
				sb.append("</li>").append("\n");
			}
		}
		
	}
	 
	/**
	 * 写菜单树文件
	 * @param isindex
	 * @param srcFile
	 * @param hibernateStr
	 */
	private void writeSysMenuFile(boolean isindex, File srcFile , String hibernateStr){
		String filename = null ;
		if(isindex){
			filename ="index";
		}else{
			filename ="tree";
		}
		File head = new File (srcFile.getParent()+"/"+filename+"_head.jsp");
		String headStr = FileToolkit.readFile(head);
		File foot = new File (srcFile.getParent()+"/"+filename+"_foot.jsp");
		String footStr = FileToolkit.readFile(foot);
		String[] tempWriteStrArr = new String[3] ;
		tempWriteStrArr[0] = headStr; 
		tempWriteStrArr[1] = hibernateStr; 
		tempWriteStrArr[2] = footStr;
		FileToolkit.writeFile(srcFile, tempWriteStrArr, false,"UTF-8");
		
	}
	/**
	 * 根据树的类型，创建显示树的文件
	 * @param treetype treeFolder treeCheck expand
	 * @param fielname_prefix 头尾文件的前缀
	 * @param srcFile 新文件地址
	 * @param treecomCode 表示树组件的html 代码
	 */
	private void writeTreeFile(String treetype,String fielname_prefix, File srcFile , String treecomCode){
		if(StringUtils.isEmpty(treetype)){
			treetype="";
		}
		StringBuffer sb = new StringBuffer();
		//expand 节点处理展开状态； collapse 节点处理闭合状态
		if(TreeVO.Tree_Type_treeCheck.equals(treetype)){
			sb.append("<ul onCheck=\"docheck\" class=\"tree treeFolder "+treetype+" expand \">").append("\n");
		}else{
			sb.append("<ul onCheck=\"docheck\" class=\"tree treeFolder "+treetype+" collapse \">").append("\n");
		}
		sb.append(treecomCode);
		sb.append("</ul>").append("\n");
		
		File head = new File (srcFile.getParent()+"/"+fielname_prefix+"_head.jsp");
		String headStr = FileToolkit.readFile(head);
		File foot = new File (srcFile.getParent()+"/"+fielname_prefix+"_foot.jsp");
		String footStr = FileToolkit.readFile(foot);
		String[] tempWriteStrArr = new String[3] ;
		tempWriteStrArr[0] = headStr; 
		tempWriteStrArr[1] = sb.toString(); 
		tempWriteStrArr[2] = footStr;
		FileToolkit.writeFile(srcFile, tempWriteStrArr, false,"UTF-8");
		
	}
	
}
