package cheng.lib.lang;

/**
 * Created by cheng on 2015/7/23.
 */
public class KeyValueVO {

	public KeyValueVO(){

	}
	public KeyValueVO(String key, String value){
		this.key = key ;
		this.value = value ;
	}
	private String key ;

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

	private String value ;
}
