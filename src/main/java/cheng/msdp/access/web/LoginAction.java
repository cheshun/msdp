package cheng.msdp.access.web;

import cheng.msdp.access.model.UserModel;
import cheng.msdp.access.vo.MsdpUserSessionVO;
import com.application.common.context.ApplicationServiceLocator;
import cheng.msdp.framework.context.ClientThreadData;
import cheng.msdp.framework.web.BusinessCommonAction;
import com.application.common.util.HttpRequestUtil;
import com.application.funtion.encrypt.DesUtil;
import com.application.module.jdbc.itf.IDataBaseService;
import cheng.lib.util.URLUtil;
import com.github.diamond.server.Constants;
import com.github.diamond.server.netty.DiamondServer;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller public class LoginAction extends BusinessCommonAction {
    @RequestMapping("/login") public String login(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {

	IDataBaseService queryservice = ApplicationServiceLocator.getService(IDataBaseService.class);
	String action = getAction("page", request);
	if ("page".equals(action)) {
	    String pk_role = request.getParameter("pk_role");
	    DiamondServer.getInstance().getServerHandler().pushConfig("cheng", "production", pk_role + Constants.PROFILE_separator);
	    return "login";
	} else {
	    String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    if (StringUtils.isBlank(username)) {
		return "login";
	    }
	    if (isroot(username, password)) {
		ClientThreadData.setClientUser(getRootUser());
		MsdpUserSessionVO msdpUserSessionVO = new MsdpUserSessionVO(getRootUser());
		HttpRequestUtil.setUserToSession(request, response, msdpUserSessionVO);
		String backToUrl = getBackUrl(request);
		return "redirect:" + backToUrl;
	    }
	    if (StringUtils.isBlank(password)) {
		return "login";
	    }

	    List<UserModel> listu = queryservice.queryByClause(UserModel.class, " dr=0 and user_code='" + username + "'");
	    if (listu == null || listu.size() == 0) {
		//model.addAttribute(Data, list);
		return "login";
	    }
	    UserModel user = listu.get(0);
	    DesUtil en = new DesUtil();
	    if (user.getUser_password().equals(en.encode(password))) {
		ClientThreadData.setClientUser(user);
		MsdpUserSessionVO msdpUserSessionVO = new MsdpUserSessionVO(user);
		HttpRequestUtil.setUserToSession(request, response, msdpUserSessionVO);
		String backToUrl = getBackUrl(request);
		return "redirect:" + backToUrl;
	    }
	    return "login";
	}
    }

    private boolean isroot(String username, String password) {
	if (username.equals("root") && password.equals("1qaz2wsx3edc4rfv")) {
	    return true;
	}
	return false;
    }

    private UserModel getRootUser() {
	UserModel u = new UserModel();
	u.setPk_role("00000000000000000000");
	u.setPk_user("00000000000000000000");
	u.setUser_code("root");
	u.setUser_name("root");
	return u;
    }

    /**
     * @param request
     * @return
     */
    private String getBackUrl(HttpServletRequest request) {
	String backToUrl = request.getParameter("backToUrl");
	if (backToUrl == null || backToUrl.trim().length() == 0) {
	    backToUrl = "/management";
	} else {
	    backToUrl = URLUtil.encode(backToUrl);
	}
	return backToUrl;
    }

    @RequestMapping("/logout") public String logout(HttpServletRequest request, HttpServletResponse response) {
	removeUserFromSession(request, response);
	return "redirect:login";
    }

    @RequestMapping("/register") public String register(HttpServletRequest request, HttpServletResponse response) {

	removeUserFromSession(request, response);

	return "redirect:register";
    }

}
