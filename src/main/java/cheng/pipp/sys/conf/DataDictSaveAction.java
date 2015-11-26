package cheng.pipp.sys.conf;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.sys.model.DataDictItemModel;
import cheng.pipp.sys.model.DataDictModel;
import cheng.pipp.sys.model.ModuleModel;
import cheng.pipp.sys.model.NodeModel;
import cheng.pipp.sys.util.TableUtil;
import cheng.pipp.ui.itf.IButtonAction;
import cheng.pipp.ui.vo.param.AddActionParamVO;
import cheng.pipp.ui.vo.param.SaveActionParamVO;
import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import arch.util.lang.SuperModel;

public class DataDictSaveAction implements IButtonAction{

	
	public SuperModel beforeSaveAction(SuperModel supervo, SaveActionParamVO paramvo,
			HttpServletRequest request)  throws BusinessException{
		IDataBaseService dataBaseService = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
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
		IDataBaseService dataBaseService = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
		
		DataDictModel datadict = (DataDictModel)supervo;
		NodeModel node = (NodeModel)dataBaseService.queryByPK(NodeModel.class, datadict.getPk_node());
		if(node.getFun_type().equals("reoprt")){
			return supervo;
		}
		if(AddActionParamVO.actiontype_add.equals(paramvo.getActiontype())){
			//初始化 对应类型的必须字段
			List<DataDictItemModel> list = TableUtil.initBusiFields(datadict);
			dataBaseService.insertVOList(list);
			return supervo;
		}
		return supervo;
	}

}
