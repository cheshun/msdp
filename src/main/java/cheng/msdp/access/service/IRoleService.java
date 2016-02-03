package cheng.msdp.access.service;

import cheng.msdp.access.model.RoleModel;
import com.application.exception.BusinessException;
import com.application.itf.IService;

import java.util.List;

public interface IRoleService extends IService {

	public List<RoleModel> getRolesByUser(String[] pk_users) throws BusinessException;
	public List<RoleModel> getRolesByUser(String pk_user) throws BusinessException;
}
