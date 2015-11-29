package cheng.pipp.ui.web.template;

import cheng.pipp.access.model.RoleModel;
import cheng.pipp.access.service.IAccessAssignment;
import com.application.common.context.ApplicationServiceLocator;
import cheng.pipp.framework.web.BusinessCommonAction;
import cheng.pipp.ui.model.*;
import cheng.pipp.ui.util.TreeDataUtil;
import cheng.pipp.ui.util.TreeUtil;
import cheng.pipp.ui.vo.TreeNodeVO;
import cheng.pipp.ui.vo.TreeVO;
import cheng.pipp.ui.vo.param.TemplateParamVO;
import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import arch.util.lang.UFBoolean;
import arch.util.lang.SuperModel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Collection;
import java.util.List;
@Controller("management.TemplateAssignmentAction")
public class TemplateAssignmentAction  extends BusinessCommonAction {
	
	
	
	
	@Resource
	IAccessAssignment accessAssignment ;
	public static final String Bill="bill";
	public static final String Query="query";
	public static final String Report="report";
	public static final String Button="button";
	/**
	 * 节点 单据模板 查询模板 报表模板 按钮 分配界面
	 * @param request
	 * @param paramvo
	 * @param model
	 * @return
	 * @throws BusinessException
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/management/ui/template/assignment")
	public String initAssignmentPage(HttpServletRequest request, TemplateParamVO paramvo ,Model model) throws BusinessException {
		//查询 pk_data 的非默认单据模板 
		List<UITempletModel> listbill = (List<UITempletModel>) getTemplateData(UITempletModel.class,paramvo );
		//查询 pk_data 的非默认查询模板 
		List<QueryTemplateModel> listquery = (List<QueryTemplateModel>) getTemplateData(QueryTemplateModel.class,paramvo);
		IDataBaseService queryseervice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		List<ButtonModel> listbutton = (List<ButtonModel>)queryseervice.queryByClause(ButtonModel.class, " pk_node='"+paramvo.getPk_data()+"' and dr=0 ");
		//查询 pk_data 的非默认报表模板 
		model.addAttribute("listbill", listbill);
		model.addAttribute("listquery", listquery);
		model.addAttribute("listbutton", listbutton);
		model.addAttribute("paramvo", paramvo);
		
		return "/management/_dev/template/assignment/ass_content";
	}
	@SuppressWarnings("rawtypes")
	public Collection getTemplateData(Class templateclass,TemplateParamVO paramvo) throws BusinessException{
		IDataBaseService queryservice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		return queryservice.queryByClause(templateclass, " dr=0 and templatetypecode !='SYSTEM' and pk_node='"+paramvo.getPk_data()+"'  ");
	}
	/**
	 * 构建分配界面 
	 * @param request
	 * @param paramvo
	 * @param model
	 * @return
	 * @throws BusinessException
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/management/ui/template/doassignment")
	public String initAssignmentTree(HttpServletRequest request, TemplateParamVO paramvo ,Model model) throws BusinessException {
		IDataBaseService queryservice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		String filename="/management/_dev/authenticate/accessassignment_"+paramvo.getPk_data() ;
		List<RoleModel> rlist = (List<RoleModel>)queryservice.queryByClause(RoleModel.class, " dr=0 ");
		TreeVO tree = null;
		if(paramvo.getTemplatetype().equals(Bill)){
			List<TemplateNodeRoleModel> listu =  queryservice.queryByClause(TemplateNodeRoleModel.class, " pk_temple='" + paramvo.getPk_data() + "' and pk_node='" + paramvo.getPk_parent() + "' and dr=0 ");
			tree = createTreeVO(rlist,listu.toArray(new SuperModel[0]),paramvo);
		}
		if(paramvo.getTemplatetype().equals(Query)){
			List<QueryTemplateNodeRoleModel> listu =  queryservice.queryByClause(QueryTemplateNodeRoleModel.class, " pk_querytemplate='" + paramvo.getPk_data() + "' and pk_node='" + paramvo.getPk_parent() + "' and dr=0 ");
			tree = createTreeVO(rlist,listu.toArray(new SuperModel[0]),paramvo);
		}
		if(paramvo.getTemplatetype().equals(Report)){
			List<TemplateNodeRoleModel> listu =  queryservice.queryByClause(TemplateNodeRoleModel.class, " pk_temple='" + paramvo.getPk_data() + "' and pk_node='" + paramvo.getPk_parent() + "' and dr=0 ");
			tree = createTreeVO(rlist,listu.toArray(new SuperModel[0]),paramvo);
		}
		if(paramvo.getTemplatetype().equals(Button)){
			List<ButtonNodeRoleModel> listu =  queryservice.queryByClause(ButtonNodeRoleModel.class, " pk_button='" + paramvo.getPk_data() + "' and pk_node='" + paramvo.getPk_parent() + "' and dr=0 ");
			tree = createTreeVO(rlist,listu.toArray(new SuperModel[0]),paramvo);
		}
		TreeUtil.getIntance().createTreeNodeTemplate(getFile(request,filename),"accessassignment",tree,paramvo);
		model.addAttribute("paramvo", paramvo);
		model.addAttribute("actionurl", "/management/ui/template/assignmentsave");
		return filename;
		
	}
	private TreeVO createTreeVO(List<RoleModel> rlist,
			SuperModel[] listu, TemplateParamVO paramvo) {
		TreeVO tree = new TreeVO();
		List<TreeNodeVO>  nodelist = TreeDataUtil.getIntance().initTreeList(rlist.toArray(new SuperModel[0]), "pk_role", "pk_parent_role", "role_name",null,paramvo);
		initRoleTree(nodelist,listu);
		tree.setNodelist(nodelist);
		tree.setTreetype(TreeVO.Tree_Type_treeCheck);
		return tree;
	}
	/**
	 * 初始化角色树
	 * @param nodelist
	 * @param listu
	 */
	private void initRoleTree(List<TreeNodeVO> nodelist, SuperModel[]  listu) {
		 for(int i=0;i<nodelist.size();i++){
			 TreeNodeVO vo = nodelist.get(i);
			 setRole(vo,listu);
			 if(vo.getChildren()!=null && vo.getChildren().size()>0){
				 initRoleTree(vo.getChildren(), listu);
			 }
		 }
	}

	/**
	 * 初始化角色树的数据
	 * @param vo 角色树的数据
	 * @param listu 已经分配角色的模板信息
	 */
	private void setRole(TreeNodeVO vo, SuperModel[] listu) {
		 for(int j=0;j<listu.length;j++){
			 if(vo.getValue().equals(listu[j].getAttributeValue("pk_role"))){
				 vo.setIscheck(UFBoolean.TRUE);
			 } 
		 }
	}
	
	/**
	 * 获取角色树的文件路径
	 * @param request
	 * @param treefilename 文件的相对路径
	 * @return
	 */
	private File getFile(HttpServletRequest request, String treefilename) {
		String treepath=getSysRealPath(request) + "/WEB-INF/jsp"+treefilename+".jsp" ;
		File treepathfile = new File(treepath);
		return treepathfile;
	}
	
	/**
	 * 保存分配的角色 
	 * @param request
	 * @param value 角色信息 数据用英文逗号隔开
	 * @param paramvo 过程参数 其中包含 节点主键 ，模板主键
	 * @param model 
	 * @return
	 * @throws BusinessException
	 */
	@RequestMapping(value="/management/ui/template/assignmentsave")
	public ModelAndView assignmentsave(HttpServletRequest request,String value , TemplateParamVO paramvo ,Model model) throws BusinessException {
		String[] values = null ;
		if(!StringUtils.isEmpty(value)){
			values = value.split(",");
		}
		String pk_template = paramvo.getPk_data();
		String pk_node = paramvo.getPk_parent();
		String templatetype = paramvo.getTemplatetype();
		if(Bill.equals(templatetype)){
			accessAssignment.assignTemplate(values, pk_node, pk_template);
		}
		if(Query.equals(templatetype)){
			accessAssignment.assignQueryTemplate(values, pk_node, pk_template);	
		}
		if(Report.equals(templatetype)){
			
		}
		if(Button.equals(templatetype)){
			accessAssignment.assignButton(values, pk_node, pk_template);
		}
		
		return ajaxDoneSuccess("分配成功");
	}
}
