package cheng.msdp.ui.web;

import cheng.lib.util.ClassUtil;
import com.application.common.context.ApplicationServiceLocator;
import cheng.msdp.framework.web.BusinessCommonAction;
import cheng.msdp.sys.model.NodeModel;
import cheng.msdp.ui.model.ButtonModel;
import cheng.msdp.ui.model.UIItemTempletModel;
import cheng.msdp.ui.itf.IButtonService;
import cheng.msdp.ui.itf.ITemplateService;
import cheng.msdp.ui.util.CardTemplateUtil;
import cheng.msdp.ui.vo.param.AddActionParamVO;
import cheng.msdp.ui.vo.param.EditActionParamVO;
import cheng.msdp.ui.vo.uitemplate.CardTemplateVO;

import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import cheng.lib.lang.SuperModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

@Controller
public class SingleCardAction extends BusinessCommonAction {
	
	@RequestMapping("/management/ui/card/add")
	public String add(HttpServletRequest request, AddActionParamVO paramvo ,Model model) throws BusinessException {
		paramvo.setActiontype(AddActionParamVO.actiontype_add);
		//获取节点pk  得到模板 
		//获取按钮pk  得到actionurl
		IDataBaseService queryservice =  ApplicationServiceLocator.getService(IDataBaseService.class);
		
		String pk_node = paramvo.getTemplateid();
		String pk_role = getUserinfo(request).getPk_role();
		NodeModel node = queryservice.queryByPK(NodeModel.class, pk_node);
		SuperModel supervo =(SuperModel)  ClassUtil.initClass(node.getModelclass());
		
		//通过节点id 用户id或者角色 得到用户的模板
		/**
		 * 得到节点的默认模板 如果该用户该节点已经分配了模板则用分配的 否则用默认的
		 */
		ITemplateService itemplateService = ApplicationServiceLocator.getService(ITemplateService.class);
		IButtonService ibuttonService = ApplicationServiceLocator.getService(IButtonService.class);
		
		List<UIItemTempletModel> itemlist = itemplateService.getUserCardTemplet(null,pk_role, pk_node,null);
		List<ButtonModel> buttons = ibuttonService.getTempletButton(pk_role, pk_node);
		
		CardTemplateUtil.initCardUI("",supervo,itemlist);
		
		CardTemplateVO cardtemplatevo = new CardTemplateVO();
		cardtemplatevo.setItemlist(itemlist);
		cardtemplatevo.setListbuttons(buttons);
		
		model.addAttribute("cardtemplatevo", cardtemplatevo);
		model.addAttribute("paramvo", paramvo);
		
		return "/management/_frag/template/card";
		
	}
	@RequestMapping("/management/ui/card/edit")
	public String edit(HttpServletRequest request, EditActionParamVO paramvo ,Model model) throws BusinessException {
		paramvo.setActiontype(EditActionParamVO.actiontype_edit);
		
		IDataBaseService queryservice =  ApplicationServiceLocator.getService(IDataBaseService.class);
		
		String pk_node = paramvo.getTemplateid();
		NodeModel node = queryservice.queryByPK(NodeModel.class, pk_node);
		SuperModel supervo =(SuperModel)  ClassUtil.initClass(node.getModelclass());
		supervo = queryservice.queryByPK(supervo.getClass(), paramvo.getPk_data());
		//通过节点id 用户id或者角色 得到用户的模板
		ITemplateService itemplateService =ApplicationServiceLocator.getService(ITemplateService.class);
		IButtonService ibuttonService = ApplicationServiceLocator.getService(IButtonService.class);
		
		String pk_role = getUserinfo(request).getPk_role();
		List<UIItemTempletModel> itemlist = itemplateService.getUserCardTemplet(null,pk_role, pk_node,null);
		List<ButtonModel> buttons = ibuttonService.getTempletButton(pk_role, pk_node);
		
		CardTemplateUtil.initCardUI("",supervo,itemlist);
		
		CardTemplateVO cardtemplatevo = new CardTemplateVO();
		cardtemplatevo.setItemlist(itemlist);
		cardtemplatevo.setListbuttons(buttons);
		
		model.addAttribute("cardtemplatevo", cardtemplatevo);
		model.addAttribute("paramvo", paramvo);
		return "/management/_frag/template/card";
	}
	@RequestMapping("/management/ui/card/detail")
	public String detail(HttpServletRequest request, EditActionParamVO paramvo ,Model model) throws BusinessException {
		IDataBaseService queryservice =  ApplicationServiceLocator.getService(IDataBaseService.class);
		ITemplateService itemplateService = ApplicationServiceLocator.getService(ITemplateService.class);
		IButtonService ibuttonService = ApplicationServiceLocator.getService(IButtonService.class);
		
		String pk_node = paramvo.getTemplateid();
		NodeModel node =  queryservice.queryByPK(NodeModel.class, pk_node);
		SuperModel supervo = (SuperModel) ClassUtil.initClass(node.getModelclass());
		supervo = queryservice.queryByPK(supervo.getClass(), paramvo.getPk_data());
		//通过节点id 用户id或者角色 得到用户的模板
		String pk_role = getUserinfo(request).getPk_role();
		List<UIItemTempletModel> itemlist = itemplateService.getUserCardTemplet(null,pk_role, pk_node,null);
		List<ButtonModel> buttons = ibuttonService.getTempletButton(pk_role, pk_node);
		CardTemplateUtil.initCardUI(paramvo.getActiontype(),supervo,itemlist);
		CardTemplateVO cardtemplatevo = new CardTemplateVO();
		cardtemplatevo.setItemlist(itemlist);
		cardtemplatevo.setListbuttons(buttons);
		model.addAttribute("cardtemplatevo", cardtemplatevo);
		model.addAttribute("paramvo", paramvo);
		return "/management/_frag/template/card";
		
	}
	
	
	
}
