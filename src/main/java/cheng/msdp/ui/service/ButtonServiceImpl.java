package cheng.msdp.ui.service;

import java.util.ArrayList;
import java.util.List;

import cheng.msdp.ui.constant.ButtonStatus;
import cheng.msdp.ui.itf.IButtonService;
import cheng.lib.exception.BusinessException;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.processor.BeanListProcessor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.application.common.context.ApplicationServiceLocator;
import cheng.msdp.ui.model.ButtonModel;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(propagation= Propagation.REQUIRED, rollbackFor=Exception.class)
public class ButtonServiceImpl implements IButtonService {
	

	
	
	public List<ButtonModel> getTempletButton(String pk_role, String pk_node)
			throws BusinessException {
		String sql = null ;
		sql = createRoleSql(pk_role, pk_node, null);
		List<ButtonModel> data = getData(sql);
		if(data.size()>0){
			return data;
		}
		sql = createDefaultSql(pk_node, null);
		data = getData(sql);
		if(data.size()>0){
			return data;
		}
		return null;
	}
	
	
	private String createRoleSql(String pk_role, String pk_node,String condition) {
		if(StringUtils.isEmpty(pk_role)){
			return createDefaultSql(pk_node, condition);
		}
		StringBuffer sb =new StringBuffer(" SELECT b.* FROM sm_button b  ");
		sb.append(" INNER JOIN sm_buttonnoderole  br ON br.pk_button=b.pk_button  ") ;
		sb.append(" WHERE br.dr=0 and br.pk_node='"+pk_node+"' and br.pk_role='"+pk_role+"' and b.btn_status='"+ ButtonStatus.可用.getStatusCode()+"' order by b.btn_index ") ;
		return sb.toString(); 
	}
	private String createUserSql(String pk_user, String pk_node,String condition) {
		StringBuffer sb =new StringBuffer(" SELECT b.* FROM sm_button b  ");
		sb.append(" INNER JOIN sm_buttonnoderole  br ON br.pk_button=b.pk_button  ") ;
		sb.append(" WHERE br.dr=0 and b.dr=0 and br.pk_node='"+pk_node+"' and br.pk_user='"+pk_user+"' and b.btn_status='"+ ButtonStatus.可用.getStatusCode()+"'  order by b.btn_index  ") ;
		return sb.toString();
	}
	private String createDefaultSql(String pk_node,String condition) {
		StringBuffer sb =new StringBuffer(" SELECT b.* FROM sm_button b  ");
		sb.append(" WHERE  b.pk_node='"+pk_node+"' and b.dr=0 and b.btn_status='"+ ButtonStatus.可用.getStatusCode()+"'  order by b.btn_index  ") ;
		return sb.toString();
	}
	private List<ButtonModel> getData(String sql) throws BusinessException {
		IDataBaseService queryseervice = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		BeanListProcessor itemprocessor = new BeanListProcessor(ButtonModel.class);
		List<ButtonModel> list =(List<ButtonModel>) queryseervice.queryBySql(sql, itemprocessor);
		return list;
	}


	
	public List<ButtonModel> addTempletButton(String pk_node,
			String[] buttoncodes) throws BusinessException {
		IDataBaseService dataBaseService = (IDataBaseService)ApplicationServiceLocator.getService(IDataBaseService.class);
		
		List<ButtonModel> list = new ArrayList<ButtonModel>();
		for(int i=0;i<buttoncodes.length;i++){
			ButtonModel b = createButton(pk_node,i,buttoncodes[i]);
			list.add(b);
		}
		dataBaseService.insert(list);
		return list;
	}


	private ButtonModel createButton(String pk_node,int i,String buttoncode) {
		ButtonModel button = new ButtonModel();
		button.setPk_node(pk_node);
		button.setBtn_class(buttoncode);
		button.setBtn_code(buttoncode);
		button.setDr(0);
		button.setBtn_status(ButtonStatus.可用.getStatusCode());
		button.setBtn_index(i);
		if(buttoncode.equals("add")){
			button.setBtn_href("/management/ui/card/add");
			button.setBtn_target("dialog");
			button.setBtn_title("增加");
			button.setBtn_name("增加");
			button.setBtn_type("N");
		}
		if(buttoncode.equals("edit")){
			button.setBtn_href("/management/ui/card/edit");
			button.setBtn_target("dialog");
			button.setBtn_title("修改");
			button.setBtn_name("修改");
			button.setBtn_type("Y");
		}
		if(buttoncode.equals("delete")){
			button.setBtn_href("/management/ui/singletable/delete");
			button.setBtn_target("ajaxTodo");
			button.setBtn_title("删除");
			button.setBtn_name("删除");
			button.setBtn_type("Y");
		}
		if(buttoncode.equals("query")){
			button.setBtn_href("/management/ui/singletable/search");
			button.setBtn_target("dialog");
			button.setBtn_title("查询");
			button.setBtn_name("查询");
			button.setBtn_type("N");
		}
		return button;
	}
	
}
