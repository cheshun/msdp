package cheng.pipp.ui.conf;

import java.util.List;

import com.application.common.context.ApplicationServiceLocator;
import cheng.pipp.sys.model.NodeModel;
import cheng.pipp.ui.itf.IVOTreeDataByID;
import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import arch.util.lang.SuperModel;

public class ReportTemplateTreeManagerData implements IVOTreeDataByID {

	
	public String getShowFieldName() {
		
		
		return "fun_name";
	}

	
	public String getTreeNodeUIType() {
		
		return "/management/ui/template/reporttemplate/index";
//		return "/management/ui/singletable/index";
	}

	
	public SuperModel[] getTreeVO(   ) throws BusinessException {
		 IDataBaseService queryseervice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
			
		List<NodeModel> list = (List<NodeModel>) queryseervice.queryByClause(NodeModel.class, " dr=0 ");
			return list.toArray(new NodeModel[0]);
	}

	
	public String getIDFieldName() {
		 
		return "pk_node";
	}

	
	public String getParentIDFieldName() {
		return "pk_parent_node";
	}

}
