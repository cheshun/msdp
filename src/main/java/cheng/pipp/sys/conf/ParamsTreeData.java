package cheng.pipp.sys.conf;

import java.util.Collection;

import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.sys.model.ModuleModel;
import cheng.pipp.ui.itf.IVOTreeDataByID;
import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import arch.util.lang.SuperModel;

public class ParamsTreeData  implements IVOTreeDataByID{

	
	public String getShowFieldName() {
		return "module_name";
	}

	
	public String getTreeNodeUIType() {
		
		return "/management/ui/singletable/index";
	}

	
	public SuperModel[] getTreeVO(   ) throws BusinessException {
		try {
			IDataBaseService queryservice = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
			Collection list = queryservice.queryByClause(ModuleModel.class, " dr=0 ");
			return (SuperModel[]) list.toArray(new SuperModel[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
	public String getIDFieldName() {
		return "pk_module";
	}

	
	public String getParentIDFieldName() {
		return null;
	}

}
