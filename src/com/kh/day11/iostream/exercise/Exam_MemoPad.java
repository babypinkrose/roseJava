package com.kh.day11.iostream.exercise;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {

	public static void main(String[] args) {
//		InputStream is = null;
//		OutputStream os = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 입력(확장자 제외) : ");
		String fileName = sc.nextLine();
		
		// 경로 입력 및 파일명으로 파일 생성
		Writer writer = null;
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/" + fileName + ".txt");
			System.out.println("종료는 exit");
			for(int i = 1; ; i++) {
				System.out.print(i + " : ");
				String input = sc.nextLine();
				writer.write(input+"\n");
				// exit를 입력하면 무한반복 빠져나오는 코드
				if(input.equals("exit")) break;
			}
			writer.flush();
			System.out.println("파일 저장이 완료되었습니다 F5를 눌러 확인해보세요~");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
	













