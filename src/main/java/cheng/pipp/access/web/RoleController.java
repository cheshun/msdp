package cheng.pipp.access.web;

import java.util.List;

import com.application.common.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.processor.BeanListProcessor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cheng.pipp.access.model.RoleModel;
import cheng.pipp.access.model.UserModel;
import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.framework.web.BusinessCommonAction;
import cheng.pipp.ui.vo.param.TemplateParamVO;

 
@Controller("management.roleController")
public class RoleController extends BusinessCommonAction {

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/management/access/role/index")
	public String list(TemplateParamVO vo, Model model) throws BusinessException {
		IDataBaseService queryservice = (IDataBaseService) ApplicationContextHelper.getService(IDataBaseService.class);

		//加载角色卡片模板 
		RoleModel r = (RoleModel) queryservice.queryByPK(RoleModel.class, vo.getPk_data());
		String sql = " select u.* from sm_user u inner join sm_user_role ur on ur.pk_user=u.pk_user where ur.pk_role='" + vo.getPk_data() + "' and u.dr=0 and ur.dr=0 ";
		List<UserModel> lr = (List<UserModel>) queryservice.queryBySql(sql, new BeanListProcessor(UserModel.class));
		model.addAttribute("item", r);
		model.addAttribute("data", lr);
		//加载一个角色的所有用户
		return "/management/_dev/authenticate/role/role_info";
	}

	@RequestMapping(value = "/management/access/role/add")
	public String add(TemplateParamVO vo, Model model) {
		model.addAttribute("param", vo);
		return "/management/_dev/authenticate/role/add_role";
	}

	@RequestMapping(value = "/management/access/role/edit")
	public String edit(TemplateParamVO vo, Model model) throws BusinessException {
		IDataBaseService queryservice = (IDataBaseService) ApplicationContextHelper.getService(IDataBaseService.class);

		RoleModel role = (RoleModel) queryservice.queryByPK(RoleModel.class, vo.getPk_data());
		model.addAttribute("item", role);
		model.addAttribute("param", vo);
		return "/management/_dev/authenticate/role/edit_role";
	}

	@RequestMapping(value = "/management/access/role/save")
	public ModelAndView save(RoleModel role, TemplateParamVO vo, Model model) throws BusinessException {

		IDataBaseService dataBaseService = (IDataBaseService) ApplicationContextHelper.getService(IDataBaseService.class);
		if (StringUtils.isNotEmpty(vo.getPk_parent())) {
			role.setPk_parent_role(vo.getPk_parent());
		}
		if (StringUtils.isNotEmpty(role.getPrimaryKey())) {
			dataBaseService.updateVO(role);
		} else {
			dataBaseService.insertVO(role);
		}
		return ajaxDoneSuccess("保存成功");
	}

	@RequestMapping(value = "/management/access/role/adduser")
	public String adduser(TemplateParamVO vo, Model model) throws BusinessException {
		//查询所有用户 放到多选表格

		return "/management/_dev/authenticate/role/adduser";
	}
}
	