package com.kh.day03.array.execise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_AfterSchool {
	public void exercise1() {
		//1번
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 정수를 입력해 주세요 : ");
		int input = sc.nextInt();
		for(int i = 1; i <= input; i++) {
			if(input >= 1) {
				System.out.print(i + " ");
			}else {
				System.out.println("1 이상의 정수를 입력해 주세요"); break;
			}
		}
		
	}
	
	public void exercise2() {
		//2번
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 정수를 입력해 주세요 : ");
		int input = sc.nextInt();
		for(int i = input; i >= 1; i--) {
			if(input < 1) {
				System.out.println("1 이상의 정수를 입력해 주세요"); break;
			}else {
				System.out.print(i + " ");
			}
		}
		
	}
	
	public void exercise3() {
		//3번
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요. 
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 정수를 입력해 주세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= input; i++) {
			sum += i;
			if(i != input) {
				System.out.print(i + " + ");
			}else {
				System.out.print(i + " = ");
			}
		}
		System.out.print(sum);
	}	
   
	public void exercise4() {
	//4번  
	//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("1 이상의 정수를 2개 입력해 주세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		for(int i = num1; i <= num2; i++) {
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해 주세요"); break;
			}else {
				System.out.print(i + " ");
			}
		}
	}
	
	public void exercise5() {
		//5번
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 9사이의 숫자를 입력해 주세요 : ");
		int dan = sc.nextInt();
		System.out.println(dan + "단");
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " X " + i + " = " + dan*i);
		}
	}
	
	public void exercise6() {
		//6번  
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 9사이의 숫자를 입력해 주세요 : ");
		int dan = sc.nextInt();
		if(dan > 8) {
			System.out.println("9 이하의 숫자만 입력해 주세요");
		}else {
			for(int i = dan; i < 10; i++) {
				System.out.println(i + "단");
				for(int j = 1; j < 10; j++) {
					System.out.println(i + " X " + j + " = " + i*j);
				}
				System.out.println();
			}	
		}
	}
   
   
	
	
	
	
	// 끝판왕 ^^
 	public void lottoExercise() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개. 로또 번호의 범위는 1 ~ 45
	}
 	
 	// 가위바위보 게임
 	public void RPSgame() {
 		// 가위 바위 보 중 하나를 선택, 승패를 결정하는 게임
 		Scanner sc = new Scanner(System.in);
 		Random rand = new Random();
 		System.out.println("===== 가위 바위 보 게임 =====");
 		System.out.println("숫자를 선택하세요(1.가위 / 2.바위 / 3.보) : ");
 		int input = sc.nextInt();
 		
 		System.out.println("========== 결과 ==========");
 		System.out.println("당신은 가위를 냈습니다");
 		System.out.println("당신은 바위를 냈습니다");
 		System.out.println("당신은 보를 냈습니다");
 		
 	}
	
	
	
	
	
}
