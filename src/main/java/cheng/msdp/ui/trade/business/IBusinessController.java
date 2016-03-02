package cheng.msdp.ui.trade.business;

import cheng.lib.lang.AggregatedValueObject;

/**
 * 进行平台衔接的业务处理控制器类，
 * 该接口主要用于进行后台业务的单元测试和平台的
 * 衔接处理
 * 创建日期：(2004-1-3 10:30:24)
 *
 * @author：樊冠军
 */
public interface IBusinessController {
    //单据ACTION的审批处理
    public AggregatedValueObject approve(AggregatedValueObject billVO, String billType, String billDate, Object userObj) throws Exception;

    //单据动作的提交处理
    public java.util.ArrayList commit(AggregatedValueObject billVO, String billType, String billDate, Object userObj) throws Exception;

    //单据动作的删除处理
    public AggregatedValueObject delete(AggregatedValueObject billVO, String billType, String billDate, Object userObj) throws Exception;

    //单据的保存处理
    public AggregatedValueObject edit(AggregatedValueObject billVO, String billType, String billDate, Object userObj) throws Exception;

    //单据动作的其它平台处理
    public Object processAction(String actionname, AggregatedValueObject billVO, String billType, String billDate, Object userObj) throws Exception;

    //单据的保存处理
    public AggregatedValueObject save(AggregatedValueObject billVO, String billType, String billDate, Object userObj, AggregatedValueObject checkVo) throws Exception;

    //单据的保存处理
    public AggregatedValueObject saveAndCommit(AggregatedValueObject billVO, String billType, String billDate, Object userObj, AggregatedValueObject checkVo) throws Exception;

    //单据的弃审处理
    public AggregatedValueObject unapprove(AggregatedValueObject billVO, String billType, String billDate, Object userObj) throws Exception;
}
