package cheng.pipp.task.vo;


import arch.util.lang.UFBoolean;

import java.util.HashMap;
import java.util.Map;

public class TaskUnitVO {

	private String pk_taskdeploy ;
	
	private String taskname; //任务名称
	private String priority;//#high,normal,low 任务名称优先级 线程相关
	private String period;//2 执行周期
	private String period_unit;//YEAR 执行周期
	private String delay;//执行任务前的延迟时间，单位是毫秒。
	private String pluginclass;// 任务插件
	private String startTime;//#yyyy-MM-dd HH mm ss 开始时间
	private String overTime;//#yyyy-MM-dd HH mm ss 结束时间
	private UFBoolean runnable;// 任务是否可用
	
	private Map<String,Object> data = new HashMap<String, Object>();
	
	public String getPk_taskdeploy() {
		return pk_taskdeploy;
	}
	public void setPk_taskdeploy(String pk_taskdeploy) {
		this.pk_taskdeploy = pk_taskdeploy;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getPeriod_unit() {
		return period_unit;
	}
	public void setPeriod_unit(String period_unit) {
		this.period_unit = period_unit;
	}
	public String getDelay() {
		return delay;
	}
	public void setDelay(String delay) {
		this.delay = delay;
	}
	public String getPluginclass() {
		return pluginclass;
	}
	public void setPluginclass(String pluginclass) {
		this.pluginclass = pluginclass;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public UFBoolean getRunnable() {
		return runnable;
	}
	public void setRunnable(UFBoolean runnable) {
		this.runnable = runnable;
	}
	public String getOverTime() {
		return overTime;
	}
	public void setOverTime(String overTime) {
		this.overTime = overTime;
	}
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}

}
