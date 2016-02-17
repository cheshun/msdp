package cheng.lib.lang;

/**
 * Created by cheng on 2015/7/23.
 */
public class DataTypeVO {
	private String key ;
	private String value ;
	private boolean isprimarykey ;
	public DataTypeVO(){

	}
	public DataTypeVO(String key, String value){
		this.key = key ;
		this.value = value ;
	}
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isIsprimarykey() {
		return isprimarykey;
	}

	public void setIsprimarykey(boolean isprimarykey) {
		this.isprimarykey = isprimarykey;
	}
}
