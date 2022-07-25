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
import java.util.Scanner;

public class Client1 {
	
	
	public void send() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.16", 8282);
		System.out.println("Server 접속 완료");
		
		OutputStream os=null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;
		
		InputStream is=null;
		InputStreamReader ir=null;
		BufferedReader br=null;
		
		boolean check = true;
		
			
		System.out.println("서버로 보낼 메세지를 입력하세요");
		String message = sc.next();
		
		while(check) {
			if(!message.toLowerCase().equals("q")) {
//		String message = "Hello Server!!";
		
					os = socket.getOutputStream();//0,1
					ow = new OutputStreamWriter(os);//문자
					bw = new BufferedWriter(ow);
					
					//전송
					bw.write(message + "\r\n");
					bw.flush();
					
					is = socket.getInputStream();
					ir =  new InputStreamReader(is);
					br = new BufferedReader(ir);
					message = br.readLine();
					System.out.println("Server : " + message);		
						
					

						
			}else {
				System.out.println("서버를 종료합니다.");
				break;
			}
		}
		//자원해제 - 연결된 역순으로 해제
		bw.close();
		ow.close();
		os.close();
		
		br.close();
		ir.close();
		is.close();
		socket.close();
	}

}
