package cheng.msdp.sys.itf;

import cheng.msdp.sys.model.DataDictItemModel;
import cheng.msdp.sys.model.DataDictModel;
import cheng.msdp.sys.model.ModuleModel;
import com.application.exception.BusinessException;
import com.application.itf.IService;

import java.util.List;

public interface ITableService extends IService {

	public boolean synchronousTable(ModuleModel modules ,DataDictModel datadict ,List<DataDictItemModel> list ) throws BusinessException;
}
