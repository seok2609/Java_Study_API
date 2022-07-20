package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {
	
	//juminCheck
	//주민번호 입력 - 스캐너
	//   9  9   1   2   0   9  -   1   2   3   4   5   6   7(체크용 번호)
	//*  2  3   4   5   6   7      8   9   2   3   4   5   6
	//  18  27  4   10  0   63     8   18  6   12  20  30  42
	//총합:258
	//총합을 11로 나누어서 나머지를 구함
	// 258/11 -- 몫 23 나머지 5
	
	//나머지를 11에서 뺀 결과를 체크용 번호와 같은지 비교
	// 11 -5 =6
	
	//만약에 위의 연산결과가 두자리라면
	//연산결과를 다시 10으로 나눈 나머지와 체크용번호를 비교
	// 11/10  ---- 나머지 = 1
	
	public void juminCheck() {
		System.out.println("주민번호를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		
		String jumin = sc.next();
//		String jumin = "991209-1234567";
		int count =2;
		int sum = 0;
		for(int i=0;i<jumin.length()-1;i++) {
		
	//		String jumins = jumin.replaceAll("-","");
	////		System.out.println(jumins);
	//		
	//		int num = Integer.parseInt(jumins);
	//		for(int a=0;a<jumins.length();a++) {
	//			for(int i=2;i<10;i++) {
	//				num = jumins.charAt(a)*(i);
	//			}
	//			System.out.println(num);
	//		}
			
			//1. substring()   : String
	//		String num = jumin.substring(0, 1);
	//		int n = Integer.parseInt(num);
			
			//2. charAt()      : char
	//		char ch = jumin.charAt(0);  
	//		int n = Integer.parseInt(ch+""); // char타입을 int타입으로 변환하는 방법
			
	//		String num = String.valueOf(ch); //                 "
	//		int n = Integer.parseInt(num);
			if (i==6) {
				continue;
			}
			
			int n = Integer.parseInt(String.valueOf(jumin.charAt(i)));
			
			sum = sum + n*count;
			count++;
		}	
		
		int check = sum%11;
		
		check = 11 - check;
		
		if(check>9) {
			check = check%10;
			
		}
		//check용 번호
		int checknum = Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));
		
		if(check == checknum) {
			System.out.println("정상 주민번호");
		}else {
			System.out.println("비정상 주민번호");
		}
		
	}

}
