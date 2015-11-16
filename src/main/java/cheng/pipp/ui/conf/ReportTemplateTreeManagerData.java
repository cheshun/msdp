package cheng.pipp.ui.conf;

import java.util.List;

import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.sys.model.NodeModel;
import cheng.pipp.ui.itf.IVOTreeDataByID;
import com.application.common.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.model.NewSuperModel;

public class ReportTemplateTreeManagerData implements IVOTreeDataByID {

	
	public String getShowFieldName() {
		
		
		return "fun_name";
	}

	
	public String getTreeNodeUIType() {
		
		return "/management/ui/template/reporttemplate/index";
//		return "/management/ui/singletable/index";
	}

	
	public NewSuperModel[] getTreeVO(   ) throws BusinessException {
		 IDataBaseService queryseervice = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
			
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
