package com.kh.day02.basic;

public class Exam_PrintSample {
	public static void main(String [] args)
	{
		System.out.println("개행 포함된 출력 메소드");
		System.out.print("개행 없이 출력 메소드");
		System.out.println("<- 바로 옆으로 붙어버림");
		
		// %d : 정수, %f : 실수, %s : 문자열, %c : 문자, %b : boolean
		// \n : 개행, \t : 탭(공백)
		// 정수 출력시 d앞에 몇 입력하면 몇자리 출력
		System.out.printf("정수 출력 : %3d\n", 11);
		// 실수 출력시 f앞에 .몇 < 입력하면 소수점 몇자리까지 출력
		System.out.printf("실수 출력 : %.3f\n", 10.26);
		System.out.printf("문자열 출력 : %s", "자바 print 문자열 출력\n");
		System.out.printf("%c반 %s과정 %.2f개강 %.2f종강 %b입니다\n",
				'F', "공공데이터 개발자", 5.15, 10.26, true);
	}
}
