package cheng.msdp.access.vo;

import cheng.msdp.access.model.UserModel;
import com.application.common.vo.UserSessionVO;

/**
 * Created by cheng on 2015/10/2.
 */
public class MsdpUserSessionVO extends UserSessionVO {
	private UserModel userModel ;
	public MsdpUserSessionVO() {
	}
	public MsdpUserSessionVO(UserModel userModel) {
		this.userModel=userModel;
	}

	@Override
	public Object getPrimaryKeyValue() {
		return userModel.getPk_user();
	}

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

	@Override
	public String getPhone() {
		return userModel.getUser_phone();
	}

	public String getPk_role() {
		return userModel.getPk_role();
	}
}
