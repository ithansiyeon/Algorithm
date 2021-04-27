package com.test.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex08_Method_question_09 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("맑은 날 : ");
		int good_day = Integer.parseInt(reader.readLine());
		System.out.print("흐린 날 : ");
		int bad_day = Integer.parseInt(reader.readLine());
		System.out.printf("사과가 총 %d개 열렸습니다.",getApple(good_day,bad_day));
		
	}
	
	
public static int getApple(int good_day,int bad_day) {
	
	return (good_day*5+bad_day*2-100)/10;
	}
}
