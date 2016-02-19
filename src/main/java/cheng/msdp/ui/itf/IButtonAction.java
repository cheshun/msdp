package cheng.msdp.ui.itf;

import cheng.lib.lang.SuperModel;
import cheng.msdp.ui.vo.param.SaveActionParamVO;
import cheng.lib.exception.BusinessException;

import javax.servlet.http.HttpServletRequest;

public interface IButtonAction {

	public SuperModel beforeSaveAction(SuperModel supervo,SaveActionParamVO paramvo,HttpServletRequest request) throws BusinessException;
	public SuperModel afterSaveAction(SuperModel supervo,SaveActionParamVO paramvo,HttpServletRequest request) throws BusinessException;
}
