package com.iu.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {
	
	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		
//		ca.roll(Calendar.MINUTE, 20);	//roll = 분은 흘러가지만 시간은 안흘러감
		ca.add(Calendar.MINUTE, 20);	//add = S분과 시간 둘다 흘러감
		
		System.out.println(ca.getTime());
		
		System.out.println("=========================");
		ca = Calendar.getInstance();
		String pattern = "yyyy년 MM월 dd일 E";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		
		String time = sd.format(ca.getTime());
		
		System.out.println(time);
		
		
	}

}
