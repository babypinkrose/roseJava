package com.kh.day03.array.execise;

import java.util.Scanner;

public class Exercise_For {
	public void ForExercise1() {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			sum += i;
			if(i < 10) {
			System.out.print(i + " + ");
			}else {
			System.out.print(i + " = " + sum);
			}
		}
	}
	
	public void ForExercise2() {
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
	
	public void ForDoubleExercise1() {
		// 구구단 출력
//		for(int n = 2; n < 10; n++) {
//			System.out.println(n + "단");
//			for(int i = 1; i < 10; i++) {
//				System.out.println(n + " X " + i + " = " + n*i);
//			}
//		}

		// 구구단 가로로 출력하기
		for(int j = 1; j < 10; j++) {
			for(int i = 2; i < 10; i++) {
				System.out.print(i + " X " + j + " = " + i*j + "\t");
			}
			System.out.println();
		}
	}
	
	public void ForDoubleExercise2() {
		// 0시 0분부터 23시 59분까지 출력하기!
		for(int k = 0; k < 24; k++) {
			for(int j = 0; j < 60; j++) {
				System.out.printf("%2d시 %2d분\n", k, j);
			}
		}
	}
	
	public void ForDoulerExercise3() {
		for(int j = 0; j < 10; j++) {
			for(int i = 0; i < j+1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
}
