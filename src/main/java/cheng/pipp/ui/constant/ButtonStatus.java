package cheng.pipp.ui.constant;

/**
 * Created by cheng on 2015/5/3.
 */
public enum ButtonStatus {

	禁用("N", "禁用"),
	可用("Y", "可用");

	private final String code;
	private final String msg;

	public String getStatusCode() {
		return this.code;
	}
	public String getStatusLable() {
		return this.msg;
	}
	private ButtonStatus(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

//	public static ButtonStatus valueOf(String code) {
//		ButtonStatus[] arr = values();
//		int len = arr.length;
//
//		for(int i = 0; i < len; ++i) {
//			ButtonStatus item = arr[i];
//			if(item.code.equals(code)) {
//				return item;
//			}
//		}
//
//		return null;
//	}

	public static String getStatusLable(String code) {
		ButtonStatus[] arr$ = values();
		int len$ = arr$.length;

		for(int i$ = 0; i$ < len$; ++i$) {
			ButtonStatus item = arr$[i$];
			if(item.code .equals(code)) {
				return item.msg;
			}
		}
		return "其他";
	}
}
