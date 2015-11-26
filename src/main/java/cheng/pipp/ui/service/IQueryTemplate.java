package cheng.pipp.ui.service;

import cheng.pipp.ui.model.QueryConditionTemplateModel;
import cheng.pipp.ui.model.QueryTemplateModel;
import cheng.pipp.ui.vo.param.TemplateParamVO;
import com.application.exception.BusinessException;
import com.application.itf.IService;

import java.util.List;

public interface IQueryTemplate extends IService {

	public List<QueryConditionTemplateModel> getQueryTemplate(String pk_node) throws BusinessException;
	public List<QueryConditionTemplateModel> getQueryTemplate(String pk_node,String pk_role) throws BusinessException;
	public List<QueryConditionTemplateModel> getQueryTemplate(String pk_node,String pk_role,String pk_user) throws BusinessException;
	public boolean copy (TemplateParamVO vo,QueryTemplateModel template) throws BusinessException;

}
