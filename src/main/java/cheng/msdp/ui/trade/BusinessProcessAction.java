package cheng.msdp.ui.trade;

import cheng.lib.exception.BusinessException;
import cheng.lib.lang.SuperModel;
import cheng.lib.util.BeanHelper;
import cheng.lib.util.ClassUtil;
import cheng.msdp.framework.web.BusinessCommonAction;
import cheng.msdp.sys.model.NodeModel;
import cheng.msdp.ui.itf.IButtonAction;
import cheng.msdp.ui.model.ButtonModel;
import cheng.msdp.ui.vo.param.DeleteActionParamVO;
import cheng.msdp.ui.vo.param.SaveActionParamVO;
import com.application.common.context.ApplicationServiceLocator;
import com.application.module.jdbc.itf.IDataBaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by homelink on 2016/3/2.
 */
@Controller
public class BusinessProcessAction extends BusinessCommonAction {
    @RequestMapping("/management/ui/businessprocess/delete")
    public ModelAndView delete(HttpServletRequest request, DeleteActionParamVO paramvo, Model model) throws BusinessException {
        IDataBaseService queryservice = ApplicationServiceLocator.getService(IDataBaseService.class);

        String pk_node = paramvo.getTemplateid();
        NodeModel node = queryservice.queryByPK(NodeModel.class, pk_node);
        SuperModel supervo = (SuperModel) ClassUtil.initClass(node.getModelclass());
        queryservice.deleteByPK(supervo.getClass(), paramvo.getPk_data());

        return ajaxDoneSuccess("删除成功");

    }


    @RequestMapping("/management/ui/businessprocess/save")
    public ModelAndView save(SaveActionParamVO paramvo, HttpServletRequest request, Model model) throws BusinessException {
        IDataBaseService queryservice = ApplicationServiceLocator.getService(IDataBaseService.class);

        String pk_node = paramvo.getTemplateid().split(",")[0];
        paramvo.setTemplateid(pk_node);
        NodeModel node = (NodeModel) queryservice.queryByPK(NodeModel.class, pk_node);
        //接收到节点的pk 解析 模型 反射得到值
        SuperModel supervo = (SuperModel) ClassUtil.initClass(node.getModelclass());
        //接收到所有字段和值
        Map<String, Object> values = getParamFromReq(request);

        initBean(supervo, values);
        //保存之前处理要保存的数据 从按钮中取得classname
        ButtonModel button = queryservice.queryByPK(ButtonModel.class, paramvo.getPk_button());
        IButtonAction buttonaction = null;
        if (StringUtils.isNotEmpty(button.getActionclass())) {
            buttonaction = (IButtonAction) ClassUtil.initClass(button.getActionclass());//IButtonAction
            supervo = buttonaction.beforeSaveAction(supervo, paramvo, request);
        }
        //功能节点 添加下级节点需要
        if (StringUtils.isNotEmpty(paramvo.getPk_parent())) {
            if (supervo.getAttributeValue(supervo.getParentPKFieldName()) == null || StringUtils.isEmpty(supervo.getAttributeValue(supervo.getParentPKFieldName()).toString())) {
                BeanHelper.setProperty(supervo, supervo.getParentPKFieldName(), paramvo.getPk_parent());
            }
        }
        if (StringUtils.isEmpty(supervo.getPrimaryKey())) {
            queryservice.insert(supervo);
        } else {
            queryservice.update(supervo);
        }
        if (buttonaction != null) {
            buttonaction.afterSaveAction(supervo, paramvo, request);
        }
        return ajaxDoneSuccess("保存成功");

    }

    private SuperModel initBean(SuperModel supervo, Map<String, Object> values) {
        Iterator<Map.Entry<String, Object>> lt = values.entrySet().iterator();
        while (lt.hasNext()) {
            Map.Entry<String, Object> entry = lt.next();
            BeanHelper.setProperty(supervo, entry.getKey(), entry.getValue());
        }
        return supervo;
    }

}
