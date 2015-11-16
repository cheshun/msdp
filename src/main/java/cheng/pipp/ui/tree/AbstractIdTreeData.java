package cheng.pipp.ui.tree;

import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.ui.itf.IVOTreeDataByID;
import com.application.common.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.model.NewSuperModel;
import org.apache.commons.lang.StringUtils;

import java.util.Collection;

/**
 * Created by a on 2015/1/3.
 */
public abstract class AbstractIdTreeData implements IVOTreeDataByID {

    public  abstract  Class<?> getTreeModel();
    protected   String getTreeModelCondition(){
        return null ;
    }
    public NewSuperModel[]  getTreeVO() throws BusinessException {
        IDataBaseService queryservice = (IDataBaseService) ApplicationContextHelper.getService(IDataBaseService.class);
        Collection<NewSuperModel> list =  queryservice.queryByClause(getTreeModel(),getCondition());
        return list.toArray(new NewSuperModel[0]);
    }

    private String getCondition(){
        if(StringUtils.isBlank(getTreeModelCondition())){
            return  " dr = 0 ";
        }
        return getTreeModelCondition();
    }
}
