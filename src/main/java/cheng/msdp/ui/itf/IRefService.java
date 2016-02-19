package cheng.msdp.ui.itf;
import cheng.msdp.sys.model.DataDictItemModel;
import cheng.msdp.sys.model.DataDictModel;
import cheng.msdp.sys.model.ModuleModel;
import cheng.lib.exception.BusinessException;
import com.application.itf.IService;

import java.util.List;

public interface IRefService extends IService {

	/**
	 * 创建参照
	 * @author cheng
	 * 2014年5月10日
	 * 下午8:11:36
	 * @param module 模块
	 * @param datadict 数据表 
	 * @param list 数据表字段集合
	 * @return 生成的参照类型
	 * @throws BusinessException
	 */
	public String createRef(ModuleModel module,DataDictModel datadict ,List<DataDictItemModel> list) throws BusinessException;
	
}
