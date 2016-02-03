package cheng.msdp.sys.service;

import cheng.msdp.sys.itf.IParamsService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional(propagation= Propagation.REQUIRED, rollbackFor=Exception.class)
public class ParamsServiceImpl implements IParamsService {
//	@Resource
//	IQueryService queryservice ;
//
//	public List<ParamsModel> getParams() throws BusinessException {
//
//		return ( List<ParamsModel> )queryservice.queryByClause(ParamsModel.class, " dr=0 ");
//	}
//
//	public String getParamsforInit() throws BusinessException {
//		 List<ParamsModel>  params = getParams();
//		 int size = params.size();
//		 StringBuffer sb = new StringBuffer();
//
//		 for(int i=0;i<size;i++){
//			 ParamsModel p = params.get(i);
//			 sb.append(p.getParamcode());
//			 sb.append(" = ");
//			 sb.append(p.getParamvalue());
//			 sb.append(Constants.PROFILE_separator);
//		 }
//		return sb.toString();
//	}

}
