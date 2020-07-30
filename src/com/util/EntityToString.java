package com.util;

import java.lang.reflect.Field;

public class EntityToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static String getString(Object o,Class<?> c){
		
		
		String result = c.getSimpleName()+":";
		Class s = c.getSuperclass();
		if(s.getName().indexOf("entity")>=0){
			
			result += "n<"+getString(o,c.getSuperclass())+">,\n";
			
		}
		Field[] fields = c.getDeclaredFields();
		for(Field field:fields){
			
			field.setAccessible(true);
			
			try{
				result += field.getName()+"="+field.get(o)+",\n";
				
			}catch(Exception e){
				
				System.out.println(e.getMessage());
			}
			
			if(result.indexOf(",")>=0){
				result = result.substring(0,result.length() - 2);
				
			}
			
		}
		return result;
	}
}
