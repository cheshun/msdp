package cheng.msdp.access.conf;

import cheng.msdp.access.model.RoleModel;
import cheng.msdp.ui.tree.AbstractIdTreeData;

public class AccessTreeData extends AbstractIdTreeData {

	public String getShowFieldName() {
		 
		return "role_name";
	}

	
	public String getTreeNodeUIType() {
		
		return "/management/access/assignment/node/index";
	}


	@Override
	public Class<?> getTreeModel() {
		return RoleModel.class;
	}

	@Override
	public String getTreeModelCondition() {
		return  " dr=0 ";
	}

	public String getIDFieldName() {
		return "pk_role";
	}

	
	public String getParentIDFieldName() {
		return "pk_parent_role";
	}

}
