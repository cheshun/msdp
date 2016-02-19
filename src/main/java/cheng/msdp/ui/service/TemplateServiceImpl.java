package cheng.msdp.ui.service;

import java.util.List;

import cheng.msdp.ui.itf.ITemplateService;
import com.application.common.context.ApplicationServiceLocator;
import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.processor.BeanListProcessor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import cheng.msdp.ui.model.UIItemTempletModel;
import cheng.msdp.ui.model.UITempletModel;
import cheng.msdp.ui.vo.param.TemplateParamVO;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(propagation= Propagation.REQUIRED, rollbackFor=Exception.class)
public class TemplateServiceImpl implements ITemplateService {
	
	
	public List<UIItemTempletModel> getUserCardTemplet(String pk_user,String pk_role,
			String pk_node ,String conditionstr) throws BusinessException {
		String sql = null;
		String condition =" ti.iscard='Y'  " ;
		if(StringUtils.isNotEmpty(conditionstr)){
			condition = condition +" and ti."+conditionstr;
		}
		//查找该用户的模板
		sql = createUserSql(pk_user,pk_node,condition);
		if(getData(sql).size()>0){
			return getData(sql);
		}
		sql=null;
		//查找该角色的模板
		sql = createRoleSql(pk_role,pk_node,condition);
		if(getData(sql).size()>0){
			return getData(sql);
		}
		sql=null;
		//查找默认模板
		sql = createDefaultSql(pk_node,condition);
		if(getData(sql).size()>0){
			return getData(sql);
		}
		return getData(sql);
	}
	
	public List<UIItemTempletModel> getUserTableTemplet(String pk_user,String pk_role,
			String pk_node,String conditionstr) throws BusinessException {
		String sql = null;
		 String condition =" ti.islist='Y' ";
		 if(StringUtils.isNotEmpty(conditionstr)){
			 condition = condition +" and ti."+conditionstr;
		 }
		//查找该用户的模板
		sql = createUserSql(pk_user,pk_node,condition);
		if(getData(sql).size()>0){
			return getData(sql);
		}
		sql=null;
		//查找该角色的模板
		sql = createRoleSql(pk_role,pk_node,condition);
		if(getData(sql).size()>0){
			return getData(sql);
		}
		sql=null;
		//查找默认模板
		sql = createDefaultSql(pk_node,condition);
		if(getData(sql).size()>0){
			return getData(sql);
		}
		return getData(sql);
	}
	
	private String createRoleSql(String pk_role, String pk_node,String condition) {
		if(StringUtils.isEmpty(pk_role)){
			return createDefaultSql(pk_node, condition);
		}
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT ti.* from sm_templet_item ti  ");
		sb.append(" INNER JOIN sm_temple_node_role tur ON tur.pk_temple=ti.pk_templet ");
		sb.append(" where  ti.dr=0 and  tur.pk_node='"+pk_node+"' and tur.pk_role='"+pk_role+"'  ");
		sb.append("  and "+condition +" order by ti.showorder asc ");
		return sb.toString(); 
	}
	private String createUserSql(String pk_user, String pk_node,String condition) {
		if(StringUtils.isEmpty(pk_user)){
			return createDefaultSql(pk_node, condition);
		}
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT ti.* from sm_templet_item ti  ") ;
		sb.append(" INNER JOIN sm_temple_node_role tur ON tur.pk_temple=ti.pk_templet  ") ;
		sb.append(" where  ti.dr=0 and  tur.pk_node='"+pk_node+"' and tur.pk_user='"+pk_user+"' ") ;
		sb.append(" and "+condition+" order by ti.showorder asc  ") ;
		return sb.toString(); 
	}
	private String createDefaultSql(String pk_node,String condition) {
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT ti.* from sm_templet_item ti  ") ;
		sb.append(" INNER JOIN sm_templet t on ti.pk_templet=t.pk_templet ") ;
		sb.append(" WHERE ti.dr=0 and t.pk_node='"+pk_node+"' and t.templatetypecode='SYSTEM' ") ;
		sb.append("  and "+condition+" order by ti.showorder asc  ") ;
		return sb.toString(); 
	}
	private List<UIItemTempletModel> getData(String sql) throws BusinessException {
		IDataBaseService queryseervice = ApplicationServiceLocator.getBean(IDataBaseService.class);
		
		BeanListProcessor itemprocessor = new BeanListProcessor(UIItemTempletModel.class);
		List<UIItemTempletModel> list =(List<UIItemTempletModel>) queryseervice.queryBySql(sql, itemprocessor);
		return list;
	}
	
	public boolean copy(UITempletModel modelvo, TemplateParamVO vo) throws BusinessException {
		IDataBaseService dataBaseService = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		UITempletModel tempmodelvo = (UITempletModel) dataBaseService.queryByPK(UITempletModel.class, vo.getPk_data());
		List<UIItemTempletModel> list = (List<UIItemTempletModel>)dataBaseService.queryByClause(UIItemTempletModel.class, "pk_templet ='"+tempmodelvo.getPk_templet()+"'");
		tempmodelvo.setTemplatetypecode(modelvo.getTemplatetypecode());
		tempmodelvo.setTempletuicaption(modelvo.getTempletuicaption());
		tempmodelvo.setTempletuiname(modelvo.getTempletuiname());
		tempmodelvo.setPrimaryKey(null);
		String pk_templet = dataBaseService.insert(tempmodelvo);
		copybody(pk_templet,list);
		return true;
	}
	private void copybody(String pk_templet,List<UIItemTempletModel> list) throws BusinessException {
		IDataBaseService dataBaseService = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		for(int i=0;i<list.size();i++){
			list.get(i).setPrimaryKey(null);
			list.get(i).setPk_templet(pk_templet);
		}
		dataBaseService.insert(list);
	}
}
