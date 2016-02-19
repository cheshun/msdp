package cheng.msdp.access.service;


import cheng.lib.exception.BusinessException;
import com.application.itf.IService;

public interface IAccessAssignment extends IService {

	/**
	 * 用户分配角色
	 * @param pk_roles
	 * @param pk_user
	 * @return
	 */
	public boolean assignRole(String[] pk_roles,String pk_user) throws BusinessException;
	public boolean assignRole(String pk_roles,String pk_user) throws BusinessException;
	public boolean assignRole(String pk_user) throws BusinessException;
	
	/**
	 * 角色分配节点
	 * @param pk_role 取消角色分配的节点
	 * @return
	 * @throws BusinessException
	 */
	public boolean assignNode(String pk_role) throws BusinessException;
	/**
	 * 给角色分配节点
	 * @author cheng
	 * 2014年5月18日
	 * 下午2:54:39
	 * @param pk_nodes 节点主键
	 * @param pk_role 角色主键
	 * @return
	 * @throws BusinessException
	 */
	public boolean assignNode(String[] pk_nodes,String pk_role) throws BusinessException;
	/**
	 * 给角色分配节点
	 * @author cheng
	 * 2014年5月18日
	 * 下午2:54:39
	 * @param pk_node 节点主键
	 * @param pk_role 角色主键
	 * @return
	 * @throws BusinessException
	 */
	public boolean assignNode(String pk_node,String pk_role) throws BusinessException;
	/**
	 * 角色，节点分配单据模板
	 * @param pk_role
	 * @param pk_node
	 * @param template
	 * @return
	 * @throws BusinessException
	 */
	public boolean assignTemplate(String[] pk_role,String pk_node,String template) throws BusinessException;
	
	public boolean assignQueryTemplate(String[] pk_role,String pk_node,String pk_querytemplate) throws BusinessException;

	public boolean assignButton(String[] pk_role,String pk_node,String pk_button) throws BusinessException;


}
