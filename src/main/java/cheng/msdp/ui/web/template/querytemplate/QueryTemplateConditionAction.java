package cheng.msdp.ui.web.template.querytemplate;

import java.util.List;

import javax.annotation.Resource;

import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cheng.msdp.framework.web.BusinessCommonAction;
import cheng.msdp.ui.model.QueryConditionTemplateModel;
import cheng.msdp.ui.vo.param.TemplateParamVO;
@Controller
public class QueryTemplateConditionAction extends BusinessCommonAction {
	@Resource
	IDataBaseService queryservice ;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/management/ui/template/querytemplate/item")
	public String index(TemplateParamVO vo, Model model) throws BusinessException {
		String pk_parent = vo.getPk_data();
		List<QueryConditionTemplateModel> list = queryservice
				.queryByClause(QueryConditionTemplateModel.class, " pk_querytemplate='" + pk_parent + "'");
		model.addAttribute("data", list);
		model.addAttribute("param", vo);
		return "/management/_dev/template/querytemplate/item";
	}
	
	@RequestMapping(value="/management/ui/template/querytemplate/item_add")
	public String add(TemplateParamVO vo, Model model) {
		model.addAttribute("param", vo);
		return "/management/_dev/template/querytemplate/item_add";
	}
	@RequestMapping(value="/management/ui/template/querytemplate/item_edit")
	public String edit(TemplateParamVO vo, Model model) throws BusinessException {
		QueryConditionTemplateModel u = queryservice.queryByPK(QueryConditionTemplateModel.class, vo.getPk_data());
		model.addAttribute("item", u);
		model.addAttribute("param", vo);
		return "/management/_dev/template/querytemplate/item_edit";
	}
	@RequestMapping(value="/management/ui/template/querytemplate/item_save")
	public ModelAndView save(QueryConditionTemplateModel item,TemplateParamVO vo, Model model) throws BusinessException {
		if(item.getAttributeValue(item.getParentPKFieldName())==null || StringUtils.isEmpty(item.getAttributeValue(item.getParentPKFieldName()).toString())){
			item.setAttributeValue(item.getParentPKFieldName(), vo.getPk_parent());
		}
		if(StringUtils.isNotEmpty(item.getPrimaryKey())){
			queryservice.update(item);
		}else{
			queryservice.insert(item);
		}
		return ajaxDoneSuccess("保存成功");
	}
}
