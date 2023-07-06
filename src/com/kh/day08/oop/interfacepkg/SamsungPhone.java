package com.kh.day08.oop.interfacepkg;

public class SamsungPhone implements PhoneInterface{
	// 1. The type SamsungPhone must implement the inherited abstract method PhoneInterface.sendCall()
	// => 인터페이스 오버라이딩 해주세요
	// 2. The type PhoneInterface cannot be the superclass of SamsungPhone; a superclass must be a class
	// => extends 안된다
	
	@Override
	public void reseiveCall() {
		System.out.println("여보세요 나야~");
	}

	@Override
	public void sendCall() {
		System.out.println("뚜루루루루루");
	}

	@Override
	public void printLogo() {
		System.out.println("===== SAMSUNG =====");
	}

}
