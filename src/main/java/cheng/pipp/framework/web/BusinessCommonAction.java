package cheng.pipp.framework.web;

import cheng.msdp.access.model.UserModel;
import cheng.pipp.framework.config.MsdpUserSessionVO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public  class BusinessCommonAction extends PlatformExceptionHandlerAction {
	protected Logger logger = LoggerFactory.getLogger(BusinessCommonAction.class);

	
	/**
	 * 得到登入用户的信息
	 * @param request
	 * @return
	 */
	protected UserModel getUserinfo(HttpServletRequest request){
		return getUserFromSession(request).getUserModel();
		
	}
	protected MsdpUserSessionVO getUserFromSession(HttpServletRequest request){
		return (MsdpUserSessionVO) super.getUserFromSession(request);

	}
	protected String getSysRealPath(HttpServletRequest request) {
	    String projectPath = request.getSession().getServletContext().getRealPath("/").replaceAll("\\\\", "\\\\\\\\");
		return projectPath;
		
	}
	protected String getAction(String defaule,HttpServletRequest request) {
		String action = request.getParameter("action");
		if(StringUtils.isEmpty(action)){
			return defaule;
		}
		return action;
	}
}
