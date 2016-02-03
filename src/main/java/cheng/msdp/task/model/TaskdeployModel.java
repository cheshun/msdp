package cheng.msdp.task.model;


import arch.util.lang.UFBoolean;
import arch.util.lang.UFDateTime;
import arch.util.lang.SuperModel;

public class TaskdeployModel extends SuperModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String vdef1;
	private String vdef2;
	private String vdef3;
	private String vdef4;
	private String vdef5;
	private String ts;
	private int dr;
	private String pk_taskdeploy;
	private String pk_taskplugin;
	private String taskname;
	private String taskdescription;
	private String priority;
	private int period;
	private String period_unit;
	private int delay;
	private UFDateTime startTime;
	private UFDateTime overTime;
	private UFBoolean runnable;// 任务是否可用

	public String getParentPKFieldName() {
		return "pk_taskplugin";
	}

	public String getPKFieldName() {
		return "pk_taskdeploy";
	}

	public String getTableName() {
		return "task_taskdeploy";
	}

	public String getVdef1() {
		return vdef1;
	}

	public void setVdef1(String vdef1) {
		this.vdef1 = vdef1;
	}

	public String getVdef2() {
		return vdef2;
	}

	public void setVdef2(String vdef2) {
		this.vdef2 = vdef2;
	}

	public String getVdef3() {
		return vdef3;
	}

	public void setVdef3(String vdef3) {
		this.vdef3 = vdef3;
	}

	public String getVdef4() {
		return vdef4;
	}

	public void setVdef4(String vdef4) {
		this.vdef4 = vdef4;
	}

	public String getVdef5() {
		return vdef5;
	}

	public void setVdef5(String vdef5) {
		this.vdef5 = vdef5;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public int getDr() {
		return dr;
	}

	public void setDr(int dr) {
		this.dr = dr;
	}

	public String getPk_taskdeploy() {
		return pk_taskdeploy;
	}

	public void setPk_taskdeploy(String pk_taskdeploy) {
		this.pk_taskdeploy = pk_taskdeploy;
	}

	public String getPk_taskplugin() {
		return pk_taskplugin;
	}

	public void setPk_taskplugin(String pk_taskplugin) {
		this.pk_taskplugin = pk_taskplugin;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getTaskdescription() {
		return taskdescription;
	}

	public void setTaskdescription(String taskdescription) {
		this.taskdescription = taskdescription;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public String getPeriod_unit() {
		return period_unit;
	}

	public void setPeriod_unit(String period_unit) {
		this.period_unit = period_unit;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	public UFDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(UFDateTime startTime) {
		this.startTime = startTime;
	}

	public UFDateTime getOverTime() {
		return overTime;
	}

	public void setOverTime(UFDateTime overTime) {
		this.overTime = overTime;
	}

	public UFBoolean getRunnable() {
		return runnable;
	}

	public void setRunnable(UFBoolean runnable) {
		this.runnable = runnable;
	}
}