package cheng.pipp.sys.conf;

import cheng.pipp.sys.model.ParamsModel;
import cheng.pipp.ui.itf.IButtonAction;
import cheng.pipp.ui.vo.param.SaveActionParamVO;
import com.application.exception.BusinessException;
import arch.util.lang.SuperModel;
import com.github.diamond.server.netty.DiamondServer;

import javax.servlet.http.HttpServletRequest;

public class ParamsSaveAction implements IButtonAction  {

	
	public SuperModel beforeSaveAction(SuperModel supervo, SaveActionParamVO paramvo,
			HttpServletRequest request) throws BusinessException {
		return supervo;
	}

	
	public SuperModel afterSaveAction(SuperModel supervo, SaveActionParamVO paramvo,
			HttpServletRequest request) {
		//把参数的值推送到前台
		ParamsModel param = (ParamsModel)supervo;
		DiamondServer.getInstance().getServerHandler().pushConfig("pipp","production", param.getParamcode()+"="+param.getParamvalue());
		return supervo;
	}

}
