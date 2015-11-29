package cheng.pipp.access.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import arch.util.lang.SuperModel;
import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import cheng.pipp.access.model.RoleNodeModel;
import cheng.pipp.access.model.UserModel;
import cheng.pipp.access.model.UserRoleModel;
import com.application.common.context.ApplicationServiceLocator;
import cheng.pipp.ui.model.TemplateNodeRoleModel;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(propagation= Propagation.REQUIRED, rollbackFor=Exception.class)
public class AccessAssignmentImpl implements IAccessAssignment {
	
//////////////////////////////////////////////////////////////////
//////////////////////////分配角色//////////////////////////////////
//////////////////////////////////////////////////////////////////

	
	public boolean assignRole(String[] pk_roles, String pk_user) throws BusinessException {
		
		//
		return doassignRole(pk_roles, pk_user);
		
	}
	
	public boolean assignRole(String pk_roles, String pk_user)
			throws BusinessException {
		if(StringUtils.isEmpty(pk_roles)){
			return assignRole(pk_user);
		}else{
			return assignRole(pk_roles.split(","),pk_user);
		}
	}
	
	public boolean assignRole(String pk_user) throws BusinessException {
		return doassignRole(null, pk_user);
	}
	
	private boolean doassignRole(String[] pk_roles, String pk_user) throws BusinessException{
		//如果是分配一个角色,且该用户还没有默认角色 则设置该角色为用户的默认角色。
		IDataBaseService dataBaseService = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		//
		
		List<UserRoleModel> listuserrole = (List<UserRoleModel>)dataBaseService.queryByClause(UserRoleModel.class, " pk_user='"+pk_user+"' ");
		if(pk_roles==null  && listuserrole.size()==0){
			return false ;
		}
		if(pk_roles==null){
			for(int j=0;j<listuserrole.size();j++){
				listuserrole.get(j).setDr(1);
			}
			dataBaseService.updateVOArray(listuserrole.toArray(new SuperModel[0]),new String[]{"dr"} );
			return true;
		}
		UserModel user = (UserModel) dataBaseService.queryByPK(UserModel.class, pk_user);
		if(StringUtils.isBlank(user.getPk_role()) && pk_roles.length==1){
			user.setPk_role(pk_roles[0]);
			dataBaseService.updateVO(user);
		}
		List<UserRoleModel> insert = new ArrayList<UserRoleModel>();
		List<UserRoleModel> update = new ArrayList<UserRoleModel>();
		Map<String,UserRoleModel> mrole = tomap(listuserrole);
		for(int j=0;j<pk_roles.length;j++){
			UserRoleModel temp = mrole.get(pk_roles[j]);
			//
			if(temp==null){
				insert.add(createUserRoleModel(pk_roles[j],pk_user));
			}else{
				if(temp.getDr()==1){
					temp.setDr(0);
					update.add(temp);
					mrole.remove(pk_roles[j]);
				}else{
					mrole.remove(pk_roles[j]);
				}
			}
		}
		if(!mrole.isEmpty()){
			Iterator<UserRoleModel>  i = mrole.values().iterator();
			while(i.hasNext()){
				UserRoleModel r = i.next();
				r.setDr(1);
				update.add(r);
			}
		}
		
		if(insert.size()>0){
			dataBaseService.insertVOList(insert);
		}
		if(update.size()>0){
			dataBaseService.updateVOArray(update.toArray(new SuperModel[0]),new String[]{"dr"} );
		}
		
		return true;
	}
	
	
	private Map<String, UserRoleModel> tomap(List<UserRoleModel> listuserrole) {
		Map<String, UserRoleModel> m = new HashMap<String, UserRoleModel>();
		for(int i=0;i<listuserrole.size();i++){
			m.put(listuserrole.get(i).getPk_role(), listuserrole.get(i));
		}
		return m;
	}
	
	private UserRoleModel createUserRoleModel(String pk_role, String pk_user) {
		UserRoleModel u = new UserRoleModel();
		u.setPk_role(pk_role);
		u.setPk_user(pk_user);
		u.setDr(0);
		return u;
	}
//////////////////////////////////////////////////////////////////
//////////////////////////分配角色//////////////////////////////////
//////////////////////////////////////////////////////////////////
	

	
//////////////////////////////////////////////////////////////////
///////////////////// 分配节点/////////////////////////////////
//////////////////////////////////////////////////////////////////
	
	public boolean assignNode(String pk_role) throws BusinessException {
		
		return doassignNode(null,pk_role);
		
	}
	
	public boolean assignNode(String[] pk_nodes, String pk_role)
			throws BusinessException {
		return doassignNode(pk_nodes,pk_role);
	}
	
	
	public boolean assignNode(String pk_node, String pk_role)
			throws BusinessException {
		return doassignNode(new String[]{pk_node},pk_role);
	}
	
	private boolean doassignNode(String[] pk_nodes, String pk_role) throws BusinessException {
		IDataBaseService dataBaseService = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		List<RoleNodeModel> insert = new ArrayList<RoleNodeModel>();
		List<RoleNodeModel> update = new ArrayList<RoleNodeModel>();
		List<RoleNodeModel> listrolenode = (List<RoleNodeModel>)dataBaseService.queryByClause(RoleNodeModel.class, " pk_role='"+pk_role+"' ");
		if(pk_nodes==null && listrolenode.size()==0){
			return false ;
		}
		
		Map<String,RoleNodeModel> m = toMap(listrolenode);
		if(pk_nodes!=null && listrolenode!=null && listrolenode.size()>0){
			for(int i=0;i<pk_nodes.length;i++){
				if(m.get(pk_nodes[i])==null){
					insert.add(createRoleNodeModel(pk_nodes[i],pk_role));
				}else{
					if(m.get(pk_nodes[i]).getDr()==1){
						RoleNodeModel r = m.get(pk_nodes[i]);
						r.setDr(0);
						update.add(r);
						m.remove(pk_nodes[i]);
					}else{
						m.remove(pk_nodes[i]);
					}
				}
			}
			if(!m.isEmpty()){
				Iterator<RoleNodeModel>  i = m.values().iterator();
				while(i.hasNext()){
					RoleNodeModel r = i.next();
					r.setDr(1);
					update.add(r);
				}
			}
		}else if(pk_nodes==null ) {
				for(int j=0;j<listrolenode.size();j++){
					listrolenode.get(j).setDr(1);
				}
				dataBaseService.updateVOArray(listrolenode.toArray(new SuperModel[0]),new String[]{"dr"} );
				return true;
		}else{
			for(int j=0;j<pk_nodes.length;j++){
				insert.add(createRoleNodeModel(pk_nodes[j],pk_role));
			}
		}
		
		if(insert.size()>0){
			dataBaseService.insertVOList(insert);
		}
		if(update.size()>0){
			dataBaseService.updateVOArray(update.toArray(new SuperModel[0]),new String[]{"dr","ts"} );
		}
		 
		return false;
		
	}
	
	private Map<String, RoleNodeModel> toMap(List<RoleNodeModel> listrolenode) {
		Map<String, RoleNodeModel> m = new HashMap<String, RoleNodeModel>();
		for(int i=0;i<listrolenode.size();i++){
			m.put(listrolenode.get(i).getPk_node(), listrolenode.get(i));
		}
		return m;
	}
	
	private RoleNodeModel createRoleNodeModel(String pk_node, String pk_role) {
		RoleNodeModel u = new RoleNodeModel();
		u.setPk_node(pk_node);
		u.setPk_role(pk_role);
		u.setDr(0);
		return u;
	}
	
//////////////////////////////////////////////////////////////////
///////////////////// 分配节点/////////////////////////////////
//////////////////////////////////////////////////////////////////
	
	
//////////////////////////////////////////////////////////////////
///////////////////// 分配单据模板/////////////////////////////////
//////////////////////////////////////////////////////////////////
	@SuppressWarnings("unchecked")
	
	public boolean assignTemplate(String[] pk_role, String pk_node,
			String template) throws BusinessException {
		 //找出该模板已经分配的角色
		IDataBaseService dataBaseService = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		List<TemplateNodeRoleModel> list = (List<TemplateNodeRoleModel>)dataBaseService.queryByClause(TemplateNodeRoleModel.class, " pk_node='"+pk_node+"' and pk_temple='"+template+"'") ;
		if(pk_role==null && list.size()==0){
			return false ;
		}
		
		Map<String, TemplateNodeRoleModel> map = toMap1(list);
		List<TemplateNodeRoleModel> insert = new ArrayList<TemplateNodeRoleModel>();
		List<TemplateNodeRoleModel> update = new ArrayList<TemplateNodeRoleModel>();
		
		if(pk_role!=null && list!=null && list.size()>0){
			for(int i=0;i<pk_role.length;i++){
				if(map.get(pk_role[i])==null){
					insert.add(createTemplateNodeRoleModel(pk_role[i],pk_node,template));
				}else{
					if(map.get(pk_role[i]).getDr()==1){
						TemplateNodeRoleModel r = map.get(pk_role[i]);
						r.setDr(0);
						update.add(r);
						map.remove(pk_role[i]);
					}else{
						map.remove(pk_role[i]);
					}
				}
			}
			if(!map.isEmpty()){
				Iterator<TemplateNodeRoleModel>  i = map.values().iterator();
				while(i.hasNext()){
					TemplateNodeRoleModel r = i.next();
					r.setDr(1);
					update.add(r);
				}
			}
		}else if(pk_role==null ) {
				for(int j=0;j<list.size();j++){
					list.get(j).setDr(1);
				}
				dataBaseService.updateVOArray(list.toArray(new SuperModel[0]),new String[]{"dr"} );
				return true;
		}else{
			for(int j=0;j<pk_role.length;j++){
				insert.add(createTemplateNodeRoleModel(pk_role[j],pk_node,template));
			}
		}
		
		if(insert.size()>0){
//			persistenceService.insertVOList(insert);
		}
		if(update.size()>0){
//			persistenceService.updateVOArray(update.toArray(new SuperVO[0]),new String[]{"dr","ts"} );
		}
		 
		return true;

	}
	
	private TemplateNodeRoleModel createTemplateNodeRoleModel(String pk_role , String pk_node,
			String template) {
		TemplateNodeRoleModel temp = new TemplateNodeRoleModel();
		temp.setPk_node(pk_node);
		temp.setPk_role(pk_role);
		temp.setPk_temple(template);
		temp.setDr(0);
		return temp;
	}
	private Map<String, TemplateNodeRoleModel> toMap1(List<TemplateNodeRoleModel> list) {
		Map<String, TemplateNodeRoleModel> m = new HashMap<String, TemplateNodeRoleModel>();
		for(int i=0;i<list.size();i++){
			m.put(list.get(i).getPk_role(), list.get(i));
		}
		return m;
	}
	
	
//////////////////////////////////////////////////////////////////
///////////////////// 分配单据模板/////////////////////////////////
//////////////////////////////////////////////////////////////////
	
	
	
//////////////////////////////////////////////////////////////////
///////////////////// 分配查询模板/////////////////////////////////
//////////////////////////////////////////////////////////////////
	
	
	public boolean assignQueryTemplate(String[] pk_role, String pk_node,
			String pk_querytemplate) throws BusinessException {
		 
		return false;
	}
//////////////////////////////////////////////////////////////////
///////////////////// 分配查询模板/////////////////////////////////
//////////////////////////////////////////////////////////////////
	
//////////////////////////////////////////////////////////////////
///////////////////// 分配按钮/////////////////////////////////
//////////////////////////////////////////////////////////////////

	
	public boolean assignButton(String[] pk_role, String pk_node,
			String pk_button) throws BusinessException {
		 
		return false;
	}
	
//////////////////////////////////////////////////////////////////
///////////////////// 分配按钮/////////////////////////////////
//////////////////////////////////////////////////////////////////

}
