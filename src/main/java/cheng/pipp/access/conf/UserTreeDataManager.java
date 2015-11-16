package cheng.pipp.access.conf;

import cheng.pipp.access.model.UserModel;
import cheng.pipp.ui.tree.AbstractIdTreeData;

public class UserTreeDataManager  extends AbstractIdTreeData {

	
	public String getShowFieldName() {
		return "user_name";
	}

	
	public String getTreeNodeUIType() {
		return "/management/access/user/index";
	}

	public Class<?> getTreeModel() {
		return UserModel.class;
	}

	public String getTreeModelCondition() {
		return " dr=0";
	}

	public String getIDFieldName() {
		return "pk_user";
	}

	
	public String getParentIDFieldName() {
		return null;
	}

}
