package cheng.pipp.ui.web.template.reporttemplate;

import java.util.List;

import javax.annotation.Resource;

import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cheng.pipp.framework.web.BusinessCommonAction;
import cheng.pipp.ui.model.ReportTemplateModel;
import cheng.pipp.ui.vo.param.TemplateParamVO;
@Controller
public class ReportTemplateAction extends BusinessCommonAction {
	@Resource
	IDataBaseService queryservice ;
	
	/**
	 * 加载查询模板
	 * @param vo
	 * @param model
	 * @return
	 * @throws BusinessException
	 */
	@RequestMapping(value="/management/ui/template/reporttemplate/index")
	public String index(TemplateParamVO vo, Model model) throws BusinessException {
		String pk_node = vo.getPk_data();
		List<ReportTemplateModel> list = queryservice.queryByClause(ReportTemplateModel.class, " pk_node='"+pk_node+"'");
		model.addAttribute("data", list);
		model.addAttribute("param", vo);
		return "/management/_dev/template/reporttemplate/index";
	}
	
	@RequestMapping(value="/management/ui/template/reporttemplate/add")
	public String add(TemplateParamVO vo, Model model) {
		model.addAttribute("param", vo);
		return "/management/_dev/template/reporttemplate/edit";
	}
	
	@RequestMapping(value="/management/ui/template/reporttemplate/edit")
	public String edit(TemplateParamVO vo, Model model) throws BusinessException {
		ReportTemplateModel u = queryservice.queryByPK(ReportTemplateModel.class, vo.getPk_data());
		model.addAttribute("item", u);
		model.addAttribute("param", vo);
		return "/management/_dev/template/reporttemplate/edit";
	}
	@RequestMapping(value="/management/ui/template/reporttemplate/save")
	public ModelAndView save(ReportTemplateModel template , TemplateParamVO vo, Model model) throws BusinessException {
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
}
