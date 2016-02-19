package cheng.msdp.ui.service;

import cheng.msdp.ui.model.QueryConditionTemplateModel;
import cheng.msdp.ui.model.QueryTemplateModel;
import cheng.msdp.ui.vo.param.TemplateParamVO;
import cheng.lib.exception.BusinessException;
import com.application.itf.IService;

import java.util.List;

public interface IQueryTemplateService extends IService {

	public List<QueryConditionTemplateModel> getQueryTemplate(String pk_node) throws BusinessException;
	public List<QueryConditionTemplateModel> getQueryTemplate(String pk_node,String pk_role) throws BusinessException;
	public List<QueryConditionTemplateModel> getQueryTemplate(String pk_node,String pk_role,String pk_user) throws BusinessException;
	public boolean copy (TemplateParamVO vo,QueryTemplateModel template) throws BusinessException;

}
