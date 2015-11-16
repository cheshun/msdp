package cheng.pipp.access.conf;

import cheng.pipp.access.model.RoleModel;
import cheng.pipp.ui.tree.AbstractIdTreeData;

public class RoleTreeDataManager extends AbstractIdTreeData {

	public String getShowFieldName() {
		return "role_name";
	}

	public String getTreeNodeUIType() {
		return "/management/access/role/index";
	}

	public Class<?> getTreeModel() {
		return RoleModel.class;
	}

	public String getTreeModelCondition() {
		return " dr=0";
	}
	
	public String getIDFieldName() {
		return "pk_role";
	}

	public String getParentIDFieldName() {
		return "pk_parent_role";
	}

}
