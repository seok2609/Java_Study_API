package com.iu.lang.string.ex1;

import java.util.StringTokenizer;

public class WorkerService {
	
//	private String info;
	
	private StringBuffer sb;
	
	//기본 생성자
	public WorkerService() {
		sb = new StringBuffer();
		sb.append("noze-인사과-과장-0101111");
		sb.append(", iu-IT-대리-0102222")	;
		sb.append(", suji-영업-부장-0103333");
		sb.append(", choa-마케팅-사원-0104444");
	}
	
	public WorkerDTO [] init () {
		//info에 있는 데이터를 parsing해서 WorkerDTO에 대입하고
		//WorkerDTO를 모은 배열을 리턴
		
		String info = sb.toString();
		
		String newInfo = info.replace(",", "-");
		StringTokenizer st = new StringTokenizer(newInfo, "-");
		int index = 0;
		
		WorkerDTO [] workerDTOs = new WorkerDTO[st.countTokens()/4];
		
		while(st.hasMoreTokens()) {
			WorkerDTO workerDTO = new WorkerDTO();
			workerDTO.setName(st.nextToken());
			workerDTO.setDepartment(st.nextToken());
			workerDTO.setJob(st.nextToken());
			workerDTO.setPhone(st.nextToken());
			workerDTOs[index]=workerDTO;
			index++;
		}
		
		
		
		
//		String [] infos = newInfo.split("-");
//		
//		WorkerDTO [] workersDTOs = new WorkerDTO[infos.length/4];
//		
//		System.out.println(infos.length);
//		
//		for(int i=0;i<infos.length;i++) {
//			
//			WorkerDTO workerDTO = new WorkerDTO();
//			workersDTOs[i/4]=workerDTO;
//			workerDTO.setName(infos[i].trim());          //4, 8
//			workerDTO.setDepartment(infos[++i].trim());    //5, 9
//			workerDTO.setJob(infos[++i].trim());			  //6, 10
//			workerDTO.setPhone(infos[++i].trim());         //7, 11
//				
//		}
		
//		info = info.replace(",", "-");
//		
//		String [] names = info.split("-");
//		
//		for(String name:names) {
//			System.out.println(name);
//		}
//		return null;
		
		return workerDTOs;
	}

}
