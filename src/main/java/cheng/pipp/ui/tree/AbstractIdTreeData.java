package cheng.pipp.ui.tree;

import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.ui.itf.IVOTreeDataByID;
import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import arch.util.lang.SuperModel;
import org.apache.commons.lang.StringUtils;

import java.util.Collection;
import java.util.List;

/**
 * Created by a on 2015/1/3.
 */
public abstract class AbstractIdTreeData implements IVOTreeDataByID {

    public  abstract  Class<?> getTreeModel();
    protected   String getTreeModelCondition(){
        return null ;
    }
    public SuperModel[]  getTreeVO() throws BusinessException {
        IDataBaseService queryservice =  ApplicationContextHelper.getService(IDataBaseService.class);
        List<SuperModel> list = (List<SuperModel>) queryservice.queryByClause(getTreeModel(),getCondition());
        return list.toArray(new SuperModel[0]);
    }

    private String getCondition(){
        if(StringUtils.isBlank(getTreeModelCondition())){
            return  " dr = 0 ";
        }
        return getTreeModelCondition();
    }
}
