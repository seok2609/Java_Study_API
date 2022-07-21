package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	//WeatherController 클래스
	//start
	//1. 날씨정보 초기화 - init메서드
	//2. 전국날씨 출력
	//3. 지역날씨 검색  - find메서드
	//4. 지역정보 추가 
	//5. 지역정보 삭제
	//6. 종		 료

	
	//결합도가 강하다(높다) : 자체에서 객체 생성
	//결합도가 느슨하다(낮다) : 매개변수를 통새허 만들어진 객체를 주입
	//					: 생성자의 매개변수,
	
	private WeatherService ws;
	private WeatherView wv;
	private Scanner sc;
	
	public WeatherController() {
		this.ws = new WeatherService();
		this.wv = new WeatherView();
		this.sc = new Scanner(System.in);
	}
	
	
	public void start() {
		ArrayList<CityDTO> ar = new ArrayList<>();
		boolean check = true;
		
		while(check) {
			System.out.println("1. 날씨 정보 초기화");
			System.out.println("2. 날씨 정보 출력");
			System.out.println("3. 지역 날씨 출력");
			System.out.println("4. 지역 정보 추가");
			System.out.println("5. 지역 정보 삭제");
			System.out.println("6. 종        료");
			
			int select = sc.nextInt();
			
			if(select == 1) {
				ws.init(ar);				
			}else if(select == 2) {
				wv.view(ar);
			}else if(select == 3) {
				CityDTO cityDTO = ws.find(ar);
				if(cityDTO != null) {
					wv.view(cityDTO);
				}else {
					wv.view("잘못된 도시명");
				}
			}else if(select == 4) {
				boolean result = ws.add(ar);
				String message = "추가 실패";
				if(result) {
					message = "추가 성공";
				}
				wv.view(message);
			}else if(select == 5) {
				boolean result = ws.remove(ar);
				String message = "삭제 실패";
				if(result) {
					message = "추가성공";
				}
			}else {
				System.out.println("프로그램 종료");
				break;
//				check=!check;
			}
		}
	}
}
