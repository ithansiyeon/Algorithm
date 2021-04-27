package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For_question_06 {
	public static void main(String[] args) throws Exception {
		//m1();
		//2. 누적 변수를 생성한다.
		//1. 루프를 생성한다.(for x 10회 **i 누적 변수 사용) {
		//3. 숫자를 출력한다. + 숫자(i)를 누적한다.(부호를 번갈아가며)
		//1.} 
		//4. 누적값을 출력한다.
		
		int sum=0;
		//int place=1; //자릿수 역할 
		//현재 루프 변수 -> 사용할 숫자 & 자릿수
		//i값이 회전을 도는 루프
		for(int i=2,place=1;i<=10;i++,place++) {
			if(place%2==1) {
			System.out.printf("%d -",i);
			sum+=i; }
			else {
				System.out.printf("%d +",sum);
				sum-=i;
			}
			
		}
		System.out.printf(" = %d\n",sum);
	}

	private static void m1 () throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시작 값:");
		int start = Integer.parseInt(reader.readLine());
		System.out.print("종료 값:");
		int end = Integer.parseInt(reader.readLine());
		int sum=0;
		int op=0;
		
		int place = 0;
		
		for(int i=start;i<=end;i++) {
			if(place%2==1) {
				op=i*(-1);
				sum+=op;
				System.out.printf("%d+",op);
			}
			else {
				op=i;
				sum+=op;
				System.out.printf("%d",op);
			}
			place++;
		}
		System.out.printf("\b = %d",sum);
		
	}

}
