package cheng.msdp.sys.conf;

import java.util.List;

import com.application.common.context.ApplicationServiceLocator;
import cheng.msdp.sys.model.ModuleModel;
import cheng.msdp.ui.itf.IVOTreeDataByID;
import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import cheng.lib.lang.SuperModel;

public class SysModulesManagerData implements IVOTreeDataByID{

	
	public String getShowFieldName() {
		
		return "module_name";
	}

	
	public String getTreeNodeUIType() {
		 
		return "/management/ui/card/detail";
	}

	
	public SuperModel[] getTreeVO(   ) throws BusinessException {
		 IDataBaseService queryservice =  ApplicationServiceLocator.getService(IDataBaseService.class);
				
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
