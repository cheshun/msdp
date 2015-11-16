package cheng.pipp.sys.itf;

import cheng.pipp.sys.model.DataDictItemModel;
import cheng.pipp.sys.model.DataDictModel;
import cheng.pipp.sys.model.ModuleModel;
import com.application.common.exception.BusinessException;
import com.application.itf.IService;

import java.util.List;

public interface ITableService extends IService {

	public boolean synchronousTable(ModuleModel modules ,DataDictModel datadict ,List<DataDictItemModel> list ) throws BusinessException;
}
