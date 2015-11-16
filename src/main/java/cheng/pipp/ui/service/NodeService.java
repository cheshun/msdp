package cheng.pipp.ui.service;

import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.sys.model.NodeModel;

import com.application.common.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.processor.BeanListProcessor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Component
@Transactional(propagation= Propagation.REQUIRED, rollbackFor=Exception.class)
public class NodeService implements INodeService {
	
	public List<NodeModel> getNodesByUser(String pk_user)
			throws BusinessException {
		IDataBaseService queryseervice = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
		
		// 通过用户id 找分配的角色
		BeanListProcessor processor = new BeanListProcessor(NodeModel.class);
		StringBuffer sql = new StringBuffer();
		sql.append("select n.*  FROM sm_node n INNER JOIN sm_role_node rn ON rn.pk_node= n.pk_node ");
		sql.append("	INNER JOIN sm_user_role ur ON rn.pk_role=ur.pk_role ");
		sql.append("	where ur.pk_user='"+pk_user+"' ");
		List<NodeModel> listnodes = (List<NodeModel>) queryseervice.queryBySql(sql.toString(), processor);
		// 去掉重复的节点 并排序

		return listnodes;
	}

	
	public List<NodeModel> getNodesByUser(String[] pk_users)
			throws BusinessException {
		
		return null;
	}

	
	public List<NodeModel> getNodesByRole(String pk_role)
			throws BusinessException {
		IDataBaseService queryseervice = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
		//n.fun_type='node' and 
		String sql = " SELECT n.* from sm_node n INNER JOIN sm_role_node su on su.pk_node= n.pk_node where su.dr=0 and n.dr=0  and n.fun_type!='tab' and  su.pk_role='"+pk_role+"' " ;
		return (List<NodeModel>) queryseervice.queryBySql(sql, new BeanListProcessor(NodeModel.class));
	}

	
	public List<NodeModel> getNodesByRole(String[] pk_roles)
			throws BusinessException {
		return null;
	}

}
