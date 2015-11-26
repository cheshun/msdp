package cheng.pipp.sys.conf;

import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.sys.model.NodeModel;
import cheng.pipp.ui.itf.IButtonAction;
import cheng.pipp.ui.vo.param.SaveActionParamVO;

import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import arch.util.lang.SuperModel;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class TabSaveAction implements IButtonAction  {

	
	public SuperModel beforeSaveAction(SuperModel supervo, SaveActionParamVO paramvo,
			HttpServletRequest request) throws BusinessException {
		 IDataBaseService queryservice = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
			
		NodeModel node = (NodeModel)supervo;
		if(StringUtils.isEmpty(node.getPk_parent_node())){
			try {
				NodeModel n = (NodeModel)queryservice.queryByPK(NodeModel.class, paramvo.getPk_data());
				node.setFun_level(n.getFun_level()+1);
				node.setPk_parent_node(paramvo.getPk_data());
				node.setFun_type("node");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return node;
	}

	
	public SuperModel afterSaveAction(SuperModel supervo, SaveActionParamVO paramvo,
			HttpServletRequest request) {
		return null;
	}

}
