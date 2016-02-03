package cheng.pipp.ui.conf;

import java.util.List;

import arch.util.lang.SuperModel;
import com.application.common.context.ApplicationServiceLocator;
import cheng.pipp.sys.model.NodeModel;
import cheng.pipp.ui.itf.IVOTreeDataByID;
import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import arch.util.lang.SuperModel;

public class ButtonTreeManageData implements IVOTreeDataByID {

	
	public String getShowFieldName() {
		
		
		return "fun_name";
	}

	
	public String getTreeNodeUIType() {
		
		return "/management/ui/template/buttonmananger/index";
	}

	
	public SuperModel[] getTreeVO(   ) throws BusinessException {
		 IDataBaseService queryseervice =  ApplicationServiceLocator.getService(IDataBaseService.class);
			
		List<NodeModel> list = queryseervice.queryByClause(NodeModel.class, " dr=0 ");
			return list.toArray(new NodeModel[0]);
		 
	}

	
	public String getIDFieldName() {
		 
		return "pk_node";
	}

	
	public String getParentIDFieldName() {
		return "pk_parent_node";
	}

}
