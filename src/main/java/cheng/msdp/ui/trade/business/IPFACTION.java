package cheng.msdp.ui.trade.business;

/**
 * 平台的动作类型。
 * 创建日期：(2004-2-14 14:53:29)
 * @author：樊冠军1
 */
public interface IPFACTION {
	public final static String SAVE="WRITE";
	public final static String APPROVE="APPROVE";
	public final static String COMMIT="SAVE";
	public final static String DELETE="DELETE";
	public final static String EDIT="EDIT";
	public final static String UNAPPROVE="UNAPPROVE";
	public final static String FREEZE="FREEZE";
	public final static String UNFREEZE="UNFREEZE";
	public final static String END="END";
	public final static String UNEND="UNEND";
	public final static String CX="CX";
	public final static String UNCX="UNCX";
}
