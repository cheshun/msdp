package cheng.pipp.ui.web.widget;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

/**
 * Created by cheng on 16/1/17.
 */
public class ShowDictNameTag extends TagSupport {

    private String execution_formula ;
    private String  uniquekey ;
    public int doStartTag() throws JspException {
        String dictionaryName = "112112121";
        try {
            pageContext.getOut().print(dictionaryName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }

    public String getExecution_formula() {
        return execution_formula;
    }

    public void setExecution_formula(String execution_formula) {
        this.execution_formula = execution_formula;
    }

    public String getUniquekey() {
        return uniquekey;
    }

    public void setUniquekey(String uniquekey) {
        this.uniquekey = uniquekey;
    }
}
