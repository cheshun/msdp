package cheng.channel.conf;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import arch.util.lang.BeanUtil;
import arch.util.lang.PageVO;
import cheng.lib.util.DataTypeUtil;
import cheng.channel.util.ChannelSourceUtil;
import cheng.channel.util.DatabaseHelper;
import cheng.channel.vo.ChannelVO;
import cheng.channel.vo.RegisterSourceVO;
import cheng.pipp.framework.context.ApplicationContextHelper;
import com.application.common.context.ApplicationServiceLocator;
import com.application.module.jdbc.itf.IDataBaseService;
import com.application.module.jdbc.model.NewSuperModel;

/**
 * Created by cheng on 2015/3/16.
 */
public class ChannelReportConf extends AbstractReportConf {
    @Override
    public String[] createSQL(String channel, PageVO pagevo) {
    	int total = channel.split(",").length;
    	//查询所有渠道的数据
    	StringBuffer sb = new StringBuffer();
    	sb.append("SELECT source channel ,COUNT(id) totaluser,SUM(recharge_money) totalrecharge,SUM(recharge_money-available_money) totalinvest ");
		sb.append("FROM htz_user WHERE source in("+channel+") AND register_status=2 AND `status`=1 GROUP BY source order by  totalrecharge DESC,totaluser desc LIMIT  "+pagevo.getStartIndex()+","+pagevo.getPageSize());
		StringBuffer sb1 = new StringBuffer();
    	sb1.append("SELECT "+total+" total, COUNT(id) as '注册总数',SUM(recharge_money) as '充值总额',SUM(recharge_money-available_money) as '投资总额' ");
		sb1.append("FROM htz_user WHERE source in("+channel+") AND register_status=2 AND `status`=1   LIMIT  "+pagevo.getStartIndex()+","+pagevo.getPageSize());
        return new String[]{sb.toString(),sb1.toString()};
    }

    @Override
    public List<NewSuperModel> getData(String[] sql, PageVO pagevo, List<NewSuperModel> channelvolist) {
    	DataSource querydataSource =  ApplicationContextHelper.getDataSource("querydataSource");
		Connection conn =null;
		try {
			 
			if(!ChannelSourceUtil.isinit()){
				IDataBaseService service = (IDataBaseService) ApplicationServiceLocator.getBean(IDataBaseService.class);
				ChannelSourceUtil.init((List<RegisterSourceVO> )service.queryAll(RegisterSourceVO.class));
			}
			conn = querydataSource.getConnection();
			DatabaseHelper databaseHelper =  (DatabaseHelper) ApplicationServiceLocator.getBean("databaseHelper");
			List<Map<String, Object>>  list = databaseHelper.executeQuery(sql[0], conn);
			List<Map<String, Object>>  listtotal = databaseHelper.executeQuery(sql[1], conn);
			Map<String, Object> totaldata = listtotal.get(0);
			int totale =Integer.valueOf(totaldata.get("total").toString());
			totaldata.remove("total");
			pagevo.setTotal(totaldata);
			pagevo.setTotalCount(totale);
			//转成vo
			for(int i=0;i<list.size();i++){
				ChannelVO channelvo  = (ChannelVO) BeanUtil.objMapToBean(list.get(i), ChannelVO.class);
				channelvo.setVdef1(DataTypeUtil.formatDoubleNumber(channelvo.getTotalrecharge()));
				channelvo.setVdef2(DataTypeUtil.formatDoubleNumber(channelvo.getTotalinvest()));
				channelvo.setVdef3(ChannelSourceUtil.getSource(channelvo.getChannel()).getSourcename());
				channelvo.setIndex((pagevo.getPageNum()-1)*pagevo.getPageSize()+i+1);
				channelvolist.add(channelvo);
			}
			pagevo.setData(channelvolist);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException("报表查询错误");
			}
		}
		return channelvolist;
	}
}
