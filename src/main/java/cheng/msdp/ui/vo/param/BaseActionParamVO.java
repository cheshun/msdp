package cheng.msdp.ui.vo.param;

public class BaseActionParamVO {

	private String templateid ;
	private String pk_data ;
	private String pk_parent ;
	private String pk_button ;
	private String templatetype;
	private String actiontype ;
	public String getTemplateid() {
		return templateid;
	}
	public void setTemplateid(String templateid) {
		this.templateid = templateid;
	}
	public String getPk_data() {
		return pk_data;
	}
	public void setPk_data(String pk_data) {
		this.pk_data = pk_data;
	}
	public String getPk_button() {
		return pk_button;
	}
	public void setPk_button(String pk_button) {
		this.pk_button = pk_button;
	}
	public String getActiontype() {
		return actiontype;
	}

	public void setActiontype(String actiontype) {
		this.actiontype = actiontype;
	}
	public String getPk_parent() {
		return pk_parent;
	}
	public void setPk_parent(String pk_parent) {
		this.pk_parent = pk_parent;
	}
	public String getTemplatetype() {
		return templatetype;
	}
	public void setTemplatetype(String templatetype) {
		this.templatetype = templatetype;
	}
}
