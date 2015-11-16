package cheng.pipp.ui.itf;

import arch.util.lang.PageVO;
import cheng.pipp.ui.vo.querytemplate.QueryParamVO;
import com.application.module.jdbc.model.NewSuperModel;

import java.util.List;

public interface IReportController {
	
	public List<NewSuperModel> getReportData(List<QueryParamVO> queryparam,PageVO pagevo);
}
