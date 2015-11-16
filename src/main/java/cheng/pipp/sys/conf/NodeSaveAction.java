package cheng.pipp.sys.conf;


import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.sys.model.NodeModel;
import cheng.pipp.ui.itf.IButtonAction;
import cheng.pipp.ui.vo.param.SaveActionParamVO;
import com.application.common.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.model.NewSuperModel;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class NodeSaveAction implements IButtonAction {

	
	public NewSuperModel beforeSaveAction(NewSuperModel supervo, SaveActionParamVO paramvo,
			HttpServletRequest request) throws BusinessException {
		 IDataBaseService queryservice = (IDataBaseService) ApplicationContextHelper.getService(IDataBaseService.class);
			
		NodeModel node = (NodeModel)supervo;
		if(StringUtils.isNotEmpty(node.getPk_parent_node())){
				NodeModel n = (NodeModel)queryservice.queryByPK(NodeModel.class, paramvo.getPk_data());
				node.setFun_level(n.getFun_level()+1);
		}
		if(node.getFun_type().equals(NodeModel.NodeType_Node)){
			if(StringUtils.isBlank(node.getUrl_name())){
				node.setUrl_name("/management/ui/singletable/index");
				if(StringUtils.isNotBlank(node.getTreedata())){
					node.setUrl_name("/management/ui/tree/index");
				}
			}
		}
		if(node.getFun_type().equals(NodeModel.NodeType_Report)){
			if(StringUtils.isBlank(node.getUrl_name())) {
				node.setUrl_name("/management/ui/report/index");
			}
		}
		return node;
	}

	
	public NewSuperModel afterSaveAction(NewSuperModel supervo, SaveActionParamVO paramvo,
			HttpServletRequest request) {
		return null;
	}

}
