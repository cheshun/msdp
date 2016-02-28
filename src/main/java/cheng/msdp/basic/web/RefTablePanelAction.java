
package cheng.msdp.basic.web;

import cheng.lib.util.ClassUtil;
import cheng.lib.util.Reflect;
import cheng.msdp.access.model.UserModel;
import cheng.msdp.basic.model.RefModel;
import cheng.msdp.basic.vo.JsonData;
import cheng.msdp.basic.vo.RefDataVO;
import cheng.msdp.basic.vo.RefVO;
import cheng.msdp.access.vo.MsdpUserSessionVO;
import com.application.common.context.ApplicationServiceLocator;
import cheng.msdp.framework.web.BusinessCommonAction;
import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import cheng.lib.lang.SuperModel;
import com.application.module.jdbc.processor.BeanListProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller("RefTablePanelAction.taskController")
@RequestMapping("/management/uicomponent/ref/")
public class RefTablePanelAction  extends BusinessCommonAction {
	
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private RefVO refmodel ;
	 
	@RequestMapping("index")
	public String index(HttpServletRequest request,RefVO refmodel,Model model) throws BusinessException {
		UserModel u = ((MsdpUserSessionVO)getUserFromSession(request)).getUserModel();
		if(u==null){
			
		}
		IDataBaseService queryservice =  ApplicationServiceLocator.getService(IDataBaseService.class);
			
		
		this.refmodel = refmodel ;
		//根据参照类型 获取参照模型
		List<RefModel> list = (List<RefModel>) queryservice.queryByClause(RefModel.class, RefModel.RefType+"='"+refmodel.getReftype()+"'");
		RefModel ref = list.get(0);
		SuperModel refm = (SuperModel) ClassUtil.initClass(ref.getModelclass());
		List<SuperModel> refdata = null ;
		//获取用户的角色id 用户的id
		String pk_user = u.getPk_user() ;
		String pk_role = u.getPk_role() ;
		//判断该参照是否启用数据权限
		if(ref.getIsaccesscontrol().booleanValue()){
			String sql = getSql(refm.getTableName(),refm.getPKFieldName(),ref,pk_role,pk_user);
			refdata = (List<SuperModel>) queryservice.queryBySql(sql, new BeanListProcessor(refm.getClass()));
		}else{
			refdata = (List<SuperModel>) queryservice.queryAll(refm.getClass());
		}
		//根据参照的模型 获取参照的数据
		
		//初始化表头
		List<JsonData> refheadlist  = inithead(ref.getField_codenames());
		//初始化表体数据
		List<RefDataVO> refvaluelist = initdate(refheadlist,refdata,ref);
		model.addAttribute("headlist", refheadlist);
		model.addAttribute("valuelist", refvaluelist);
		return "management/_frag/refer/refTablePanel";
	}
	
	private String getSql(String tablename, String pk_field, RefModel ref, String pk_role, String pk_user) {
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT n.* FROM "+tablename+" n INNER JOIN  sm_resourcerole r ON r.pk_resource=n.").append(pk_field);
		sb.append(" WHERE r.pk_role='"+pk_role+"' and r.dr=0 and n.dr=0; ");
		return sb.toString();
	}

	/**
	 * 初始化表格数据
	 * @param refheadlist
	 * @param refdata
	 * @param ref
	 * @return
	 */
	private List<RefDataVO> initdate(List<JsonData> refheadlist, List<SuperModel> refdata,RefModel ref) {
		List<RefDataVO> refvaluelist = new ArrayList<RefDataVO>();
		for(int i =0;i<refdata.size();i++){
			SuperModel supervo = (SuperModel) refdata.get(i);
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
	private RefDataVO initdata(SuperModel supervo, List<JsonData> refheadlist,
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
		initbringback(bringlist,valuemap,refmodel,ref);
		fefDataVO.setRefdatalist(datastr);
		fefDataVO.setBringlist(bringlist);
		return fefDataVO;
	}

	/**
	 * 初始化返回字段和数据
	 * @param bringlist
	 * @param valuemap
	 * @param refvo
	 * @param ref
	 */
	private void initbringback(List<JsonData> bringlist, Map<String, Object> valuemap, RefVO refvo,
			RefModel ref) {
		JsonData id = new JsonData();
		id.setName(refvo.getItemkey());
		String idvalue = valuemap.get(ref.getPk_field()).toString();
		String namevalue = valuemap.get(ref.getShowfield()).toString();
		id.setValue(idvalue);
		JsonData showname = new JsonData();
		showname.setName("orgName");
		showname.setValue(namevalue);
		bringlist.add(id);
		bringlist.add(showname);
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
