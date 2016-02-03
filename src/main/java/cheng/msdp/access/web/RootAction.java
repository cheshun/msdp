package cheng.msdp.access.web;


import cheng.pipp.framework.web.BusinessCommonAction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RootAction extends BusinessCommonAction {

/*	
	@RequestMapping("")
	public String index() {
		return "/index";
	}
*/	
	@RequestMapping("/root")
	public String login(HttpServletRequest request,Model model) {
		
		return "root/index";
	}

	
}