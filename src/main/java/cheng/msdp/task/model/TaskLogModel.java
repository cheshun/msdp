package cheng.msdp.task.model;


import cheng.lib.lang.UFBoolean;
import cheng.lib.lang.UFDateTime;
import cheng.lib.lang.SuperModel;

public class TaskLogModel extends SuperModel {

	private static final long serialVersionUID = 1L;
	private String pk_task_tasklog ;
	private String pk_taskdeploy ;
	private String returnstr ;
	private UFBoolean issuccess ;
	private UFDateTime runtime ;
	private String runserver ;
	private String vdef1;
	private String vdef2;
	private String vdef3;
	private String vdef4;
	private String vdef5;
	private String ts;
	private int dr;
	@Override
	public String getParentPKFieldName() {
		return "pk_taskdeploy";
	}

	@Override
	public String getPKFieldName() {
		return "pk_task_tasklog";
	}

	@Override
	public String getTableName() {
		return "task_tasklog";
	}
 

	public String getPk_taskdeploy() {
		return pk_taskdeploy;
	}

	public void setPk_taskdeploy(String pk_taskdeploy) {
		this.pk_taskdeploy = pk_taskdeploy;
	}

	public String getReturnstr() {
		return returnstr;
	}

	public void setReturnstr(String returnstr) {
		this.returnstr = returnstr;
	}

	public UFBoolean getIssuccess() {
		return issuccess;
	}

	public void setIssuccess(UFBoolean issuccess) {
		this.issuccess = issuccess;
	}

	public UFDateTime getRuntime() {
		return runtime;
	}

	public void setRuntime(UFDateTime runtime) {
		this.runtime = runtime;
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

	@Override
	public String toString() {
		return "TaskLogModel [pk_tasklog= , pk_taskdeploy="
				+ pk_taskdeploy + ", returnstr=" + returnstr + ", issuccess="
				+ issuccess + ", runtime=" + runtime + ", vdef1=" + vdef1
				+ ", vdef2=" + vdef2 + ", vdef3=" + vdef3 + ", vdef4=" + vdef4
				+ ", vdef5=" + vdef5 + ", ts=" + ts + ", dr=" + dr + "]";
	}

	public String getPk_task_tasklog() {
		return pk_task_tasklog;
	}

	public void setPk_task_tasklog(String pk_task_tasklog) {
		this.pk_task_tasklog = pk_task_tasklog;
	}

	public String getRunserver() {
		return runserver;
	}

	public void setRunserver(String runserver) {
		this.runserver = runserver;
	}

}
