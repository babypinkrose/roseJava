package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Exam_JRadioButton extends JFrame{
	
	public Exam_JRadioButton() {
		setTitle("JRadioButton 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("image/cherry.jpg");
		ImageIcon selectedCherry = new ImageIcon("image/selectedCherry.jpg");
		// "사과", true 이렇게 쓰면 체크된 상태로
		JRadioButton apple = new JRadioButton("사과", true);
		JRadioButton pear = new JRadioButton("배");
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		cherry.setBorderPainted(true); // 음각 양각
		cherry.setSelectedIcon(selectedCherry); // 선택아이콘 변경
		// 라디오 버튼은 1가지만 선택되도록 해주는 버튼그룹
		// input[type=radio] 태그의 name을 맞춰주는것과 같음
		ButtonGroup g = new ButtonGroup(); 
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Exam_JRadioButton();
	}

}
