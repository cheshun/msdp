package cheng.msdp.ui.itf;

import arch.util.lang.SuperModel;
import cheng.msdp.ui.vo.param.SaveActionParamVO;
import com.application.exception.BusinessException;

import javax.servlet.http.HttpServletRequest;

public interface IButtonAction {

	public SuperModel beforeSaveAction(SuperModel supervo,SaveActionParamVO paramvo,HttpServletRequest request) throws BusinessException;
	public SuperModel afterSaveAction(SuperModel supervo,SaveActionParamVO paramvo,HttpServletRequest request) throws BusinessException;
}
