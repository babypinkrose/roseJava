package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
		Reader reader = null;
		// cannot instantiate the type Reader
		
		
		
		
		try {
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			while(true) {
				int readData = reader.read();
				if(readData == -1) break; 
				// Unhandled exception type IOException
				// 이런것들을 Checked Exception이라고 한다
				System.out.print((char)readData);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Unhandled exception type FileNotFoundException
		// FileNotFoundException가 일어날 수 있기때문에 
		// new FileReader(""); 사용하고 싶으면 try/catch로 감싸줘!
		catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				//Unhandled exception type IOException
				// 트라이캐치 해줘야됨
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
