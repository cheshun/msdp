package cheng.msdp.ui.itf;

import cheng.msdp.ui.model.ButtonModel;
import cheng.lib.exception.BusinessException;
import com.application.itf.IService;

import java.util.List;

public interface IButtonService extends IService {
	public List<ButtonModel> getTempletButton(String pk_user,String pk_node) throws BusinessException;
	public List<ButtonModel> addTempletButton(String pk_node,String[] buttoncodes) throws BusinessException;

}
