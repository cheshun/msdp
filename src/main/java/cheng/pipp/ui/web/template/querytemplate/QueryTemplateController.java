package cheng.pipp.ui.web.template.querytemplate;

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
import cheng.pipp.ui.model.QueryTemplateModel;
import cheng.pipp.ui.service.IQueryTemplate;
import cheng.pipp.ui.vo.param.TemplateParamVO;
@Controller
public class QueryTemplateController  extends BusinessCommonAction {
	@Resource
	IDataBaseService queryservice ;
	
	@Resource
	IQueryTemplate queryTemplate ;
	/**
	 * 加载查询模板
	 * @param vo
	 * @param model
	 * @return
	 * @throws BusinessException
	 */
	@RequestMapping(value="/management/ui/template/querytemplate/index")
	public String index(TemplateParamVO vo, Model model) throws BusinessException {
		String pk_node = vo.getPk_data();
		List<QueryTemplateModel> list = (List<QueryTemplateModel>) queryservice.queryByClause(QueryTemplateModel.class, " pk_node='"+pk_node+"'");
		model.addAttribute("data", list);
		return "/management/_dev/template/querytemplate/index";
	}
	
	@RequestMapping(value="/management/ui/template/querytemplate/add")
	public String add(TemplateParamVO vo, Model model) {
		model.addAttribute("param", vo);
		return "/management/_dev/template/querytemplate/add";
	}
	
	@RequestMapping(value="/management/ui/template/querytemplate/edit")
	public String edit(TemplateParamVO vo, Model model) throws BusinessException {
		QueryTemplateModel u = (QueryTemplateModel)queryservice.queryByPK(QueryTemplateModel.class, vo.getPk_data());
		model.addAttribute("item", u);
		model.addAttribute("param", vo);
		return "/management/_dev/template/querytemplate/edit";
	}
	@RequestMapping(value="/management/ui/template/querytemplate/save")
	public ModelAndView save(QueryTemplateModel template , TemplateParamVO vo, Model model) throws BusinessException {
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
	@RequestMapping(value="/management/ui/template/querytemplate/copy")
	public String copy(TemplateParamVO vo, Model model) throws BusinessException {
		model.addAttribute("param", vo);
		return "/management/_dev/template/querytemplate/copyquerytemplate";
	}
	@RequestMapping(value="/management/ui/template/querytemplate/savecopy")
	public ModelAndView savecopy(QueryTemplateModel template , TemplateParamVO vo, Model model) throws BusinessException {
		queryTemplate.copy(vo, template);
		return ajaxDoneSuccess("复制成功");
	}
}
