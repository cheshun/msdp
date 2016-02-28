package cheng.msdp.ui.web;

import cheng.lib.lang.PageVO;
import cheng.msdp.framework.web.BusinessCommonAction;
import cheng.msdp.ui.vo.param.TemplateParamVO;
import cheng.lib.exception.BusinessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by homelink on 2016/2/3.
 */

@Controller
public class MulticardAction extends BusinessCommonAction {
    @RequestMapping("/management/ui/multicard/index")
    public String index(HttpServletRequest request, TemplateParamVO paramvo ,PageVO pagevo,Model model) throws BusinessException {
            //接受
	return "/management/_frag/template/multicard";
    }
}
