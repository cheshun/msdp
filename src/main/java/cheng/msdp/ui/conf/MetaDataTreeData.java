package cheng.msdp.ui.conf;

import cheng.msdp.basic.model.MetaDataTypeModel;
import cheng.msdp.ui.tree.AbstractIdTreeData;

public class MetaDataTreeData extends AbstractIdTreeData {

	public String getShowFieldName() {
		return "type_name";
	}

	public String getTreeNodeUIType() {
		return "/management/ui/singletable/index";
	}

	public String getIDFieldName() {
		return "pk_metadata_type";
	}

	public String getParentIDFieldName() {
		return null;
	}

	@Override
	public Class<?> getTreeModel() {
		return MetaDataTypeModel.class;
	}

	@Override
	public String getTreeModelCondition() {
		return " dr = 0 ";
	}
}
