package com.kh.day13.student.run;

import java.util.List;
import java.util.Scanner;

import com.kh.day13.student.controller.StudentController;
import com.kh.day13.student.model.vo.Student;
import com.kh.day13.student.view.StudentView;

public class Run {

	public static void main(String[] args) {
		StudentView view = new StudentView();
		StudentController sController = new StudentController();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Student student = null;
		String name = "";
		int index = 0;
		
		do {
//			System.out.println("학생 성적 관리 프로그램");
//			System.out.println("1. 학생 정보 입력");
//			System.out.println("2. 학생 정보 이름 검색");
//			System.out.println("3. 학생 정보 전체 출력");
//			System.out.println("4. 재평가 대상여부 확인");
//			System.out.println("5. 프로그램 종료");
//			System.out.println(" 선택 : ");
			choice = view.printMenu();
			switch(choice) {
			case 1 : 
				student = view.inputInfo();
				sController.inputStudentInfo(student);
				view.displaySuccess("학생 정보 입력 성공!");
				break;
			case 2 : 
				name = view.searchInfoByName("검색");
				List<Student> findList = sController.searchInfoByName(name); 
				view.showAllStudentList(findList);
				view.displaySuccess(name + " 학생 정보 검색 성공!\n");
				break;
			case 3 : 
				List<Student> stdList = sController.printStudentList(); 
				view.showAllStudentList(stdList);
				view.displaySuccess("학생 정보 전체 출력 성공!\n");
				break;
//			case 4 : view.checkPass(); break;
			case 5 : System.out.println("프로그램이 종료되었습니다."); break;
			}
		
		}while(choice != 0);
	}
}
