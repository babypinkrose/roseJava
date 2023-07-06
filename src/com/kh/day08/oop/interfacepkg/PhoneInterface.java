package com.kh.day08.oop.interfacepkg;

public interface PhoneInterface {
	// 1. Illegal modifier for the interface field PhoneInterface.name;
	// only public, static & final are permitted
	// => private 사용 불가 public 사용
	// 2. The blank final field NAME may not have been initialized
	// => 초기화 해주세요~
	public String NAME = "";
	public static final int TIME_OUT = 10000;
	
	public abstract void reseiveCall();
	void sendCall();
	abstract void printLogo();
	// 3. Abstract methods do not specify a body
	// => {} 몸체 없애라~
	public default void showLogo() {
		// 디폴트 메소드
		// 하위 호환성을 위해서 작성함
		// 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성
		System.out.println("** LG **");
	}
	
}
