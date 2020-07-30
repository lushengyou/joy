package com.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TimerTaskUtil extends TimerTask implements ServletContextListener{
	
	public void run() {
		System.out.println("開始執行定時任務...start...");
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("定時任務計時器關閉了...closing...");
	}

	@SuppressWarnings("deprecation")
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("定時任務開始啟動...loading...");
		Date date = new Date();
		int hour = date.getHours();
		if(hour > 19){
			Calendar calendar=Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.DATE,1);
			date = calendar.getTime();
		}
		date.setHours(19);
		date.setMinutes(0);
		date.setSeconds(0);
		System.out.println("定時任務執行時間初始化完�?.. Time: " + date);
		Timer timer = new Timer();
		timer.schedule(new TimerTaskUtil(), date, 1000*60*60*24);
	}
}
