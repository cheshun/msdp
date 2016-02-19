package cheng.msdp.ui.conf;

import java.util.List;

import cheng.lib.lang.SuperModel;
import com.application.common.context.ApplicationServiceLocator;
import cheng.msdp.sys.model.NodeModel;
import cheng.msdp.ui.itf.IVOTreeDataByID;
import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;

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
