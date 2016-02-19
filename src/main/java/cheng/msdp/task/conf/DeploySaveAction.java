package cheng.msdp.task.conf;

import cheng.msdp.ui.itf.IButtonAction;
import cheng.msdp.ui.vo.param.SaveActionParamVO;
import cheng.lib.exception.BusinessException;
import cheng.lib.lang.SuperModel;

import javax.servlet.http.HttpServletRequest;

public class DeploySaveAction implements IButtonAction {

	
	public SuperModel beforeSaveAction(SuperModel supervo, SaveActionParamVO paramvo,
			HttpServletRequest request)
			throws BusinessException {
		
		return supervo;
	}

	
	public SuperModel afterSaveAction(SuperModel supervo, SaveActionParamVO paramvo,
			HttpServletRequest request)
			throws BusinessException {
		return supervo;
	}

	 

}
