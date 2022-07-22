package com.iu.exception;

import java.util.Random;
import java.util.Scanner;

public class Test {
	
	public void t4() throws MyException {
		//유치원생 프로그램
		//0~99
		int num = 48;
		int num2 = 82;
		int num3 = num+num2;
		int num4 = num - num2;
		
		if(num3>99) {
			throw new MyException("????");
		}
		if(num4<0) {
			throw new MyException("그런 숫자 몰라요");
		}
	}
	
	public void t3() throws NullPointerException, ArithmeticException {
		String str = null;
		System.out.println(str.toString());
	}
	
	public void t2() {
		String [] str = {"10", "five", "3.14", "0"};
		Scanner sc = new Scanner(System.in);
		
		for(String s:str) {
			try {
				System.out.println("숫자를 입력하세요");
				int n = sc.nextInt();
				
				int num = Integer.parseInt(s);
				num = n/num;
				System.out.println(num);
				
			} catch(NumberFormatException e) {
				//예외처리
				System.out.println("예외처리");
			} catch(ArithmeticException e) {
				System.out.println("수학 오류 해결");
			} catch(Exception e) {
				e.printStackTrace();
			} catch(Throwable e){
				
			}
		}
	}

	
	public void t1() {
		System.out.println("t1 메서드 실행");
		
		Random random = new Random();	
		
		
		String str = null;
		if(random.nextInt(10)%2 == 0) {
			str="10";
		}
		
		int num = Integer.parseInt(str);//new NumberException
		num = num/random.nextInt(2);
		System.out.println(num);
		
		System.out.println(str.toString());
		
		System.out.println("t1 메서드 종료");
//	}
	}
}