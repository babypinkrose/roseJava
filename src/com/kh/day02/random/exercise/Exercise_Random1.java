package com.kh.day02.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {
	public static void main(String [] args)
	{
		// 동전 앞뒤 맞추기!!
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 1
//		맞췄습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 2
//		맞췄습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 2
//		틀렸습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 1
//		틀렸습니다.
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int input = 0;
		int coin = 0;
		while(true) {
			System.out.println("===== 동전 앞 뒤 맞추기 =====");
			System.out.print("숫자를 입력해주세요 (1.앞면 / 2.뒷면) : ");
			input = sc.nextInt();
			if(input < 0 || input > 2) {
				System.out.println("1 또는 2를 입력해주세요");
				while(true) {
					System.out.print("숫자를 입력해주세요 (1.앞면 / 2.뒷면) : ");
					input = sc.nextInt();
					if(input == 1 || input == 2) {
						break;
					}else {
						System.out.println("1 또는 2를 입력해주세요");
					}
				}
			}
			// 1 부터 2까지의 랜덤한 수
			// 0 부터 1까지의 랜덤 -> nextInt(2)
			// 1 부터 2까지의 랜덤 -> nextInt(2) + 1
			coin = rand.nextInt(2) + 1;
			System.out.println(rand.nextInt(1) + 1);
			if(input == coin) {
				System.out.println("맞췄습니다");
			}else {
				System.out.println("틀렸습니다");
			}
		}
		
	}
}
