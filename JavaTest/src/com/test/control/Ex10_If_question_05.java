package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_If_question_05 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 :");
		int text = reader.read();
		
		if(text>='a' && text <='z') {
			System.out.printf("결과: %c",(char)(text-32));
		}
		else if(text>='A' && text <='Z') {
			System.out.printf("결과: %c",(char)(text+32));
		}
		else {
			System.out.println("잘못된 입력임");
		}
		
	}

}
