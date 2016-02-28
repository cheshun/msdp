package cheng.msdp.sys.conf;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.application.common.context.ApplicationServiceLocator;
import cheng.msdp.sys.model.DataDictItemModel;
import cheng.msdp.sys.model.DataDictModel;
import cheng.msdp.sys.model.ModuleModel;
import cheng.msdp.sys.model.NodeModel;
import cheng.msdp.sys.util.TableUtil;
import cheng.msdp.ui.itf.IButtonAction;
import cheng.msdp.ui.vo.param.AddActionParamVO;
import cheng.msdp.ui.vo.param.SaveActionParamVO;
import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import cheng.lib.lang.SuperModel;

public class DataDictSaveAction implements IButtonAction{

	
	public SuperModel beforeSaveAction(SuperModel supervo, SaveActionParamVO paramvo,
			HttpServletRequest request)  throws BusinessException{
		IDataBaseService dataBaseService =  ApplicationServiceLocator.getService(IDataBaseService.class);
		DataDictModel datadict = (DataDictModel)supervo;
		datadict.setPk_module(paramvo.getPk_parent());
		ModuleModel modules = (ModuleModel)dataBaseService.queryByPK(ModuleModel.class, datadict.getPk_module());
		if(!datadict.getDatatablecode().startsWith(modules.getModule_code()+"_")){
			datadict.setDatatablecode(modules.getModule_code()+"_"+datadict.getDatatablecode());
		}
		return datadict;
	}

	
	public SuperModel afterSaveAction(SuperModel supervo, SaveActionParamVO paramvo,
			HttpServletRequest request) throws BusinessException {
		IDataBaseService dataBaseService =  ApplicationServiceLocator.getService(IDataBaseService.class);
		
		DataDictModel datadict = (DataDictModel)supervo;
		NodeModel node = (NodeModel)dataBaseService.queryByPK(NodeModel.class, datadict.getPk_node());
		if(node.getFun_type().equals("reoprt")){
			return supervo;
		}
		if(AddActionParamVO.actiontype_add.equals(paramvo.getActiontype())){
			//初始化 对应类型的必须字段
			List<DataDictItemModel> list = TableUtil.initBusiFields(datadict);
			dataBaseService.insert(list);
			return supervo;
		}
		return supervo;
	}

}
