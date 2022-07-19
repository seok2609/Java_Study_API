package com.iu.lang.string.ex1;

public class WorkerView {
	
	//view 메서드 생성
	//WorkerDTO들을 받아서 정보를 출력
	
	public void view(WorkerDTO [] workerDTOs) {
		for(WorkerDTO workerDTO:workerDTOs) {
			System.out.println("이름 : " + workerDTO.getName());
			System.out.println("부서 : " + workerDTO.getDepartment());
			System.out.println("직급 : " + workerDTO.getJob());
			System.out.println("전화번호 : " + workerDTO.getPhone());
		}
	}
	
//	public void view (WorkerDTO [] workerdto) {
//		for(int i=0;i<workerdto.length;i++) {
//			System.out.println(workerdto[i].getName());
//			System.out.println(workerdto[i].getDepartment());
//			System.out.println(workerdto[i].getJob());
//			System.out.println(workerdto[i].getPhone());
//		}
//	}


}
