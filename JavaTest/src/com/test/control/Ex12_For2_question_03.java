package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For2_question_03 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String result="";
		System.out.print("행의 갯수: ");
		int row = Integer.parseInt(reader.readLine());
		for(int i=row;i>=1;i--) {
			result="";
				for(int j=1;j<=i;j++) 
					result+="*";
		System.out.printf("%10s",result);
		System.out.println();
					
			}
	
	
	}

}
