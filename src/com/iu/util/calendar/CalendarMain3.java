package com.iu.util.calendar;

import java.util.Calendar;

public class CalendarMain3 {
	
	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance();
		
		ca.set(2022, 11, 31, 23, 59, 50);
		
		System.out.println(ca.getTime());
		
		long now = ca.getTimeInMillis();
		now = now + 10000;
		
		ca.setTimeInMillis(now);           //long 타입을 날짜로 변환
		System.out.println(ca.getTime());
	}

}
