package cheng.msdp.sys.conf;

import java.util.Collection;

import com.application.common.context.ApplicationServiceLocator;
import cheng.msdp.sys.model.ModuleModel;
import cheng.msdp.ui.itf.IVOTreeDataByID;
import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import cheng.lib.lang.SuperModel;

public class ParamsTreeData  implements IVOTreeDataByID{

	
	public String getShowFieldName() {
		return "module_name";
	}

	
	public String getTreeNodeUIType() {
		
		return "/management/ui/singletable/index";
	}

	
	public SuperModel[] getTreeVO(   ) throws BusinessException {
		try {
			IDataBaseService queryservice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
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
