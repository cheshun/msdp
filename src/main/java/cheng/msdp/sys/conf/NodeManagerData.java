package cheng.msdp.sys.conf;

import com.application.common.context.ApplicationServiceLocator;
import cheng.msdp.sys.model.NodeModel;
import cheng.msdp.ui.itf.IVOTreeDataByID;
import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import cheng.lib.lang.SuperModel;

import java.util.List;

public class NodeManagerData implements IVOTreeDataByID {

	
	public String getShowFieldName() {
		
		
		return "fun_name";
	}

	
	public String getTreeNodeUIType() {
		
		
		return "/management/ui/card/detail";
	}

	
	public SuperModel[] getTreeVO(   ) throws BusinessException {
		  IDataBaseService dataBaseService = (IDataBaseService) ApplicationServiceLocator.getService(IDataBaseService.class);
				
		List<NodeModel> list = (List<NodeModel>) dataBaseService.queryByClause(NodeModel.class, " dr=0 ");
			return list.toArray(new NodeModel[0]);
	}

	
	public String getIDFieldName() {
		 
		return "pk_node";
	}

	
	public String getParentIDFieldName() {
		return "pk_parent_node";
	}

}
