package cheng.channel.util;

import cheng.channel.vo.DateTimeUtil;
import cheng.channel.vo.FieldVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
public class DatabaseHelper {
	
	protected Logger logger = LoggerFactory.getLogger(DatabaseHelper.class);
	
	
	public DatabaseHelper() {
		
	}
	 
	/**
	 * 用于手动控制事务，需要主动关闭connection
	 * @param sql
	 * @param conn
	 * @return
	 * @throws java.sql.SQLException
	 */
	public int executeUpdate(String sql,Connection conn) throws SQLException {
		Statement stmt = null;
		try {
			logger.info("-=-=-"+sql);
			stmt = conn.createStatement();
			return stmt.executeUpdate(sql);
		} finally {
			if(isNotEmpty(stmt)){
				stmt.close();
				stmt = null;
			}
		}
	}
	 
	private boolean isNotEmpty(Object stmt) {
		if(stmt==null){
			return false;
		}
		return true;
	}
 
	
	 
	public Map<String, Object> executeQueryOne(String sql,Connection conn) throws SQLException {
		List<Map<String, Object>> rows = executeQuery(sql,conn);
		if(rows.size()==0){
			return new HashMap<String, Object>();
		}else if(rows.size()==1){
			return rows.get(0);	
		}else{
			throw new RuntimeException("the return record is not unique!");
		}
	}
	
	
	public List<Map<String, Object>> executeQuery(String sql ,Connection conn)  {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
		try {
			logger.info("-=-=-"+sql);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			List<FieldVO> fields = new ArrayList<FieldVO>(columnCount);
			FieldVO field = null;
			for (int i = 1; i <= columnCount; i++) {
				field = new FieldVO();
				field.setName(rsmd.getColumnLabel(i));
				field.setInt(rsmd.getColumnTypeName(i).contains("INT"));
				field.setDate(rsmd.getColumnTypeName(i).contains("DATE"));
				field.setDate(rsmd.getColumnTypeName(i).contains("DATETIME"));
				fields.add(field);
			}
			rsmd = null;
			Map<String, Object> row = null;
			while (rs.next()) {
				row = new HashMap<String, Object>(columnCount);
				for (FieldVO obj : fields) {
					if (obj.isInt()) {
						row.put(obj.getName().toLowerCase(), rs.getInt(obj.getName()));
					} else if(obj.isDate()){
						row.put(obj.getName().toLowerCase(), DateTimeUtil.getShortDateTimeString(DateTimeUtil.getShortDateTime(rs.getString(obj.getName()))));
					}else{
						row.put(obj.getName().toLowerCase(), rs.getString(obj.getName()));
					}
				}
				rows.add(row);
			}
		} catch (SQLException e) {
			throw new RuntimeException("SQL Exception",e);
		} finally {
			if(isNotEmpty(rs)){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				rs = null;
			}
			if(isNotEmpty(pstmt)){
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				pstmt = null;
			}
		}
		return rows;
	}
	
	 
}
