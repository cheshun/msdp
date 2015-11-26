package cheng.pipp.sys.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import arch.util.lang.UFBoolean;
import org.springframework.stereotype.Component;

import cheng.pipp.sys.itf.ISysTemplateService;
import cheng.pipp.sys.model.DataDictItemModel;
import cheng.pipp.sys.model.DataDictModel;
import cheng.pipp.sys.model.NodeModel;
import cheng.pipp.ui.model.QueryConditionTemplateModel;
import cheng.pipp.ui.model.QueryTemplateModel;
import cheng.pipp.ui.model.ReportItemTemplateModel;
import cheng.pipp.ui.model.ReportTemplateModel;
import cheng.pipp.ui.model.UIItemTempletModel;
import cheng.pipp.ui.model.UITempletModel;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(propagation= Propagation.REQUIRED, rollbackFor=Exception.class)
public class TemplateServiceImpl implements ISysTemplateService {
	 @Resource
	 IDataBaseService dataBaseService ;
	
		public boolean createBillTemplate(String pk_module, String pk_datadict)
				throws BusinessException {
			DataDictModel datadict = (DataDictModel)dataBaseService.queryByPK(DataDictModel.class, pk_datadict);
			List<DataDictItemModel> list = (List<DataDictItemModel>)dataBaseService.queryByClause(DataDictItemModel.class, "pk_datadict='"+pk_datadict+"' and isBilltemplatesyn= '"+ UFBoolean.FALSE+"'");
			createBillTemplate(datadict, list);
			for(DataDictItemModel dataDictItemModel :list){
				dataDictItemModel.setIsBilltemplatesyn(UFBoolean.TRUE);
			}
			dataBaseService.updateVOList(list);
			return true;
		}
		public boolean createQueryTemplate(String pk_module, String pk_datadict)
				throws BusinessException {
			DataDictModel datadict = (DataDictModel)dataBaseService.queryByPK(DataDictModel.class, pk_datadict);
			List<DataDictItemModel> list = (List<DataDictItemModel>)dataBaseService.queryByClause(DataDictItemModel.class, "pk_datadict='"+pk_datadict+"' and isQueryTemplatesyn= '"+UFBoolean.FALSE+"'");
			createQueryTemplate(datadict, list);
			for(DataDictItemModel dataDictItemModel :list){
				dataDictItemModel.setIsQueryTemplatesyn(UFBoolean.TRUE);
			}
			dataBaseService.updateVOList(list);
			return true;
		}
	 
	 
	 
	 
	public boolean createBillTemplate(DataDictModel datadict,
			List<DataDictItemModel> list) throws BusinessException {
		//生成单据模板主表信息
		String[] pk_billtemplate = createBillTemplateHead(datadict);
		//生成单据模板子表信息
		createBillItemTemplate(datadict,pk_billtemplate,list);
		return true;
	}
	/**
	 * 生成单据模板主表信息
	 * @param datadict
	 * @return
	 * @throws BusinessException
	 */
	private String[] createBillTemplateHead(DataDictModel datadict) throws BusinessException {
		//查找有没有该节点的模板
		NodeModel node = (NodeModel)dataBaseService.queryByPK(NodeModel.class, datadict.getPk_node());
		if(node.getFun_type().equals("report")){
			List<ReportTemplateModel> list = (List<ReportTemplateModel>) dataBaseService.queryByClause(ReportTemplateModel.class, " pk_node='"+datadict.getPk_node()+"' and dr=0 ");
			if(list==null || list.size()==0){
				ReportTemplateModel u = new ReportTemplateModel();
				u.setDr(0);
				u.setPk_node(datadict.getPk_node());
				u.setTemplatetypecode("SYSTEM");
				u.setTemplatename(datadict.getDatatablename()+"默认模板");;
				String pk = dataBaseService.insertVO(u);
				return new String[]{pk};
			}else{
				String [] s = new String [list.size()];
				for(int i=0;i<list.size();i++){
					s[i]=list.get(i).getPrimaryKey();
				}
				return s ;
			}
		}else{
			List<UITempletModel> list = (List<UITempletModel>) dataBaseService.queryByClause(UITempletModel.class, " pk_node='"+datadict.getPk_node()+"' and dr=0 ");
			if(list==null || list.size()==0){
				//如果没有则添加一个默认的模板
				//如果有 返回所有的模板主键
				UITempletModel u = new UITempletModel();
				u.setDr(0);
				u.setPk_node(datadict.getPk_node());
				u.setTemplatetypecode("SYSTEM");
				u.setTempletuiname(datadict.getDatatablename()+"默认模板");
				String pk = dataBaseService.insertVO(u);
				return new String[]{pk};
			}else{
				String [] s = new String [list.size()];
				for(int i=0;i<list.size();i++){
					s[i]=list.get(i).getPrimaryKey();
				}
				return s ;
			}
		}
	}
	/**
	 * 生成单据模板子表信息
	 * @param datadict
	 * @param pk_billtemplate
	 * @param list
	 * @throws BusinessException
	 */
	private void createBillItemTemplate(DataDictModel datadict, String[] pk_billtemplate,
			List<DataDictItemModel> list)  throws BusinessException {
		NodeModel node = (NodeModel)dataBaseService.queryByPK(NodeModel.class, datadict.getPk_node());
		if(node.getFun_type().equals("report")){
			List<ReportItemTemplateModel> listtemplate = new ArrayList<ReportItemTemplateModel>();
			for(int j=0;j<pk_billtemplate.length;j++){
				for(int i=0;i<list.size();i++){
					DataDictItemModel item = list.get(i);
					ReportItemTemplateModel u = new ReportItemTemplateModel();
					u.setDatatype(item.getUitype());
					u.setItemname(item.getItemname());
					u.setItemcode(item.getItemcode());
					u.setPk_reporttemplate(pk_billtemplate[j]);
					u.setShoworder(i+1);
					u.setWidth(150);
					u.setIslistshow(UFBoolean.TRUE);
					String code = item.getItemcode();
					if(code.contains("vdef") || code.contains("ts")|| code.contains("dr")){
						u.setIslistshow(UFBoolean.FALSE);
					}else{
						u.setIslistshow(UFBoolean.TRUE);
					}
					u.setIslist(UFBoolean.TRUE);
					listtemplate.add(u);
				}
			}
			dataBaseService.insertVOList(listtemplate);
		}else{
			List<UIItemTempletModel> listtemplate = new ArrayList<UIItemTempletModel>();
			for(int j=0;j<pk_billtemplate.length;j++){
				for(int i=0;i<list.size();i++){
					DataDictItemModel item = list.get(i);
					UIItemTempletModel u = new UIItemTempletModel();
					u.setDatatype(item.getUitype());
					u.setCsstype(item.getDatatype());
					u.setDefaultshowname(item.getItemname());
					u.setInputlength(item.getLength());
					u.setItemkey(item.getItemcode());
					u.setPk_templet(pk_billtemplate[j]);
					u.setReftype(item.getTypedata());
					u.setWidth(120);
					u.setShoworder(i+1);
					u.setIscard(UFBoolean.TRUE);
					String code = item.getItemcode();
					if(code.contains("vdef") || code.contains("ts")|| code.contains("dr")){
						u.setIslistshow(UFBoolean.FALSE);
						u.setIscardshow(UFBoolean.FALSE);
					}else{
						u.setIslistshow(UFBoolean.TRUE);
						u.setIscardshow(UFBoolean.TRUE);
					}
					u.setIsedit(UFBoolean.TRUE);
					u.setIslist(UFBoolean.TRUE);
					u.setIslock(UFBoolean.FALSE);
					u.setIsnull(UFBoolean.TRUE);
					listtemplate.add(u);
				}
			}
			dataBaseService.insertVOList(listtemplate);
		}
	}
	/**
	 * 生成查询模板信息
	 */
	public boolean createQueryTemplate(DataDictModel datadict,
			List<DataDictItemModel> list) throws BusinessException {
		//生成查询模板主表信息
		String[] pk_querytemplate = createQueryTemplate(datadict);
		//生成查询模板字表信息
		createQueryItemTemplate(pk_querytemplate,list);
		return false;
	}
	/**
	 * 生成查询模板主表信息
	 * @param datadict
	 * @return
	 * @throws BusinessException
	 */
	private String[] createQueryTemplate(DataDictModel datadict) throws BusinessException {
		List<QueryTemplateModel> list = (List<QueryTemplateModel>) dataBaseService.queryByClause(QueryTemplateModel.class, " pk_node='"+datadict.getPk_node()+"' and dr=0 ");
		if(list==null || list.size()==0){
			//如果没有则添加一个默认的模板
			//如果有 返回所有的模板主键
			QueryTemplateModel query = new QueryTemplateModel();
			query.setCode(datadict.getDatatablecode());
			query.setName(datadict.getDatatablename());
			query.setPk_node(datadict.getPk_node());
			query.setDr(0);
			query.setRemark(datadict.getDatatableremark());
			query.setTemplatetypecode("SYSTEM");
			String pk = dataBaseService.insertVO(query);
			return new String[]{pk};
		}else{
			String [] s = new String [list.size()];
			for(int i=0;i<list.size();i++){
				s[i]=list.get(i).getPrimaryKey();
			}
			return s ;
		}
		
		
		
	}
	/**
	 * 生成查询模板主表信息
	 * @param pk_querytemplate
	 * @param list
	 * @throws BusinessException
	 */
	private void createQueryItemTemplate(String[] pk_querytemplate,
			List<DataDictItemModel> list) throws BusinessException {
		List<QueryConditionTemplateModel> li = new ArrayList<QueryConditionTemplateModel>();
		for(int j=0;j<pk_querytemplate.length;j++){
			for(int i=0;i<list.size();i++){
				DataDictItemModel item = list.get(i);
				QueryConditionTemplateModel queryitem = new QueryConditionTemplateModel();
				queryitem.setDatatype(item.getUitype());
				queryitem.setItemkey(item.getItemcode());
				queryitem.setDefaultshowname(item.getItemname());
				queryitem.setIsedit(UFBoolean.TRUE);
				queryitem.setIsnull(UFBoolean.TRUE);
				String code = item.getItemcode();
				if(code.contains("vdef")|| code.contains("ts")|| code.contains("dr")){
					queryitem.setIsuse(UFBoolean.FALSE);
				}else{
					queryitem.setIsuse(UFBoolean.TRUE);
				}
				queryitem.setPk_querytemplate(pk_querytemplate[j]);
				queryitem.setReftype(item.getTypedata());
				queryitem.setDr(0);
				//根据不同的数据类型产生不同操作符
				queryitem.setOperatecode("CV;=,等于;like,包含");
				li.add(queryitem);
			}
		}
		dataBaseService.insertVOList(li);
	}
	
	
	
}
