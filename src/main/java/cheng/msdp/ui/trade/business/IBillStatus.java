package cheng.msdp.ui.trade.business;

/**
 * 行业的单据状态
 * 创建日期：(2003-5-20 17:08:02)
 * @author：樊冠军
 */
public interface IBillStatus {

	//审批未通过
	public static final int NOPASS = 0;
	//审批通过
	public static final int CHECKPASS = 1;
	//审批进行中
	public static final int CHECKGOING = 2;
	//提交状态
	public static final int COMMIT = 3;
	//作废状态
	public static final int DELETE = 4;
	//冲销状态
	public static final int CX = 5;
	//终止(结算）态
	public static final int ENDED = 6;
	//冻结状态
	public static final int FREEZE = 7;
	//自由态
	public static final int FREE = 8;

	public static final int ALL = 30;
	//状态名称
	public static String[] strStateRemark =
		new String[] {"审批不通过","审批通过","审批进行中","提交态","作废态","冲销态","终止(结算)态","冻结态","自由态" };

}