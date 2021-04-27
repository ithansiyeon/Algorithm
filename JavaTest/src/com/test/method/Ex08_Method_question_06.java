package com.test.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex08_Method_question_06 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 : ");
		int num = Integer.parseInt(reader.readLine());
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.",num,getNumber(num));
	}
	
	public static String getNumber(int num) {
		return num%2 == 0 ? "짝수": "홀수";
	}
}
