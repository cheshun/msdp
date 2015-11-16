package cheng.pipp.ui.itf;


import com.application.common.exception.BusinessException;
import com.application.module.jdbc.model.NewSuperModel;

public interface IVOTreeData {
	public String getShowFieldName();

	public String getTreeNodeUIType();
	
	public NewSuperModel[] getTreeVO()throws BusinessException, BusinessException;
}
