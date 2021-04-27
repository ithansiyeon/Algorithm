package com.test.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex08_Method_question_08 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("역의 개수 : ");
		int count = Integer.parseInt(reader.readLine());
		System.out.print("환승역의 횟수 : ");
		int transfer = Integer.parseInt(reader.readLine());
		System.out.printf("총 소요 시간은 %d분입니다.",getTime(count,transfer));
		
	}
	
	public static int getTime(int count,int transfer) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String time = reader.readLine();
		int result = time.equals("평상") ? count*2+transfer*3: time.equals("출근") ? count*2+transfer*4 :count*2+transfer*5;
		return result;
	}
}

