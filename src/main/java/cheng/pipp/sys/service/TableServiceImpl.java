package cheng.pipp.sys.service;

import java.util.List;

import com.application.common.context.ApplicationServiceLocator;
import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import arch.util.lang.UFBoolean;
import org.springframework.stereotype.Component;

import com.application.common.context.ApplicationServiceLocator;
import cheng.pipp.sys.itf.ITableService;
import cheng.pipp.sys.model.DataDictItemModel;
import cheng.pipp.sys.model.DataDictModel;
import cheng.pipp.sys.model.ModuleModel;
import cheng.pipp.sys.util.TableUtil;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
@Transactional(propagation= Propagation.REQUIRED, rollbackFor=Exception.class) public class TableServiceImpl implements ITableService {

	@Resource
	IDataBaseService dataBaseService ;


	public boolean synchronousTable(ModuleModel modules ,DataDictModel datadict,
			List<DataDictItemModel> list) throws BusinessException {
	    list = dataBaseService.queryByClause(DataDictItemModel.class, "pk_datadict='" + datadict.getPrimaryKey() + "' and isTablesyn='" + UFBoolean.FALSE + "'");
		IDataBaseService persistence = ApplicationServiceLocator.getService(IDataBaseService.class);
		String sql = TableUtil.synchronousTable(modules,datadict, list);
		int i = persistence.update(sql);
		for(DataDictItemModel itemModel :list){
			itemModel.setIsTablesyn(UFBoolean.TRUE);
		}
		persistence.update(list);
		return true;
	}

}