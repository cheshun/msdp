package cheng.channel.vo;


import com.application.module.jdbc.model.NewSuperModel;

public class UserInfoVO extends NewSuperModel {

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRecharemoney() {
		return recharemoney;
	}

	public void setRecharemoney(String recharemoney) {
		this.recharemoney = recharemoney;
	}

	public String getInvestmoney() {
		return investmoney;
	}

	public void setInvestmoney(String investmoney) {
		this.investmoney = investmoney;
	}

	public String getWithdrawmoney() {
		return withdrawmoney;
	}

	public void setWithdrawmoney(String withdrawmoney) {
		this.withdrawmoney = withdrawmoney;
	}

	public String getRegistertime() {
		return registertime;
	}

	public void setRegistertime(String registertime) {
		this.registertime = registertime;
	}

	private int index ;
	private String username ;
	private String phone ;
	private String recharemoney ;
	private String investmoney ;
	private String withdrawmoney ;

	public String getPk_registersource() {
		return pk_registersource;
	}

	public void setPk_registersource(String pk_registersource) {
		this.pk_registersource = pk_registersource;
	}

	private String registertime ;
	private String pk_registersource ;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getParentPKFieldName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPKFieldName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return null;
	}

}
