package cheng.msdp.sys.itf;


import cheng.lib.exception.BusinessException;
import com.application.itf.IService;

public interface ISysTemplateService extends IService {
	
	/**
	 * 根据选中的数据字典生成单据模板
	 * @author cheng
	 * 2014年5月31日
	 * 上午4:22:35
	 * @param pk_module 模块主键
	 * @param pk_datadict 数据字典主键
	 * @return
	 * @throws BusinessException
	 */
	public boolean createBillTemplate(String pk_module ,String pk_datadict ) throws BusinessException;
	/**
	 * 生成指定模块指定数据字段的查询模板
	 * @author cheng
	 * 2014年5月31日
	 * 上午10:17:48
	 * @param pk_module 模块主键
	 * @param pk_datadict 数据字典主键
	 * @return
	 * @throws BusinessException
	 */
	public boolean createQueryTemplate(String pk_module ,String pk_datadict) throws BusinessException;

	 

	 
}
