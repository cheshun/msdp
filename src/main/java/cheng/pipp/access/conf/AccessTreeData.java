package cheng.pipp.access.conf;

import cheng.pipp.access.model.RoleModel;
import cheng.pipp.ui.tree.AbstractIdTreeData;

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
