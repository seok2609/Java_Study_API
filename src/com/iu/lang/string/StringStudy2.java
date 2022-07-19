package com.iu.lang.string;

import java.util.Scanner;

public class StringStudy2 {
	
	public void ex2() {
		//키보드로부터 파일명을 입력 받음, abc.txt   
		//파일이 이미지 파일인지아닌지 구별
		//확장자가 jpg, png, gif, jpeg 일때만 이미지 파일로 인정
		Scanner sc = new Scanner(System.in);
		
		String [] files = {"jpg", "jpeg", "gif", "png"};
		
//		System.out.println("파일명을 입력하세요");
//		String fileName = sc.next();
		String fileName = "abc.jpg";
		
		int index = fileName.lastIndexOf(".");
		
		String result = "이미지 파일이 아닙니다.";
		fileName = fileName.substring(index);                      //.txt
		for(int i=0;i<files.length;i++) {
			if(fileName.equals(files[i])) {
				result ="이미지 파일입니다";
//				System.out.println("이 파일은 이미지 파일입니다");
					break;
				}
			System.out.println(result);
//					System.out.println("이 파일은 이미지 파일이 아닙니다");
				
			
		}
		
			
					
		

//		System.out.println(hwak[0]);
//		
//		while(check) {
//			System.out.println("파일명을 입력하세요");
//		
//			Scanner sc = new Scanner(System.in);
//			sc.next();
//			
//			String ext = file.substring(4);                //ext : 확장자 변수명
//			System.out.println(ext);
//			
//			if(file.substring(4) == ext) {
//				System.out.println("이 파일은 이미지 파일입니다");
//				break;
//				
//			}else {
//				System.out.println("이 파일은 이미지 파일이 아닙니다");
//			}
//			break;
//		}
}
	
	public void StudyIndexOfEx1() {
		String names = "iu,suji,choa,hani";
		//1, names에는 몇개의 쉼표가 있는가?
		//2, 총 몇명이 있습니까?
		
		//1.
		boolean check = true;
		int count = 0;    		//쉼표의 갯수를 담을 변수
		int index = 0; 			//쉼표의 찾은 인덱스 번호
		while(check) {
			
			index = names.indexOf(",", index);
			
			if(index==-1) {
				break;
			}else {
				count++;
				index++;
			}
		}//while 끝
		
		System.out.println("쉼표의 갯수 : " + count);
		System.out.println("인원수: " + (count+1));
		
		
	}
	
	public void studyIndexOf() {
		String str = "Hello Java";
		
//		int a = str.indexOf("el");
//		
//		System.out.println(a);
		
		System.out.println(str.indexOf("Ja"));
		
		String replace = str.replace('l', 'w');
		System.out.println(replace);
		System.out.println(str);
		
		str = "Google에 입사 지원동기는... Google에 입사하면 노예가....";
		System.out.println(str);
		str = str.replace("Google", "Samsung");
		System.out.println(str);
		
		str = "hi";
		String str2 = " h i ";
		str2 = str2.trim();
		str2 = str2.replace(" ", "");
		System.out.println(str.equals(str2));
		
	}
	
	
	public void studySubString() {
		//하나의 문자열을 분리하는 작업 (parsing)
		String member = "iu/1234";
		String pw = member.substring(3);
		String id = member.substring(0,2);
		System.out.println(id);
		System.out.println(pw);
	}

}
