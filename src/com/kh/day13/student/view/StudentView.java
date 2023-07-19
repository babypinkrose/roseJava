package com.kh.day13.student.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day13.student.model.vo.Student;

public class StudentView {
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("학생 성적 관리 프로그램");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 이름 검색");
		System.out.println("3. 학생 정보 전체 출력");
		System.out.println("4. 재평가 대상여부 확인");
		System.out.println("5. 프로그램 종료");
		System.out.println(" 선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public Student inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 입력");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("2차 점수 : ");
		int score2 = sc.nextInt();
		Student std = new Student(name, score1, score2);
		return std;
	}
	
	public String searchInfoByName(String category) {
		System.out.println("\n" + category +" 할 학생 이름 입력");
		Scanner sc = new Scanner(System.in);
		String searchName = sc.next();
		return searchName;
	}
	
	public void displaySuccess(String msg) {
		System.out.println("\n[서비스 성공] " + msg );
	}
	
	public void displayError(String msg) {
		System.out.println("\n[서비스 실패] " + msg );
	}
	
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	public void showAllStudentList(List<Student> allList) {
		for(Student student : allList) {
			System.out.println(student.toString());
		}
	}
	
	public void showFindStudentList(List<Student> findList) {
		for(Student student : findList) {
			System.out.println(student.toString());
		}
	}
		
//		public void checkPass() {
//			for(Student student : stdList) {
//				
//				int score1 = student.getScore1();
//				int score2 = student.getScore2();
//				double avg = (score1 + score2) / 2;
//				System.out.println(student.getName() + " 학생의 재평가 여부는");
//				if(avg >= 60) {
//					if(score1 < 40) {
//						System.out.println("1차 시험 재평가 ㅇㅇ..");
//					}else if(score2 < 40) {
//						System.out.println("2차 시험 재평가 ㅇㅇ..");
//					}else {
//						System.out.println("통과 !! ㅊㅊ");
//					}
//				}else {
//					if(score1 < 60) {
//						System.out.println("1차 시험 재평가 ㅇㅇ..");
//					}
//					if(score2 < 60) {
//						System.out.println("2차 시험 재평가 ㅇㅇ..");
//					}
//				}
//			}
//		}

}
