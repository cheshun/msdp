package cheng.lib.util;

import javax.servlet.http.HttpServletRequest;

public class RequestUtil {
	public static boolean isAjax(HttpServletRequest request) {
		if (request != null  ){
			String temp = request.getHeader("X-Requested-With");
			if("XMLHttpRequest".equalsIgnoreCase(temp)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
}
