package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14_String_question_07 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단어:");
		String word = reader.readLine();
		String word1="";
		String word2="";
		String result="";
		int index =-1;
		int j=1,i=0;
	
			for(j=1;j<word.length();j++) {
				if(word.charAt(j)>='A' && word.charAt(j)<='Z') {
					result+=word.substring(i,j)+" ";
					i=0;
					i+=j;
				}
				if(j==word.length()-1) {
					result+=word.substring(i,word.length());
				}
			}
		
		System.out.printf("결과:%s",result);
		
		
	}

}
