package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_AnonymousClassListener extends JFrame{

	public Exam_AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	// class 안의 class 이너클래스(내부클래스) 외부의 차단
	private class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			//Action버튼이 맞는지 확인해서 액션으로 바꾸고 Action일때는 액션으로 바꿔줌
			if(btn.getText().equals("Action")) {
				btn.setText("액션");
			}else {
				btn.setText("Action");
			}
			Exam_AnonymousClassListener.this.setTitle(btn.getText()+" 이벤트 리스너 예제");
		}
	}
	
	public static void main(String[] args) {
		new Exam_AnonymousClassListener();
	}

}
// 인터페이슨느 추상 메소드로만 이루어져 있음
// -> 오버라이딩 상속은 extends말고 implements로 함















