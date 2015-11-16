package cheng.pipp.access.web;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import arch.util.lang.ClassUtil;
import cheng.lib.util.Reflect;
import com.application.common.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.model.NewSuperModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cheng.pipp.access.model.ResourceRoleModel;
import cheng.pipp.access.model.RoleModel;
import cheng.pipp.basic.model.RefModel;
import cheng.pipp.basic.vo.JsonData;
import cheng.pipp.basic.vo.RefDataVO;
import cheng.pipp.framework.context.ApplicationContextHelper;
import cheng.pipp.framework.web.BusinessCommonAction;
import cheng.pipp.ui.util.TreeDataUtil;
import cheng.pipp.ui.util.TreeUtil;
import cheng.pipp.ui.vo.TreeNodeVO;
import cheng.pipp.ui.vo.TreeVO;
import cheng.pipp.ui.vo.param.TemplateParamVO;
@Controller
public class ResourceController extends BusinessCommonAction {

	/**
	 * 查询选中资源的数据，
	 * @author cheng
	 * 2014年6月5日
	 * 下午7:40:49
	 * @param vo
	 * @param request
	 * @param model
	 * @return
	 * @throws BusinessException
	 */
	@RequestMapping(value="/management/access/resource/index")
	public String list(TemplateParamVO vo, HttpServletRequest request,Model model) throws BusinessException {
		//通过pk_data(参照的主键)获取信息
		IDataBaseService queryservice = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
		RefModel ref = (RefModel)queryservice.queryByPK(RefModel.class, vo.getPk_data());
		NewSuperModel refm = (NewSuperModel) ClassUtil.initClass(ref.getModelclass());
		//获取用户的角色id 用户的id
		List<NewSuperModel> refdata = (List<NewSuperModel>) queryservice.queryAll(refm.getClass());
		//根据参照的模型 获取参照的数据
		
		//初始化表头
		List<JsonData> refheadlist  = inithead(ref.getField_codenames());
		//初始化表体数据
		List<RefDataVO> refvaluelist = initdate(refheadlist,refdata,ref);
		model.addAttribute("headlist", refheadlist);
		model.addAttribute("valuelist", refvaluelist);
		model.addAttribute("paramvo", vo);
		return "management/_dev/authenticate/resource/index";
	}
	
	@RequestMapping(value="/management/access/resource/selectrole")
	public String selectrole(TemplateParamVO paramvo, HttpServletRequest request,Model model) throws BusinessException {
		//接收资源主键pk_data，资源类型主键（pk_parent）
		
		//获取所有角色
		IDataBaseService queryservice = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
		
		String filename="/management/_dev/authenticate/accessassignment_"+paramvo.getPk_data() ;
		//获取所有的角色
		List<RoleModel> roleslist = (List<RoleModel>)queryservice.queryByClause(RoleModel.class, " dr=0 ");
		List<ResourceRoleModel> roleresourcelist = (List<ResourceRoleModel>)queryservice.queryByClause(ResourceRoleModel.class, " pk_resource='"+paramvo.getPk_data()+"' and dr=0 ");
		
		//构造树
		List<TreeNodeVO>  nodelist = TreeDataUtil.getIntance().initTreeList(roleslist.toArray(new NewSuperModel[0]), "pk_role", "pk_parent_role", "role_name",null,paramvo);
		TreeVO tree = new TreeVO();
		tree.setNodelist(nodelist);
		tree.setTreetype(TreeVO.Tree_Type_treeCheck);
		initResourceRoleTree(nodelist,roleresourcelist);
		
		TreeUtil.getIntance().createTreeNodeTemplate(getFile(request,filename),"accessassignment",tree,paramvo);
		model.addAttribute("paramvo", paramvo);
		model.addAttribute("actionurl", "/management/access/resource/roleresourcesave");
		return filename;
		
	}
	
	@RequestMapping(value="/management/access/resource/roleresourcesave")
	public ModelAndView saveAssignmentPage(String value,HttpServletRequest request , TemplateParamVO paramvo ,Model model) throws BusinessException {
		//接收  资源主键 数组，角色主键
		//接收资源主键pk_data，资源类型主键（pk_parent）
		System.out.println("pk_resource:"+paramvo.getPk_data());
		System.out.println("pk_resourcetype:"+paramvo.getPk_parent());
		System.out.println("pk_role:"+value);
		IDataBaseService dataBaseService = (IDataBaseService)ApplicationContextHelper.getService(IDataBaseService.class);
		
		List<ResourceRoleModel> list = (List<ResourceRoleModel>)dataBaseService.queryByClause(ResourceRoleModel.class, " pk_role='"+value+"' and pk_resource='"+paramvo.getPk_parent()+"'  and pk_resourcetype='"+paramvo.getPk_data()+"'");
		if(list==null || list.size()==0){
			//添加
			ResourceRoleModel r = new ResourceRoleModel();
			r.setPk_resource(paramvo.getPk_data());
			r.setPk_role(value);
			r.setPk_resourcetype(paramvo.getPk_parent());
			dataBaseService.insertVO(r);
		}
		return ajaxDoneSuccess("分配成功");
	
	}
	
	
	
	
	
	private File getFile(HttpServletRequest request, String treefilename) {
		String treepath=getSysRealPath(request) + "/WEB-INF/jsp"+treefilename+".jsp" ;
		File treepathfile = new File(treepath);
		return treepathfile;
	}
	
	private void initResourceRoleTree(List<TreeNodeVO> nodelist,
			List<ResourceRoleModel> roleresourcelist) {
		
		
	}

	/**
	 * 初始化表格数据
	 * @param refheadlist
	 * @param refdata
	 * @param ref
	 * @return
	 */
	private List<RefDataVO> initdate(List<JsonData> refheadlist, List<NewSuperModel> refdata,RefModel ref) {
		List<RefDataVO> refvaluelist = new ArrayList<RefDataVO>();
		for(int i =0;i<refdata.size();i++){
			NewSuperModel supervo = (NewSuperModel) refdata.get(i);
			RefDataVO refdatavo = initdata(supervo,refheadlist,ref);
			refvaluelist.add(refdatavo);
		}
		return refvaluelist;
	}
	
	/**
	 * 初始化一行数据
	 * @param supervo
	 * @param refheadlist
	 * @param ref
	 * @return
	 */
	private RefDataVO initdata(NewSuperModel supervo, List<JsonData> refheadlist,
			RefModel ref) {
		RefDataVO fefDataVO = new RefDataVO();
		List<JsonData> bringlist = new ArrayList<JsonData>();
		Reflect reflect = new Reflect(supervo);
		Map<String, Object> valuemap = reflect.getFieldNameAndValue();
		List<String> datastr = new ArrayList<String>();
		for(int i=0;i<refheadlist.size();i++){
			JsonData t = refheadlist.get(i);
			Object o = valuemap.get(t.getValue());
			if(o!=null){
				datastr.add(o.toString());
			}else{
				datastr.add("");
			}
			
		}
		initbringback(bringlist,valuemap,ref);
		fefDataVO.setRefdatalist(datastr);
		fefDataVO.setBringlist(bringlist);
		return fefDataVO;
	}

	/**
	 * 初始化返回字段和数据
	 * @param bringlist
	 * @param valuemap
	 * @param ref
	 */
	private void initbringback(List<JsonData> bringlist, Map<String, Object> valuemap,RefModel ref) {
		String idvalue = valuemap.get(ref.getPk_field()).toString();
		JsonData j1 = new JsonData();
		j1.setCode("target");
		j1.setValue("pk");
		JsonData j2 = new JsonData();
//		j2.setCode("rel");
		j2.setValue(idvalue);
//		bringlist.add(j1);
		bringlist.add(j2);
	}

	/**
	 * 初始化表头
	 * @param fieldCodenames
	 * @return
	 */
	private List<JsonData> inithead(String fieldCodenames) {
		List<JsonData> refheadlist = new ArrayList<JsonData>();
		String[] fields = fieldCodenames.split(";");
		for(int i=0;i<fields.length;i++){
			JsonData t = new JsonData();
			String[] field = fields[i].split(":");
			t.setName(field[1]);
			t.setValue(field[0]);
			refheadlist.add(t);
		}
		return refheadlist;
	}
}
