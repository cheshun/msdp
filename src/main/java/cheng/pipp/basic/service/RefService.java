package cheng.pipp.basic.service;

import java.util.ArrayList;
import java.util.List;

import arch.util.lang.UFBoolean;
import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import org.springframework.stereotype.Component;

import cheng.pipp.basic.model.RefModel;
import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.sys.model.DataDictItemModel;
import cheng.pipp.sys.model.DataDictModel;
import cheng.pipp.sys.model.ModuleModel;
import cheng.pipp.sys.util.SuperVOUtil;
import cheng.pipp.ui.itf.IRefService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(propagation= Propagation.REQUIRED, rollbackFor=Exception.class)
public class RefService implements IRefService {

	public String createRef(ModuleModel module ,DataDictModel datadict, List<DataDictItemModel> list) throws BusinessException {
		RefModel refmodel = new RefModel();
		refmodel.setDr(0);
		int size = list.size();
		String primarykey =null;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<size;i++){
			DataDictItemModel temp = list.get(i);
			if(temp.getItemcode().startsWith("vdef")){
				continue ;
			}
			if("ts".equals(temp.getItemcode())){
				continue ;
			}
			if("dr".equals(temp.getItemcode())){
				continue ;
			}
			if(temp.getIsprimary().booleanValue()){
				primarykey = temp.getItemcode();
			}
			sb.append(temp.getItemcode()).append(":").append(temp.getItemname());
			if(i+1!=size){
				sb.append(";");
			}
		}
		refmodel.setField_codenames(sb.toString());
		refmodel.setModelclass(SuperVOUtil.createVO(module.getModule_code(), datadict, list));
		refmodel.setPk_module(module.getPk_module());
		refmodel.setPk_field(primarykey);
		refmodel.setIsaccesscontrol(UFBoolean.FALSE);
		//设置表名
		refmodel.setDatatablename(datadict.getDatatablecode());
		IDataBaseService dataBaseService = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
		refmodel.setReftype(module.getModule_code()+"_"+datadict.getDatatablecode()+"_ref");
		List<RefModel>  tdata =dataBaseService.queryByClause(RefModel.class, "reftype='" + module.getModule_code() + "_" + datadict.getDatatablecode() + "_ref" + "'");
		if(tdata==null || tdata.size()==0 ){
			dataBaseService.insertVO(refmodel);
			return refmodel.getReftype();
		}
		return tdata.get(0).getReftype();
	}

}
