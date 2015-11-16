package cheng.pipp.ui.itf;

import cheng.pipp.ui.vo.param.SaveActionParamVO;
import com.application.common.exception.BusinessException;
import com.application.module.jdbc.model.NewSuperModel;

import javax.servlet.http.HttpServletRequest;

public interface IButtonAction {

	public NewSuperModel beforeSaveAction(NewSuperModel supervo,SaveActionParamVO paramvo,HttpServletRequest request) throws BusinessException;
	public NewSuperModel afterSaveAction(NewSuperModel supervo,SaveActionParamVO paramvo,HttpServletRequest request) throws BusinessException;
}
