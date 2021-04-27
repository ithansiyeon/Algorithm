package com.test.control;

public class Ex12_For_basic {
	public static void main(String[] args) {
		/*
		 
		
		 
		 반목문, Loop  
		 - 실행 블럭내의 코드를 원하는 횟수만큼 반복 실행하는 제어
		 
		 
		 for문 
		 
		 for(초기식;조건식;증감식) {
		 	실행 코드;
		 }
		 
		 
		 */
		//m1();
		//m2();
		m3();
	} //main

	private static void m3() {
		// TODO Auto-generated method stub
		//중첩된 for문 
		//-2중 for문(여기까지)
		//-3중 for문
//		for(int k=0;k<3;k++) {
//		for(int j=0;j<3;j++) {
//			for(int i=0;i<3;i++) {
//				System.out.println(i); //x 9회 x27회
//			}
//			System.out.println();
//		}
//	}
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<10;j++) {
//				System.out.printf("i: %d,j: %d\n",i,j);
//			}
//		}
		for(int i=0;i<12;i++) { //시
			for(int j=0;j<60;j++) { //분
				System.out.printf("i: %d,j: %d\n",i,j);
			}
		}
	}

	private static void m2() {
		//루프 변수
		//1. 반복 횟수 제어
		//2. 루프 변수의 값 제어(*************)
		
		
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//		}
		
//		for(int i=11;i<=20;i++) {
//			System.out.println(i); //i가 중요 
//		}
		
//		for(int i=10;i>0;i--) {
//			System.out.println(i); //i가 중요 
//		}
		
//		for(int i=1;i<=10;i+=2) {
//			System.out.println(i); //i가 중요 
//		}
//		for(int i=2;i<=10;i+=2) {
//			System.out.println(i); //i가 중요 
//		}
		
		for(int i=1;i<=10;i++) {
			System.out.println(i); // 읽기
			i++; //쓰기(수정), 비권장
			
		}
	}

	private static void m1() {
		//i : 지역 변수
		//i : 루프 변수(반복에 관련된 업무)
		for(int i=1;i<5;i++) {
			System.out.println("안녕하세요.");
		
		}
		//System.out.println(i);
	}
}
