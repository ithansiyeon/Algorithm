package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For_use_01 {
	public static void main(String[] args) throws Exception {
		
		//m1();
		//m2();
		m3();
		//m4();
		m5();
		
	}
	private static void m5() {
		
		//제어문(반복문) + break + continue 
		//1. break(전체 중단)
		// - 자신이 속한 제어문을 탈출한다.(if문 제외)
		//2. continue(회차만 종료시킴,일시 중단)
		// - 자신이 속한 제어문의 처음으로 돌아간다.(if문 제외)
		
		for(int i=1;i<=10; i++) {
			if(i==5) { 
			//break;
			continue; // 5가 출력이 안됨, 하던일을 멈추고 증가문으로 감 i++ 
			}
			
			System.out.println(i);
		}
		
		//선생님 + 학생 상담(30명)
		for(int i=1;i<=30;i++) {
			//반복 흐름 제어
//			if(i == 15) { // 아예 for문을 나감 
//				break;
//			}
			if(i == 15 || i==17 || i==25) { //15번 학생 결석, 특정 패턴에만 예외를 두자 
				continue;
			}
			System.out.printf("선생님이 %d번 학생을 상담 중..\n",i);
		}
		
		
		
	}
	private static void m4() throws Exception {
		//요구사항] 사용자에게 숫자를 10개를 입력받아 그 수들의 합을 구하시오.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sum =0; //누적변수 
		
		for(int i=1;i<=10;i++) {
			//int sum =0; 뺑뺑이 돌면서 다시 0으로 초기값을 같게 됨
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			sum+=num;
			
		}
		
		System.out.println(sum);
		
		
	}
	private static void m3() {
		
		//Loop -> 누적 
		//1 ~ 10까지의 합을 구하시오.
		//1+2+3+4+..+9+10 = 55
		
		//무언가의 누적값을 구해야한다.
		//1. 누적값을 저장할 변수를 만든다. 누적변수
		int sum = 0;
		
		//2.누적시킬 수들을 열을 반복문을 통해 만든다. -> 수열 생서 a
		//1,2,3,4,5...,9,10 -> for문의 i값
		
		for(int i=0;i<=100;i+=7) { // i값을 어떻게 control 하는지가 중요해 
			System.out.println(i);
			sum +=i;
			}
		System.out.println(sum); //0부터 100 사이의 7의 배수의 합
		
	}
	
	private static void m2() {
		int a =10; //지역변수(m2)
		if(a>0) {
			int b =20; //지역변수(if)
		}
		
		for(int i=1;i<=5;i++) { //지역변수(for) ,for문을 빠져나가는 순간 죽어, 생명주기가 조금 더 길어진 특이한 case *******
			int c = 30; //지역변수(for), 5번 태어났다가 5번 죽어
			
		}
//		System.out.println(i); 
//		System.out.println(c);
		
	}
	private static void m1() {
		//구구단 출력
		//- 3단 
		// 5 x 1 = 5
		// 5 x 2 = 10
		//..
		// 5 x 9 = 45
		int dan = 9;
		for(int i=1;i<=9;i++) {
			System.out.printf("%d x %d = %2d\n",
								dan,i,dan*i);
		}
		
		
		
	}
}
