package cheng.msdp.ui.web.widget;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

/**
 * Created by cheng on 16/1/17.
 */
public class getValueByKeyTag extends TagSupport {
    private String fieldName ;
    private String tableName ;
    private String  uniqueKey ;
    private String condition ;
    public int doStartTag() throws JspException {
        String dictionaryName = fieldName+"-"+tableName+"-"+uniqueKey;
        try {
            pageContext.getOut().print(dictionaryName);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getUniqueKey() {
        return uniqueKey;
    }

    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
