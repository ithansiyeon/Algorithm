package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For2_question_05 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행의 갯수: ");
		int k=1;
		int row = Integer.parseInt(reader.readLine());
		String result="";
		//행의 갯수만큼 반복 
		for(int i=1;i<=row;i++) {
			result="";
			for(int j=1;j<=k;j++) // k에 2를 더한 만큼 *를 반복 
				//System.out.print("*");
				result+="*";
			for(int l=row;l>=i;l--) System.out.print(" "); //공백을 출력하기 위해서 작성 
			
			System.out.printf("%s",result);
			k=k+2;
			System.out.println();
		}
	}

}
