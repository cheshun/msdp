package cheng.pipp.sys.conf;

import java.util.List;

import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.sys.model.ModuleModel;
import cheng.pipp.ui.itf.IVOTreeDataByID;
import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import arch.util.lang.SuperModel;

public class SysModulesManagerData implements IVOTreeDataByID{

	
	public String getShowFieldName() {
		
		return "module_name";
	}

	
	public String getTreeNodeUIType() {
		 
		return "/management/ui/card/detail";
	}

	
	public SuperModel[] getTreeVO(   ) throws BusinessException {
		 IDataBaseService queryservice = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
				
		List<ModuleModel> list = (List<ModuleModel>) queryservice.queryByClause(ModuleModel.class, " dr=0 ");
			return list.toArray(new ModuleModel[0]);
	}

	
	public String getIDFieldName() {
		return "pk_module";
	}

	
	public String getParentIDFieldName() {
		return null;
	}

}
