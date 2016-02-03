package cheng.msdp.ui.vo;

public class ComboxData {

	/**
	 * 返回索引 显示名称
	 */
	public static String TYPE_IV="IV" ;
	/**
	 * 返回编码 显示名称
	 */
	public static String TYPE_CV="CV" ;
	/**
	 * 返回名称 显示名称
	 */
	public static String TYPE_VV="VV" ;
	private String name ;
	private String value ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
