package cheng.pipp.access.web;

import cheng.pipp.access.model.RoleModel;
import cheng.pipp.access.model.RoleNodeModel;
import cheng.pipp.access.model.UserRoleModel;
import cheng.pipp.access.service.IAccessAssignment;
import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.framework.web.BusinessCommonAction;
import cheng.pipp.sys.model.NodeModel;
import cheng.pipp.ui.util.TreeDataUtil;
import cheng.pipp.ui.util.TreeUtil;
import cheng.pipp.ui.vo.TreeNodeVO;
import cheng.pipp.ui.vo.TreeVO;
import cheng.pipp.ui.vo.param.TemplateParamVO;
import com.application.common.context.ApplicationServiceLocator;
import com.application.common.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.lang.UFBoolean;
import com.application.module.jdbc.model.NewSuperModel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Controller
public class AccessAssignmentAction  extends BusinessCommonAction {
	
	@RequestMapping(value="/management/access/assignment/role/index")
	public String initAssignmentPage(HttpServletRequest request, TemplateParamVO paramvo ,Model model) throws BusinessException {
		IDataBaseService queryservice = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
			
		String filename="/management/_dev/authenticate/accessassignment_"+paramvo.getPk_data() ;
		List<RoleModel> rlist = (List<RoleModel>)queryservice.queryByClause(RoleModel.class, " dr=0 ");
		List<UserRoleModel> listu = (List<UserRoleModel>)queryservice.queryByClause(UserRoleModel.class, " pk_user='"+paramvo.getPk_data()+"' and dr=0 ");
		
		//构造树
		List<TreeNodeVO>  nodelist = TreeDataUtil.getIntance().initTreeList(rlist.toArray(new NewSuperModel[0]), "pk_role", "pk_parent_role", "role_name",null,paramvo);
		TreeVO tree = new TreeVO();
		tree.setNodelist(nodelist);
		tree.setTreetype(TreeVO.Tree_Type_treeCheck);
		initRoleTree(nodelist,listu);
		
		TreeUtil.getIntance().createTreeNodeTemplate(getFile(request,filename),"accessassignment",tree,paramvo);
		model.addAttribute("paramvo", paramvo);
		model.addAttribute("actionurl", "/management/access/assignment/rolesave");
		return filename;
	}
	
	private void initRoleTree(List<TreeNodeVO> nodelist, List<UserRoleModel> listu) {
		 for(int i=0;i<nodelist.size();i++){
			 
			 TreeNodeVO vo = nodelist.get(i);
			 
			 setRole(vo,listu);
			 //
			 if(vo.getChildren()!=null && vo.getChildren().size()>0){
				 initRoleTree(vo.getChildren(), listu);
			 }
			
		 }
		
	}

	private void setRole(TreeNodeVO vo, List<UserRoleModel> listu) {
		 for(int j=0;j<listu.size();j++){
			 if(vo.getValue().equals(listu.get(j).getPk_role())){
				 vo.setIscheck(UFBoolean.TRUE);
			 } 
		 }
		
	}

	private File getFile(HttpServletRequest request, String treefilename) {
		String treepath=getSysRealPath(request) + "/WEB-INF/jsp"+treefilename+".jsp" ;
		File treepathfile = new File(treepath);
		return treepathfile;
	}

	
	@RequestMapping(value="/management/access/assignment/rolesave")
	public ModelAndView saveAssignmentPage(HttpServletRequest request,String value, TemplateParamVO paramvo ,Model model) throws BusinessException {
		IAccessAssignment accessAssignment =(IAccessAssignment)ApplicationContextHelper.getService(IAccessAssignment.class);
		
		accessAssignment.assignRole(value, paramvo.getPk_data());
		
		return ajaxDoneSuccess("分配成功");
	
	}
	
	
	@RequestMapping(value="/management/access/assignment/node/index")
	public String initAssignmentnodePage(HttpServletRequest request, TemplateParamVO paramvo ,Model model) throws BusinessException {
		 IDataBaseService queryservice = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
			
		String filename="/management/_dev/authenticate/accessassignment_"+paramvo.getPk_data() ;
//		String filename="/management/_dev/authenticate/accessassignment" ;
		List<NodeModel> rlist = (List<NodeModel>)queryservice.queryByClause(NodeModel.class, " dr=0 ");
		List<RoleNodeModel> listu = (List<RoleNodeModel>)queryservice.queryByClause(RoleNodeModel.class, " pk_role='"+paramvo.getPk_data()+"' and dr=0 ");
		
		//构造树
		List<TreeNodeVO>  nodelist = TreeDataUtil.getIntance().initTreeList(rlist.toArray(new NewSuperModel[0]), "pk_node", "pk_parent_node", "fun_name",null,paramvo);
		TreeVO tree = new TreeVO();
		tree.setNodelist(nodelist);
		tree.setTreetype(TreeVO.Tree_Type_treeCheck);
		initNodeTree(nodelist,listu);
		TreeUtil.getIntance().createTreeNodeTemplate(getFile(request,filename),"accessassignment",tree,paramvo);
		model.addAttribute("paramvo", paramvo);
		model.addAttribute("actionurl", "/management/access/assignment/nodesave");
		return filename;
	}
	
	private void initNodeTree(List<TreeNodeVO> nodelist, List<RoleNodeModel> listu) {
		 for(int i=0;i<nodelist.size();i++){
			 TreeNodeVO vo = nodelist.get(i);
			 
			 setNode(vo,listu);
			 
			 if(vo.getChildren()!=null && vo.getChildren().size()>0){
				 initNodeTree(vo.getChildren(), listu);
			 }
		 }
		
	}

	private void setNode(TreeNodeVO vo, List<RoleNodeModel> listu) {
		for(int j=0;j<listu.size();j++){
			 if(vo.getValue().equals(listu.get(j).getPk_node())){
				 vo.setIscheck(UFBoolean.TRUE); 
			 } 
		 }
		
	}
	
	/**
	 * 保存分配的节点
	 * @author cheng
	 * 2014年5月18日
	 * 下午2:51:54
	 * @param request
	 * @param value 节点主键
	 * @param paramvo 参数
	 * @param model
	 * @return
	 * @throws BusinessException
	 */
	@RequestMapping(value="/management/access/assignment/nodesave")
	public ModelAndView saveAssignmentNodePage(HttpServletRequest request,String value, TemplateParamVO paramvo ,Model model) throws BusinessException {
		//将节点转成数组 
		//判断是否叶子节点
		//将叶子节点的父节点添加的待分配节点中
		String[] values = getAssignNode(value);
		System.out.println(values);
		IAccessAssignment accessAssignment = ApplicationServiceLocator.getService(IAccessAssignment.class);
		
		accessAssignment.assignNode(values, paramvo.getPk_data());
		
		return ajaxDoneSuccess("分配成功");
	
	}

	private String[] getAssignNode(String value) {
		Set<String> nodes = new HashSet<String>();
		if(StringUtils.isEmpty(value)){
			return null;
		}
		String[] values = value.split(",");
		return values;
	}
}
