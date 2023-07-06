package com.kh.day09.mala;

import java.util.Scanner;

public class MalaFunction {
	int gram = 0;
	int price = 0;
	int beef = 0, ramb = 0, shrimp = 0, sausage = 0, ham = 0, fishball = 0, yubu = 0,
		beancurd = 0, fuju = 0, dumpling = 0, 
	
	
	
	
	public MalaFunction() {
		
	}
	public int printMenu() {
		//마라탕 주문하기
		// 1. 재료선택
		// 2. 맵기선택
		// 3. 마라선택
		// 4. 땅콩소스
		// 5. 주문하기
		// 메뉴 선택 : 
		Scanner sc = new Scanner(System.in);
		System.out.println("┌──────────────────┐");
		System.out.println("│  춘 리 마 라 탕  │");
		System.out.println("└──────────────────┘");
		System.out.println("┌──────────────────┐");
		System.out.println("│    ♡주문하기♡    │ ");
		System.out.println("│                  │");
		System.out.println("│  1. 메 뉴 선 택  │");
		System.out.println("│  2. 재 료 선 택  │");
		System.out.println("│  3. 맵 기 선 택  │");
		System.out.println("│  4. 마 라 선 택  │");
		System.out.println("│  5. 땅 콩 소 스  │");
		System.out.println("│  6. 조 리 시 작  │");
		System.out.println("│  7. 음 료&주 류  │");
		System.out.println("└──────────────────┘");
		
		int choice = sc.nextInt();
		return choice;
	}
	public void mainMenu() {
		
		System.out.println("┌────────────────────────────────────────────────┐");
		System.out.println("│  메 뉴 를 선 택 해 주 세 요                    │");
		System.out.println("└────────────────────────────────────────────────┘");
		System.out.println("┌────────────────────────────────────────────────┐");
		System.out.println("│ 1. 마라탕(100g)    1,900원 ※기본  7,000원 부터 │");
		System.out.println("│ 2. 마라샹궈(100g)  3,000원 ※기본 15,000원 부터 │");
		System.out.println("│ 3. 꿔바로우 小 11,900원                        │");
		System.out.println("│ 4. 꿔바로우 大 16,900원                        │");
		System.out.println("│ 5. 볶음밥 6,900원                              │");
		System.out.println("│ 5. 공기밥 1,000원                              │");
		System.out.println("└────────────────────────────────────────────────┘");
		
	}
	public void ingredient() {
		System.out.println("┌─────────────────────────────────────────────┐");
		System.out.println("│  재 료 선 택                                │");
		System.out.println("└─────────────────────────────────────────────┘");
		System.out.println("┌─────────────────────────────────────────────┐");
		System.out.println("│    재 료 선 택                              │");
		System.out.println("└─────────────────────────────────────────────┘");
	}
}


















