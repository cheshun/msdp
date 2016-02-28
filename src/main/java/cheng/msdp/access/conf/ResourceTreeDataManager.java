package cheng.msdp.access.conf;

import java.util.List;

import cheng.msdp.basic.model.RefModel;
import cheng.msdp.ui.itf.IVOTreeDataByID;
import com.application.common.context.ApplicationServiceLocator;
import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import cheng.lib.lang.SuperModel;
import com.application.module.jdbc.processor.BeanListProcessor;

public class ResourceTreeDataManager implements IVOTreeDataByID{

	
	public String getShowFieldName() {
		 
		return "refname";
	}

	
	public String getTreeNodeUIType() {
		 
		return "/management/access/resource/index";
	}

	
	public SuperModel[] getTreeVO() throws BusinessException {
		IDataBaseService queryservice =   ApplicationServiceLocator.getBean(IDataBaseService.class);
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT r.pk_module ,r.pk_ref  ,r.refname refname FROM sm_ref r ");
		sb.append(" WHERE r.dr=0 AND r.isaccesscontrol='Y' ");
		sb.append(" UNION ");
		sb.append(" SELECT '' pk_module , m.pk_module pk_ref,m.module_name refname FROM sys_module m ");
		List<RefModel> list = (List<RefModel>)queryservice.queryBySql(sb.toString(), new BeanListProcessor(RefModel.class));
		return list.toArray(new SuperModel[0]);
		 
	}

	
	public String getIDFieldName() {
		return "pk_ref";
	}

	
	public String getParentIDFieldName() {
		return "pk_module";
	}

}
