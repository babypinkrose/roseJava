package com.kh.day09.mala;

public class MalaRun {
	public static void main(String[] args) {
		
		MalaFunction mFunc = new MalaFunction();
		finish :
			while(true) {
				int choice = mFunc.printMenu();
				switch(choice) {
				case 1 :
					mFunc.mainMenu();
					break;
						
					
				}
			}
	}
}
