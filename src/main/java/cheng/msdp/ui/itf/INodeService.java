package cheng.msdp.ui.itf;

import cheng.msdp.sys.model.NodeModel;
import cheng.lib.exception.BusinessException;
import com.application.itf.IService;

import java.util.List;

public interface INodeService extends IService {

	public List<NodeModel> getNodesByUser(String pk_user) throws BusinessException;
	public List<NodeModel> getNodesByUser(String[] pk_users) throws BusinessException;
	public List<NodeModel> getNodesByRole(String pk_role) throws BusinessException; 
	public List<NodeModel> getNodesByRole(String[] pk_roles) throws BusinessException; 

}
