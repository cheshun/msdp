package cheng.pipp.ui.web;

import arch.util.lang.ClassUtil;
import com.application.common.context.ApplicationServiceLocator;
import cheng.pipp.framework.web.BusinessCommonAction;
import cheng.pipp.sys.model.NodeModel;
import cheng.pipp.ui.model.ButtonModel;
import cheng.pipp.ui.model.UIItemTempletModel;
import cheng.pipp.ui.service.IButtonService;
import cheng.pipp.ui.service.ITemplateService;
import cheng.pipp.ui.util.CardTemplateUtil;
import cheng.pipp.ui.vo.param.AddActionParamVO;
import cheng.pipp.ui.vo.param.EditActionParamVO;
import cheng.pipp.ui.vo.uitemplate.CardTemplateVO;

import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import arch.util.lang.SuperModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

@Controller
public class CardController extends BusinessCommonAction {
	
	@RequestMapping("/management/ui/card/add")
	public String add(HttpServletRequest request, AddActionParamVO paramvo ,Model model) throws BusinessException {
		paramvo.setActiontype(AddActionParamVO.actiontype_add);
		//获取节点pk  得到模板 
		//获取按钮pk  得到actionurl
		IDataBaseService queryservice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		String pk_node = paramvo.getTemplateid();
		String pk_role = getUserinfo(request).getPk_role();
		NodeModel node = (NodeModel)queryservice.queryByPK(NodeModel.class, pk_node);
		SuperModel supervo =(SuperModel)  ClassUtil.initClass(node.getModelclass());
		
		//通过节点id 用户id或者角色 得到用户的模板
		/**
		 * 得到节点的默认模板 如果该用户该节点已经分配了模板则用分配的 否则用默认的
		 */
		ITemplateService itemplateService =(ITemplateService)ApplicationServiceLocator.getService(ITemplateService.class);
		IButtonService ibuttonService =(IButtonService)ApplicationServiceLocator.getService(IButtonService.class);
		
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
		
		IDataBaseService queryservice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		String pk_node = paramvo.getTemplateid();
		NodeModel node = (NodeModel)queryservice.queryByPK(NodeModel.class, pk_node);
		SuperModel supervo =(SuperModel)  ClassUtil.initClass(node.getModelclass());
		supervo = (SuperModel)queryservice.queryByPK(supervo.getClass(), paramvo.getPk_data());
		//通过节点id 用户id或者角色 得到用户的模板
		ITemplateService itemplateService =(ITemplateService)ApplicationServiceLocator.getService(ITemplateService.class);
		IButtonService ibuttonService =(IButtonService)ApplicationServiceLocator.getService(IButtonService.class);
		
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
		IDataBaseService queryservice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		ITemplateService itemplateService =(ITemplateService)ApplicationServiceLocator.getService(ITemplateService.class);
		IButtonService ibuttonService =(IButtonService)ApplicationServiceLocator.getService(IButtonService.class);
		
		String pk_node = paramvo.getTemplateid();
		NodeModel node = (NodeModel)queryservice.queryByPK(NodeModel.class, pk_node);
		SuperModel supervo = (SuperModel) ClassUtil.initClass(node.getModelclass());
		supervo = (SuperModel)queryservice.queryByPK(supervo.getClass(), paramvo.getPk_data());
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
