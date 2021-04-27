package com.test.datetime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex09_DateTime_question_05 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Calendar dad = Calendar.getInstance();
		System.out.print("아빠 생일(년) : ");
		int dadyear = Integer.parseInt(reader.readLine());
		System.out.print("아빠 생일(월) : ");
		int dadmonth = Integer.parseInt(reader.readLine());
		System.out.print("아빠 생일(일) : ");
		int dadday = Integer.parseInt(reader.readLine());
		
		System.out.println();
		
		System.out.print("딸 생일(년) : ");
		int daughteryear = Integer.parseInt(reader.readLine());
		System.out.print("딸 생일(월) : ");
		int daughtermonth = Integer.parseInt(reader.readLine());
		System.out.print("딸 생일(일) : ");
		int daughterday = Integer.parseInt(reader.readLine());
		
		Calendar daughter = Calendar.getInstance();
		dad.set(dadyear, dadmonth-1, dadday);
		daughter.set(daughteryear,daughtermonth-1,daughterday);
		
		System.out.println();
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.",(daughter.getTimeInMillis()-dad.getTimeInMillis())/1000/60/60/24);
		
		
	}
}
