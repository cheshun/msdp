package cheng.msdp.sys.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.application.common.context.ApplicationServiceLocator;
import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import cheng.lib.lang.UFBoolean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cheng.msdp.framework.web.BusinessCommonAction;
import cheng.msdp.sys.itf.ISysTemplateService;
import cheng.msdp.sys.itf.ITableService;
import cheng.msdp.sys.model.CacheTableModel;
import cheng.msdp.sys.model.DataDictItemModel;
import cheng.msdp.sys.model.DataDictModel;
import cheng.msdp.sys.model.ModuleModel;
import cheng.msdp.sys.model.NodeModel;
import cheng.msdp.sys.util.SuperVOUtil;
import cheng.msdp.ui.itf.IRefService;
import cheng.msdp.ui.itf.IButtonService;
import cheng.msdp.ui.vo.param.TemplateParamVO;

@Controller("management.UICreateController")
@RequestMapping("/management/sys/")
public class UICreateAction extends BusinessCommonAction {
	 
	@Resource
	ISysTemplateService SysTemplateService;
	@Resource
	ITableService tableService ;
	@Resource
	IButtonService buttonService;
	/**
	 * 组件选择 按钮 模板 建表 缓存 参照 
	 * @param request
	 * @param paramvo
	 * @param model
	 * @return
	 * @throws BusinessException
	 */
	@RequestMapping(value="ui/compselect")
	public String compselect(HttpServletRequest request, TemplateParamVO paramvo ,Model model) throws BusinessException {
		 IDataBaseService queryservice = ApplicationServiceLocator.getService(IDataBaseService.class);
		//数据表主键
		String pk_datadict = paramvo.getPk_data();
		DataDictModel datadictModel = queryservice.queryByPK(DataDictModel.class, pk_datadict);
		//回写
		String pk_node = datadictModel.getPk_node();
		//加载没有创建的按钮
		
		model.addAttribute("paramvo", paramvo);
		model.addAttribute("pk_node", pk_node);
		return "/management/_dev/sys/ui/compselect";
	}
	/**
	 * 根据选中的组件进行相应的处理 
	 * 完成后还有 回写相关联的节点主键
	 * @param request
	 * @param paramvo
	 * @param model
	 * @return
	 * @throws BusinessException
	 */
	@RequestMapping(value="ui/compsave")
	public ModelAndView CompSave(HttpServletRequest request, TemplateParamVO paramvo ,Model model) throws BusinessException {
		 IDataBaseService queryservice = ApplicationServiceLocator.getService(IDataBaseService.class);
			
		Map<String,Object> obj = getParamFromReq(request);
		//获取选中的表主键 找到 表字段 
		DataDictModel datadict =  queryservice.queryByPK(DataDictModel.class, paramvo.getPk_data());
		List<DataDictItemModel> list =  queryservice.queryByClause(DataDictItemModel.class, "pk_datadict='"+datadict.getPrimaryKey()+"'");
		ModuleModel modules = queryservice.queryByPK(ModuleModel.class, datadict.getPk_module());
		NodeModel node =  queryservice.queryByPK(NodeModel.class, datadict.getPk_node());
		//根据表字段信息生产相应的模板
		if("Y".equals(obj.get("iscreatetable"))){
			//判断数据库表是否存在
			//判断是否存在没有同步数据库的字段
			tableService.synchronousTable(modules,datadict, list);
			//同步完成后，回写字段的 是否同步数据库字段
		}
		if(obj.get("button")!=null){
			Object o = obj.get("button") ;
			String [] btns = null ;
			if(o instanceof String[]){
				btns = (String[])obj.get("button");
			}else if(o instanceof String){
				btns = new String[]{(String)obj.get("button")};
			}
			if(btns !=null ){
				buttonService. addTempletButton(node.getPrimaryKey(), btns);
			}
		}
		if("Y".equals(obj.get("isref"))){
			IRefService ref =  ApplicationServiceLocator.getService(IRefService.class);
			ref.createRef(modules, datadict, list);
		}
		if("Y".equals(obj.get("iscache"))){
			CacheTableModel c = new CacheTableModel();
			c.setPk_module(modules.getPrimaryKey());
			c.setTablename(datadict.getDatatablecode());
			c.setIscache(UFBoolean.TRUE);
			queryservice.insert(c);
		}
		if("Y".equals(obj.get("isbilltemplate"))){
			SysTemplateService.createBillTemplate(datadict.getPk_module(), datadict.getPrimaryKey());
		}
		if("Y".equals(obj.get("isquerytemplate"))){
			SysTemplateService.createQueryTemplate(datadict.getPk_module(), datadict.getPrimaryKey());
		}
		//生成vo类型
		String classmodelname = SuperVOUtil.createVO(modules.getModule_code(),datadict,list);
		if(StringUtils.isNotEmpty(classmodelname)){
			node.setModelclass(classmodelname);
			queryservice.update(node);
		}
		return ajaxDoneSuccess("保存成功");
	}
	
}
