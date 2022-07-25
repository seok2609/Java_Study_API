package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.Scanner;

public class Client2 {
	
	//getfood
	//서버 접속 후
	// 1. 점심메뉴
	// 2. 저녁메뉴
	// 3. 종료
	// 번호를 입력받아서 server로 전송
	// 받아서 출력
	
	public void getfood() throws Exception {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.16", 8282);
		System.out.println("server 접속 완료");
		
		OutputStream os = socket.getOutputStream();//0,1
		OutputStreamWriter ow = new OutputStreamWriter(os);//문자
		BufferedWriter bw = new BufferedWriter(ow);
		
		InputStream is = socket.getInputStream();
		InputStreamReader  ir =  new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		
		boolean check = true;
		while(check) {
			System.out.println("1. 점심 메뉴");
			System.out.println("2. 저녁 메뉴");
			System.out.println("3. 종    료");
			int select = sc.nextInt();
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			bw.write(select + "\r\n");
			bw.flush();
			
			if(select==3) {
				break;
			}
			
			//-----------------------------
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			String message = br.readLine();
			System.out.println(message);
			
			
		}
		
		bw.close();
		ow.close();
		os.close();
		
		br.close();
		ir.close();
		is.close();
		socket.close();
			
	}

}
