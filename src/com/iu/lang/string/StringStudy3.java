package com.iu.lang.string;

public class StringStudy3 {
	
	public void studySplit3() {
		String info = "서울,대전-대구,부산-제주,광주-강릉";
		//전처리  
		info = info.replace(",", "-");             //replace = 문자열을 변환하고 리턴
		System.out.println(info);
		String [] cities = info.split("-");
		for(String c:cities) {
			System.out.println(c);
		}
		
//		String [] citys = info.split(",|-");
//		
//		for(String city:citys) {
//			System.out.println(city);
//		}
	}
	
	public void studySplit2() {
		String info = "1997 12 24";
		
		String [] nums = info.split(" ");
		
		for(String num : nums) {
			System.out.println(num);
		}
	}
	
	public void studySplit() {
		//Split = 특정기준으로 문자열을 분리 
		
		String str = "noze,iu,suji,naen";
		
		String [] names = str.split(",");
		
		//for -> for(초기식;조건식;증감식){}
		// 향상된 for문	
		//for(배열에 모은 데이터 타입 변수명 : 배열 참조변수명 ) {}
		
		for(String name : names) {              // << 향상된 for문
			System.out.println(name);
		}
	}

}
