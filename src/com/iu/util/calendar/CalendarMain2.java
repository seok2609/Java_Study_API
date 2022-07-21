package com.iu.util.calendar;


import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); 
		
		Calendar birth = Calendar.getInstance();
		
//		future.set(Calendar.MINUTE, 15);
//		
//		long n = now.getTimeInMillis();
//		long f = future.getTimeInMillis();
//		
//		long result = f - n;
//		
//		System.out.println(result);
//		System.out.println(result/(1000*60));
		
		birth.set(Calendar.YEAR, 1999);
		birth.set(Calendar.MONTH, 11);
		birth.set(Calendar.DAY_OF_MONTH, 9);
		
		long n = now.getTimeInMillis();
		long b = birth.getTimeInMillis();
		
		long result = n - b;
		System.out.println(result);
		System.out.println("지금까지 살아온날 : " + result/(1000*60*60*24)+"일");
		System.out.println("지금까지 살아온연도수 : " + result/(1000*60*60*24)/365+"년");
		
		Date date = now.getTime();
		System.out.println(date);
		
	}

}
