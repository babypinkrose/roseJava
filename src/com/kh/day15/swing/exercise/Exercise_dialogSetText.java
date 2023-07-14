package com.kh.day15.swing.exercise;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyModalDialog extends JDialog {
	private JTextField field;
	private JButton btn;
	public MyModalDialog() {}
	public MyModalDialog(JFrame frame, String title, JButton jBtn) {
		super(frame, title);
		setLayout(new FlowLayout());
		field = new JTextField(10);
		add(field);
		btn = new JButton("OK");					
		btn.addActionListener(new ActionListener() {		// OK버튼 눌렀을 때 
			@Override
			public void actionPerformed(ActionEvent e) {				
				if(field.getText().length() == 0) return;
				else jBtn.setText(field.getText());
				setVisible(false);							// 다이얼로그 사라짐
				field.setText("");							// 다이얼로그 호출될 때  필드를 비워줌
			}
		});
		add(btn);
		setSize(200, 100);
	}
	
//	public String getInput() {							// 버튼에 다이얼로그 텍스트 전달하기
//		if(field.getText().length() == 0) return null;	// 텍스트필드에 있는 String 가져와야함
//		else return field.getText();
//	}
}
public class Exercise_dialogSetText extends JFrame{
	private MyModalDialog dialog;
	public Exercise_dialogSetText() {
		super("다이얼로그 텍스트 셋팅 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Modal DiaLog");
		btn.setSize(200, 50);
		btn.setLocation(20, 50);
		dialog = new MyModalDialog(this, "Show Modal Dialog", btn);	// 버튼 누르면 다이얼로그 띄워줌
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
//				String text = dialog.getInput();
//				if(text == null) return;
//				JButton btn = (JButton)e.getSource();
//				btn.setText(text);
			}
		});
		Container c = getContentPane();
		c.setLayout(null);
		c.add(btn);
		
		setSize(250, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise_dialogSetText();
	}
}










