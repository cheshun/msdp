package cheng.msdp.framework.config;

import cheng.lib.util.RequestUtil;
import com.application.config.exceptionhandle.CustomerHandleResultVO;
import com.application.config.exceptionhandle.ICustomerExceptionHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cheng on 2015/10/2.
 */
@Component
public class CustomerExceptionHandler implements ICustomerExceptionHandler {
	@Override
	public CustomerHandleResultVO resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
		CustomerHandleResultVO customerHandleResultVO = new CustomerHandleResultVO();
		if (RequestUtil.isAjax(httpServletRequest) || httpServletRequest.getParameter("ajax") != null) {
			customerHandleResultVO.setViemname("ajaxDone");
			Map<String,Object> data = new HashMap<>();
			data.put("statusCode",300);
			data.put("message",e.getMessage());
			data.put("forwardUrl","");
			customerHandleResultVO.setData(data);
			return customerHandleResultVO;
		}
		Map<String,Object> map = new HashMap<>();
		StringPrintWriter strintPrintWriter = new StringPrintWriter();
		e.printStackTrace(strintPrintWriter);
		map.put("errorMsg", strintPrintWriter.getString());//将错误信息传递给view
		map.put("statusCode", 300);
		map.put("message", e.getMessage());
		customerHandleResultVO.setData(map);
		return customerHandleResultVO;
	}
	public class StringPrintWriter extends PrintWriter {

		public StringPrintWriter(){
			super(new StringWriter());
		}

		public StringPrintWriter(int initialSize) {
			super(new StringWriter(initialSize));
		}

		public String getString() {
			flush();
			return ((StringWriter) this.out).toString();
		}

		@Override
		public String toString() {
			return getString();
		}
	}
}
