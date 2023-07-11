package com.kh.day10.mara;

import java.util.Scanner;

import com.kh.day10.mara.MaraFunction;

public class MaraRun {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		MaraFunction mFunc = new MaraFunction();
		int result = 1;
		while(true) {
			result = mFunc.printMenu();
		}
	}		
}