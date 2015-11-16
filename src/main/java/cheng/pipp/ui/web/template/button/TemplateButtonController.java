package cheng.pipp.ui.web.template.button;

import java.util.List;

import cheng.pipp.ui.constant.ButtonStatus;
import com.application.common.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.framework.web.BusinessCommonAction;
import cheng.pipp.ui.model.ButtonModel;
import cheng.pipp.ui.vo.param.TemplateParamVO;
@Controller("management.TemplateButtonController")
public class TemplateButtonController  extends BusinessCommonAction {
	
	@RequestMapping(value="/management/ui/template/buttonmananger/index")
	public String index(TemplateParamVO vo, Model model) throws BusinessException {
		IDataBaseService queryservice = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
		
		String pk_parent = vo.getPk_data();
		@SuppressWarnings("unchecked")
		List<ButtonModel> list = (List<ButtonModel>) queryservice.queryByClause(ButtonModel.class, " pk_node='" + pk_parent + "' ");
		for( ButtonModel buttonModel :list){
			buttonModel.setBtn_status(ButtonStatus.getStatusLable(buttonModel.getBtn_status()));
		}
		model.addAttribute("data", list);
		model.addAttribute("param", vo);
		return "/management/_dev/template/buttonmananger/index";
	}
	
	@RequestMapping(value="/management/ui/template/buttonmananger/add")
	public String add(TemplateParamVO vo, Model model) {
		model.addAttribute("param", vo);
		return "/management/_dev/template/buttonmananger/add";
	}
	
	@RequestMapping(value="/management/ui/template/buttonmananger/edit")
	public String edit(TemplateParamVO vo, Model model) throws BusinessException {
		IDataBaseService queryservice = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
		
		ButtonModel u = (ButtonModel)queryservice.queryByPK(ButtonModel.class, vo.getPk_data());
		model.addAttribute("item", u);
		model.addAttribute("param", vo);
		return "/management/_dev/template/buttonmananger/edit";
	}
	@RequestMapping(value="/management/ui/template/buttonmananger/save")
	public ModelAndView save(ButtonModel button,TemplateParamVO vo, Model model) throws BusinessException {
		IDataBaseService queryservice = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
		
		if(StringUtils.isNotEmpty(vo.getPk_parent())){
			button.setPk_node(vo.getPk_parent());
		}
		if(StringUtils.isNotEmpty(button.getPrimaryKey())){
			queryservice.updateVO(button);
		}else{
			queryservice.insertVO(button);
		}
		return ajaxDoneSuccess("保存成功");
	}
}
