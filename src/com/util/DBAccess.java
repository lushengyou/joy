package com.util;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;

public class DBAccess {
	private static final Logger log = Logger.getLogger(DBAccess.class);
	
	private static Properties config = new Properties();
	
	static{	
		try {
			config.load(DBAccess.class.getClassLoader().getResourceAsStream("database/sqlserver.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 *  
	 * 实现查询分页的功能
	 * 
	 * @param page
	 * @param sql
	 * @param isCount
	 * @param params
	 * @return 结果集
	 */
	public List<Map<String,String>> handlePage(Page page, String sql,boolean isCount, Object ...params){
		List<Map<String,String>> resultList = new ArrayList<Map<String,String>>();
		try {
			if(isCount){
				page.setTotalCount(count(sql, params));
				if(page.getPageNum() > page.getPageCount()){
					page.setPageNum(page.getPageCount());
				}
			}
			String _pageHandle = config.getProperty("PageHandle");
			_pageHandle = _pageHandle.replace("#SQL#", sql);
			_pageHandle = _pageHandle.replace("#BEGININDEX#", "" + page.getBeginIndex());
			_pageHandle = _pageHandle.replace("#ENDINDEX#", "" + page.getEndIndex());
			_pageHandle = _pageHandle.replace("#PAGESIZE#", "" + page.getPageSize());
			//System.out.println("sql for page: " + _pageHandle);
			resultList = (List<Map<String, String>>) this.doQuery(_pageHandle, params);
			page.setData(resultList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultList;
	}
	/**
	 * 结果集合统计数据量
	 * @param sql
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public int count(String sql, Object ...params) throws Exception{
		List<Map<String, String>> countList = doQuery(sql, params);
		if(countList != null && countList.size() > 0){
			return countList.size();
		}
		return 0;
	}

	/**
	 * 公共调用存储过程
	 * @param procName  存储过程名称
	 * @param outParam  输出参数
	 * @param inParams  输入参数列表
	 * @return    ProcReturn 输出参数对象
	 */
	public static ProcReturn  doExecProc(String procName, ProcReturn outParam ,Object ...inParams){
		Connection conn = null;
		CallableStatement proc = null; 
		StringBuffer procSql =  new StringBuffer("{ call "+procName+"(");
		try {
			conn = ConnectionPool.getInstance().getConnection();
			//拼装存储过程调用sql语句
			for (int i = 0 ; i<inParams.length;i++) {
				procSql.append("?,");	
			}
			procSql.append("?,?) }");
			//设置存储过程调用语句
			proc = conn.prepareCall(procSql.toString()); 
			//向存储过程传递设置参数
			int j = 0;
			for (; j<inParams.length;j++) {
				proc.setObject((j+1), inParams[j]);
			}
			proc.registerOutParameter(++j, Types.VARCHAR);
			proc.registerOutParameter(++j, Types.VARCHAR);
			//执行存储过程
			proc.execute();
			//获取存储过程返回数据
			outParam.setResultcode(proc.getString(j-1));
			outParam.setResultmsg(proc.getString(j));
		} catch (SQLException e) {
			log.error("sql:" +  procSql ,e);
			
		}
		try {
			if(proc!=null){
				proc.close();
			}
			ConnectionPool.getInstance().returnConnection(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return outParam;
	}
	
	/**
	 * 根据SQL查询结果集
	 * @param sql
	 * @return
	 * @throws Exception
	 */
	public List<Map<String, String>> doQuery(String sql, Object ... params) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		try {
			// 取出数据库连接
			conn = ConnectionPool.getInstance().getConnection();
			// 取出游标
			pstmt = conn.prepareStatement(sql);
			//设置参数
			for(int i = 0; i < params.length; i++){
				pstmt.setObject(i + 1, params[i]);
			}
			
			// 执行SQL查询语句
			result = pstmt.executeQuery();
			//conn.commit();
			
			// 获得结果集中字段类型属性
			ResultSetMetaData metaData = result.getMetaData();
			String[] names = new String[metaData.getColumnCount()];
			// 循环定位，获得字段名称和类型
			int i = 0;
			for (i = 0; i < metaData.getColumnCount(); i++) {
				names[i] = (metaData.getColumnLabel(i + 1)).toLowerCase();
			}
			String str = "";
			// 取出查询结果
			List<Map<String, String>> lst = new ArrayList<Map<String, String>>();
			HashMap<String, String> tmp = new HashMap<String, String>();
			while (result.next()) {
				// 重构输出结构
				tmp = new HashMap<String, String>();
				// 按字段名循环定制输出结构
				for (i = 0; i < names.length; i++) {
					// 不管数据类型，一律按字符串取值
					str = result.getString(i + 1);
					// 如果取出的字段是null值，将这个字符串置为空字符串
					str = str == null ? "" : str.trim();
					// 定制输出结构
					tmp.put(names[i], str);
				}
				lst.add(tmp);
			}
			return lst;
		} catch (Exception e) {
			log.error("sql:" + sql, e);
			throw e;
		} finally {
			try {
				// 关闭数据库查询结果集
				if (result != null) {
					result.close();
				}
				result = null;
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
			}
			try {
				// 归还数据库连接
				ConnectionPool.getInstance().returnConnection(conn);
			} catch (Exception e) {
			}
		}
	}
	
	
	/**
	 * 执行插入和更新SQL
	 * @param sql
	 * @param objs
	 * @return
	 * @throws Exception
	 */
	public int doUpdate(String sql, Object[] objs) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			// 取出�?��数据库连�?
			conn = ConnectionPool.getInstance().getConnection();
			// 取出游标
			ps = conn.prepareStatement(sql);
			for (int i=0; i<objs.length; i++){
				ps.setObject(i+1, objs[i]);
			}
			int ret = ps.executeUpdate();
			//conn.commit();
			
			return ret;
		} catch (Exception e) {
			log.error("sql:" + sql, e);
			throw e;
		} finally {
			try {
				// 关闭数据库查询结果集
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e) {
			}
			try {
				// 归还数据库连接
				ConnectionPool.getInstance().returnConnection(conn);
			} catch (Exception e) {
			}
		}
	}
}
