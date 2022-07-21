package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	
	private StringBuffer sb;
	
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul,30.2,70,맑음-");
		sb.append("Daegu-39.8,90,흐림-");
		sb.append("Jeju,12.1,10,눈,");
		sb.append("Busan-0.5,85,태풍-");
		
		
	}
	
		Scanner sc = new Scanner(System.in);
		
		
	public void init(ArrayList<CityDTO> ar) {
		//sb에 있는 Data들을 파싱해서 CityDTO에 담아서 리턴
		
		String str = sb.toString();
		str = str.replace('-', ',');
//		System.out.println(str);
		StringTokenizer st = new StringTokenizer(str,",");
		
		while(st.hasMoreTokens()) {
			CityDTO cityDTO = new CityDTO();
			cityDTO.setName(st.nextToken());
			cityDTO.setGion(Double.parseDouble(st.nextToken()));
			cityDTO.setHum(Integer.parseInt(st.nextToken()));
			cityDTO.setStatus(st.nextToken());
			ar.add(cityDTO);
		}
		
//		StringTokenizer st2 = new StringTokenizer(str,"-");
//		while(st.hasMoreTokens()) {
//			System.out.println(st2.nextToken());
//		}
	}
	
	public boolean add(ArrayList<CityDTO> ar) {
		//city정보를 입력받아서 추가
		CityDTO cityDTO = new CityDTO();
		System.out.println("도시명을 입력하세요");
		cityDTO.setName(sc.next());
		System.out.println("기온을 입력하세요");
		cityDTO.setGion(sc.nextDouble());
		System.out.println("습도를 입력하세요");
		cityDTO.setHum(sc.nextInt());
		System.out.println("날씨를 입력하세요");
		cityDTO.setStatus(sc.next());
		return ar.add(cityDTO);
		
	}//add 메서드 끝
	
	public boolean remove(ArrayList<CityDTO> ar) {
		//도시명을 입력받아서 리트스에서 삭제
		System.out.println("삭제하는 도시명 입력");
		String name = sc.next();
//		String name = sc.next().toUpperCase();//입력한 도시명을 전부 대문자로 출력
//		String name = sc.next().toLowerCase();//입력한 도시명을 전부 소문자로 출력
											  //입력한 도시명을 전부 대문자나 소문자로 출력하려면
											  //아래에 get.name()뒤에도 .toUpperCase();를 붙여야함
		boolean r = false;
		
//		for(int i=0;i<ar.size();i++) {
//			if(name.equals(ar.get(i).getName())) {
//				ar.remove(i);
//				break;
//			}
//		}
		
		for(CityDTO cityDTO : ar ) {
			if(name.equals(cityDTO.getName())) {
				ar.remove(cityDTO);
				r= !r;
				break;
			}
		}
		return r;
	}//remove 메서드 끝
	
	
	public CityDTO find (ArrayList<CityDTO> ar) {
		//도시명을 입력받아서 리스트에서 검색해서 리턴 
		CityDTO cityDTO = null;
		System.out.println("검색할 도시명 입력");
		String name = sc.next();
		
		//향상된 for
		for(CityDTO cityDTO2 : ar) {
			
			if(name.equals(cityDTO2.getName())) {
				cityDTO = cityDTO2;
				break;
			}
		}
		
		return cityDTO;
	}

}
