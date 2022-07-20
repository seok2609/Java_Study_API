package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {
	
	//ex1 메서드
	//주민번호를 입력 : 6-7 :
	//1. 남자 여자 판단
	//2. 현재나이 출력
	//3. 3-5월 : 봄
	//   6-8월 : 여름
	//	 9-11월 : 가을
	//   12-2월 : 겨울
	
	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		String nums = sc.next();
		
		
		
		
		//1. 남자 여자 판단
		
		char ch = nums.charAt(7);
		if(ch=='1' || ch=='3') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		

		//2. 현재 나이 출력
		int age = Integer.parseInt(nums.substring(0, 2));

		if(ch=='1' || ch=='2') {
			age=2022-(1900+age)+1;
			System.out.println(age);
		}else if(ch=='3' || ch=='4') {
			age=2022-(2000+age)+1;
			System.out.println(age);
		}
//		String year = nums.substring(0, 2);
//		System.out.println(year);
//		
//		String cen = "20";
//		if(ch=='1' || ch=='2') {
//			cen="19";
//			
//		}
//		year = cen+year;
//		int y = Integer.parseInt(year);
		
		//3. 계절 출력
		
		int month = Integer.parseInt(nums.substring(2, 4));
		if(month>2 && month<6) {
			System.out.println("봄");
		}else if(month>5 && month<9){
			System.out.println("여름");
		}else if(month>8 && month<12) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		
		
		
	
		
//		String result = nums.substring(7, 8);
//		System.out.println(result);
//		
//			if(result == 1) {
//				System.out.println("남자");
//				break;
//			}else {
//				System.out.println("여자");
//				break;
//			}
		}
		
		
	}


