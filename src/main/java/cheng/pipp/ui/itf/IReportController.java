package cheng.pipp.ui.itf;

import arch.util.lang.PageVO;
import arch.util.lang.SuperModel;
import cheng.pipp.ui.vo.querytemplate.QueryParamVO;

import java.util.List;

public interface IReportController {
	
	public List<SuperModel> getReportData(List<QueryParamVO> queryparam,PageVO pagevo);
}
