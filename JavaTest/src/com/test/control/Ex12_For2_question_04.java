package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For2_question_04 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행의 갯수: ");
		int row = Integer.parseInt(reader.readLine());
		String result="";
		for(int i=1;i<=row;i++) {
			result="";
			for(int j=1;j<=i;j++) {
				result+="*";
			}
			System.out.printf("%10s\n",result);
		}
		
		
		
	}
}
