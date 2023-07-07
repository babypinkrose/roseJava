package com.kh.day10.collection.music;

import java.util.Scanner;

public class MusicRun {
	
	public static void main(String[] args) {
		MusicFunction mFunc = new MusicFunction();
		end :
		while(true) {
			int value = mFunc.printMenu();
			switch(value) {
			case 1 : mFunc.addLastMusic();
					 break;
			case 2 : mFunc.addFirstMusic();
					 break;
			case 3 : mFunc.musicList(); 
					 break;
			case 4 : mFunc.searchMusic();
					 break;
			case 5 : mFunc.delMusic(); 
					 break;
			case 6 : mFunc.setMusic(); 
					 break;
			case 7 : 
			case 8 : 
			case 9 : 
			case 10 : 
			case 0 : break end;
			}
		}
	}
}
