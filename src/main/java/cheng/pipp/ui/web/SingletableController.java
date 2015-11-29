package cheng.pipp.ui.web;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import arch.util.lang.BeanHelper;
import arch.util.lang.ClassUtil;
import arch.util.lang.PageVO;
import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import arch.util.lang.SuperModel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cheng.pipp.basic.util.DataTableUtil;
import com.application.common.context.ApplicationServiceLocator;
import cheng.pipp.framework.web.BusinessCommonAction;
import cheng.pipp.sys.model.NodeModel;
import cheng.pipp.ui.itf.IButtonAction;
import cheng.pipp.ui.model.ButtonModel;
import cheng.pipp.ui.model.QueryConditionTemplateModel;
import cheng.pipp.ui.model.UIItemTempletModel;
import cheng.pipp.ui.service.IButtonService;
import cheng.pipp.ui.service.IQueryTemplate;
import cheng.pipp.ui.service.ITemplateService;
import cheng.pipp.ui.util.ParamUtil;
import cheng.pipp.ui.util.QueryTemplateUtil;
import cheng.pipp.ui.vo.param.DeleteActionParamVO;
import cheng.pipp.ui.vo.param.SaveActionParamVO;
import cheng.pipp.ui.vo.param.SearchActionParamVO;
import cheng.pipp.ui.vo.param.TemplateParamVO;
import cheng.pipp.ui.vo.querytemplate.QueryParamVO;
import cheng.pipp.ui.vo.uitemplate.TableTemplateVO;
@Controller
public class SingletableController extends BusinessCommonAction {
	@Resource
	IDataBaseService queryservice ;
	@Resource
	ITemplateService itemplateService ; 
	@Resource
	IButtonService ibuttonService ; 
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/management/ui/singletable/index")
	public String index(HttpServletRequest request, TemplateParamVO paramvo ,PageVO pagevo,Model model) throws BusinessException {
		
		TableTemplateVO tabletemplatevo = new TableTemplateVO();
		//用户角色
		paramvo.setTemplateid(paramvo.getTemplateid().split(",")[0]);
		String pk_role = getUserinfo(request).getPk_role();
		NodeModel node = (NodeModel)queryservice.queryByPK(NodeModel.class, paramvo.getTemplateid());
		SuperModel supervo = (SuperModel) ClassUtil.initClass(node.getModelclass());
		
		/**
		 * 通过节点id 用户id或者角色 得到用户的模板
		 * 得到节点的默认模板 如果该用户该节点已经分配了模板则用分配的 否则用默认的
		 */
		
		List<UIItemTempletModel> itemlist = itemplateService.getUserTableTemplet(null,pk_role, paramvo.getTemplateid(),null);
		List<ButtonModel> button = ibuttonService.getTempletButton(pk_role, paramvo.getTemplateid());
		//找到该节点的直接页签
		List<NodeModel> listtab = (List<NodeModel>)queryservice.queryByClause(NodeModel.class, "pk_parent_node='"+node.getPk_node()+"' and dr=0 ");
		if(!listtab.isEmpty()){
			List<ButtonModel> tabbutton = createButton(listtab,paramvo);
			button.addAll(tabbutton);

		}
		//从模板字段 处理 成 name:key;name:key 的形式
		String condition = getCondition(paramvo,supervo,request);
		initPageCondition(pagevo,condition);
		pagevo = queryservice.queryByPage(supervo.getClass(), pagevo);
		
		tabletemplatevo = DataTableUtil.initTableData(pagevo, itemlist, (List<SuperModel>)pagevo.getData(), button);
		
		model.addAttribute("tabletemplatevo", tabletemplatevo);
		paramvo.setPk_data("{"+supervo.getPKFieldName()+"}");
		model.addAttribute("paramvo", paramvo);
		return "/management/_frag/template/singletable";
		
	}

	private List<ButtonModel> createButton(List<NodeModel> listtab, TemplateParamVO paramvo) {
		List<ButtonModel> l = new ArrayList<ButtonModel>();
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
		IQueryTemplate iqueryTemplate =(IQueryTemplate)ApplicationServiceLocator.getService(IQueryTemplate.class);
		
		String condition = null ;
		if(StringUtils.isEmpty(paramvo.getActiontype())){
			return condition;
		}
		if("search".equals(paramvo.getActiontype())){
			List<QueryConditionTemplateModel> querylist = iqueryTemplate.getQueryTemplate(paramvo.getTemplateid(),getUserinfo(request).getPk_role());
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

	
	@RequestMapping("/management/ui/singletable/delete")
	public ModelAndView delete(HttpServletRequest request, DeleteActionParamVO paramvo ,Model model) throws BusinessException {
		IDataBaseService queryservice =(IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		String pk_node = paramvo.getTemplateid();
		NodeModel node = (NodeModel)queryservice.queryByPK(NodeModel.class, pk_node);
		SuperModel supervo = (SuperModel) ClassUtil.initClass(node.getModelclass());
		queryservice.deleteByPK(supervo.getClass(), paramvo.getPk_data());
		
		return ajaxDoneSuccess("删除成功");
		
	}
	

	@RequestMapping("/management/ui/singletable/save")
	public ModelAndView save(SaveActionParamVO paramvo ,HttpServletRequest request,Model model) throws BusinessException {
		IDataBaseService queryservice =(IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		String pk_node = paramvo.getTemplateid().split(",")[0];
		paramvo.setTemplateid(pk_node);
		NodeModel node = (NodeModel)queryservice.queryByPK(NodeModel.class, pk_node);
		//接收到节点的pk 解析 模型 反射得到值
		SuperModel supervo = (SuperModel) ClassUtil.initClass(node.getModelclass());
		//接收到所有字段和值
		Map<String, Object> values = getParamFromReq(request);

		initBean(supervo ,values);
		//保存之前处理要保存的数据 从按钮中取得classname
		ButtonModel button = (ButtonModel) queryservice.queryByPK(ButtonModel.class, paramvo.getPk_button());
		IButtonAction buttonaction = null ;
		if(StringUtils.isNotEmpty(button.getActionclass())){
			buttonaction = (IButtonAction) ClassUtil.initClass(button.getActionclass());//IButtonAction
			supervo = buttonaction.beforeSaveAction(supervo, paramvo, request);
		}
		//功能节点 添加下级节点需要
		if(StringUtils.isNotEmpty(paramvo.getPk_parent())){
			if(supervo.getAttributeValue(supervo.getParentPKFieldName())==null || StringUtils.isEmpty(supervo.getAttributeValue(supervo.getParentPKFieldName()).toString())){
				BeanHelper.setProperty(supervo, supervo.getParentPKFieldName(), paramvo.getPk_parent());
			}
		}
		if(StringUtils.isEmpty(supervo.getPrimaryKey())){
			queryservice.insertVO(supervo);
		}else{
			queryservice.updateVO(supervo);
		}
		if(buttonaction!=null){
			supervo = buttonaction.afterSaveAction(supervo, paramvo, request);
		}
		return ajaxDoneSuccess("保存成功");
		
	}
	
	@RequestMapping("/management/ui/singletable/search")
	public String search(HttpServletRequest request, SearchActionParamVO paramvo ,Model model) throws BusinessException {
		IQueryTemplate iqueryTemplate =(IQueryTemplate)ApplicationServiceLocator.getService(IQueryTemplate.class);
		
		String pk_role = getUserinfo(request).getPk_role();
		String pk_node = paramvo.getTemplateid();
		List<QueryConditionTemplateModel> querylist = iqueryTemplate.getQueryTemplate(pk_node, pk_role);
		QueryTemplateUtil.initQueryTemplate(querylist);
		model.addAttribute("querylist", querylist);
		paramvo.setActiontype("search");
		model.addAttribute("paramvo", paramvo);
		return "management/_frag/search/search";
		
	}
	
	private SuperModel initBean(SuperModel supervo, Map<String, Object> values) {
		Iterator<Entry<String, Object>> lt = values.entrySet().iterator();
		while(lt.hasNext()){
			Entry<String, Object> entry = lt.next();
			BeanHelper.setProperty(supervo, entry.getKey(), entry.getValue());
		}
		return supervo;
	}
	

}
