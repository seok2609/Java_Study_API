package com.iu.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	//DTO : Data Transfer Object
	//DAO : Data Access Object
	// file data에 접근
	
	//2. setList
	public int setList(ArrayList<StudentDTO> ar) {
		//예외처리는 내부에서 처리
		//List로 받은 데이터들을 studentData에다가 작성
		//기존 내용은 삭제
		//작성 형식은 기존 내용의 형식과 동일하게
		//1을 리턴 : 정상적인 성공
		//0을 리턴 : 예외가 발생 했을 경우
		return 0;
	}
	
	//1. getList
	//	 studentData 파일의 내용을 읽어서 작업
		
		public ArrayList<StudentDTO> getList() throws Exception{
			ArrayList<StudentDTO> ar = new ArrayList<>();
			File file = new File("C:\\study\\studentData.txt");
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			boolean check=true;
			//첫줄 공백 제거
			br.readLine();
			while(check) { //While 시작
				String data=br.readLine();
				if(data==null) {
					break;
				}
						//1. StringTokenizer 
				StringTokenizer st = new StringTokenizer(data, ",");
				while(st.hasMoreTokens()) {
					StudentDTO studentDTO = new StudentDTO();
					studentDTO.setName(st.nextToken().trim());
					studentDTO.setNum(Integer.parseInt(st.nextToken().trim()));
					studentDTO.setKor(Integer.parseInt(st.nextToken().trim()));
					studentDTO.setEng(Integer.parseInt(st.nextToken().trim()));
					studentDTO.setMath(Integer.parseInt(st.nextToken().trim()));
					ar.add(studentDTO);
				}
			
				
//						//2. StringTokenizer
//				StringTokenizer st = new StringTokenizer(data, ",");
//				StudentDTO studentDTO = new StudentDTO();
//				studentDTO.setName(st.nextToken().trim());
//				studentDTO.setNum(Integer.parseInt(st.nextToken().trim()));
//				studentDTO.setKor(Integer.parseInt(st.nextToken().trim()));
//				studentDTO.setEng(Integer.parseInt(st.nextToken().trim()));
//				studentDTO.setMath(Integer.parseInt(st.nextToken().trim()));
//				ar.add(studentDTO);
			

//						// Array
//				String [] info = data.split(",");
//				StudentDTO studentDTO = new StudentDTO();
//				studentDTO.setName(info[0]);
//				studentDTO.setNum(Integer.parseInt(info[1].trim()));
//				studentDTO.setKor(Integer.parseInt(info[2].trim()));
//				studentDTO.setEng(Integer.parseInt(info[3].trim()));
//				studentDTO.setMath(Integer.parseInt(info[4].trim()));
//				ar.add(studentDTO);			
					
				
			}//while 끝
			
			return ar;
		}

	}
