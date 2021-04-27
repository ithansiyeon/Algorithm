package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14_String_question_12 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문장:");
		String txt = reader.readLine();
		int sum=0;
		for(int i=0;i<txt.length();i++) {
			if(txt.charAt(i)>='0' && txt.charAt(i)<='9') {
				sum+=(int)(txt.charAt(i)-48);
			}
		}
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.\n",sum);
	
	
	}

}
