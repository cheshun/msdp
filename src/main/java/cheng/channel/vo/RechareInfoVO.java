package cheng.channel.vo;

import cheng.lib.lang.SuperModel;

public class RechareInfoVO extends SuperModel {
	private int index ;
	private String username ;
	private String recharemoney ;
	private String recharetime ;
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

	public String getRecharemoney() {
		return recharemoney;
	}

	public void setRecharemoney(String recharemoney) {
		this.recharemoney = recharemoney;
	}

	public String getRecharetime() {
		return recharetime;
	}

	public void setRecharetime(String recharetime) {
		this.recharetime = recharetime;
	}

}
