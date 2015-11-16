package cheng.pipp.sys.conf;

import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.sys.model.ModuleModel;
import cheng.pipp.ui.itf.IVOTreeDataByID;
import com.application.common.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.model.NewSuperModel;

import java.util.Collection;

public class DataDicTreeData  implements IVOTreeDataByID {

	
	public String getShowFieldName() {
		return "module_name";
	}

	
	public String getTreeNodeUIType() {
		
		return "/management/ui/singletable/index";
	}

	
	public NewSuperModel[] getTreeVO(   ) throws BusinessException {
		try {
			IDataBaseService queryservice = (IDataBaseService) ApplicationContextHelper.getService(IDataBaseService.class);
			Collection list = queryservice.queryByClause(ModuleModel.class, " dr=0 ");
			return (NewSuperModel[]) list.toArray(new NewSuperModel[0]);
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
