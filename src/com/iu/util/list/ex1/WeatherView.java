package com.iu.util.list.ex1;

import java.util.ArrayList;

public class WeatherView {
	
	public void view(String message) {
		
		System.out.println(message);

		
	}
	
	public void view(CityDTO cityDTO) {
		System.out.println("도시명 : " + cityDTO.getName());
		System.out.println("기온정보 : " + cityDTO.getGion());
		System.out.println("습도정보 : " + cityDTO.getHum());
		System.out.println("날씨 : " + cityDTO.getStatus());
		
//		for(CityDTO cityDTO: cityDTOs) {
//		System.out.println("도시명 : " + cityDTO.getName());
//		System.out.println("기온정보 : " + cityDTO.getGion());
//		System.out.println("습도정보 : " + cityDTO.getHum());
//		System.out.println("날씨 : " + cityDTO.getStatus());
//	}
		
	}
	
	public void view(ArrayList<CityDTO> ar) {
		for(int i=0;i<ar.size();i++) {
			CityDTO cityDTO = ar.get(i);
			this.view(cityDTO);
		}
	}
	
	

}

//view
//리스트를 받아서 모든 정보를 출력

//view 
//city 하나를 받아서 모든 정보를 출력

//view
//메세지(String)하나를 받아서 출력

