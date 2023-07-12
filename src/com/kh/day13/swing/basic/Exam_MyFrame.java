package com.kh.day13.swing.basic;

import javax.swing.JFrame;

public class Exam_MyFrame extends JFrame{
	
	public Exam_MyFrame() {
		setTitle("300x300 스윙 프레임 만들기"); // 프레임 이름
		setSize(300, 300); // 프레임 크기
		setVisible(true); // 프레임 실행
	}

	public static void main(String[] args) {
		Exam_MyFrame exFrame = new Exam_MyFrame();
		// exFrame 참조변수에 주소가 생성됨 
		// 객체가 생성되어야 실행이 됨 -> new Exam_MyFrame();
	}

}
