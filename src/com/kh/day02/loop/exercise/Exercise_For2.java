package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_For2 {
	public static void main(String [] args) {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력 하여야 합니다"를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 해주세요 : ");
		int input = sc.nextInt();
		if(input < 10 && input > 0) {
			System.out.println(input + "단");
			for(int i = 1; i < 10; i++) {
				System.out.println(input + " X " + i +" = " + i*input);
			}
		}else {
			System.out.print("1 ~ 9사이의 양수를 입력 하여야 합니다");
		}
	}
}
