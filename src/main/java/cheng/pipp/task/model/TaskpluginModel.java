package cheng.pipp.task.model;


import arch.util.lang.SuperModel;

public class TaskpluginModel extends SuperModel {
	private static final long serialVersionUID = 1L;
	private String pk_taskplugin;
	private String pluginname;
	private String pluginclass;
	private String plugindescription;
	private String plugintype;
	private String belong_system;
	private int dr;
	private String ts;

	public String getParentPKFieldName() {
		return null;
	}

	public String getPKFieldName() {
		return "pk_taskplugin";
	}

	public String getTableName() {
		return "task_taskplugin";
	}

	public String getPk_taskplugin() {
		return pk_taskplugin;
	}

	public void setPk_taskplugin(String pk_taskplugin) {
		this.pk_taskplugin = pk_taskplugin;
	}

	public String getPluginname() {
		return pluginname;
	}

	public void setPluginname(String pluginname) {
		this.pluginname = pluginname;
	}

	public String getPluginclass() {
		return pluginclass;
	}

	public void setPluginclass(String pluginclass) {
		this.pluginclass = pluginclass;
	}

	public String getPlugindescription() {
		return plugindescription;
	}

	public void setPlugindescription(String plugindescription) {
		this.plugindescription = plugindescription;
	}

	public String getPlugintype() {
		return plugintype;
	}

	public void setPlugintype(String plugintype) {
		this.plugintype = plugintype;
	}

	public String getBelong_system() {
		return belong_system;
	}

	public void setBelong_system(String belong_system) {
		this.belong_system = belong_system;
	}

	public int getDr() {
		return dr;
	}

	public void setDr(int dr) {
		this.dr = dr;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}
}