package cheng.msdp.framework.context;

import cheng.msdp.sys.model.CacheTableModel;
import com.application.common.context.ApplicationServiceLocator;
import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
public class CacheTableManager {
	
	private ConcurrentHashMap<String,CacheTableModel> cachetablemap = new ConcurrentHashMap<String,CacheTableModel>();
	
	private volatile static CacheTableManager cachetablemanager;

	private CacheTableManager() {
		try {
			init();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	private void init() throws BusinessException{
		IDataBaseService query =   ApplicationServiceLocator.getService(IDataBaseService.class);
		List<CacheTableModel> cachedata = query.queryByClause(CacheTableModel.class, CacheTableModel.IsCache+"='Y' and dr=0 ");
		//
		if(cachedata==null || cachedata.size()==0){
			return ;
		}
		int size = cachedata.size();
		for(int i=0;i<size;i++){
			cachetablemap.put(cachedata.get(i).getTablename(), cachedata.get(i));
		}
	}

	public static CacheTableManager getSingleton() {
		if (cachetablemanager == null) {
			synchronized (CacheTableManager.class) {
				if (cachetablemanager == null) {
					cachetablemanager = new CacheTableManager();
				}
			}
		}
		return cachetablemanager;
	}
	
	public boolean add(CacheTableModel cacheTableModel) {
		cachetablemap.put(cacheTableModel.getTablename(), cacheTableModel);
		return true;
	}
	public boolean update(CacheTableModel cacheTableModel) {
		cachetablemap.put(cacheTableModel.getTablename(), cacheTableModel);
		return true;
	}
	public boolean isCache(String tableName) {
		CacheTableModel cachetable = cachetablemap.get(tableName);
		if(cachetable==null){
			return false ;
		}
		return cachetable.getIscache().booleanValue();
	}
}