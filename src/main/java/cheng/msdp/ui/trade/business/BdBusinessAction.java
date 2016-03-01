package cheng.msdp.ui.trade.business;

import cheng.lib.lang.AggregatedValueObject;
import cheng.lib.lang.BilltypeVO;

/**
 * 基础数据的业务处理。 创建日期：(2004-1-14 13:46:21)
 *
 * @author：樊冠军1
 */
public class BdBusinessAction extends DefaultBusinessAction {

    /**
     * CommonBusinessAction 构造子注解。
     */
    public BdBusinessAction() {
        super();
    }

    /**
     * approve 方法注解。
     */
    public AggregatedValueObject approve(AggregatedValueObject billVO, String billType,
            String billDate, Object userObj) throws Exception {
        throw new Exception("普通业务处理类不支持审批操作。");

    }

    /**
     * commit 方法注解。
     */
    public java.util.ArrayList commit(AggregatedValueObject billVO,
            String billType, String billDate, Object userObj) throws Exception {

        throw new Exception("普通业务处理类不支持提交操作。");
    }

    /**
     * delete 方法注解。
     */
    public AggregatedValueObject delete(AggregatedValueObject billVO, String billType,
            String billDate, Object userObj) throws Exception {
//        if (userObj instanceof IBDGetCheckClass2) {
//            RunUIBeforeCheck(((IBDGetCheckClass2) userObj).getUICheckClass(),
//                    billType, IPFACTION.DELETE, userObj, billVO);
//        } else {
            //如果数据库注册，按照数据库执行，如果未注册，按照以前机制运行
            //BilltypeVO billVo = PfUIDataCache.getBillTypeInfo(billType);
            //动作执行前的事前处理
           // String strClassName =billVo==null?null:billVo.getDef3();
            //RunUIBeforeCheck(strClassName, billType, IPFACTION.DELETE, userObj,
            //        billVO);
        //}
//        AggregatedValueObject vo = nc.ui.trade.business.HYPubBO_Client
//                .deleteBD(billVO, userObj);
        return null;
    }

    /**
     * edit 方法注解。
     */
    public AggregatedValueObject edit(AggregatedValueObject billVO, String billType,
            String billDate, Object userObj) throws Exception {
        return null;
    }

    /**
     * processAction 方法注解。
     */
    public Object processAction(String actionname,AggregatedValueObject billVO, String billType,
            String billDate, Object userObj) throws Exception {
        throw new Exception("普通业务处理类不支持平台操作。");
    }

    /**
     * save 方法注解。
     */
    public AggregatedValueObject save(AggregatedValueObject billVO,
            String billType, String billDate, Object userObj,
            AggregatedValueObject checkVo) throws Exception {
//        if (userObj instanceof IBDGetCheckClass2) {
//            RunUIBeforeCheck(((IBDGetCheckClass2) userObj).getUICheckClass(),
//                    billType, IPFACTION.SAVE, userObj, checkVo);
//        } else {
//            //如果数据库注册，按照数据库执行，如果未注册，按照以前机制运行
//            BilltypeVO billVo = PfUIDataCache.getBillTypeInfo(billType);
//            //动作执行前的事前处理
//            String strClassName =billVo==null?null:billVo.getDef3();
//            RunUIBeforeCheck(strClassName, billType, IPFACTION.SAVE, userObj,
//                    checkVo);
//
//        }
//        AggregatedValueObject retVo = nc.ui.trade.business.HYPubBO_Client
//                .saveBD(billVO, userObj);
//        if (userObj instanceof nc.vo.trade.pub.IRetCurrentDataAfterSave) {
//            fillUITotalVO(checkVo.getChildrenVO(), retVo.getChildrenVO());
//            checkVo.setParentVO(retVo.getParentVO());
//            retVo = checkVo;
//        }
        return null;
    }

    /*
     * 进行前台的类校验
     */
    private void RunUIBeforeCheck(String checkClsName, String billType,
            String actionName, Object userObj, AggregatedValueObject checkVo)
            throws Exception {
        if (checkClsName == null || checkClsName.length() == 0)
            return;
        Class c = Class.forName(checkClsName);
        Object o = c.newInstance();
//        if (o instanceof IUIBeforeProcAction) {
//            ((IUIBeforeProcAction) o).runClass(getUI(), billType, actionName,
//                    checkVo, userObj);
//        }
    }

    /**
     * saveAndCommit 方法注解。
     */
    public AggregatedValueObject saveAndCommit(AggregatedValueObject billVO, java.lang.String billType,
            java.lang.String billDate, java.lang.Object userObj,AggregatedValueObject checkVo) throws java.lang.Exception {
        return null;
    }

    /**
     * unapprove 方法注解。
     */
    public AggregatedValueObject unapprove(AggregatedValueObject billVO, String billType,
            String billDate, Object userObj) throws Exception {
        return null;
    }
}