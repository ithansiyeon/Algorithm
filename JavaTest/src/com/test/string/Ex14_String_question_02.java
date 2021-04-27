package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14_String_question_02 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이메일 : ");
		String email = reader.readLine();
		
		String id = email.substring(0,email.indexOf("@"));
		String domain = email.substring(email.lastIndexOf("@")+1,email.length());
		System.out.printf("아이디: %s\n",id);
		System.out.printf("도메일: %s\n",domain);
		
	
	
	}

}
