package com.test.operator;

public class Ex07_Operator_question_06 {
	public static void main(String[] args) throws Exception {
		System.out.print("문자 입력 : ");
		int shape = System.in.read(); 
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다.",(char)shape,(char)(shape-32));
		
		
	}
}
