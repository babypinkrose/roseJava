package com.kh.day13.student.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.day12.music.model.vo.Music;
import com.kh.day13.student.model.vo.Student;



public class StudentController {

	List<Student> stdList;
	
	public StudentController() {
		stdList = new ArrayList<Student>();
	}
	
	/** 학생 전체 정보 출력
	 * 
	 * @return mList
	 */
	public List<Student> printStudentList() {
		return stdList;
	}
	
	/**
	 * 학생 정보 입력
	 * @param student
	 */
	public void inputStudentInfo(Student student) {
		stdList.add(student);
	}
	
	/** 학생 정보 이름검색
	 * @return
	 */
	public List<Student> searchInfoByName(String name) {
		// 찾은 학생을 담을 리스트
		List<Student> findList = new ArrayList<Student>();
		// 기존 학생이 있는 sList에서 찾기
		for(Student stdOne : stdList) {
			// 입력한 이름이 같으면
			if(stdOne.getName().equals(name)) {
				// findList에 추가하기
				findList.add(stdOne);
			}
		}
		return findList;
	}
	
	

	
	public void printInfo() {
		System.out.println("학생 정보 전체 출력");
		for(Student student : stdList) {
			System.out.println(student.toString());
		}
	}
	
}
