package com.test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex44_File_IO {
	public static void main(String[] args) throws Exception {

		// Ex44_File_IO .java
		/*
		  
		  파일 입출력 
		  		- 자바 프로그램 <-> (데이터) <-> 외부 공간(HDD,SDD) 
		  		- 콘솔 입출력 방식과 유사
		  
		  
		  1. 텍스트 입출력(수업) 
		  		- 문자(열) 읽기/쓰기 
		  		- 메모장 등 
		  		- "ABC" -> (변환) <->  100101001001001001110
		  
		  2. 바이너리 입출력 
		  		- 바이너리 데이터(이진 데이터) 읽기/쓰기
		  		 - 비텍스트 데이터, 이미지, 동영상, 음악 파일, 압축 파일, 실행  파일 등.. 
		  		 - 음악 파일.mp3 <-> (변환) ->01001110110100100100100101001010
		  
		  "ABC" <-> (변환) <-> 100101001001001001110
		 
		  인코딩, Encoding 
		  		- 문자 코드를 부호화(0,1)하는 작업 - 내보내기(쓰기)
		  
		  디코딩, Decoding 
		  		- 부호 데이터를 문자 코드로 변환하는 작업(복호화) - 가져오기(읽기)
		  
		  인코딩/디코딩 규칙 1. ISO-8859-1 2. EUC-KR 3. ANSI 4. UTF-8 5. UTF-16 6. MS949
		  
		  <외우기♥>
		  
		  ANSI(ISO-8859-1, EUC-KR, MS949) 1. 영어 : 1byte 2. 한글 : 2byte
		  
		  
		  UTF-8 (공식적인 인코딩 방식) 1. 영어 : 1byte 2. 한글 : 3byte
		 
		  UTF-16 1. 영어 : 2byte 2. 한글 : 2byte
		  
		  
		 */

		//m1();
		// m2();
		 m3();
		// m4();
		// m5();
		//m6();
		// m7();
		// m8();
		// m9();
		// m10();

	} // main

	private static void m10() throws Exception {

		// 기록은 자동으로 만들어줌
		// 스트림 특징: 읽기 작업 > 한번 읽은 내용을 다시 읽을 수 없다. > 다시 읽을 수 있게끔 수정하기
		File file = new File("C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\JavaTest\\src\\com\\test\\io\\color.txt");
		// 파일의 내용 -> 배열 복사 : 라인 단위
		// 순수배열 < 컬렉션 선택 => 라인수를 예측 할 수 없어서
		// 소량의 데이터 읽때
		if (file.exists()) {

			ArrayList<String> list = new ArrayList<String>();// 임시 저장(파일 대신)

			BufferedReader reader = new BufferedReader(new FileReader(file));

			// 파일 -> 컬렉션
			String line = null;

			while ((line = reader.readLine()) != null) {
				list.add(line);// *****

			}

			reader.close();

			System.out.println(list.size() + "줄");

			// 옮겨놓고 작업을 함
			// 메모리상에 있는 걸 읽은거임, 단점: 메모리가 증가함
			for (String color : list) {
				System.out.println(color);
			}

			for (String color : list) {
				System.out.println(color);
			}

		} else {
			System.out.println("파일 없음");
		}

	}

	private static void m9() throws Exception {

		// 기록은 자동으로 만들어줌
		// 스트림 특징: 읽기 작업 > 한번 읽은 내용을 다시 읽을 수 없다.
		File file = new File("C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\JavaTest\\src\\com\\test\\io\\color.txt");

		if (file.exists()) {

			BufferedReader reader = new BufferedReader(new FileReader(file));
			String color = reader.readLine();
			System.out.println(color);

			color = reader.readLine();
			System.out.println(color);

			color = reader.readLine();
			System.out.println(color);

			// 이전 내용을 다시 읽을려면? > 스트림을 다시 열어야 한다. > 비용 비싸다.
			reader = new BufferedReader(new FileReader(file));

			color = reader.readLine();
			System.out.println(color);

			reader.close();

		} else {
			System.out.println("파일 없음");
		}

	}

	private static void m8() throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader(
				"C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\JavaTest\\src\\com\\test\\io\\Ex42_File_basic.java"));

		String line = null;
		int num = 1;

		while ((line = reader.readLine()) != null) {
			System.out.printf("%3d: %s\r\n", num, line);
			num++;
		}
		reader.close();

	}

	private static void m7() throws Exception {

		// 전용툴
		// FileOutputStream, FileInputStream : 파일 입출력
		// FileWriter, FileReader : 파일 입출력

		// 추상 클래스
		// BufferedWriter, BufferedReader : 범용 입출력(파일, 키보드, 메모리, 네트워크 등..) 만능 툴

		// 읽기(***)
		// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// // 키보드 입력과 관련된 것

		BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\JavaTest\\src\\com\\test\\io\\data3.txt")); // 파일
																													// 읽기
																													// 추상화

		String line = reader.readLine(); // 키보드 입력 -> 텍스트파일 내용
		System.out.println(line);

		line = reader.readLine();
		System.out.println(line);

		line = reader.readLine();
		System.out.println(line);

		line = reader.readLine();
		System.out.println(line); // 읽을게 없으면 null을 반환함

		reader.close();

	}

	private static void m6() throws Exception {

		// 쓰기(BufferedReader의 짝꿍)
		BufferedWriter writer = new BufferedWriter(
				new FileWriter("C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\JavaTest\\src\\com\\test\\io\\data3.txt"));

		writer.write("문자열입니다.");
		writer.write("홍길동입니다.");
		writer.newLine();
		writer.write("\r\n");
		writer.write("안녕~");

		writer.close();

		System.out.println("완료");

	}

	private static void m5() throws Exception {

		// FileOutputStream
		// FileInputStream

		// 쓰는데는 지장이 없음
		// 쓰기
		// - FileWriter : 문자 단위 쓰기
		// 읽기
		// - FileReader : 문자 단위 읽기

		FileReader reader = new FileReader(
				"C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\JavaTest\\src\\com\\test\\io\\할일.txt");

		int code = reader.read();
		System.out.println((char) code);

		code = -1;

		while ((code = reader.read()) != -1) {
			System.out.print((char) code);
		}

		reader.close(); // 한글이 안깨짐

	}

	private static void m4() throws Exception {

		// 콘솔 입력 -> 파일 출력
		Scanner scan = new Scanner(System.in); // 입력 도구

		System.out.print("파일명:");
		String filename = scan.nextLine();

		FileWriter writer = new FileWriter(
				"C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\JavaTest\\src\\com\\test\\io\\" + filename);

		while (true) {

			String line = scan.nextLine(); // 입력
			if (line.equals("q")) {
				break;
			}
			writer.write(line + "\r\n"); // 출력(쓰기)

		}

		writer.close();
		scan.close();

		System.out.println("파일 저장 완료");
	}

	private static void m3() throws Exception {

		// 쓰기
		// - 문자 단위 쓰기(2byte)
		// - 모든 문자를 쓰기가 가능하다.(한글 포함)
		// - FileOutputStream > FileWriter

		FileWriter writer = new FileWriter(
				"C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\JavaTest\\src\\com\\test\\io\\data.txt");

		writer.write(65);
		writer.write("A");

		writer.write("ABCDEF");
		writer.write("홍길동");
		writer.close();

		// 스트림 닫으면 입출력이 불가능하다. > 스트림 다시 열어야 한다.
		writer = new FileWriter("C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\JavaTest\\src\\com\\test\\io\\data.txt");

		writer.write("아무개"); // java.io.IOException: Stream closed

		writer.close(); // close를 안하면 저장이 안돼

		System.out.println("완료");

	}

	private static void m2() throws Exception {

		// 읽기
		// - 바이트 단위 읽기
		// - System.in.read() 유사

		// 읽기 전용 스트림 객체 생성하기
		File file = new File("C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\JavaTest\\src\\com\\test\\io\\data.txt");
		FileInputStream stream = new FileInputStream(file);

//		int code = stream.read(); 
//		System.out.println(code);
//		
//		code = stream.read(); 
//		System.out.println(code);
//		
//		code = stream.read(); 
//		System.out.println(code);

		// 읽기 스트림 도구 stream.read() 메소드 > 더 이상 읽을게 없으면 -1 반환, 숫자 중의 하나로 반환해줘야 돼서
		int code = -1;
		// 한글을 못읽어 1바이트씩 끊어서 읽어서임
		while ((code = stream.read()) != -1) {
			System.out.print((char) code);
		}
		stream.close();
	}

	private static void m1() throws Exception {

		// 쓰기
		// - 바이트 단위 쓰기
		// - 1바이트씩 저장 > 2바이트 문자 저장 불가능 > ASCII문자 저장(영어,숫자,특수문자)

		// 파일에 데이터 저장하기
		// 1. 스트림 객체 생성하기(열기)
		// 2. 스트림 객체 사용하기
		// 3. 스트림 객체 닫기(필수)

		// FileOutputStream
		// - 쓰기 전용 스트림
		// - 스트림 열기 모드
		// a. 생성 모드, Create Mode
		// - 기본 방식
		// - 파일이 없으면 새로 만든다.
		// - 무조건 덮어쓰기를 한다.
		// b. 추가 모드, Append Mode
		// - 선택 방식
		// - 파일이 없으면 새로 만든다.

		// 1.
		File file = new File("C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\JavaTest\\src\\com\\test\\io\\data.txt");
		FileOutputStream stream = new FileOutputStream(file, true); // 파일 출력 스트림, file에 쓸수 있도록 해주는 도구

		// 2.
		stream.write(65);
		stream.write(66);
		stream.write(67);

		stream.write('\r'); // 'a' > 95 , 자동 형변환이 돼
		stream.write('\n');

		stream.write('J');
		stream.write('a');
		stream.write('v');
		stream.write('a');

		stream.write('\r');
		stream.write('\n');

		String str = "Hello~ Hong 홍길동";

		for (int i = 0; i < str.length(); i++) {
			stream.write(str.charAt(i));
		}

		// 3.
		stream.close();

		System.out.println("완료");

	}

}
