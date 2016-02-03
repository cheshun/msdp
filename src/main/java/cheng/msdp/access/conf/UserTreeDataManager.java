package cheng.msdp.access.conf;

import cheng.msdp.access.model.UserModel;
import cheng.msdp.ui.tree.AbstractIdTreeData;

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
