package cheng.msdp.ui.itf;

import cheng.lib.lang.PageVO;
import cheng.lib.lang.SuperModel;
import cheng.msdp.ui.vo.querytemplate.QueryParamVO;

import java.util.List;

public interface IReportController {
	
	public List<SuperModel> getReportData(List<QueryParamVO> queryparam,PageVO pagevo);
}
