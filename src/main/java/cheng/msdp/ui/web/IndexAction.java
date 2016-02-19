package cheng.msdp.ui.web;


import cheng.msdp.access.model.UserModel;
import com.application.common.context.ApplicationServiceLocator;
import cheng.msdp.framework.web.BusinessCommonAction;
import cheng.msdp.sys.model.NodeModel;
import cheng.msdp.ui.itf.INodeService;
import cheng.msdp.ui.util.TreeDataUtil;
import cheng.msdp.ui.util.TreeUtil;
import cheng.msdp.ui.vo.TreeNodeVO;

import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.List;

/**
 * 这里加载后台首页的信息
 * @author cheng
 *
 */
@Controller("management.indexController")
public class IndexAction extends BusinessCommonAction {

    @Resource
    IDataBaseService queryservice ;
	@RequestMapping("/management")
	public String index(HttpServletRequest request,Model model) throws BusinessException {
//		IDataBaseService queryservice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		//通过用户的id或者用户的角色 得到 用户的所有节点 
		UserModel user= getUserinfo(request);
		String indexpagepath = "/WEB-INF/jsp/management/index_"+user.getPrimaryKey() ;
		//角色为空怎为管理员 得到所有节点
		List<NodeModel> listnode = null ;
		if("00000000000000000000".equals(user.getPk_role())){
			listnode = (List<NodeModel>) queryservice.queryByClause(NodeModel.class, " dr=0 and fun_type!='tab' ");// and fun_type='node'
		}else{
			INodeService inodeservice =(INodeService)ApplicationServiceLocator.getService(INodeService.class);
			listnode = inodeservice.getNodesByRole(user.getPk_role());
		}
		List<TreeNodeVO> node = TreeDataUtil.getIntance().initMenuTree(listnode.toArray(new NodeModel[0]), "pk_node", "pk_parent_node", "fun_name");
		TreeUtil.getIntance().createSysMenuTemplate(getAdminIndexPath(request,indexpagepath),node);
		model.addAttribute("now", new Date());
		model.addAttribute("user", user);
		return "/management/index_"+user.getPrimaryKey();
	}

	private String getAdminIndexPath(HttpServletRequest request,String path) {
		String indexpath=getSysRealPath(request) + path+".jsp" ;
		return indexpath;
	}
}