package com.kh.day06.oop.exercise;

public class Student {
	 String name;
	 int kor = 0;
	 int eng = 0;
	 int math = 0;
	
	public Student() {}
	
	public Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 합계 메소드
	public int getTotal() {
		int total = this.kor + this.eng + this.math;
		return total;
	}
	// 평균 메소드
	public double getAvg() {
		double avg = (double)this.getTotal() / 3;
		return avg;
	}
}
