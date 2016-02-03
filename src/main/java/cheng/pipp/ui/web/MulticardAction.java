package cheng.pipp.ui.web;

import arch.util.lang.PageVO;
import cheng.pipp.framework.web.BusinessCommonAction;
import cheng.pipp.ui.vo.param.TemplateParamVO;
import com.application.exception.BusinessException;
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

	return "/management/_frag/template/multicard";
    }
}
