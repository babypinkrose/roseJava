package com.kh.day17.network.soket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorServer {

	public static void main(String[] args) {
		// 서버 구동중입니다
		// 클라이언트와 연결을 기다리고 있습니다..
		// 클라이언트와 연결되었습니다.
		// 받은 메시지 : 23
		// 받은 메시지 : 24 + 42
		// 클라이언트가 종료하였습니다.
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;  // 한번에 인풋하기
		OutputStream os = null;  // ctrl + shift + o
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("서버 구동중입니다.");
			for(int i = 0; i <= 50; i++) {
				Thread.sleep(10); // 로딩바처럼~
				System.out.print("=");
			}
			System.out.println();
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트와 연결을 기다리고 있습니다..");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			// 받을 준비
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			while(true) {
				// 데이터 받기
				String recvMsg = dis.readUTF();
				 if(recvMsg.equalsIgnoreCase("exit")) { // 대소문자 구분 X
						System.out.println("클라이언트가 종료하였습니다.");
						break;
					}
				System.out.printf("받은 메시지 : %s\n", recvMsg);
				// 24 + 42 -> 띄어쓰기 기준으로 문자열 배열을 만듬
				String [] msgArrs = recvMsg.split(" ");
				if(msgArrs.length != 3) {
					String errMsg = "end";
					dos.writeUTF(errMsg);
					continue;
				}
				// 24 / + / 42
				int num1 = Integer.parseInt(msgArrs[0]);
				int num2 = Integer.parseInt(msgArrs[2]);
				String operator = msgArrs[1];
				String result = "";
				switch(operator) {
				case "+" : 
					result = String.valueOf(num1 + num2); // 변환해도 되고
					break;
				case "-" : 
					result = String.valueOf(num1 - num2);
					break;
				case "*" : 
					result = num1 * num2 + "";      // 문자열을 추가해도 된다
					break;
				case "/" : 
					result = num1 / num2 + "";
					break;
				case "%" : 
					result = num1 % num2 + "";
					break;
				}
				// 결과 보내고 끝
				dos.writeUTF(result);
				dos.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
