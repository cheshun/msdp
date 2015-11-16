package cheng.channel.conf;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import arch.util.lang.BeanUtil;
import arch.util.lang.PageVO;
import com.application.common.context.ApplicationServiceLocator;
import com.application.module.jdbc.model.NewSuperModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cheng.lib.util.DataTypeUtil;
import cheng.channel.util.DatabaseHelper;
import cheng.channel.vo.UserInfoVO;
import cheng.pipp.framework.context.ApplicationContextHelper;

public class UserReportConf extends AbstractReportConf  {
	protected Logger logger = LoggerFactory.getLogger(UserReportConf.class);



	public List<NewSuperModel> getData(String[] sql, PageVO pagevo,
			List<NewSuperModel> userlist) {
		DataSource querydataSource =  ApplicationContextHelper.getDataSource("querydataSource");
		Connection conn =null;
		try {
			conn = querydataSource.getConnection();
			DatabaseHelper databaseHelper =    ApplicationServiceLocator.getBean("databaseHelper");
			List<Map<String, Object>>  list = databaseHelper.executeQuery(sql[0], conn);
			List<Map<String, Object>>  listtotal = databaseHelper.executeQuery(sql[1], conn);
			Map<String, Object> totaldata = listtotal.get(0);
			int totale = DataTypeUtil.getInteger(totaldata.get("total"));
			totaldata.remove("total");
			pagevo.setTotal(totaldata);
			pagevo.setTotalCount(totale);
			//转成vo
			for(int i=0;i<list.size();i++){
				UserInfoVO uservo  = (UserInfoVO) BeanUtil.objMapToBean(list.get(i), UserInfoVO.class);
				uservo.setIndex((pagevo.getPageNum()-1)*pagevo.getPageSize()+i+1);
//				uservo.setPhone(StringUtil111.replaceStr(uservo.getPhone(), 3, 4, "*", true));
				userlist.add(uservo);
			}
			pagevo.setData(userlist);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
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
		sb.append("SELECT username,phone,recharge_money recharemoney ,recharge_money-available_money investmoney ,register_datetime registertime ");
		sb.append("FROM htz_user WHERE source in("+source+") AND register_status=2 AND `status`=1 order by register_datetime desc LIMIT  "+pagevo.getStartIndex()+","+pagevo.getPageSize());


		StringBuffer sb3 = new StringBuffer();
		sb3.append("SELECT count(id) total,sum(recharge_money)-SUM(available_money) as '投资总额' ,sum(recharge_money) as '充值总额'  , COUNT(id) as '注册总数'  ");
		sb3.append("FROM htz_user WHERE source in ("+source+") AND register_status=2 AND `status`=1 ");
		return new String[]{sb.toString(),sb3.toString()};
	}

}
