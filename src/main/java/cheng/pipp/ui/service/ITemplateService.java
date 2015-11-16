package cheng.pipp.ui.service;

import cheng.pipp.ui.model.UIItemTempletModel;
import cheng.pipp.ui.model.UITempletModel;
import cheng.pipp.ui.vo.param.TemplateParamVO;
import com.application.common.exception.BusinessException;
import com.application.itf.IService;

import java.util.List;

public interface ITemplateService extends IService {

	
	public List<UIItemTempletModel> getUserCardTemplet(String pk_user,String pk_role,String pk_node ,String conditionstr) throws BusinessException;
	
	public List<UIItemTempletModel> getUserTableTemplet(String pk_user,String pk_role,String pk_node,String conditionstr ) throws BusinessException;
	
	public boolean copy(UITempletModel modelvo,TemplateParamVO vo) throws BusinessException;
}
