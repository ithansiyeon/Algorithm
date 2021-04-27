package com.test.control;

public class Ex13_While_basic {
	public static void main(String[] args) {
		//Ex13_While_basic.java
		m1();
		//m2();		
		
	} //main
	
	

	private static void m2() {
		
		/*
		
		 do while문
		
		while문 -> 선조건, 후실행 // 조건을 검사한 뒤에 나중에 실행할 지 결정
		do while 문 -> 선실행, 후조건 : 조건 불만족 최소 1회 실행 
		
		
		do {
			실행코드;
		} while(조건); // 뒤에 몸통있는지 찾으니까 
		
		 
		 */
		
		int n =1; 
		
		do {
			System.out.println(n);
			n++;
		}	while(n<=10);
		
	}



	private static void m1() {
		/*
		 
		 while 문
		 - for문 유사
		 - 조건에 따라 반복 제어를 한다.
		 - 조건식을 만족하는 동안 반복을 한다.
		 
		 
		 while(조건식) {
			실행코드;
		} 
		// 안빠져나가고 다시 위로 올라가, if문을 여러개 쓰는 거라 생각하면 돼
		
		 
		 
		 if(조건식) {
			실행코드;
		}
		 
		 
		 숫자를 1~10까지 출력
		 
		 */
		
		//	 숫자를 1~10까지 출력
		for(int i=1;i<=10;i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		
		
		int num =1; //초기식
		
		//좀 더 자율적
		while(num<=10) { // 조건식 밖에 요구를 안해
			System.out.printf("%3d",num);
			num++; //증감식
			
		}
		System.out.println();
		
		
		//while문 연습 -> for문 예제 + 문제 
		
		//누적값 구하기
		//-누적값이 1000이 넘으면 Stop
		int sum=0;
		int i=1;
		
		for(i=1;;i++) {
			sum+=i; //주업무 
			
			if(sum>=1000) {
				break; //for문
			}
		
			
		}
		System.out.println(i);
		System.out.println(sum);
		
		sum=0;
		num=1;
		
		while(true) {
			sum+=num;
			num++;
			if(sum>=1000) {
				break;
			}
			
		}
		//System.out.println(num);
		System.out.println(sum);
		sum=0;
		num=1;
		
		//simple을 함
		while(sum<1000) { //sum이 1000을 넘어가면 break;
			sum+=num; 
			num++;
			
		}
		System.out.println(sum);
		
		sum=0;
		i=0;
		
		for(i=1;sum<1000;i++) {
			sum+=i;
		}
		
		System.out.println(sum);
		
		
	}//m1

	
	

	
	
	
}
