package cheng.pipp.framework.web;

import com.application.action.AbstractCommonAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller("management.BaseController")
public class PlatformExceptionHandlerAction extends AbstractCommonAction {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	protected ModelAndView ajaxDone(int statusCode, String message, String forwardUrl) {
		ModelAndView mav = new ModelAndView("ajaxDone");
		mav.addObject("statusCode", statusCode);
		mav.addObject("message", message);
		mav.addObject("forwardUrl", forwardUrl);
		return mav;
	}
	protected ModelAndView ajaxDoneSuccess(String message) {
		return ajaxDone(200, message, "");
	}

	protected ModelAndView ajaxDoneError(String message) {
		return ajaxDone(300, message, "");
	}
	@Override
	protected String getMsgTipPage() {
		return null;
	}



}
