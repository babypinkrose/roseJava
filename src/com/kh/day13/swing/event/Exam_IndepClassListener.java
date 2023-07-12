package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_IndepClassListener extends JFrame{
	// 외부 클래스로 이벤트 넣기
	public Exam_IndepClassListener() {
		
		setTitle("Action 이벤트 리스터 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
//		c.add(new JButton("Action"));  --> 위와 같음
		
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exam_IndepClassListener();
	}
}

class MyActionListener implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		if(btn.getText().equals("Action")) {
			// 액션버튼 안의 값이 맞으면 바꾸기
			btn.setText("액션");
			
		}else {
			btn.setText("Action");
		}
	}
}










