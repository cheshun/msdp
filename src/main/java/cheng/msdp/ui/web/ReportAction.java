package cheng.msdp.ui.web;

import cheng.lib.util.ClassUtil;
import cheng.lib.lang.PageVO;
import com.application.common.context.ApplicationServiceLocator;
import cheng.msdp.framework.web.BusinessCommonAction;
import cheng.msdp.sys.model.NodeModel;
import cheng.msdp.ui.itf.IReportController;
import cheng.msdp.ui.model.QueryConditionTemplateModel;
import cheng.msdp.ui.model.ReportItemTemplateModel;
import cheng.msdp.ui.model.ReportTemplateModel;
import cheng.msdp.ui.service.IQueryTemplateService;
import cheng.msdp.ui.util.ParamUtil;
import cheng.msdp.ui.util.QueryTemplateUtil;
import cheng.msdp.ui.util.ReportTableUtil;
import cheng.msdp.ui.vo.param.TemplateParamVO;
import cheng.msdp.ui.vo.querytemplate.QueryParamVO;
import cheng.msdp.ui.vo.uitemplate.TableTemplateVO;

import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import cheng.lib.lang.SuperModel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.util.List;

@Controller
public class ReportAction extends BusinessCommonAction {

	@Resource IQueryTemplateService iqueryTemplateService;
	
	@RequestMapping("/management/ui/report/index")
	public String index(HttpServletRequest request, TemplateParamVO paramvo ,PageVO pagevo,Model model) throws BusinessException {
		IDataBaseService queryservice =  ApplicationServiceLocator.getService(IDataBaseService.class);
		TableTemplateVO tabletemplatevo = new TableTemplateVO();
		//用户角色
		paramvo.setTemplateid(paramvo.getTemplateid().split(",")[0]);
//		String pk_role = getUserinfo(request).getPk_role();
//		Map<String,Object> obj = getParamFromReq(request);
		NodeModel node = (NodeModel)queryservice.queryByPK(NodeModel.class, paramvo.getTemplateid());
		//获取报表模板的数据 vo 和出结果处理类
		
		IReportController contr = (IReportController) ClassUtil.initClass(node.getTreedata());
		List<ReportTemplateModel> h = (List<ReportTemplateModel>)queryservice.queryByClause(ReportTemplateModel.class, "pk_node='"+node.getPrimaryKey()+"'", new String[]{"pk_reporttemplate"});
		if(h==null || h.size()==0){
			 throw new BusinessException("没有报表模板");
		}
		List<ReportItemTemplateModel> querylist = (List<ReportItemTemplateModel>) queryservice.queryByClause(ReportItemTemplateModel.class, "pk_reporttemplate='"+h.get(0).getPrimaryKey()+"'") ;
		List<QueryParamVO> queryparam = ParamUtil.initReportQueryParam(querylist,getParamFromReq(request));
		//获取这个角色的默认查询条件
		String newcondition = ParamUtil.getConditionStr(queryparam);
		if(!(StringUtils.isBlank(newcondition) && StringUtils.isNotBlank(pagevo.getCondition()))){
			pagevo.setCondition(newcondition);
		}
		List<SuperModel> reportdata = contr.getReportData(queryparam,pagevo);
		
		tabletemplatevo = ReportTableUtil.initdata(querylist,reportdata,pagevo);
		
		model.addAttribute("tabletemplatevo", tabletemplatevo);
		model.addAttribute("paramvo", paramvo);
		return "/management/_frag/template/report";
	}
	private String getCondition(TemplateParamVO paramvo,List<QueryParamVO> queryparam, PageVO pageVO) throws BusinessException {
		String condition = null ;
		condition = ParamUtil.getConditionStr(queryparam);
		return condition;
	}
	@RequestMapping("/management/ui/report/query")
	public String query(HttpServletRequest request, TemplateParamVO paramvo ,PageVO pagevo,Model model) throws BusinessException {
		//获取查询模板
		IQueryTemplateService iqueryTemplateService =(IQueryTemplateService)ApplicationServiceLocator.getService(IQueryTemplateService.class);
		String pk_role = getUserinfo(request).getPk_role();
		String pk_node = paramvo.getTemplateid();
		List<QueryConditionTemplateModel> querylist = iqueryTemplateService.getQueryTemplate(pk_node, pk_role);
		QueryTemplateUtil.initQueryTemplate(querylist);
		model.addAttribute("querylist", querylist);
		paramvo.setActiontype("search");
		model.addAttribute("paramvo", paramvo);
		return "management/_frag/search/reportsearch";
	}
}
