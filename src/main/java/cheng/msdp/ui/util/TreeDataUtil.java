package cheng.msdp.ui.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import arch.util.lang.UFBoolean;
import arch.util.lang.SuperModel;
import org.apache.commons.lang3.StringUtils;

import com.application.common.context.ApplicationServiceLocator;
import cheng.msdp.sys.model.NodeModel;
import cheng.msdp.ui.vo.TreeNodeVO;
import cheng.msdp.ui.vo.param.TemplateParamVO;

public class TreeDataUtil {

	private static TreeDataUtil treeutil = null;

	public static TreeDataUtil getIntance() {
		if (treeutil == null) {
			treeutil = new TreeDataUtil();
		}
		return treeutil;
	}
	public List<TreeNodeVO> initMenuTree(SuperModel[] treeVO, String idFieldName,
			String parentIDFieldName, String showFieldName) {
		TreeNodeVO[] treenodes = new TreeNodeVO[treeVO.length];
		for (int i = 0; i < treeVO.length; i++) {
			TreeNodeVO treenode = new TreeNodeVO();
			SuperModel node = treeVO[i];
			treenode.setShowvalue(node.getAttributeValue(showFieldName));
			treenode.setPk_node(node.getAttributeValue(idFieldName));
			treenode.setPk_parentnode(node.getAttributeValue(parentIDFieldName));
			treenode.setIsicon(UFBoolean.TRUE);
			if(node.getAttributeValue("url_name")==null){
				treenode.setUrl("");
			}else{
				treenode.setUrl(node.getAttributeValue("url_name")+"");
			}
			treenode.setValue(treenode.getPk_node());
			treenode.setIscheck(UFBoolean.FALSE);
			treenode.setTreeData(node);
			treenodes[i] = treenode;
		}
		return createTree(treenodes);
	}
	
	private List<TreeNodeVO> createTree(TreeNodeVO[] treenodes) {
		List<TreeNodeVO> rootnodes = new ArrayList<TreeNodeVO>();
		// 找到所有根节点。
		for (int i = 0; i < treenodes.length; i++) {
			if (treenodes[i].getPk_parentnode() == null ||StringUtils.isEmpty(treenodes[i].getPk_parentnode() .toString())) {
				treenodes[i].setPk_parentnode("root");
				rootnodes.add(treenodes[i]);
			}
		}
		for (int j = 0; j < rootnodes.size(); j++) {
			setChildren(rootnodes.get(j), treenodes);
		}
		return rootnodes;

	}

	private void setChildren(TreeNodeVO voTreeNode, TreeNodeVO[] treenodes) {
		setUrl(voTreeNode);
		for (int i = 0; i < treenodes.length; i++) {
			TreeNodeVO node = treenodes[i];
			if (node.getPk_parentnode() != null) {
				if (node.getPk_parentnode().equals(voTreeNode.getPk_node())) {
					setUrl(node);
					setChildren(node, treenodes);
					voTreeNode.addChild(node);
				}
			}
		}
	}

	private void setUrl(TreeNodeVO voTreeNode) {
		if (StringUtils.isEmpty(voTreeNode.getUrl())) {
			voTreeNode.setUrl(voTreeNode.getUrl() + "?templateid="+ voTreeNode.getPk_node());
		}
	}
	
	
	public Map<NodeModel,List<NodeModel>> createTreeMap(List<NodeModel> listnodes) throws BusinessException{
		Map<NodeModel,List<NodeModel>> treenodes = new LinkedHashMap<NodeModel,List<NodeModel>>();
		for(int i=0;i<listnodes.size();i++){
			treenodes.put(listnodes.get(i),getChildnodes(listnodes.get(i).getPk_node()));
		}
		return treenodes;
	}
	
	
	private List<NodeModel> getChildnodes(String pk_node) throws BusinessException {
		IDataBaseService queryservice = ApplicationServiceLocator.getService(IDataBaseService.class);
		List<NodeModel> chilren = queryservice.queryByClause(NodeModel.class, " pk_parent_node ='"+pk_node+"' ");
		if(chilren!=null && !chilren.isEmpty()){
			for(int i =0;i<chilren.size();i++){
				chilren.get(i).setChilren(getChildnodes(chilren.get(i).getPk_node()));
			}
		}
		return chilren;
	}
	
	
	
	/**
	 * 根据树节点数据构建一颗树
	 * @param treeVO
	 * @param idFieldName
	 * @param parentIDFieldName
	 * @param showFieldName
	 * @param treeNodeUIType
	 * @param paramvo
	 * @return
	 */
	public List<TreeNodeVO> initTreeList(SuperModel[] treeVO, String idFieldName,
			String parentIDFieldName, String showFieldName,
			String treeNodeUIType, TemplateParamVO paramvo) {
		TreeNodeVO[] treenodes = new TreeNodeVO[treeVO.length];
		for (int i = 0; i < treeVO.length; i++) {
			TreeNodeVO treenode = new TreeNodeVO();
			SuperModel node = treeVO[i];
			treenode.setShowvalue(node.getAttributeValue(showFieldName));
			treenode.setPk_node(node.getAttributeValue(idFieldName));
			treenode.setPk_parentnode(node.getAttributeValue(parentIDFieldName));
			treenode.setUrl(null);
			treenode.setIsseaf((UFBoolean)node.getAttributeValue("isseaf"));
			if(treenode.getIsseaf()==null){
				treenode.setIsseaf(UFBoolean.FALSE);
			}
			treenode.setIsicon(UFBoolean.TRUE);
			treenode.setValue(treenode.getPk_node());
			treenode.setIscheck(UFBoolean.FALSE);
			treenode.setTreeData(node);
			treenodes[i] = treenode;
		}

		return createTree(treenodes, paramvo, treeNodeUIType);
	}

	private List<TreeNodeVO> createTree(TreeNodeVO[] treenodes,
			TemplateParamVO paramvo, String treeNodeUIType) {
		List<TreeNodeVO> rootnodes = new ArrayList<TreeNodeVO>();
		// 找到所有根节点。
		for (int i = 0; i < treenodes.length; i++) {
			if (treenodes[i].getPk_parentnode() == null || StringUtils.isEmpty(treenodes[i].getPk_parentnode().toString())) {
				treenodes[i].setPk_parentnode("root");
				rootnodes.add(treenodes[i]);
			}
		}
		for (int j = 0; j < rootnodes.size(); j++) {
			setChildren(rootnodes.get(j), treenodes, paramvo, treeNodeUIType);
		}
		return rootnodes;

	}

	private void setChildren(TreeNodeVO voTreeNode, TreeNodeVO[] treenodes,
			TemplateParamVO paramvo, String treeNodeUIType) {
		setUrl(voTreeNode, treeNodeUIType, paramvo);
		for (int i = 0; i < treenodes.length; i++) {
			TreeNodeVO node = treenodes[i];
			if (node.getPk_parentnode() != null || StringUtils.isNotEmpty(node.getPk_parentnode().toString())) {
				if (node.getPk_parentnode().equals(voTreeNode.getPk_node())) {
					setUrl(node, treeNodeUIType, paramvo);
					setChildren(node, treenodes, paramvo, treeNodeUIType);
					voTreeNode.addChild(node);
				}
			}
		}
	}

	private void setUrl(TreeNodeVO voTreeNode, String treeNodeUIType,
			TemplateParamVO paramvo) {
		if (StringUtils.isEmpty(voTreeNode.getUrl())) {
			voTreeNode.setUrl(treeNodeUIType + "?templateid="
					+ paramvo.getTemplateid() + "&pk_data="
					+ voTreeNode.getPk_node() + "&pk_parent="
					+ voTreeNode.getPk_node() + "&actiontype="
					+ paramvo.getActiontype());
		}
	}
}
