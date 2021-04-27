package com.test.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex08_Method_question_02 {
	public static void main(String[] args) throws Exception  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력 : ");
		int num = Integer.parseInt(reader.readLine());
		digit(num);
	
	}
	public static void digit(int num) {

		System.out.printf("%d → %04d",num,num);
	}
	
}
