package com.test.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex08_Method_question_07 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("국어 : ");
		int kor = Integer.parseInt(reader.readLine());
		System.out.print("영어 : ");
		int eng = Integer.parseInt(reader.readLine());
		System.out.print("수학 : ");
		int math = Integer.parseInt(reader.readLine());
		
		System.out.printf("%s입니다.",test(kor,eng,math));
	}
	
	public static String test(int kor, int eng, int math) {
		return kor<40 || eng< 40 || math <40 ? "과락" : (kor+eng+math)/3 >= 60 ? "합격" :"불합격";
	}
}
