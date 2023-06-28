package com.kh.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args)
	{
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
		
//		System.out.print("2 X 1 = 2\t");
//		System.out.print("3 X 1 = 3\t");
//		System.out.print("4 X 1 = 4\t");
//		System.out.print("5 X 1 = 5\t");
//		System.out.print("6 X 1 = 6\t");
//		System.out.print("7 X 1 = 7\t");
//		System.out.print("8 X 1 = 8\t");
//		System.out.print("9 X 1 = 9\t");
//		System.out.println();
//		System.out.print("2 X 2 = 4\t");
//		System.out.print("3 X 2 = 6\t");
//		System.out.print("4 X 2 = 8\t");
//		System.out.print("5 X 2 = 10\t");
//		System.out.print("6 X 2 = 12\t");
//		System.out.print("7 X 2 = 14\t");
//		System.out.print("8 X 2 = 16\t");
//		System.out.print("9 X 2 = 18\t");
	}
}
