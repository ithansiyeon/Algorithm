package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For_question_03 {
	public static void main(String[] args) throws Exception {
	 m1();	
	}

	private static void m1() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 : ");
		int num = Integer.parseInt(reader.readLine());
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.printf("1 ~ %,d = %,d",num,sum);
	}

}
