package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_If_question_08 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("년도 입력 :");
		int year = Integer.parseInt(reader.readLine());
		String syear="";
		if(year%4!=0) {
			syear = "평년";
		}
		else if(year%100!=0) {
			syear = "윤년";
		}
		else if(year%400!=0) {
			syear = "평년";
		}
		else {
			syear = "윤년";
		}
			
		System.out.printf("%d년은 '%s'입니다.",year,syear);
		
		
	}
}
