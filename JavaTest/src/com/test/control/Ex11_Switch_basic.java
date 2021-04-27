package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex11_Switch_basic {
	public static void main(String[] args) throws Exception {
		/*
		 
		 
		 조건문 
		 1. if
		 2. switch



		switch(조건값) {
		
			case 값:
				실행문;
				break; 
			[case 값:
				실행문;
				break;] x N
			[default 값:
				실행문;
				break;]
	
		
		}
		 */
		
		
		//m1();
		//m2();
		//m3();
		// m4();
		//m5();
		m6();
	} //main

	private static void m6() {
		//쇼핑몰
		//1. 카메라 + 메모리 카드 + 삼각대 
		//2. 카메라 + 메모리 카드 
		//3. 카메라 
		
		int input = 1;
		
		switch(input) {
			case 1:
				//System.out.println("카메라");
				//System.out.println("메모리 카드");
				System.out.println("삼각대");
				//break;
			case 2:
				//System.out.println("카메라");
				System.out.println("메모리 카드");
				//break;
			case 3:
				System.out.println("카메라");
				break;
		}
		
	}

	private static void m5() {
		//switch 조건
		// - 숫자(정수), 문자열, 열거형만 가능하다.
		// - 범위 비교 or 논리 비교 -> 사용 안함 
		
//		int age = 25; 
//		switch(age) {
//			case age>=19: 
//		}
		
		
		
//		boolean b =true;
//		switch(b) {
//			case true:
//				System.out.println("참");
//				break;
//			case false:
//				System.out.println("거짓");
////				break;
//		}
//		double d = 3.4;
//		switch(d) {
//			case 3.4:
//				System.out.println("A");
//			case 5.8:
//				System.out.println("B");
//				break;
//		}
//		
	}

	private static void m4() {
		//사용자 입력: 월 -> 해당월의 마지막 날짜?
		int month = 5;
		int lastDay = 0;
		
		if(month == 1 || month == 3 || month ==5 || month == 7|| month == 8 || month==10
				|| month == 10|| month ==12) {
			lastDay = 31;
			
		} else if(month == 4 || month == 6|| month ==9|| month ==11) {
			lastDay = 30;
		} else {
			// 윤년 계산 
			//lastDay = 29;
			lastDay = 28;
		}
		
		System.out.println(lastDay);
		
		switch(month) {
		
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastDay = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				lastDay = 30;
				break;
			case 2:
				lastDay = 28;
				break;
			
		
		}
		
	}

	private static void m3() throws Exception {
		//자판기
		// - 메뉴 출력 > 음료 선택 > 가격 출력 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("==============");
		System.out.println("자판기");
		System.out.println("==============");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 비타500");
		System.out.print("선택(메뉴번호): ");
		
		String input =reader.readLine();
		
		switch(input) {
			case "1": 
				System.out.println("700원입니다.");
				break;
			case "2":
				System.out.println("600원입니다.");
				break;
			case "3":
				System.out.println("500원입니다.");
				break;
			
		}
		
	}

	private static void m2() {
		
		String color = "검정"; // 사용자 선택
		
		//재고있는 색상 > 판매 
		switch(color) {
		
			case "빨강":
				System.out.println("주문 완료");
				break;
			case "파란":
				System.out.println("주문 완료");
				break;
			case "노랑":
				System.out.println("주문 완료");
				break;
			default: // 기타 등등(else 절)
				System.out.println("취급하지 않는 색상입니다.");
				break;
				
		}
		
		
	}

	private static void m1() {
		// 사용자입력 : 숫자 1개 -> 한글 출력 
		//1 -> "하나"
		//2 -> "둘"
		//3 -> "셋"
		
		int num =2;
		
		
		switch(num) {
			case 1: //Label, 표지판
				System.out.println("하나");
				break; // 기생해서 사용이 됑~
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
			
		}
		// break 이곳으로 이동, 하던일을 멈춰라~
		// default else 느낌
		
		
		
		
	}

}
