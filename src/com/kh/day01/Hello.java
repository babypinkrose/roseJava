package com.kh.day01;

public class Hello {
	
	public static int sum(int num1, int num2) {
		//This method must return a result of type int
		// 이 메세지가 뜨면 return 안썼나? 하고 생각해야함
		return num1+num2;
	}
	
	public static void main(String [] args)
	{
		int i = 20;
		int s;
		char a;
		// ctrl + shift + c 한번에 주석처리
		// ctrl + z 되돌리기 ctrl + y 앞되돌리기
		a = '?';
		s = sum(i, 10);
		System.out.println(s);
		System.out.println(a);
		System.out.println("Hello");
	}

}
