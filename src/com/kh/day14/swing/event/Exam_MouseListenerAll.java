package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_MouseListenerAll extends JFrame{
	private JLabel la;
	
	public Exam_MouseListenerAll() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		la = new JLabel("No Mouse Event");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	private class MyMouseListener implements MouseListener, MouseMotionListener{
		//The type MyMouseListener must implement the inherited abstract method MouseListener.
		// mouseEntered(MouseEvent)
		// 인터페이스는 꼭 오버라이딩 해줘야한다!
		// implements는 ,로 여러개 다중상속이 가능, 다중구현
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("mouseDragged(" + e.getX() + ", " + e.getY()+")");
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved(" + e.getX() + ", " + e.getY()+")");
		}
	}
	
	public static void main(String[] args) {
		new Exam_MouseListenerAll();
	}

}






















