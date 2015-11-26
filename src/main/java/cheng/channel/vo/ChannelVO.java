package cheng.channel.vo;


import arch.util.lang.SuperModel;

/**
 * Created by cheng on 2015/3/16.
 */
public class ChannelVO extends SuperModel {
	private int index ;
	private int channel ;
    private int totaluser ;
    private double totalrecharge ;
    private double totalinvest ;
    private String vdef1 ;
    private String vdef2 ;
    private String vdef3 ;
     
    @Override
    public String getParentPKFieldName() {
        return null;
    }

    @Override
    public String getPKFieldName() {
        return null;
    }

    @Override
    public String getTableName() {
        return null;
    }

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getTotaluser() {
		return totaluser;
	}

	public void setTotaluser(int totaluser) {
		this.totaluser = totaluser;
	}

	public double getTotalrecharge() {
		return totalrecharge;
	}

	public void setTotalrecharge(double totalrecharge) {
		this.totalrecharge = totalrecharge;
	}

	public double getTotalinvest() {
		return totalinvest;
	}

	public void setTotalinvest(double totalinvest) {
		this.totalinvest = totalinvest;
	}

	public String getVdef1() {
		return vdef1;
	}

	public void setVdef1(String vdef1) {
		this.vdef1 = vdef1;
	}

	public String getVdef2() {
		return vdef2;
	}

	public void setVdef2(String vdef2) {
		this.vdef2 = vdef2;
	}

	public String getVdef3() {
		return vdef3;
	}

	public void setVdef3(String vdef3) {
		this.vdef3 = vdef3;
	}
}
