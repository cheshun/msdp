package cheng.pipp.ui.conf;

import cheng.pipp.sys.model.ModuleModel;
import cheng.pipp.ui.tree.AbstractIdTreeData;

public class RefTreeData extends AbstractIdTreeData {
	public String getIDFieldName() {
		return "pk_module";
	}
	public String getParentIDFieldName() {
		return null;
	}
	public String getShowFieldName() {
		return "module_name";
	}
	public String getTreeNodeUIType() {

		return "/management/ui/singletable/index";
	}
	public Class<?> getTreeModel() {
		return ModuleModel.class;
	}

	public String getTreeModelCondition() {
		return " dr=0";
	}
}
