package com.iu.file.ex1;

import java.util.ArrayList;

public class ExMain {
		public static void main(String[] args) {
			StudentDAO dao = new StudentDAO();
			StudentView sv = new StudentView();
			
			ArrayList<StudentDTO> ar=null;
			try {
				ar = dao.getList();
				for(StudentDTO studentDTO:ar) {
					System.out.println(studentDTO.getName());
					System.out.println(studentDTO.getNum());
					System.out.println(studentDTO.getKor());
					System.out.println(studentDTO.getEng());
					System.out.println(studentDTO.getMath());
					System.out.println("==================");
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println(ar);
			

		}

	}