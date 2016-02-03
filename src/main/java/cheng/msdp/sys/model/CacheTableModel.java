package cheng.msdp.sys.model;


import arch.util.lang.UFBoolean;
import arch.util.lang.SuperModel;

public class CacheTableModel extends SuperModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String IsCache ="iscache";
	/**
	 *自定义项1
	 */
		public static final String VDEF1="vdef1" ;
	/**
	 *自定义项2
	 */
		public static final String VDEF2="vdef2" ;
	/**
	 *自定义项3
	 */
		public static final String VDEF3="vdef3" ;
	/**
	 *自定义项4
	 */
		public static final String VDEF4="vdef4" ;
	/**
	 *自定义项5
	 */
		public static final String VDEF5="vdef5" ;
	/**
	 *ts
	 */
		public static final String TS="ts" ;
	/**
	 *dr
	 */
		public static final String DR="dr" ;
	/**
	 *缓存数据表主键
	 */
		public static final String PK_CACHETABLE="pk_cachetable" ;
	/**
	 *所属模块
	 */
		public static final String PK_MODULE="pk_module" ;
	/**
	 *数据表名
	 */
		public static final String TABLENAME="tablename" ;
	/**
	 *是否缓存
	 */
		public static final String ISCACHE="iscache" ;
	/**
	 *自定义项1
	 */
		private String vdef1 ;
	/**
	 *自定义项2
	 */
		private String vdef2 ;
	/**
	 *自定义项3
	 */
		private String vdef3 ;
	/**
	 *自定义项4
	 */
		private String vdef4 ;
	/**
	 *自定义项5
	 */
		private String vdef5 ;
	/**
	 *ts
	 */
		private String ts ;
	/**
	 *dr
	 */
		private int dr ;
	/**
	 *缓存数据表主键
	 */
		private String pk_cachetable ;
	/**
	 *所属模块
	 */
		private String pk_module ;
	/**
	 *数据表名
	 */
		private String tablename ;
	/**
	 *是否缓存
	 */
		private UFBoolean iscache ;
	
	@Override
	public String getParentPKFieldName() {
		return "pk_module";
	}

	@Override
	public String getPKFieldName() {
		return "pk_cachetable";
	}

	@Override
	public String getTableName() {
		return "sys_cachetable";
	}

	public String getPk_cachetable() {
		return pk_cachetable;
	}

	public void setPk_cachetable(String pk_cachetable) {
		this.pk_cachetable = pk_cachetable;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public String getPk_module() {
		return pk_module;
	}

	public void setPk_module(String pk_module) {
		this.pk_module = pk_module;
	}

	public UFBoolean getIscache() {
		return iscache;
	}

	public void setIscache(UFBoolean iscache) {
		this.iscache = iscache;
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

}
