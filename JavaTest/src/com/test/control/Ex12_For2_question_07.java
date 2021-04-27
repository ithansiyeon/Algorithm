package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For2_question_07 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행의 갯수: ");
		int row = Integer.parseInt(reader.readLine());
		for(int i=1;i<=row;i++) {
			for(int j=row;j>=i;j--)
				System.out.print(" ");
			for(int l=1;l<=i;l++)
				System.out.printf("%c",(char)(96+l)); 
			for(int k=i;k>=1;k--) 
				System.out.printf("%c",(char)(96+k));
			System.out.println();
		}
			System.out.println("프로그램 종료");
		}
	}


