package cheng.msdp.ui.conf;

import java.util.List;
import com.application.common.context.ApplicationServiceLocator;
import cheng.msdp.sys.model.NodeModel;
import cheng.msdp.ui.itf.IVOTreeDataByID;
import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import cheng.lib.lang.SuperModel;

public class TemplateAssignmentManagerData implements IVOTreeDataByID{

	
	public String getShowFieldName() {
		return "fun_name";
	}

	
	public String getTreeNodeUIType() {
		return "/management/ui/template/assignment";
	}

	
	public SuperModel[] getTreeVO(   ) throws BusinessException {

		List<NodeModel> list = ApplicationServiceLocator.getService(IDataBaseService.class).queryByClause(NodeModel.class, " dr=0 ");
			return list.toArray(new NodeModel[0]);
	}

	
	public String getIDFieldName() {
		 
		return "pk_node";
	}

	
	public String getParentIDFieldName() {
		return "pk_parent_node";
	}


}
