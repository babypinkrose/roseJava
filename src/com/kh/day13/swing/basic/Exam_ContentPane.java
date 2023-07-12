package com.kh.day13.swing.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_ContentPane extends JFrame{

	Exam_ContentPane() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 코드 입력 전에는 종료가 아니라 안보이게만 했었던건데
		// 코드 입력 후에는 실제 종료됨8888888888888888888888888888888888888888888888
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.PINK);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_ContentPane();
	}
}











