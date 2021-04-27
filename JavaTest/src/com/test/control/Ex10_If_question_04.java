package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_If_question_04 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 : ");
		int text = reader.read();
//		char text = (char) reader.read();
		if(text == 'f' || text == 'F') {
			System.out.println("Father");
		}
		else if(text == 'm' || text == 'M') {
			System.out.println("Mother");
		}
		else if(text == 's' || text == 'S') {
			System.out.println("Sister");
		}
		else if(text == 'b' || text == 'B') {
			System.out.println("Brother");
		}
		else {
			System.out.println("잘못된 값입력");
		}
	}
}
