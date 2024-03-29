package cheng.msdp.framework.context;

import cheng.msdp.access.model.UserModel;



public class ClientThreadData {
	private static ThreadLocal<UserModel> clientenvrioment = new ThreadLocal<UserModel>();
	
	public static UserModel getClientUser() {
		if(clientenvrioment.get()==null){
			clientenvrioment.set(new UserModel());
		}
		return clientenvrioment.get();
	}
	public static void setClientUser(UserModel u) {
		clientenvrioment.set(u);
	}
}
