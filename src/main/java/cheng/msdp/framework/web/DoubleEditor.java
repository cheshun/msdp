package cheng.msdp.framework.web;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

public class DoubleEditor extends PropertyEditorSupport {
	
	public void setAsText(String text) throws IllegalArgumentException {
		if (text == null || text.equals(""))
			text = "0";
		if (!StringUtils.hasText(text)) {
			setValue(null);
		} else {
			setValue(Double.parseDouble(text));// 这句话是最重要的，他的目的是通过传入参数的类型来匹配相应的databind
		}
	}

	
	public String getAsText() {

		return getValue().toString();
	}
}
