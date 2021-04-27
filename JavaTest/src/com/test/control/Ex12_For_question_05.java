package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For_question_05 {
	public static void main(String[] args) throws Exception {
		m1();
		
		//2. 누적 변수를 생성한다.
		//1. 루프를 생성한다.(for x 10회 **i 누적 변수 사용) {
		//3. 숫자를 출력한다. + 숫자(i)를 누적한다.
		//1.} 
		//4. 누적값을 출력한다.
		int sum =0; //2.
		for(int i=1;i<=10;i++) //1. 
		{
			System.out.printf("%d + ",i); //3.
			sum+=i; //3.
		}
		System.out.printf("\b\b = %d",sum);
		
	}

	private static void m1() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시작 값: ");
		int start = Integer.parseInt(reader.readLine());
		System.out.print("종료 값:");
		int end = Integer.parseInt(reader.readLine());
		int sum=0;
		for(int i = start;i<=end;i++) {
			sum+=i;
			System.out.printf("%d +",i);
		}
		System.out.printf("\b = %d",sum);
		
	}

}
