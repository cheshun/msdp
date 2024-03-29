package cheng.msdp.ui.trade.business;

/**
 * Created by cheng on 16/2/28.
 */

import cheng.lib.lang.AggregatedValueObject;
import cheng.lib.lang.SuperVO;

import java.util.ArrayList;

/**
 * 默认的业务动作实现。 创建日期：(2004-1-3 14:46:52)
 *
 */
public class BusinessAction extends DefaultBusinessAction {

    /**
     * BusinessAction 构造子注解。 该构造进行单元测试的后台调用
     */
    public BusinessAction() {
	super();
    }


    /**
     * approve 方法注解。
     */
    public AggregatedValueObject approve(AggregatedValueObject billVO, String billType, String billDate, Object userObj) throws Exception {
	return (AggregatedValueObject) PfUtilClient.processActionFlow(null, IPFACTION.APPROVE, billType, billDate, billVO, userObj);
    }

    /**
     * approve 方法注解。
     */
    public Object approveBatch(AggregatedValueObject[] billVO, String billType, String billDate, Object[] userObj) throws Exception {
	return PfUtilClient.processBatchFlow(null, IPFACTION.APPROVE, billType, billDate, billVO, userObj);
    }

    /**
     * commit 方法注解。
     */
    public ArrayList commit(AggregatedValueObject billVO, String billType, String billDate, Object userObj) throws Exception {
	java.util.ArrayList al = (java.util.ArrayList) PfUtilClient.processAction(getUI(), IPFACTION.COMMIT, billType, billDate, billVO, userObj);

	return al;
    }

    /**
     * delete 方法注解。
     */
    public AggregatedValueObject delete(AggregatedValueObject billVO, String billType, String billDate, Object userObj) throws Exception {
	return billVO = (AggregatedValueObject) PfUtilClient.processAction(getUI(), IPFACTION.DELETE, billType, billDate, billVO, userObj);
    }

    /**
     * edit 方法注解。
     */
    public AggregatedValueObject edit(AggregatedValueObject billVO, java.lang.String billType, java.lang.String billDate, java.lang.Object userObj) throws java.lang.Exception {
	return billVO = (AggregatedValueObject) PfUtilClient.processActionNoSendMessage(getUI(), IPFACTION.EDIT, billType, billDate, billVO, userObj, null, null);
    }
    /**
     * 获得UI。 创建日期：(2004-1-15 13:55:07)
     */
    protected String getUI() {
	return "";
    }

    /**
     * processAction 方法注解。
     */
    public Object processAction(String actionname, AggregatedValueObject billVO, String billType, String billDate, Object userObj) throws Exception {
	return PfUtilClient.processAction(getUI(), actionname, billType, billDate, billVO, userObj);
    }

    /**
     * processAction 方法注解。
     */
    public Object processActionBatch(String actionname, AggregatedValueObject[] billVO, String billType, String billDate, Object[] userObj) throws Exception {
	return PfUtilClient.processBatch(getUI(), actionname, billType, billDate, billVO, userObj);
    }

    /**
     * 根据条件进行数据查询
     */
    public SuperVO[] queryHeadAllData(Class headVoClass, String strBillType, String strWhere) throws Exception {
//	BilltypeVO billVo = PfUIDataCache.getBillTypeInfo(strBillType);
//	if (billVo.getWherestring() != null && billVo.getWherestring().length() != 0) {
//	    if (strWhere != null)
//		strWhere = strWhere + " and (" + billVo.getWherestring() + ")";
//	    else
//		strWhere = billVo.getWherestring();
//	}
//	return HYPubBO_Client.queryByCondition(headVoClass, strWhere);
	return null ;
    }

    /**
     * save 方法注解。
     */
    public AggregatedValueObject save(AggregatedValueObject billVO, String billType, String billDate, Object userObj, AggregatedValueObject checkVo) throws Exception {

	setBillStatus(billVO);

	String strBeforeUIClass = null;
//	if (userObj != null && userObj instanceof IUIBeforeProcAction)
//	    strBeforeUIClass = userObj.getClass().getName();


	ArrayList retAry = (ArrayList) PfUtilClient.processAction(getUI(), IPFACTION.SAVE, billType, billDate, billVO, userObj);
	AggregatedValueObject retVo = (AggregatedValueObject) retAry.get(1);
	return retVo;
    }

    /**
     * saveAndCommit 方法注解。
     */
    public AggregatedValueObject saveAndCommit(AggregatedValueObject billVO, java.lang.String billType, java.lang.String billDate, java.lang.Object userObj, AggregatedValueObject checkVo) throws java.lang.Exception {
	setBillStatus(billVO);

	String strBeforeUIClass = null;
//	if (userObj != null && userObj instanceof IUIBeforeProcAction)
//	    strBeforeUIClass = userObj.getClass().getName();

	ArrayList retAry = (ArrayList) PfUtilClient.processAction(getUI(), IPFACTION.COMMIT, billType, billDate, billVO, userObj);
	AggregatedValueObject retVo = (AggregatedValueObject) retAry.get(1);
	return retVo;
    }

    /**
     * 设置状态。 创建日期：(2003-9-27 14:14:15)
     *
     * @param billvo
     *            AggregatedValueObject
     */
    protected void setBillStatus(AggregatedValueObject billvo) {
//	Integer billstatus = (Integer) billvo.getParentVO().getAttributeValue(getUI().getBillField().getField_BillStatus());

//	if (billstatus == null || billstatus.intValue() == IBillStatus.NOPASS) {
//	    billvo.getParentVO().setAttributeValue(getUI().getBillField().getField_CheckMan(), null);
//	    billvo.getParentVO().setAttributeValue(getUI().getBillField().getField_CheckDate(), null);
//	    billvo.getParentVO().setAttributeValue(getUI().getBillField().getField_CheckNote(), null);
//	    billvo.getParentVO().setAttributeValue(getUI().getBillField().getField_BillStatus(), new Integer(IBillStatus.FREE));
//	}

    }

    /**
     * unapprove 方法注解。
     */
    public AggregatedValueObject unapprove(AggregatedValueObject billVO, String billType, String billDate, Object userObj) throws Exception {
	return (AggregatedValueObject) PfUtilClient.processActionFlow(getUI(), IPFACTION.UNAPPROVE, billType, billDate, billVO, userObj);
    }
}
