package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For_use_02 {
	public static void main(String[] args)  throws Exception {
		//Ex12_For_use_02.java
		m1();
		//m2();
		//m3();
		
		
	}

	private static void m3() {
		//난수 생성
		// - 임의의 수(data)
		// - 임의의 숫자
		
		//Math 클래스 - 범용
		//Random 클래스 - 자바 기반
		
		//난수 생성기 메소드
		//- 0(포함)~1(미포함) 사이의 실수 반환
		//System.out.println(Math.random());
		
		//1~10
		double num = Math.random();
		System.out.println(num);
		System.out.println(num*10);
		System.out.println((int)(num*10));
		System.out.println((int)(num*10)+1); // 1~10 사의 난수
		System.out.println();
		//3~7 사이의 난수
		num = Math.random();
		System.out.println(num);
		System.out.println(num*10);
		System.out.println((int)(num*5)); //0 ~ 4 사이의 수가 생성이 돼
		System.out.println((int)(num*5)+3); // 3 ~ 7 ******
		
		//0.1 -> 0.5
		//0.5 -> 2.5
		//0.9 -> 4.5
		
	}

	private static void m2() throws Exception {
		//프로그램 시작 -> (메뉴 출력 -> 메뉴 선택 -> 선택 기능 실행 -> 마침) x 반복 -> 프로그램 종료

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("프로그램 시작");
		boolean loop = true;
		
		for(;loop;) {
				System.out.println("==============");
				System.out.println("메뉴");
				System.out.println("1. 쓰기");
				System.out.println("2. 읽기");
				System.out.println("3. 종료");
				System.out.println("==============");
				System.out.print("선택:");
				String input = reader.readLine();
				if(input.equals("1")) {
					//쓰기
					write();
				}
				else if(input.equals("2")) {
					//읽기
					read();
				}
				else {
					//종료
					loop = false;
					
				} //if
			
			}//for문
		
		
		
		System.out.println("프로그램 종료");
	}

	private static void read() throws Exception {
		System.out.println("읽기 작업...");
		pause();
		
	}

	private static void write() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("쓰기 작업...");
		pause();
		
	}

	private static void pause() throws Exception {
		// TODO Auto-generated method stub
		//잠시 멈춤
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("계속하시려면 [엔터]를 입력하세요.");
		reader.readLine();
		
	}

	private static void m1() {
		//무한 루프 > 21억(underflow가 일어나는 순간 부호가 바뀌어서 엄청 큰 양수)
//		for(int i=0;i<=10;i--) {
//			System.out.println(i);
//		}
		
		//인위적인 무한 루프
//		for(;;) { 	
//			System.out.println(System.currentTimeMillis()); //tick값
			
//		} 
		
//		for(int i=2135000000; true; i++) {
//			System.out.println(i);
//		}
		
//		for(int i=2145000000;;i++) { //true라고 생각함
//			System.out.println(i);
//		}
		
		
		
	}

}
