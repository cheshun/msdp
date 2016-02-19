package cheng.msdp.ui.itf;

import cheng.msdp.ui.model.UIItemTempletModel;
import cheng.msdp.ui.model.UITempletModel;
import cheng.msdp.ui.vo.param.TemplateParamVO;
import cheng.lib.exception.BusinessException;
import com.application.itf.IService;

import java.util.List;

public interface ITemplateService extends IService {

	
	public List<UIItemTempletModel> getUserCardTemplet(String pk_user,String pk_role,String pk_node ,String conditionstr) throws BusinessException;
	
	public List<UIItemTempletModel> getUserTableTemplet(String pk_user,String pk_role,String pk_node,String conditionstr ) throws BusinessException;
	
	public boolean copy(UITempletModel modelvo,TemplateParamVO vo) throws BusinessException;
}
