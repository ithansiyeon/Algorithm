package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For_question_07 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean loop = true;
		String statement=" ";
		String sum=" ";
		System.out.println("아래에 입력하세요.");
		for(;loop;) {
			statement = reader.readLine();
			sum+=statement+"\n";
			if(statement.equals("")) 
				loop=false;
	
		}
		System.out.print(sum);
		System.out.println("프로그램 종료");
	}

}
