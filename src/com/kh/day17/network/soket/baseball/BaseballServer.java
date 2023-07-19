package com.kh.day17.network.soket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class BaseballServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 7777;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		int [] numbers = new int[3];
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("서버 소켓을 생성하였습니다.");
			Thread.sleep(3000);
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			//(int) Math.random() * (최대값 - 최소값 + 1) + 최소값
			System.out.print("서버 숫자 -> ");
			for(int i = 0; i < 3; i++) {
				// 중복 없이 추출하기
				numbers[i] = (int)(Math.random()*9+1);
				for(int j = 0; j < i; j++) {
					if(numbers[j] == numbers[i]) {
						i--;
						break;
					}
				}
			}
			System.out.printf("%d %d %d\n", numbers[0], numbers[1], numbers[2]);
			System.out.println("서버 준비 완료");
			// 보낸거 받아주기
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			while(true) {
				String recvMsg = dis.readUTF();
				System.out.printf("받기 : %s\n", recvMsg);
				// 결과 알려주기 (보내기)
				// numbers 배열과 입력한 값으로 만든 배열과 비교
				// 정답과 비교해서 스트라이크, 볼 알려주기
				String [] inputNums = recvMsg.split(" ");
				int strike = 0;
				int ball = 0;
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if(numbers[i] == Integer.parseInt(inputNums[j])) {
							if(i == j) { // 값이 같은 상태에서 인덱스가 같으면 스트라이크
								strike++;
							} else { // 값이 같은 상ㅌ에서 인덱스가 다르면 볼
								ball++;
							}
						}
					}
				}
				String result = strike + "스크라이크 " + ball + "볼";
				dos.writeUTF(result);
				dos.flush();
				if(strike == 3) {
					System.out.println("아웃! 게임종료");
					
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
