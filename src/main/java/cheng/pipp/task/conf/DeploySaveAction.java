package cheng.pipp.task.conf;

import cheng.pipp.ui.itf.IButtonAction;
import cheng.pipp.ui.vo.param.SaveActionParamVO;
import com.application.common.exception.BusinessException;
import com.application.module.jdbc.model.NewSuperModel;

import javax.servlet.http.HttpServletRequest;

public class DeploySaveAction implements IButtonAction {

	
	public NewSuperModel beforeSaveAction(NewSuperModel supervo, SaveActionParamVO paramvo,
			HttpServletRequest request)
			throws BusinessException {
		
		return supervo;
	}

	
	public NewSuperModel afterSaveAction(NewSuperModel supervo, SaveActionParamVO paramvo,
			HttpServletRequest request)
			throws BusinessException {
		return supervo;
	}

	 

}
