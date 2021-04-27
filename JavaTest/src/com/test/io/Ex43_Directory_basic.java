package com.test.io;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class Ex43_Directory_basic {

	private static int count = 0;

	public static void main(String[] args) {

		// Ex43_Directory_basic.java

		 m1();
		// m2();
		// m3();
		// m4();
		//m5();
		// m6(); //*****
		// m7(); //*****
		// m8();
	}

	private static void m8() {

		// 정렬
		// C:\Users\PC\OneDrive\바탕 화면\java\JavaTest\src\com\test\object
		// 파일 목록 출력하기
		String path = "C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\JavaTest\\src\\com\\test\\object";

		File dir = new File(path);
		File[] list = dir.listFiles(); // 파일명을 기준으로 정렬해서 가져옴

		// 정렬 : 이름 -> 크기
		// 정렬 알고리즘
		// - 버블 정렬 vs 퀵 정렬
		// 버블 큰 숫자가 맨 끝으로 감

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length - i - 1; j++) {
				if (list[j].length() > list[j + 1].length()) { // 정렬은 부등호의 기준으로 바뀜 > 오름차순, < 내림차순
					File temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;

				}

			}
		}

		for (File file : list) {
			if (file.isFile()) {
				System.out.printf("[%5dB] %s\n", file.length(), file.getName());

			}

		}

	}

	private static void m7() {

		// *****************************
		// m6() -> 재귀 호출 구조로 변경

		String path = "C:\\Users\\PC\\eclipse\\jee-2020-03\\eclipse";

		File dir = new File(path);

		if (dir.exists()) {

			countFile(dir);

		}

		System.out.printf("총 파일 개수 : %d", count);

	}

	private static void countFile(File dir) {
		// 1. 자식 목록 가져오기
		File[] list = dir.listFiles();

		// 2. 파일 개수 세기
		for (File sub : list) {
			if (sub.isFile()) { // isDirectory이면 폴더의 개수를 셈
				count++; // count+=sub.length() eclipse 크기를 구할 수 있어
			}

		}
		// 3. 자식 폴더를 대상으로 본인이 했던 행동을 다시하기

		for (File sub : list) {
			if (sub.isDirectory()) {
				// 똑같은 행동을 반복
				countFile(sub); // 재귀 호출
			}
		}
	}

	private static void m6() {

		// 특정 폴더 -> 파일 개수 ?
		String path = "C:\\Users\\PC\\eclipse\\jee-2020-03\\eclipse";
		File dir = new File(path);

		if (dir.exists()) {

			int count = 0; // 누적 변수

			File[] list = dir.listFiles(); // 이클립스의 자식

			for (File sub : list) {
				if (sub.isFile()) {
					count++;
				}
			} // 파일 개수

			// 자식 폴더로 이동
			for (File sub : list) {
				if (sub.isDirectory()) {
					File[] sublist = sub.listFiles(); // 이클립스의 손자들, 폴더의 폴더안에 있는 파일들

					for (File subsub : sublist) {
						if (subsub.isFile()) {
							count++;
						}
					}

					for (File subsub : sublist) {
						if (subsub.isDirectory()) {
							File[] subsublist = subsub.listFiles(); // 이클립스의 증손자들
							for (File subsubsub : subsublist) {
								if (subsubsub.isFile()) {
									count++;
								}
							}
						}
					}
				}
			}

		}

	}

	private static void m5() {
		// 디렉토리 내용 보기(*****)
		// - 자식 파일 + 자식 디렉토리
		String path = "C:\\Users\\PC\\eclipse\\jee-2020-03\\eclipse";
		File dir = new File(path);

		if (dir.exists()) {
			// Returns an array of strings naming the files and directories in the directory
			// denoted by this abstract pathname.
			// 디렉토리의 파일과 디렉토리를 명명하는 문자열 배열을 반환합니다. 이 추상 경로 이름으로 표시됩니다.
			// String[] list = dir.list(); // 자식의 이름을 반환
//			for(String name : list) {
//				System.out.println(name); // dir의 자식 이름이 출력 됨
//				File file = new File(path + "\\" + name);
//				System.out.println(file.length());
//			}

			File[] list = dir.listFiles(); // file 배열을 리턴함, 자식들 객체를 반환해 줌, 주로 사용
//			for(File file : list) {
//				System.out.println(file.getName());
//				//System.out.println(file.isFile()); // 폴더?파일?
//				if(file.isFile()) {
//					System.out.println(file.length());
//					
//				}
//			}

			for (File sub : list) {

				if (sub.isDirectory()) {
					System.out.printf("[%s]\t", sub.getName());
					System.out.print("\t");
					System.out.print("파일폴더\t");
					Date date = new Date(sub.lastModified());
					System.out.printf("%tF %tT\n", date, date);
				}

			}

			for (File sub : list) {

				if (sub.isFile()) {
					System.out.print(sub.getName() + "\t");
					System.out.printf("%,dKB\t", sub.length() / 1024);
					System.out.print("파일\t");
					Date date = new Date(sub.lastModified());
					System.out.printf("%tF %tT\n", date, date);

				}

			}

		}

	}

	private static void m4() {

		// 디렉토리 삭제
		// - 빈폴더만 삭제 가능하다.
		// - 내용물을 직접 지우면 폴더를 삭제할 수 있다. -> 해당 폴더내의 모든 파일 삭제 후 폴더를 빈폴더로 만들고 폴더를 삭제 x 반복
		String path = "C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\io\\GGG";
		File dir = new File(path);

		if (dir.exists()) {

			System.out.println(dir.delete());

		} else {
			System.out.println("없음");
		}

	}

	private static void m3() {

		// 디렉토리명 바꾸기 & 이동하기
		String path = "C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\io\\BBB";
		File dir = new File(path);

		if (dir.exists()) {

			String path2 = "C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\io\\GGG\\BBB";
			File dir2 = new File(path2);

			dir.renameTo(dir2);

			System.out.println("디렉토리 이름 바꾸기");

		}

	}

	private static void m2() {

		// 디렉토리 조작
		// - 생성, 이름 바꾸기, 이동하기, 삭제하기, 복사하기(X)

		// 새 폴더 만들기
		// String path = "C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\io\\CCC"; //희망 경로
		String path = "C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\io\\DDD\\EEE\\FFF"; // 할아버지 폴더, 아버지 폴더가 없어서 에러가 떠
		File dir = new File(path);

		// boolean result = dir.mkdir(); // 마지막 목적 폴더만 만들어줘
		boolean result = dir.mkdirs(); // 존재하지 않는 모든 경로를 만들어줘

		if (result) {
			System.out.println("폴더 생성 성공");
		} else {
			System.out.println("폴더 생성 실패"); // 같은 폴더가 있으면 안만들어줌
		}

		// 요구사항] 회원 -> 회원별 개인 폴더 작성하기
		String[] member = { "아무개", "홍길동", "하하하", "호호호", "후후후" };

		for (String name : member) {

			// 폴더 생성
			path = String.format("C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\io\\AAA\\[개인폴더]%s님", name);
			dir = new File(path);
			dir.mkdir();

			System.out.printf("%s님의 개인폴더를 생성했습니다.\n", name);

		}

		// 요구 사항] 날짜별 폴더 생성하기
		// - 2020-01-01 ~ 2020-12-31 : 366개
		// - Calendar 사용

		Calendar c = Calendar.getInstance();

		c.set(2020, 0, 1);

//		System.out.println(c.get(Calendar.DAY_OF_YEAR)); //올해 들어 오늘이 몇일인지?
//		System.out.println(c.get(Calendar.DAY_OF_MONTH)); 
//		System.out.println(c.getMaximum(Calendar.DAY_OF_YEAR)); // 한해중에 가장 큰 숫자를 반환 
//		System.out.println(c.getMaximum(Calendar.DAY_OF_MONTH)); // 이번달의 마지막 날짜가 언제인지 반환됨 

		for (int i = 0; i < c.getMaximum(Calendar.DAY_OF_YEAR); i++) {

			path = String.format("C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\io\\BBB\\%tF", c);
			dir = new File(path);
			dir.mkdir();

			System.out.printf("%tF\n", c);
			c.add(Calendar.DATE, 1);
		}

	}

	private static void m1() {

		// 디렉토리 정보 확인
		// - 디렉토리 참조 객체 -> 정보 or 조작

		// 디렉토리 참조 객체
		String path = "C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\io\\AAA";

		File dir = new File(path);

		if (dir.exists()) {
			// 디렉토리 정보
			System.out.println(dir.getName()); // AAA, 폴더명
			System.out.println(dir.isFile()); // false
			System.out.println(dir.isDirectory()); // true
			System.out.println(dir.length()); // length가 0이 나옴, 폴더 자신의 크기를 물어보는 거임

			System.out.println(dir.getAbsolutePath());
			System.out.println(dir.getPath());

			System.out.println(dir.getParent()); // 부모 폴더 경로 반환
			System.out.println(dir.getParentFile()); // 부모 폴더 참조 객체 반환

		} else {
			System.out.println("디렉토리 없음.");
		}

		// 폴더 객체에 이름을 적어 AAA
		// 폴더는 사이즈가 0인 파일
		// getParent() : 부모 경로에 대한 경로명을 문자열로 넘겨줌
		// getParentFile() : 부모 폴더를 File의 형태로 리턴함 
	}

}
