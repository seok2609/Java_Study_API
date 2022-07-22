package com.iu.file.ex1;

public class StudentView {
	
	// view 3개
	//1. String 출력하는 view 메서드
	//2. StudentDTO를 출력하는 메서드
	//3. ArrayList<StudentDTO>를 출력
	
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(StudentDTO studentDTO) {
		System.out.println("학생명 : " + studentDTO.getName());
		System.out.println("학생 번호 : " + studentDTO.getNum());
		System.out.println("학생 국어 점수 : " + studentDTO.getKor());
		System.out.println("학생 영어 점수 : " + studentDTO.getEng());
		System.out.println("학생 수학 점수 : " + studentDTO.getMath());
		
	}
	
	

}
