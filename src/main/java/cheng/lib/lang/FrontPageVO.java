package cheng.lib.lang;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cheng on 2015/7/25.
 */

/**
 * 分页显示类
 */
public class FrontPageVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Map<String, Object>> records = new ArrayList<Map<String, Object>>();                // 分页数据
	private long totalrecord;                // 总记录数
	private long totalpage = 1;                // 总页数,默认1
	private int maxresult = 8;                // 每页显示记录数,默认8
	private int currentpage = 1;            // 当前页,默认1
	private int pagecode = 8;                // 页码数量,如:1,2,3,4,5,6,7,8默认8
	private boolean hasPrevious = false;    // 判断是否有上一页
	private boolean hasNext = false;        // 判断是否有下一页
	private Map<String, String> searchPar = new HashMap<String, String>();//查询参数
	private boolean hasBtn = false;         // 判断是否有上下按钮
	private int times = 1;                  // 上下按钮的次数
	private long alltimes = 1;                  // 上下按钮的总次数
	private long start = 1;                  // 页码开始页
	private long end = 1;                    // 页码结束页
	private boolean hasPrevBtn = false;
	private boolean hasNextBtn = false;

	public Map<String, String> getSearchPar() {
		return searchPar;
	}

	public void setSearchPar(Map<String, String> searchPar) {
		this.searchPar = searchPar;
	}
	/**
	 * @param maxresult   每页显示的记录数
	 * @param currentpage 当前页数
	 */
	public FrontPageVO(int maxresult, int currentpage) {

		if (maxresult != 0)
			this.maxresult = maxresult;
		if (currentpage != 0)
			this.currentpage = currentpage;
	}

	/**
	 * @param maxresult   每页显示的记录数
	 * @param currentpage 当前页数
	 * @param times
	 */
	public FrontPageVO(int maxresult, int currentpage, int times) {

		if (maxresult != 0)
			this.maxresult = maxresult;
		if (currentpage != 0)
			this.currentpage = currentpage;
		if (times != 0)
			this.times = times;
	}

	/**
	 * 要获取记录的开始索引 *
	 */
	public int getFirstResult() {

		return (this.currentpage - 1) * this.maxresult; // 如：第二页开始索引为(当前页-1)*每页显示数，即：(2-1)*12=12，第二页的开始索引为12
	}

	public long getTotalrecord() {

		return totalrecord;
	}

	public long getAlltimes() {

		return alltimes;
	}

	public void setTotalrecord(long totalrecord) {

		this.totalrecord = totalrecord;

		/** 设置总页数 **/
		setTotalpage(this.totalrecord % this.maxresult == 0 ? this.totalrecord / this.maxresult : this.totalrecord / this.maxresult + 1);

		setAlltimes(getTotalpage() % pagecode == 0 ? getTotalpage() / pagecode : getTotalpage() / pagecode + 1);
		/** 设置上一页 下一页 **/
		setSkip();

		//设置是否有上下按钮
		setHasBtn();

		//设置显示页码数字
		setPageBtnCode();
	}

	public List<Map<String, Object>> getRecords() {

		return records;
	}

	public void setRecords(List<Map<String, Object>> records) {

		this.records = records;
	}

	public long getTotalpage() {

		return totalpage;
	}

	/**
	 * 设置总页数 *
	 */
	public void setTotalpage(long totalpage) {

		this.totalpage = totalpage;
	}

	/**
	 * 设置上一页下一页*
	 */
	public void setSkip() {

		if (totalpage <= 1) {                            // 不可以上一页下一页

			hasPrevious = false;
			hasNext = false;

		} else if (currentpage == 1) {                    // 首页,可以下一页

			hasPrevious = false;
			hasNext = true;

		} else if (currentpage == totalpage) {        // 尾页,可以上一页

			hasPrevious = true;
			hasNext = false;

		} else {                                        // 中间也,即可上一页,也可下一页

			hasPrevious = true;
			hasNext = true;
		}
	}

	/**
	 * 设置是否有上下按钮
	 */
	public void setHasBtn() {
		if (totalpage < pagecode) {
			hasBtn = false;
		} else if (totalpage > pagecode) {
			hasBtn = true;
			if (times == 1) {
				hasNextBtn = true;
				hasPrevBtn = false;
			} else if (1 < times && times < Math.ceil((double) totalpage / (8.0))) {
				hasPrevBtn = true;
				hasNextBtn = true;
			} else if (times == Math.ceil((double) totalpage / (8.0))) {
				hasPrevBtn = true;
				hasNextBtn = false;
			}
		}
	}

	/**
	 * 设置显示页码
	 */
	public void setPageBtnCode() {
		if (totalpage < pagecode) {
			start = 1;
			end = totalpage;
		} else {
			end = (times * pagecode) >= totalpage ? totalpage : (times * pagecode);
			start = (times - 1) * pagecode + 1;
		}
	}

	public boolean isHasBtn() {
		return hasBtn;
	}

	public void setHasBtn(boolean hasBtn) {
		this.hasBtn = hasBtn;
	}

	public int getMaxresult() {

		return maxresult;
	}

	public int getCurrentpage() {

		return currentpage;
	}

	public int getPagecode() {

		return pagecode;
	}

	public void setPagecode(int pagecode) {

		this.pagecode = pagecode;
	}

	public boolean getHasPrevious() {

		return hasPrevious;
	}

	public boolean getHasNext() {

		return hasNext;
	}

	public void setMaxresult(int maxresult) {
		this.maxresult = maxresult;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getEnd() {
		return end;
	}

	public void setEnd(long end) {
		this.end = end;
	}

	public boolean isHasPrevBtn() {
		return hasPrevBtn;
	}

	public void setHasPrevBtn(boolean hasPrevBtn) {
		this.hasPrevBtn = hasPrevBtn;
	}

	public boolean isHasNextBtn() {
		return hasNextBtn;
	}

	public void setHasNextBtn(boolean hasNextBtn) {
		this.hasNextBtn = hasNextBtn;
	}

	public void setAlltimes(long alltimes) {
		this.alltimes = alltimes;
	}


	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}

	public void setHasPrevious(boolean hasPrevious) {
		this.hasPrevious = hasPrevious;
	}

	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}


}
