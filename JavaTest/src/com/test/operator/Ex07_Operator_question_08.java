package com.test.operator;
import java.io.*;
public class Ex07_Operator_question_08 {
	public static void main(String[] args) throws Exception {
		String date = "2020년 4월";
		BufferedReader reader 
		= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("날짜 입력 : ");
		String day = reader.readLine();
		int real_day = Integer.parseInt(day);
		
		String week = (real_day%7)==1 ? "수요일":((real_day%7)==2 ? "목요일":((real_day%7)==3 ? "금요일":((real_day%7)==4 ? 
													"토요일":((real_day%7)==5?"일요일":((real_day%7)==6?"월요일":"화요일")))));
		System.out.printf("입력하신 %s %s일은 '%s'입니다.",date,day,week);
		
		
	}
}
