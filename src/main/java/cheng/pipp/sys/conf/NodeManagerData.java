package cheng.pipp.sys.conf;

import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.sys.model.NodeModel;
import cheng.pipp.ui.itf.IVOTreeDataByID;
import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import arch.util.lang.SuperModel;

import java.util.List;

public class NodeManagerData implements IVOTreeDataByID {

	
	public String getShowFieldName() {
		
		
		return "fun_name";
	}

	
	public String getTreeNodeUIType() {
		
		
		return "/management/ui/card/detail";
	}

	
	public SuperModel[] getTreeVO(   ) throws BusinessException {
		  IDataBaseService dataBaseService = (IDataBaseService) ApplicationContextHelper.getService(IDataBaseService.class);
				
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
