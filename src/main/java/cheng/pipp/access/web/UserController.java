package cheng.pipp.access.web;

import cheng.pipp.access.model.RoleModel;
import cheng.pipp.access.model.UserModel;
import com.application.common.context.ApplicationServiceLocator;
import cheng.pipp.framework.web.BusinessCommonAction;
import cheng.pipp.ui.vo.param.TemplateParamVO;
import com.application.exception.BusinessException;
import com.application.funtion.encrypt.DesUtil;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.processor.BeanListProcessor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class UserController extends BusinessCommonAction {
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/management/access/user/index")
	public String index(TemplateParamVO vo, Model model)
			throws BusinessException {
		IDataBaseService queryservice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		UserModel u = (UserModel)queryservice.queryByPK(UserModel.class, vo.getPk_data());
		RoleModel role =(RoleModel)queryservice.queryByPK(RoleModel.class, u.getPk_role());
			
		String sql =" select r.* from sm_role r inner join sm_user_role ur on ur.pk_role=r.pk_role where ur.pk_user='"+vo.getPk_data()+"' and ur.dr=0  " ;
		List<RoleModel> lr = (List<RoleModel>)queryservice.queryBySql(sql, new BeanListProcessor(RoleModel.class));
		model.addAttribute("item", u);
		model.addAttribute("role", role);
		model.addAttribute("data", lr);
		model.addAttribute("param", vo);
		return "/management/_dev/authenticate/user/user_info";
	}

	@RequestMapping(value = "/management/access/user/add")
	public String add(TemplateParamVO vo, Model model) {
		model.addAttribute("param", vo);
		return "/management/_dev/authenticate/user/add_user";
	}

	@RequestMapping(value = "/management/access/user/edit")
	public String edit(TemplateParamVO vo, Model model) throws BusinessException {
		
		 IDataBaseService queryservice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		UserModel u =(UserModel)queryservice.queryByPK(UserModel.class, vo.getPk_data());
		RoleModel role =(RoleModel)queryservice.queryByPK(RoleModel.class, u.getPk_role());
		model.addAttribute("item", u);
		model.addAttribute("role", role);
		model.addAttribute("param", vo);
		return "/management/_dev/authenticate/user/edit_user";
	}

	@RequestMapping(value = "/management/access/user/save")
	public ModelAndView save(UserModel user, TemplateParamVO vo,
			Model model) throws BusinessException {
		 IDataBaseService dataBaseService = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		 DesUtil en = new DesUtil();
		if (StringUtils.isNotEmpty(user.getPrimaryKey())) {
			UserModel old = (UserModel) dataBaseService.queryByPK(UserModel.class, user.getPrimaryKey());
			if(!old.getUser_password().equals(user.getUser_password())){
				user.setUser_password(en.encode(user.getUser_password()));
			}
			dataBaseService.updateVO(user);
		} else {
			user.setUser_password(en.encode(user.getUser_password()));
			dataBaseService.insertVO(user);
		}
		en=null;
		return ajaxDoneSuccess("保存成功");
	}
}
