package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14_String_question_01 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문장 입력 : ");
		String txt = reader.readLine();
		String result="";
		for(int i=txt.length()-1;i>=0;i--) {
			result+=txt.substring(i,i+1);
		}
		System.out.printf("역순 결과: %s",result);
	}

}
