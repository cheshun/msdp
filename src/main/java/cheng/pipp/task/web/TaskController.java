package cheng.pipp.task.web;

import arch.util.lang.PageVO;
import arch.util.lang.TimeToolkit;
import com.application.common.context.ApplicationServiceLocator;
import cheng.pipp.framework.web.BusinessCommonAction;
import cheng.pipp.task.model.TaskPluginVO;
import cheng.pipp.task.model.TaskdeployVO;
import cheng.pipp.ui.model.UIItemTempletModel;
import cheng.pipp.ui.service.ITemplateService;
import cheng.pipp.ui.vo.param.TemplateParamVO;
import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
/**
 * 任务中心 处理所以的后台定时任务
 * @author cheng
 *
 */
@Controller("management.taskController")
@RequestMapping("/management/task/")
public class TaskController extends BusinessCommonAction {
	
	@Resource
	ITemplateService itemplateService ;
	/**
	 * 加载所以的注册的任务
	 * @param paramvo
	 * @param model
	 * @return
	 */
	@RequestMapping("list")
	public String list(HttpServletRequest request, TemplateParamVO paramvo ,Model model) throws BusinessException {
		 IDataBaseService queryservice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
			
		//////////////////////////////////////////
		PageVO pagevo = new PageVO();
		if(StringUtils.isEmpty(paramvo.getTemplatetype())){
			pagevo.setCondition(" dr=0 ");
		}else{
			pagevo.setCondition(" dr=0 and pluginname ='"+paramvo.getTemplatetype()+"'");
		}
		pagevo = queryservice.queryByPage(TaskPluginVO.class, pagevo);
		model.addAttribute("pagedata", pagevo.getData());
		model.addAttribute("pagedata", pagevo);
		model.addAttribute("paramvo", paramvo);
		return "/management/task/list";
//		return "/management/_frag/template/singletable";
	}
	private String[] getFiledsCodes(List<UIItemTempletModel> itemlist) {
		List<String> fildslist = new ArrayList<String>();
		for(int i=0;i<itemlist.size();i++){
			fildslist.add(itemlist.get(i).getDefaultshowname()+":"+itemlist.get(i).getItemkey());
		}
		return fildslist.toArray(new String[0]);
	}
	@RequestMapping("search")
	public String search(String navTabId ,Model model){
		
		model.addAttribute("navTabId", navTabId);
		return "management/_frag/search/search_t";
	}
	@RequestMapping("listdetail")
	public String listadd(String action,String pk,Model model) throws BusinessException {
		 IDataBaseService queryservice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
			
		if("add".equals(action)){
			return "/management/task/list_add";
		}else if("update".equals(action)){
			TaskPluginVO vo = (TaskPluginVO) queryservice.queryByPK(TaskPluginVO.class, pk);
			model.addAttribute("item", vo);
			model.addAttribute("action", "update");
			return "/management/task/list_add";
		}else{
			model.addAttribute("action", "viem");
			return "/management/task/deploy_view";
		}
		
	}
	@RequestMapping("list/save")
	public ModelAndView listsave(String action,TaskPluginVO vo,Model model) throws BusinessException {
		IDataBaseService dataBaseService = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		vo.setDr(0);
		vo.setTs(TimeToolkit.getCurrentTs());
		if(StringUtils.isEmpty(vo.getPrimaryKey())){
			dataBaseService.insert(vo);
		}else{
			dataBaseService.update(vo);
		}
		return ajaxDoneSuccess("保存成功");
	}
	
	@RequestMapping("deploy")
	public String deploy(  Model model) throws BusinessException {
		IDataBaseService dataBaseService = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		List<TaskdeployVO> tasklist = (List<TaskdeployVO>) dataBaseService.queryByClause(TaskdeployVO.class, " dr=0 ");
		model.addAttribute("data", tasklist);
		return "/management/task/deploy";
	}
	
	@RequestMapping("deploy/detail")
	public String detail(String action,String pk,Model model) throws BusinessException {
		 IDataBaseService queryservice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
			
		if("add".equals(action)){
			model.addAttribute("action", "add");
			return "/management/task/deploy_add";
		}else
		if("update".equals(action)){
			TaskdeployVO vo = (TaskdeployVO) queryservice.queryByPK(TaskdeployVO.class, pk);
			model.addAttribute("item", vo);
			model.addAttribute("action", "update");
			return "/management/task/deploy_update";
		}else{
			model.addAttribute("action", "viem");
			return "/management/task/deploy_view";
		}
	}
	
	@RequestMapping("deploy/save")
	public ModelAndView deploysave(String action,String pk_taskplugin,TaskdeployVO vo,Model model) throws BusinessException {
		IDataBaseService dataBaseService = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		vo.setDr(0);
		vo.setTs(TimeToolkit.getCurrentTs());
		if(StringUtils.isEmpty(vo.getPrimaryKey())){
			String pk = dataBaseService.insert(vo);
		}else{
			dataBaseService.update(vo);
//			taskService.refreshTask(vo.getPrimaryKey());
		}
		return ajaxDoneSuccess("保存成功");
	}
	
	@RequestMapping("log")
	public String log( Model model) {
		return "/management/task/log";
	}
	
	@RequestMapping("look")
	public String look( Model model) {
		return "/management/task/look";
	}
	
	@RequestMapping("/delete/{userId}")
	public ModelAndView delete(@PathVariable("userId") int userId) {


		return ajaxDoneSuccess("删除成功");
	}
}
