package cheng.msdp.ui.web;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import cheng.lib.util.BeanHelper;
import cheng.lib.util.ClassUtil;
import cheng.lib.lang.PageVO;
import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import cheng.lib.lang.SuperModel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cheng.msdp.basic.util.DataTableUtil;
import com.application.common.context.ApplicationServiceLocator;
import cheng.msdp.framework.web.BusinessCommonAction;
import cheng.msdp.sys.model.NodeModel;
import cheng.msdp.ui.itf.IButtonAction;
import cheng.msdp.ui.model.ButtonModel;
import cheng.msdp.ui.model.QueryConditionTemplateModel;
import cheng.msdp.ui.model.UIItemTempletModel;
import cheng.msdp.ui.itf.IButtonService;
import cheng.msdp.ui.service.IQueryTemplateService;
import cheng.msdp.ui.itf.ITemplateService;
import cheng.msdp.ui.util.ParamUtil;
import cheng.msdp.ui.util.QueryTemplateUtil;
import cheng.msdp.ui.vo.param.DeleteActionParamVO;
import cheng.msdp.ui.vo.param.SaveActionParamVO;
import cheng.msdp.ui.vo.param.SearchActionParamVO;
import cheng.msdp.ui.vo.param.TemplateParamVO;
import cheng.msdp.ui.vo.querytemplate.QueryParamVO;
import cheng.msdp.ui.vo.uitemplate.TableTemplateVO;
@Controller
public class ListTableAction extends BusinessCommonAction {
	@Resource
	IDataBaseService queryservice ;
	@Resource
	ITemplateService itemplateService ; 
	@Resource
	IButtonService ibuttonService ; 
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/management/ui/singletable/index")
	public String index(HttpServletRequest request, TemplateParamVO paramvo ,PageVO pagevo,Model model) throws BusinessException {
		// 接受 表格类型 单字表 多子表
		//用户角色
		paramvo.setTemplateid(paramvo.getTemplateid().split(",")[0]);
		String pk_role = getUserinfo(request).getPk_role();
		NodeModel node = queryservice.queryByPK(NodeModel.class, paramvo.getTemplateid());
		SuperModel supervo = (SuperModel) ClassUtil.initClass(node.getModelclass());
		
		/**
		 * 通过节点id 用户id或者角色 得到用户的模板
		 * 得到节点的默认模板 如果该用户该节点已经分配了模板则用分配的 否则用默认的
		 */
		
		List<UIItemTempletModel> itemlist = itemplateService.getUserTableTemplet(null,pk_role, paramvo.getTemplateid(),null);
		List<ButtonModel> button = ibuttonService.getTempletButton(pk_role, paramvo.getTemplateid());
		//找到该节点的直接页签
		List<NodeModel> listtab = queryservice.queryByClause(NodeModel.class, "pk_parent_node='"+node.getPk_node()+"' and dr=0 ");
		if(!listtab.isEmpty()){
			List<ButtonModel> tabbutton = createButton(listtab,paramvo);
			button.addAll(tabbutton);

		}
		//从模板字段 处理 成 name:key;name:key 的形式
		String condition = getCondition(paramvo,supervo,request);
		initPageCondition(pagevo,condition);
		pagevo = queryservice.queryByPage(supervo.getClass(), pagevo);

		TableTemplateVO tabletemplatevo = DataTableUtil.initTableData(pagevo, itemlist, (List<SuperModel>)pagevo.getData(), button);

		model.addAttribute("tabletemplatevo", tabletemplatevo);
		paramvo.setPk_data("{"+supervo.getPKFieldName()+"}");
		model.addAttribute("paramvo", paramvo);
		return "/management/_frag/template/singletable";
		
	}

	private List<ButtonModel> createButton(List<NodeModel> listtab, TemplateParamVO paramvo) {
		List<ButtonModel> l = new ArrayList<>();
		for(int i=0;i<listtab.size();i++){
			NodeModel node = listtab.get(i);
			ButtonModel button = new ButtonModel();
			button.setBtn_type(ButtonModel.BUTTON_TYPE_BODY);
			button.setBtn_name(node.getFun_name());
			button.setBtn_target("navTab");
			button.setBtn_href(listtab.get(i).getUrl_name()+"?templateid="+node.getPrimaryKey()+"&pk_parent="+paramvo.getTemplateid());
			button.setBtn_class("icon");
			button.setPk_node(node.getPrimaryKey());
			l.add(button);
		}
		return l;
	}



	private String getCondition(TemplateParamVO paramvo, SuperModel supervo,
			HttpServletRequest request) throws BusinessException {
		IQueryTemplateService iqueryTemplateService = ApplicationServiceLocator.getService(IQueryTemplateService.class);
		
		String condition = null ;
		if(StringUtils.isEmpty(paramvo.getActiontype())){
			return condition;
		}
		if("search".equals(paramvo.getActiontype())){
			List<QueryConditionTemplateModel> querylist = iqueryTemplateService.getQueryTemplate(paramvo.getTemplateid(),getUserinfo(request).getPk_role());
			List<QueryParamVO> queryparam = ParamUtil.initQueryParam(querylist,getParamFromReq(request));
			condition = ParamUtil.getConditionStr(queryparam);
		}else if("view".equals(paramvo.getActiontype())){
			return condition;
		}else{
			condition = supervo.getParentPKFieldName()+"='"+paramvo.getPk_data()+"' ";
			paramvo.setPk_parent(paramvo.getPk_data());
		}
		return condition;
	}

	private void initPageCondition(PageVO pagevo, String condition) {
		 if(StringUtils.isEmpty(pagevo.getCondition())){
			 pagevo.setCondition(condition);
		 }
	}


	@RequestMapping("/management/ui/singletable/search")
	public String search(HttpServletRequest request, SearchActionParamVO paramvo ,Model model) throws BusinessException {
		IQueryTemplateService iqueryTemplateService = ApplicationServiceLocator.getService(IQueryTemplateService.class);
		
		String pk_role = getUserinfo(request).getPk_role();
		String pk_node = paramvo.getTemplateid();
		List<QueryConditionTemplateModel> querylist = iqueryTemplateService.getQueryTemplate(pk_node, pk_role);
		QueryTemplateUtil.initQueryTemplate(querylist);
		model.addAttribute("querylist", querylist);
		paramvo.setActiontype("search");
		model.addAttribute("paramvo", paramvo);
		return "management/_frag/search/search";
		
	}
	


}
