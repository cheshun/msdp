package cheng.pipp.ui.vo.uitemplate;

import java.util.ArrayList;
import java.util.List;

public class BillTableTemplateVO {
	private BillTemplateVO head = new BillTemplateVO();
	private List<BillTemplateVO> body =new ArrayList<BillTemplateVO> ();
	public BillTemplateVO getHead() {
		return head;
	}
	public void setHead(BillTemplateVO head) {
		this.head = head;
	}
	public List<BillTemplateVO> getBody() {
		return body;
	}
	public void setBody(List<BillTemplateVO> body) {
		this.body = body;
	}
	public void addBody(BillTemplateVO body) {
		this.body.add(body);
	}
}
