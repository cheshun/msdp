package cheng.msdp.ui.service;

import java.util.List;

import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.processor.BeanListProcessor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.application.common.context.ApplicationServiceLocator;
import cheng.msdp.ui.model.QueryConditionTemplateModel;
import cheng.msdp.ui.model.QueryTemplateModel;
import cheng.msdp.ui.vo.param.TemplateParamVO;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(propagation= Propagation.REQUIRED, rollbackFor=Exception.class)
public class QueryTemplateServiceImpl implements IQueryTemplateService {

	public List<QueryConditionTemplateModel> getQueryTemplate(String pk_node,
			String pk_role,String pk_user) throws BusinessException {
		String sql = null ;
		//获取该用户 分配模板
		sql = createUsersql(pk_node,pk_user);
		if(getData(sql).size()>0){
			return getData(sql);
		}
		//获取该角色 分配模板
		sql = createRolesql(pk_node,pk_role);
		if(getData(sql).size()>0){
			return getData(sql);
		}
		//获取默认模板
		sql = createDefaultsql(pk_node);
		if(getData(sql).size()>0){
			return getData(sql);
		}
		return getData(sql);
	}
		//得到模板id; 
//		List<TemplateNodeRoleModel> list = (List<TemplateNodeRoleModel>) persistenceService.queryByClause(TemplateNodeRoleModel.class, " pk_role='"+pk_role+"' and pk_node='"+pk_node+"' ");
//		String pk_template = list.get(0).getPk_temple() ;
//		String sql = "select qct.* from sm_queryconditiontemplate qct " +
//			" INNER JOIN sm_querytemplatenoderole qtn ON qtn.pk_querytemplate=qct.pk_querytemplate " +
//			" where qtn.pk_role='"+pk_role+"' and qtn.pk_node='"+pk_node+"' and qtn.pk_template='"+pk_template+"' ";
//		 List<QueryConditionTemplateModel> l = (List<QueryConditionTemplateModel>) persistenceService.executeQuery(sql, new BeanListProcessor(QueryConditionTemplateModel.class));
	
	private String createUsersql(String pk_node, String pk_user) {
		StringBuffer sb = new StringBuffer("SELECT b.* from sm_queryconditiontemplate b ");
		sb.append(" INNER JOIN sm_querytemplate h ON b.pk_querytemplate= h.pk_querytemplate") ;
		sb.append(" INNER JOIN sm_querytemplatenoderole nq  ON nq.pk_querytemplate=b.pk_querytemplate ") ;
		sb.append(" WHERE b.isuse='Y' and nq.dr=0 and h.dr=0 and b.dr=0  and nq.pk_user='"+pk_user+"' and nq.pk_node='"+pk_node+"'") ;
		return sb.toString();
	}
	private String createRolesql(String pk_node, String pk_role) {
		StringBuffer sb = new StringBuffer("SELECT b.* from sm_queryconditiontemplate b ");
		sb.append(" INNER JOIN sm_querytemplate h ON b.pk_querytemplate= h.pk_querytemplate") ;
		sb.append(" INNER JOIN sm_querytemplatenoderole nq  ON nq.pk_querytemplate=b.pk_querytemplate ") ;
		sb.append(" WHERE b.isuse='Y' and nq.dr=0 and h.dr=0 and b.dr=0 and nq.pk_role='"+pk_role+"' and nq.pk_node='"+pk_node+"'") ;
		return sb.toString();
	}
	private String createDefaultsql(String pk_node) {
		StringBuffer sb = new StringBuffer("SELECT b.* from sm_queryconditiontemplate b ");
		sb.append(" INNER JOIN sm_querytemplate h ON b.pk_querytemplate= h.pk_querytemplate ");
		sb.append(" WHERE b.isuse='Y' and h.dr=0 and b.dr=0 and h.templatetypecode='SYSTEM' and h.pk_node='"+pk_node+"'");
		return sb.toString();
	}
	
	@SuppressWarnings("unchecked")
	private List<QueryConditionTemplateModel> getData(String sql) throws BusinessException{
		IDataBaseService queryseervice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		List<QueryConditionTemplateModel> l = (List<QueryConditionTemplateModel>) queryseervice.queryBySql(sql, new BeanListProcessor(QueryConditionTemplateModel.class));
		return l;
	}

	
	public List<QueryConditionTemplateModel> getQueryTemplate(String pk_node)
			throws BusinessException {
		return getData(createDefaultsql(pk_node));
	}

	
	public List<QueryConditionTemplateModel> getQueryTemplate(String pk_node,
			String pk_role) throws BusinessException {
		if(StringUtils.isEmpty(pk_role) || "00000000000000000000".equals(pk_role)){
			return getQueryTemplate(pk_node);
		}
		return getData(createRolesql(pk_node,pk_role));
	}

	
	public boolean copy(TemplateParamVO vo, QueryTemplateModel modelvo) throws BusinessException {
		IDataBaseService dataBaseService = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		QueryTemplateModel tempmodelvo = (QueryTemplateModel) dataBaseService.queryByPK(QueryTemplateModel.class, vo.getPk_data());
		List<QueryConditionTemplateModel> list = (List<QueryConditionTemplateModel>)dataBaseService.queryByClause(QueryConditionTemplateModel.class, "pk_querytemplate ='"+tempmodelvo.getPrimaryKey()+"'");
		tempmodelvo.setTemplatetypecode(modelvo.getTemplatetypecode());
		tempmodelvo.setRemark(modelvo.getRemark());
		tempmodelvo.setName(modelvo.getName());
		tempmodelvo.setCode(modelvo.getCode());
		tempmodelvo.setPrimaryKey(null);
		String pk_templet = dataBaseService.insert(tempmodelvo);
		copybody(pk_templet,list);
		return true;
	}
	private void copybody(String pk_querytemplate,
			List<QueryConditionTemplateModel> list) throws BusinessException {
		for(int i=0;i<list.size();i++){
			list.get(i).setPrimaryKey(null);
			list.get(i).setPk_querytemplate(pk_querytemplate);;
		}
		IDataBaseService dataBaseService = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		dataBaseService.insert(list);
	}
}
