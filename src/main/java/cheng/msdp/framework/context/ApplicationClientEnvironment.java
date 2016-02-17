package cheng.msdp.framework.context;

public class ApplicationClientEnvironment {
	public static String getPk_role(){
		return ClientThreadData.getClientUser().getPk_role();
	}
	public static String getPk_user(){
		return ClientThreadData.getClientUser().getPrimaryKey();
	}
}
