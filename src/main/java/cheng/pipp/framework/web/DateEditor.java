package cheng.pipp.framework.web;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

//import cheng.pipp.common.util.DateUtil;

public class DateEditor extends PropertyEditorSupport {
	
	public void setAsText(String text) throws IllegalArgumentException {

		if (!StringUtils.hasText(text)) {
			setValue(null);
		} else {
//			setValue(DateUtil.string2Date(text, "yyyy-MM-dd"));
		}
	}

	
	public String getAsText() {

		return getValue().toString();
	}
}
