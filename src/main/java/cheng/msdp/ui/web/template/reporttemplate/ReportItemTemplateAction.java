package cheng.msdp.ui.web.template.reporttemplate;

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
import cheng.msdp.ui.model.ReportItemTemplateModel;
import cheng.msdp.ui.vo.param.TemplateParamVO;
@Controller
public class ReportItemTemplateAction extends BusinessCommonAction {
	@Resource
	IDataBaseService queryservice ;
	
	/**
	 * 加载查询模板
	 * @param vo
	 * @param model
	 * @return
	 * @throws BusinessException
	 */
	@RequestMapping(value="/management/ui/template/reporttemplate/itemindex")
	public String index(TemplateParamVO vo, Model model) throws BusinessException {
		String pk_node = vo.getPk_data();
		List<ReportItemTemplateModel> list =  queryservice.queryByClause(ReportItemTemplateModel.class, " pk_reporttemplate='"+pk_node+"'");
		model.addAttribute("data", list);
		model.addAttribute("param", vo);
		return "/management/_dev/template/reporttemplate/itemindex";
	}
	
	@RequestMapping(value="/management/ui/template/reporttemplate/additem")
	public String add(TemplateParamVO vo, Model model) {
		model.addAttribute("param", vo);
		return "/management/_dev/template/reporttemplate/edititem";
	}
	
	@RequestMapping(value="/management/ui/template/reporttemplate/edititem")
	public String edit(TemplateParamVO vo, Model model) throws BusinessException {
		ReportItemTemplateModel u = queryservice.queryByPK(ReportItemTemplateModel.class, vo.getPk_data());
		model.addAttribute("item", u);
		model.addAttribute("param", vo);
		return "/management/_dev/template/reporttemplate/edititem";
	}
	@RequestMapping(value="/management/ui/template/reporttemplate/saveitem")
	public ModelAndView save(ReportItemTemplateModel template , TemplateParamVO vo, Model model) throws BusinessException {
		if(StringUtils.isNotEmpty(template.getPrimaryKey())){
			queryservice.update(template);
		}else{
			if(StringUtils.isNotEmpty(vo.getPk_parent())){
				template.setPk_reporttemplate(vo.getPk_parent());;
			}
			queryservice.insert(template);
		}
		return ajaxDoneSuccess("保存成功");
	}
}
