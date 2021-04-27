package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14_String_question_03 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 : ");
		String txt = reader.readLine();
		String result = "";
		int sum=0;
		for(int i=0;i<txt.length();i++) {
			char c = txt.charAt(i);
			result+=c+" + ";
			sum+=(int)txt.charAt(i)-48;
			
		}
		System.out.printf("결과 : %s = %d",result,sum);
		
		
		
		
		
	}

}
