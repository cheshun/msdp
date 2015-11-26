package cheng.channel.conf;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import arch.util.lang.BeanUtil;
import arch.util.lang.PageVO;
import com.application.common.context.ApplicationServiceLocator;
import arch.util.lang.SuperModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cheng.lib.util.DataTypeUtil;
import cheng.channel.util.DatabaseHelper;
import cheng.channel.vo.RechareInfoVO;
import cheng.pipp.framework.context.ApplicationContextHelper;

public class RechareLogConf extends AbstractReportConf   {
	protected Logger logger = LoggerFactory.getLogger(RechareLogConf.class);


	public List<SuperModel> getData(String[] sql, PageVO pagevo,
			List<SuperModel> userlist) {
		DataSource querydataSource =  ApplicationContextHelper.getDataSource("querydataSource");
		Connection conn =null;
		try {
			conn = querydataSource.getConnection();
			DatabaseHelper databaseHelper =  (DatabaseHelper) ApplicationServiceLocator.getBean("databaseHelper");
			List<Map<String, Object>>  list = databaseHelper.executeQuery(sql[0], conn);
			List<Map<String, Object>>  listtotal = databaseHelper.executeQuery(sql[1], conn);
			Map<String, Object> totaldata = listtotal.get(0);
			int totale = DataTypeUtil.getInteger(totaldata.get("total"));
			pagevo.setTotalCount(totale);
			totaldata.remove("total");
			pagevo.setTotal(totaldata);
			//转成vo
			for(int i=0;i<list.size();i++){
				RechareInfoVO b = new RechareInfoVO();
				b = (RechareInfoVO) BeanUtil.objMapToBean(list.get(i), RechareInfoVO.class);
				b.setIndex((pagevo.getPageNum()-1)*pagevo.getPageSize()+i+1);
				userlist.add(b);
			}
			pagevo.setData(userlist);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				 
				e.printStackTrace();
			}
		}
		return userlist;
	}


	public String[] createSQL(String source,PageVO pagevo) {
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT u.username,r.money recharemoney ,r.`status`,r.createtime recharetime ");
		sb.append(" FROM htz_rechargelog r INNER JOIN htz_user u ON u.id= r.uid ");
		sb.append(" WHERE u.register_status = 2 AND u.`status`=1 AND r.`status`=1 AND u.source in ("+source);
		sb.append(" ) order by createtime desc LIMIT  "+pagevo.getStartIndex()+","+pagevo.getPageSize());
//
		StringBuffer sb3 = new StringBuffer();
		sb3.append("SELECT count(rid) total , sum(r.money) as '充值总额' , COUNT(uid) as '充值总人数' ");
		sb3.append(" FROM htz_rechargelog r INNER JOIN htz_user u ON u.id= r.uid ");
		sb3.append(" WHERE u.register_status = 2 AND u.`status`=1 AND r.`status`=1 AND u.source in ( "+source+" )");
		return new String[]{sb.toString(),sb3.toString()};
	}


}
