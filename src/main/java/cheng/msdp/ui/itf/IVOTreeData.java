package cheng.msdp.ui.itf;


import cheng.lib.lang.SuperModel;
import cheng.lib.exception.BusinessException;

public interface IVOTreeData {
	public String getShowFieldName();

	public String getTreeNodeUIType();
	
	public SuperModel[] getTreeVO()throws BusinessException;
}
