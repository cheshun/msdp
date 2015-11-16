package cheng.pipp.framework.web;

import com.application.module.jdbc.lang.UFDateTime;
import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

public class UFDateTimeEditor extends PropertyEditorSupport{
	
	public void setAsText(String text) throws IllegalArgumentException {

		if (!StringUtils.hasText(text)) {
			setValue(null);
		} else {
			setValue(new UFDateTime(text));
		}
	}

	
	public String getAsText() {

		return getValue().toString();
	}
}
