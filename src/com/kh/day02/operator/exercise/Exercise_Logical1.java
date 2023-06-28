package com.kh.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args)
	{
		// 입력한 정수가 1 ~ 100 사이의 숫자인지 확인하세요!
		// 변수 num에 초기화
		// 1부터 100사이의 숫자인가? : true
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		boolean result = (num >= 1) && (num <= 100);
		System.out.println("1 ~ 100 사이의 정수인가요? : " + result);
	}
}
