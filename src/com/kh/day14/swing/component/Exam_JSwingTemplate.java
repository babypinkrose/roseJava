package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Exam_JSwingTemplate extends JFrame{
	
	public Exam_JSwingTemplate() {
		setTitle("JCheckBox 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		setSize(250, 150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Exam_JSwingTemplate();
	}

}
