package cheng.pipp.access.service;

import cheng.pipp.access.model.RoleModel;
import com.application.common.exception.BusinessException;
import com.application.itf.IService;

import java.util.List;

public interface IRoleService extends IService {

	public List<RoleModel> getRolesByUser(String[] pk_users) throws BusinessException; 
	public List<RoleModel> getRolesByUser(String pk_user) throws BusinessException;
}
