package cheng.lib.lang;


import cheng.lib.util.BeanHelper;
import cheng.lib.util.ClassUtil;
import cheng.lib.util.TimeToolkit;
import com.application.exception.ValidationException;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by cheng on 2015/7/3.
 */
public abstract class SuperModel extends SuperVO{


    //	public abstract String getTableName() ;
    //
    //	public abstract String getPKFieldName();

    private static final long serialVersionUID = 1386231098909087720L;

    private transient static Map<Class, String[]> map = new HashMap<Class, String[]>();

    private transient static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    /**
     * SuperVO 构造子注解。
     */
    public SuperModel() {
	super();
    }

    /**
     * 根类Object的方法,克隆这个VO对象。 创建日期：(2001-3-14)
     */
    public Object clone() {

	SuperModel vo = null;
	try {
	    vo = (SuperModel) getClass().newInstance();
	} catch (Exception e) {

	}
	String[] fieldNames = getAttributeNames();
	if (fieldNames != null) {
	    for (int i = 0; i < fieldNames.length; i++) {
		try {
		    vo.setAttributeValue(fieldNames[i],
				    getAttributeValue(fieldNames[i]));
		} catch (Exception ex) {
		    continue;
		}
	    }
	}
	//		vo.setDirty(isDirty());
	//		vo.setStatus(getStatus());
	return vo;

    }

    /**
     * 创建日期：(2003-8-1 15:20:29)
     *
     * @param obj
     *            java.lang.Object
     * @return boolean
     */
    public boolean equalsContent(Object obj) {
	if (obj == this)
	    return true;
	if (obj == null)
	    return false;
	if (obj.getClass() != getClass())
	    return false;
	return equalsContent((SuperModel) obj, getAttributeNames());
    }

    /**
     * @return boolean
     */
    public boolean equalsContent(SuperModel vo, String[] fieldnames) {
	if (fieldnames == null || vo == null)
	    return false;

	for (String field : fieldnames) {
	    if (!isAttributeEquals(getAttributeValue(field), vo
			    .getAttributeValue(field)))
		return false;
	}
	return true;
    }

    /**
     * @return java.lang.String[]
     */
    public String[] getAttributeNames() {
	rwl.readLock().lock();
	try {
	    return getAttributeAry();
	} finally {
	    rwl.readLock().unlock();
	}
    }

    private String[] getAttributeAry() {
	String[] arys = map.get(this.getClass());
	if (arys == null) {
	    rwl.readLock().unlock();
	    rwl.writeLock().lock();
	    try {
		arys = map.get(this.getClass());
		if (arys == null) {
		    //					List<String> al = new ArrayList<String>();
		    Set<String> set = new HashSet<String>();
		    String[] strAry = BeanHelper.getInstance()
				    .getPropertiesAry(this);
		    for (String str : strAry) {
			if (getPKFieldName() != null
					&& str.equals("primarykey")) {
			    set.add(getPKFieldName());
			} else if (!(str.equals("status") || str
					.equals("dirty")))
			    set.add(str);
		    }
		    arys = set.toArray(new String[set.size()]);
		    map.put(this.getClass(), arys);
		}
	    } finally {
		rwl.readLock().lock();
		rwl.writeLock().unlock();
	    }
	}
	return arys;
    }

    /**
     * <p>
     * 根据一个属性名称字符串该属性的值。
     * <p>
     * 创建日期：(2002-11-6)
     *
     * @param attributeName
     *            java.lang.String
     */
    public Object getAttributeValue(String attributeName) {
	if (attributeName == null || attributeName.length() == 0)
	    return null;
	if (getPKFieldName() != null && attributeName.equals(getPKFieldName()))
	    attributeName = "primarykey";
	return BeanHelper.getProperty(this, attributeName);
    }

    /**
     * This method used to VO with parent_child structure 创建日期：(2002-8-26
     * 9:52:39)
     *
     * @return primary key of parent
     */
    public abstract String getParentPKFieldName();

    /**
     * 创建日期：(2002-8-26 9:52:39)
     *
     * @return primary key of the database_table
     */
    public abstract String getPKFieldName();

    /**
     * 创建日期：(2002-8-26 9:52:39)
     *
     * @return tablename of the database_table
     */
    public abstract String getTableName();

    /**
     * 判断两个属性是否值相同，支持字符串、UFBoolean、Integer。 创建日期：(2002-11-15 16:27:32)
     *
     * @param attrOld
     *            java.lang.Object
     * @param attrNew
     *            java.lang.Object
     * @return boolean
     */
    private boolean isAttributeEquals(Object attrOld, Object attrNew) {
	if (attrOld == attrNew)
	    return true;
	if (attrOld == null || attrNew == null) {
	    return false;
	}
	return attrOld.equals(attrNew);
    }

    public static void main(String[] s) {
	System.exit(0);
    }

    /**
     * 创建日期：(01-3-20 17:24:29)
     */
    public void setAttributeValue(String attributeName, Object value) {
	if (attributeName == null || attributeName.length() == 0)
	    return;
	if (getPKFieldName() != null && attributeName.equals(getPKFieldName()))
	    attributeName = "primarykey";
	BeanHelper.setProperty(this, attributeName, value);
    }

    public void setPrimaryKey(String key) {
	if (getPKFieldName() == null)
	    return;
	BeanHelper.setProperty(this, getPKFieldName().toLowerCase(), key);
    }

    public String getPrimaryKey() {
	if (getPKFieldName() == null)
	    return null;
	return (String) BeanHelper.getProperty(this, getPKFieldName()
			.toLowerCase());
    }

    /*
 * If child need this method,please override it
 *
 * @see nc.vo.pub.ValueObject#validate()
 */
    public void validate() throws ValidationException {
    }


    /*
 * If child need this method,please override it
 *
 * @see nc.vo.pub.ValueObject#getEntityName()
 */
    public String getEntityName() {
	return null;
    }

    public static String toTableSql(Class<?> modelclass) {
	SuperModel superModel = (SuperModel) ClassUtil.initClass(modelclass);
	StringBuffer stringBuffer = new StringBuffer(" CREATE TABLE `"+superModel.getTableName()+"` ( ");
	stringBuffer.append("\n");
	List<DataTypeVO> list = getModelTypes(modelclass);
	for (DataTypeVO dataTypeVO :list){
	    stringBuffer.append("  ");
	    stringBuffer.append(dataTypeVO.getKey());
	    if("double".equals(dataTypeVO.getValue()) || Double.class.getSimpleName().equals(dataTypeVO.getValue())){
		stringBuffer.append(" decimal(20,2) DEFAULT 0.0 ");
	    }else if ("int".equals(dataTypeVO.getValue()) || Integer.class.getSimpleName().equals(dataTypeVO.getValue())){
		if(dataTypeVO.isIsprimarykey()){
		    stringBuffer.append(" int(11) ");
		}else {
		    stringBuffer.append(" int(11) DEFAULT 0 ");
		}
	    }else {
		stringBuffer.append(" varchar(255) DEFAULT NULL ");
	    }
	    if(dataTypeVO.isIsprimarykey()){
		stringBuffer.append(" NOT NULL AUTO_INCREMENT ");
	    }
	    stringBuffer.append(",").append("\n");
	}
	stringBuffer.append("  PRIMARY KEY (`"+superModel.getPKFieldName() + "`) ").append("\n");;
	stringBuffer.append(" ) ENGINE=InnoDB DEFAULT CHARSET=utf8; ");
	return stringBuffer.toString();
    }


    private static  String getDataBaseType(String modeltype){
	String datatype = "int" ;
	if("int".equals(modeltype) || Integer.class.getSimpleName().equals(modeltype)){
	    datatype = "int" ;
	}else
	if(String.class.getSimpleName().equals(modeltype)){
	    datatype = "varchar" ;
	}else
	if(Double.class.getSimpleName().equals(modeltype) || "double".equals(modeltype)){
	    datatype = "decimal" ;
	}
	return datatype ;
    }
    private static List<DataTypeVO> getModelTypes(Class modelclass) {
	List<DataTypeVO> keyValueVOs = new ArrayList<DataTypeVO>();
	SuperModel superModel = (SuperModel) ClassUtil.initClass(modelclass);
	String pkfiled = superModel.getPKFieldName();
	Field[] fields = superModel.getClass().getDeclaredFields();
	for (int i = 0, len = fields.length; i < len; i++) {
	    if(!Modifier.isPrivate(fields[i].getModifiers()) ){
		continue;
	    }
	    if(Modifier.isStatic(fields[i].getModifiers())){
		continue;
	    }
	    String varName = fields[i].getName();
	    Class<?> type = fields[i].getType();
	    DataTypeVO dataTypeVO = new DataTypeVO(varName,getDataBaseType(type.getSimpleName()));
	    if(pkfiled.equals(varName)){
		dataTypeVO.setIsprimarykey(true);
	    }
	    keyValueVOs.add(dataTypeVO );
	}
	return keyValueVOs ;
    }

    public void setPrimaryKey( int primaryKeyValue){
	String primarykey = getPKFieldName();
	try {
	    BeanInfo beanInfo = Introspector.getBeanInfo(this.getClass());
	    PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
	    for (PropertyDescriptor property : propertyDescriptors) {
		String key = property.getName();
		if (primarykey.equals(key)) {
		    // 得到property对应的setter方法
		    Method setter = property.getWriteMethod();
		    setter.invoke(this, primaryKeyValue);
		    return;
		}
	    }

	} catch (Exception e) {
	    System.out.println("transMap2Bean Error " + e);
	}

    }
    public void setTsDr(){
	try {
	    BeanInfo beanInfo = Introspector.getBeanInfo(this.getClass());
	    PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
	    for (PropertyDescriptor property : propertyDescriptors) {
		String key = property.getName();
		if ("ts".equals(key)) {
		    // 得到property对应的setter方法
		    Method setter = property.getWriteMethod();
		    setter.invoke(this, TimeToolkit.getCurrentTs());
		}
		if ("dr".equals(key)) {
		    // 得到property对应的setter方法
		    Method setter = property.getWriteMethod();
		    setter.invoke(this, 0);
		}
	    }

	} catch (Exception e) {
	    System.out.println("transMap2Bean Error " + e);
	}

    }
    //	public int getPrimaryKey(){
    //		Map<String,Object> data = BeanUtil.getValueMap(this);
    //		Object value = data.get( getPKFieldName());
    //		if(value !=null && StringUtils.isNotBlank(value.toString())){
    //			return Integer.valueOf(value.toString());
    //		}else {
    //			return 0 ;
    //		}
    //	}
}
