package com.test.datetime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex09_DateTime_question_04 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Calendar date = Calendar.getInstance();
		System.out.print("남자 이름 : ");
		String boyname = reader.readLine();
		System.out.print("여자 이름 : ");
		String girlname = reader.readLine();
		
		System.out.print("만난날(년) : ");
		int year = Integer.parseInt(reader.readLine());
		System.out.print("만난날(월) : ");
		int month = Integer.parseInt(reader.readLine());
		System.out.print("만난날(일) : ");
		int day = Integer.parseInt(reader.readLine());
		 
		date.set(year,month-1,day);
		System.out.printf("'%s'과(와) '%s'의 기념일\n",boyname,girlname);
		date.add(Calendar.DATE, 100);
		System.out.printf("100일  : %tF\n",date);
		date.add(Calendar.DATE,100);
		System.out.printf("200일  : %tF\n",date);
		date.add(Calendar.DATE,100);
		System.out.printf("300일  : %tF\n",date);
		date.add(Calendar.DATE,200);
		System.out.printf("500일  : %tF\n",date);
		date.add(Calendar.DATE,500);
		System.out.printf("1000일 : %tF\n",date);
		
		
		
	}
}
