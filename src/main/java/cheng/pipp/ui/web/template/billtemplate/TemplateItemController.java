package cheng.pipp.ui.web.template.billtemplate;

import java.util.List;

import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.application.common.context.ApplicationServiceLocator;
import cheng.pipp.framework.web.BusinessCommonAction;
import cheng.pipp.sys.model.NodeModel;
import cheng.pipp.ui.model.UIItemTempletModel;
import cheng.pipp.ui.model.UITempletModel;
import cheng.pipp.ui.vo.param.TemplateParamVO;
import cheng.pipp.ui.vo.uitemplate.BillTableTemplateVO;
import cheng.pipp.ui.vo.uitemplate.BillTemplateVO;
import cheng.pipp.ui.vo.uitemplate.TabVO;
@Controller("management.TemplateItemController")
public class TemplateItemController  extends BusinessCommonAction {
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/management/ui/template/billtemplate/item")
	public String index(TemplateParamVO vo, Model model)
			throws BusinessException {
		IDataBaseService queryservice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		String pk_parent = vo.getPk_data();//模板的主键
		UITempletModel ui = (UITempletModel)queryservice.queryByPK(UITempletModel.class, pk_parent);
		//通过模板的主键得到模板的节点
		//得到所有子节点（页签）
		List<NodeModel> listtab = (List<NodeModel>)queryservice.queryByClause(NodeModel.class, "pk_parent_node='"+ui.getPk_node()+"'");
		//从模板字段中按页签编码 分组
		
		List<UIItemTempletModel> list = (List<UIItemTempletModel>) queryservice
				.queryByClause(UIItemTempletModel.class, " pk_templet='" + pk_parent + "'");
		
		BillTableTemplateVO tabldata = initTableData(listtab,list);
		
		
		model.addAttribute("data", tabldata);
		model.addAttribute("param", vo);
		return "/management/_dev/template/billtemplate/templateitem";
	}
	
	private BillTableTemplateVO initTableData(List<NodeModel> listtab,
			List<UIItemTempletModel> list) {
		BillTableTemplateVO vo = new BillTableTemplateVO();
		if(listtab==null || listtab.size()==0){
			createTabItem(vo,null,list);
			return vo ;
		}
		for(int i=0;i<listtab.size();i++){
			NodeModel tab = listtab.get(i);
			BillTemplateVO tabvo = createTabItem(tab);
			for(int j=0;j<list.size();j++){
				if(tab.getFun_code().equals(list.get(j).getTabcode()) && list.get(j).getItempos()==2){
					tabvo.addItem(list.get(j));
				}else{
					vo.getHead().addItem(list.get(j));
				}
			}
			vo.addBody(tabvo);
		}
		return vo;
	}

	/**
	 * 
	 * @param vo
	 * @param tab2
	 * @param list
	 */
	private void createTabItem(BillTableTemplateVO vo, NodeModel tab2, List<UIItemTempletModel> list) {
		BillTemplateVO head = new BillTemplateVO();
		TabVO tab = new TabVO();
		tab.setTabname("表头");
		tab.setTabcode("head");
		head.setListitem(list);
		vo.setHead(head);
	}

	private BillTemplateVO createTabItem(NodeModel tab2) {
		BillTemplateVO tabvo = new BillTemplateVO();
		TabVO tab = new TabVO();
		tab.setTabname(tab2.getFun_name());
		tab.setTabcode(tab2.getFun_code());
		tabvo.setTabvo(tab);
		return tabvo ;
 	}
	@RequestMapping(value="/management/ui/template/billtemplate/item_add")
	public String add(TemplateParamVO vo, Model model) {
		model.addAttribute("param", vo);
		return "/management/_dev/template/billtemplate/add_templateitem";
	}
	
	@RequestMapping(value="/management/ui/template/billtemplate/item_edit")
	public String edit(TemplateParamVO vo, Model model) throws BusinessException {
		IDataBaseService queryservice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		UIItemTempletModel u = (UIItemTempletModel)queryservice.queryByPK(UIItemTempletModel.class, vo.getPk_data());
		model.addAttribute("item", u);
		model.addAttribute("param", vo);
		return "/management/_dev/template/billtemplate/edit_templateitem";
	}
	@RequestMapping(value="/management/ui/template/billtemplate/item_save")
	public ModelAndView save(UIItemTempletModel item,TemplateParamVO vo, Model model) throws BusinessException {
		IDataBaseService queryservice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		if(StringUtils.isNotEmpty(vo.getPk_parent())){
			item.setPk_templet(vo.getPk_parent());
		}
		if(StringUtils.isNotEmpty(item.getPrimaryKey())){
			queryservice.updateVO(item);
		}else{
			queryservice.insertVO(item);
		}
		return ajaxDoneSuccess("保存成功");
	}
}
