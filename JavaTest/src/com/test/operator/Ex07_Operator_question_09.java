package com.test.operator;
import java.io.*;
public class Ex07_Operator_question_09 {
	public static void main(String[] args) throws Exception {
		System.out.print("영문자 입력 : ");
		int num = System.in.read();
		char realnum = (char) num;
	
		String name = realnum >= 'a' && realnum <='z' ? "소문자":"대문자";
		System.out.printf("입력한 문자 '%c'는 %s입니다.",realnum,name);
		
		
		
	}

}
