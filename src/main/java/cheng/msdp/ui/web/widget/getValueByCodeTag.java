package cheng.msdp.ui.web.widget;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

/**
 * Created by homelink on 2016/2/21.
 */
public class getValueByCodeTag extends TagSupport {

    private String codeType ;
    private String codeName ;
    public int doStartTag() throws JspException {
	String dictionaryName = codeType+"-"+codeName;
	try {
	    pageContext.getOut().print(dictionaryName);

	} catch (IOException e) {
	    e.printStackTrace();
	}
	return SKIP_BODY;
    }

    public String getCodeType() {
	return codeType;
    }

    public void setCodeType(String codeType) {
	this.codeType = codeType;
    }

    public String getCodeName() {
	return codeName;
    }

    public void setCodeName(String codeName) {
	this.codeName = codeName;
    }
}
