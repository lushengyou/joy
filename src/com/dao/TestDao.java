package com.dao;

import java.util.List;
import java.util.Map;

import com.util.DBAccess;

public class TestDao {
	 
	public static void main(String[] args){
		
		DBAccess db = new DBAccess();
		
		String sql = "select * from registered_info";
		try {
			List<Map<String, String>> list = db.doQuery(sql);
			for( int i=0;i<list.size();i++ ){
				System.out.println(i+":"+list.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
//		try {
//			int list = db.doUpdate(sql, new String[]{});
//			System.out.println(list);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}
}
