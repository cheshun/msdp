package cheng.msdp.ui.web.template.billtemplate;

import java.util.List;

import javax.annotation.Resource;

import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.application.common.context.ApplicationServiceLocator;
import cheng.pipp.framework.web.BusinessCommonAction;
import cheng.msdp.ui.model.UITempletModel;
import cheng.msdp.ui.itf.ITemplateService;
import cheng.msdp.ui.vo.param.TemplateParamVO;
@Controller
public class TemplateAction extends BusinessCommonAction {

	@Resource
	ITemplateService templateService ;
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/management/ui/billtemplate/index")
	public String index(TemplateParamVO vo, Model model) throws BusinessException {
		IDataBaseService queryservice = ApplicationServiceLocator.getService(IDataBaseService.class);
		
		String pk_node = vo.getPk_data();
		List<UITempletModel> list = queryservice.queryByClause(UITempletModel.class, " pk_node='"+pk_node+"'");
		model.addAttribute("param", vo);
		model.addAttribute("data", list);
		return "/management/_dev/template/billtemplate/template";
	}
	@RequestMapping(value="/management/ui/template/billtemplate/add")
	public String add(TemplateParamVO vo, Model model) {
		model.addAttribute("param", vo);
		return "/management/_dev/template/billtemplate/add_template";
	}
	
	@RequestMapping(value="/management/ui/template/billtemplate/edit")
	public String edit(TemplateParamVO vo, Model model) throws BusinessException {
		IDataBaseService queryservice = ApplicationServiceLocator.getService(IDataBaseService.class);
		
		UITempletModel u = queryservice.queryByPK(UITempletModel.class, vo.getPk_data());
		model.addAttribute("item", u);
		model.addAttribute("param", vo);
		return "/management/_dev/template/billtemplate/edit_template";
	}
	@RequestMapping(value="/management/ui/template/billtemplate/save")
	public ModelAndView save(UITempletModel template , TemplateParamVO vo, Model model) throws BusinessException {
		IDataBaseService queryservice =ApplicationServiceLocator.getService(IDataBaseService.class);
		
		if(StringUtils.isNotEmpty(vo.getPk_parent())){
			template.setPk_node(vo.getPk_parent());
		}
		if(StringUtils.isNotEmpty(template.getPrimaryKey())){
			queryservice.update(template);
		}else{
			if(StringUtils.isNotEmpty(vo.getPk_parent())){
				template.setPk_node(vo.getPk_parent());
			}
			queryservice.insert(template);
		}
		return ajaxDoneSuccess("保存成功");
	}
	@RequestMapping(value="/management/ui/template/billtemplate/copy")
	public String copy(TemplateParamVO vo, Model model) throws BusinessException {
		model.addAttribute("param", vo);
		return "/management/_dev/template/billtemplate/copytemplatepage";
	}
	@RequestMapping(value="/management/ui/template/billtemplate/savecopy")
	public ModelAndView savecopy(TemplateParamVO vo,UITempletModel template, Model model) throws BusinessException {
		templateService.copy(template, vo);
		//model.addAttribute("param", vo);
		return ajaxDoneSuccess("复制成功");
	}
}
