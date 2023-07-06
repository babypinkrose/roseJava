package com.kh.day09.javaapi;

public class Exam_String {

	public static void main(String[] args) {
		String msg = "Hello Java";
		msg = new String("Hello Java"); // 내용은 같으나 주소가 달라짐
		// 내용비교 equals를 이용하여 값을 비교해야 함!
		
		String data1 = new String(" C#");
		String data2 = new String(",C++ ");
		System.out.println(data1 + "의 길이는 " + data1.length());
		System.out.println(data2 + "의 길이는 " + data2.length());
		
		// 문자열 포함
		System.out.println("#이 있는가? : " + data1.contains("#"));
		
		// 문자열 연결
		// data1이 문자열이여야 쓸 수 있다(String)
		data1 = data1.concat(data2); // ( C#,C++ )
		System.out.println("연결된 문자열 : " + data1);
		
		// 공백제거
		data1 = data1.trim();
		System.out.println("공백 제거 확인 : " + data1);
		
		// 문자열 교체
		data1 = data1.replace("C#", "Java");
		System.out.println("문자열 교체 : " + data1);
		
		// 문자열 분리
		System.out.println("문자열 분리 : ");
		String [] words = data1.split(",");
		for(int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " / ");
			System.out.println();
		}
//		System.out.println("문자열 분리 : " + words[0]);
//		System.out.println("문자열 분리 : " + words[1]);
		
		// 문자열 자르기
		// Java,C++
//		data1 = data1.substring(5);
//		System.out.println("문자열 자르기 : " + data1);
		data1 = data1.substring(0, 4);
		System.out.println("범위 자르기 : " + data1);
		// 1자리 수만 쓰면 해당글자부터 ~뒤로 자르고
		// 2자리 수를 쓰면 0이 첫글자고 두번째 숫자 -1만큼 자름
		
		
		// 문자 자르기(From String)
		char word = data1.charAt(0);
		System.out.println("문자 자르기 : " + word);
	}

}
















