package com.iu.lang;

import java.util.Scanner;

public class LangMain {
	public static void main(String[] args) {
		
		//모든 클래스의 최고조상 = Object 
		//모든클래스는 Object 타입이다.
		Object obj = new Object();
		String str = obj.toString();
		Member member = new Member();
		System.out.println(str);
		str = member.toString();
		System.out.println(str);
		MemberClient mc = new MemberClient();
		Car car = new Car();
		Car car2 = new Car();
		
		//다형성
		obj = member;
		
		boolean check = car.equals(obj); // car == car2
		System.out.println(car);
		System.out.println(car2.toString());
		System.out.println(check);
		
		String name = "iu";
		System.out.println(name);
		
	}

}
