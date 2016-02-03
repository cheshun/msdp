package cheng.pipp.ui.web;

import arch.util.lang.ClassUtil;
import arch.util.lang.PageVO;
import cheng.pipp.framework.web.BusinessCommonAction;
import cheng.pipp.sys.model.NodeModel;
import cheng.pipp.ui.itf.IVOTreeData;
import cheng.pipp.ui.itf.IVOTreeDataByID;
import cheng.pipp.ui.util.TreeDataUtil;
import cheng.pipp.ui.util.TreeUtil;
import cheng.pipp.ui.vo.TreeNodeVO;
import cheng.pipp.ui.vo.TreeVO;
import cheng.pipp.ui.vo.param.TemplateParamVO;

import com.application.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import arch.util.lang.SuperModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.io.File;
import java.util.List;
@Controller
public class TreeAction extends BusinessCommonAction {
	@Resource
	IDataBaseService queryservice ;
	
	@RequestMapping("/management/ui/tree/index")
	public String index(HttpServletRequest request, TemplateParamVO paramvo ,PageVO pagevo,Model model) throws BusinessException {
		
		paramvo.setTemplateid(paramvo.getTemplateid().split(",")[0]);
		NodeModel node = queryservice.queryByPK(NodeModel.class, paramvo.getTemplateid());
		String dataclass = node.getTreedata();
		String treefilename = "/management/_frag/template/tree/"+paramvo.getTemplateid();
		IVOTreeData treedata = (IVOTreeData) ClassUtil.initClass(dataclass);
		boolean isshowadd = false ;
		if (treedata instanceof IVOTreeDataByID) {
			IVOTreeDataByID idtree = (IVOTreeDataByID) treedata;
			if(idtree.getTreeNodeUIType().equals("/management/ui/singletable/index")){
				paramvo.setActiontype("index");
			}else{
				paramvo.setActiontype("view");
			}
			SuperModel[] treenodearray = idtree.getTreeVO();
			if(treenodearray==null || treenodearray.length==0){
				isshowadd = true ;
			}
			List<TreeNodeVO>  nodelist = TreeDataUtil.getIntance().initTreeList(treenodearray, idtree
					.getIDFieldName(), idtree.getParentIDFieldName(), idtree
					.getShowFieldName(),idtree.getTreeNodeUIType(),paramvo);
			TreeVO tree = new TreeVO();
			if(nodelist.size()==0){
				isshowadd = false ;
			}
			tree.setNodelist(nodelist);
			tree.setTreetype(TreeVO.Tree_Type_treeUrl);
			TreeUtil.getIntance().createTreeNodeTemplate(getTreePath(request,treefilename),"tree",tree,paramvo);
		}
		
		model.addAttribute("isshowadd", isshowadd);
		model.addAttribute("paramvo", paramvo);
		return treefilename;
		
	}
	 
	private File getTreePath(HttpServletRequest request,String treefilename) {
		String treepath=getSysRealPath(request) + "/WEB-INF/jsp"+treefilename+".jsp" ;
		File treepathfile = new File(treepath);
		return treepathfile;
	}
}
