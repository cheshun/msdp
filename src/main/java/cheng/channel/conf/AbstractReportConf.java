package cheng.channel.conf;

import arch.util.lang.ClassUtil;
import arch.util.lang.PageVO;
import cheng.pipp.access.model.ResourceRoleModel;
import cheng.pipp.basic.model.RefModel;
import cheng.channel.vo.RegisterSourceVO;
import cheng.pipp.framework.context.ApplicationClientEnvironment;
import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.ui.itf.IReportController;
import cheng.pipp.ui.vo.querytemplate.QueryParamVO;

import com.application.common.context.ApplicationServiceLocator;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.model.NewSuperModel;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractReportConf implements IReportController{
	protected Logger logger = LoggerFactory.getLogger(AbstractReportConf.class);
	
	protected String getChannel() {
		try{
			String pk_role = ApplicationClientEnvironment.getPk_role();
			IDataBaseService query =  ApplicationServiceLocator.getBean(IDataBaseService.class);
			List<ResourceRoleModel> list1 = (List<ResourceRoleModel>) query.queryByClause(ResourceRoleModel.class, " pk_role='"+pk_role+"' and pk_resourcetype='0001AA100000000000D2' ");
			if(list1==null || list1.size()==0){
				String resourcetype = "0001AA100000000000D2" ;
				RefModel refmodel = (RefModel) query.queryByPK(RefModel.class, resourcetype);
				String modelclass = refmodel.getModelclass();
				NewSuperModel vo = (NewSuperModel) ClassUtil.initClass(modelclass);
				List<RegisterSourceVO> registervos = (List<RegisterSourceVO>) query.queryAll(vo.getClass());
				StringBuffer sb = new StringBuffer();
				for(int i=0;i<registervos.size();i++){
					sb.append(registervos.get(i).getRegistersource()).append(",");
				}
				sb.setLength(sb.length()-1);
				return sb.toString();
			}
			String pk = list1.get(0).getPk_resource();
			String resourcetype = list1.get(0).getPk_resourcetype();
			RefModel refmodel = (RefModel) query.queryByPK(RefModel.class, resourcetype);
			String modelclass = refmodel.getModelclass();
			NewSuperModel vo = (NewSuperModel)ClassUtil.initClass(modelclass);
			RegisterSourceVO registervo = (RegisterSourceVO) query.queryByPK(vo.getClass(), pk);
			return String.valueOf(registervo.getRegistersource());
		}catch(Exception e){
			logger.info("get channel error "+e.getMessage());
		}
		return null;
	}

	public List<NewSuperModel> getReportData(List<QueryParamVO> queryparam,
									   PageVO pagevo) {
		List<NewSuperModel> userlist = new ArrayList<NewSuperModel>();
		//获取角色对应的渠道
		String channel = getChannel();
		if(StringUtils.isBlank(channel)){
			return userlist ;
		}
		String[] sql = createSQL(channel,pagevo);
		logger.info("query user ："+sql[0]);
		logger.info("query user ："+sql[1]);
		userlist = getData(sql,pagevo,userlist);
		return userlist;
	}

	public abstract String[] createSQL(String channel ,PageVO pagevo);
	public abstract  List<NewSuperModel> getData(String[] sql, PageVO pagevo,List<NewSuperModel> userlist) ;
}
