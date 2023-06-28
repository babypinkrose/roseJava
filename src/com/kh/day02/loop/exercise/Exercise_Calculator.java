package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
//		int count = 0;
//		count를 선언해주고 아랫쪽에 if문으로 카운트 횟수 정하고 break;하면
//		해당 횟수만큼만 진행됨 
		// for(;;) {}
		while(true) {
			System.out.print("정수 하나 입력 : ");
			int inputNum1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			int inputNum2 = sc.nextInt();
			System.out.print("연산자 입력(+,-,*,/,%) : ");
			String operator = sc.next();
			int result = 0;
			switch(operator) {
			case "+" : result = inputNum1 + inputNum2; break; 
			case "-" : result = inputNum1 - inputNum2; break; 
			case "*" : result = inputNum1 * inputNum2; break; 
			case "/" : result = inputNum1 / inputNum2; break; 
			case "%" : result = inputNum1 % inputNum2; break;
			default : System.out.println("유효한 연산자가 아닙니다"); break;
			}
			System.out.println(inputNum1 + " " + operator + " " + inputNum2 + " = " + result);
//			count++;
//			if(count == 3) break;
		}
	}
}
