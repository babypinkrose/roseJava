package com.kh.day10.collection.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFunction {
	
//	Student [] student;
	List<Student> stdList;
//	int index;
	
	public StudentFunction() {
//		student = new Student[100];
//		index = 0;
		stdList = new ArrayList<Student>();
	}
	
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
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 입력");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("2차 점수 : ");
		int score2 = sc.nextInt();
		Student std = new Student(name, score1, score2);
		stdList.add(std);
//		student[index] = std;
//		index++;
	}
	
	public void printInfo() {
		System.out.println("학생 정보 전체 출력");
		for(Student student : stdList) {
			System.out.println(student.toString());
		}
//		for(int i = 0; i < index; i++) {
//			System.out.println(student[i].getName() + "/ ");
//		}
//		for(int i = 0; i < stdList.size(); i++) {
//			System.out.println(stdList.get(i).getName() + "/ ");
//			System.out.println(stdList.get(i).toString() + " / ");
//		}
	}
	
	public void checkPass() {
		for(Student student : stdList) {
			
			int score1 = student.getScore1();
			int score2 = student.getScore2();
			double avg = (score1 + score2) / 2;
			System.out.println(student.getName() + " 학생의 재평가 여부는");
			if(avg >= 60) {
				if(score1 < 40) {
					System.out.println("1차 시험 재평가 ㅇㅇ..");
				}else if(score2 < 40) {
					System.out.println("2차 시험 재평가 ㅇㅇ..");
				}else {
					System.out.println("통과 !! ㅊㅊ");
				}
			}else {
				if(score1 < 60) {
					System.out.println("1차 시험 재평가 ㅇㅇ..");
				}
				if(score2 < 60) {
					System.out.println("2차 시험 재평가 ㅇㅇ..");
				}
			}
		}
	}

	public void searchInfoByName() {
		System.out.println("학생 정보 이름 검색");
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		for(Student std : stdList) {
			if(std.getName().equals(searchName)) {
				System.out.println(std.toString());
				break;
			}
		}
		
	}
}
