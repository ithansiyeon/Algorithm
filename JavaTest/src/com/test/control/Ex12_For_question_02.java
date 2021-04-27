package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For_question_02 {
	public static void main(String[] args) throws Exception {
		m1();
	}

	private static void m1() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시작 숫자: ");
		int n1 = Integer.parseInt(reader.readLine());
		System.out.print("종료 숫자: ");
		int n2 = Integer.parseInt(reader.readLine());
		System.out.print("증가치 숫자: ");
		int plus = Integer.parseInt(reader.readLine());
		for(int i=n1;i<=n2;i+=plus) {
			System.out.printf("%d\n",i);
		}
		
		
	}
}
