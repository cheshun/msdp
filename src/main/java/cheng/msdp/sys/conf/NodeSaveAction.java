package cheng.msdp.sys.conf;


import com.application.common.context.ApplicationServiceLocator;
import cheng.msdp.sys.model.NodeModel;
import cheng.msdp.ui.itf.IButtonAction;
import cheng.msdp.ui.vo.param.SaveActionParamVO;
import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import arch.util.lang.SuperModel;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class NodeSaveAction implements IButtonAction {

	
	public SuperModel beforeSaveAction(SuperModel supervo, SaveActionParamVO paramvo,
			HttpServletRequest request) throws BusinessException {
		 IDataBaseService queryservice = (IDataBaseService) ApplicationServiceLocator.getService(IDataBaseService.class);
			
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

	
	public SuperModel afterSaveAction(SuperModel supervo, SaveActionParamVO paramvo,
			HttpServletRequest request) {
		return null;
	}

}
