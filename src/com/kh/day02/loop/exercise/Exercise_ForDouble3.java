package com.kh.day02.loop.exercise;

public class Exercise_ForDouble3 {
	public static void main(String [] args)
	{
		for(int j = 0; j < 10; j++) {
			for(int i = 0; i < j+1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
