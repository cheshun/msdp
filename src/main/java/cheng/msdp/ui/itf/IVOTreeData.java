package cheng.msdp.ui.itf;


import arch.util.lang.SuperModel;
import com.application.exception.BusinessException;

public interface IVOTreeData {
	public String getShowFieldName();

	public String getTreeNodeUIType();
	
	public SuperModel[] getTreeVO()throws BusinessException;
}
