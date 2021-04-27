package com.test.io;

import java.io.File;
import java.util.Date;

public class Ex42_File_basic {
	public static void main(String[] args) {

		// 파일 정보 확인 -> 파일 조작
		// 디렉토리 정보 확인 -> 디렉토리 조작

		 m1();
		// m2();
		//m3();
		m4();
	}

	private static void m4() {
		
		//파일 삭제하기 
		
		String path = "C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\io\\AAA\\data.txt"; 

		File file = new File(path); // 원본 객체

		if (file.exists()) {

			boolean result = file.delete(); //해당 파일이 지워짐 
			
			System.out.println("파일명 삭제 완료");

		} else {

			System.out.println("파일 없음");
		}

		
		
	}

	private static void m3() {

		// 파일 이동하기
		// AAA > data.txt -> BBB
		String path = "C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\io\\AAA\\data.txt"; //아무개

		File file = new File(path); // 원본 객체

		if (file.exists()) {

			String path2 = "C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\io\\BBB\\hong.txt"; //폴더명만 바뀜 홍길동

			File file2 = new File(path2);

			boolean flag = file.renameTo(file2);
			
			System.out.println("파일명 수정 완료");

		} else {

			System.out.println("파일 없음");
		}

	}

	private static void m2() {

		// 파일 조작하기
		// - 생성(x), 복사(x), 이동, 파일명 수정, 삭제

		// - 파일 객체 참조 - > 조작

		// -io\AAA폴더 > hong.txt
		// -io\BBB폴더

		// 파일명 수정하기
		// hong.txt -> data.txt
		String path = "C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\io\\AAA\\hong.txt"; // 과거

		File file = new File(path); // 원본 객체

		if (file.exists()) {

			String path2 = "C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\io\\AAA\\data.txt"; // 미래

			File file2 = new File(path2);

			file.renameTo(file2);

			System.out.println("파일명 수정 완료");

		} else {

			System.out.println("파일 없음");
		}

	}

	private static void m1() {

		// 파일 접근 -> 정보 확인
		// 파일 참조 객체(클래스)

		String path = "C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\io\\test.txt";
		File file = new File(path); // 프로그램 외부의 작업을 건드려서 , 파일 위치 + 파일명
		// test.txt 맨 앞에는 무조건 .\가 생략되어 있는 상태,
		// 콘솔 cd.. 부모 폴더, cd. 본인

		// System.out.println(file.exists()); // 존재 유무를 돌려주는 메소드

		// 예외 처리
		if (file.exists()) {

			// 기억
			// 파일 정보 확인
			System.out.println(file.getName()); // test.txt 파일명
			System.out.println(file.isFile()); // true 파일이냐
			System.out.println(file.isDirectory()); // false 폴더냐?
			System.out.println(file.length()); // 16 크기(바이트)

			System.out.println(file.getAbsolutePath()); // 경로와 이름을 리턴 , 절대경로 루트부터 시작하는 경로
			System.out.println(file.getPath()); // 참조경로, path 글자를 그대로 리턴함
			// 절대경로: 최상위 디렉토리가 반드시 포함된 경로, 상대경로: 현재의 위치에서 해당 파일까지 접근하기 위해 거쳐야되는 경로
			// ---------------------------------------------------------------------------------

			System.out.println(file.lastModified()); // 1588896354920, 틱값 마지막으로 언제 수정했는지 시간
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.isHidden());

			Date date = new Date(file.lastModified());
			System.out.printf("%tF %tT\n", date, date);

		} else {
			System.out.println("파일이 없습니다.");
		}

	}

}
