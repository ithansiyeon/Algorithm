package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex10_If_question_09 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("년 :");
		int year = Integer.parseInt(reader.readLine());
		System.out.print("월 :");
		int month = Integer.parseInt(reader.readLine());
		System.out.print("일 :");
		int day = Integer.parseInt(reader.readLine());
		Calendar now = Calendar.getInstance();
		now.set(year,month-1,day);
		//DAY_OF_WEEK)); // 요일, (1(일)~7(토))
		if(now.get(Calendar.DAY_OF_WEEK)!=1 && now.get(Calendar.DAY_OF_WEEK)!=7 ) {
			
			//2 -> ? -> 5
			//3 -> ? -> 4
			now.add(Calendar.DATE,7-now.get(Calendar.DAY_OF_WEEK));
		
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			System.out.printf("이동한 날짜는 '%tF'입니다.",now);
		}
		else {
			System.out.printf("입력하신 날짜는 '휴일'입니다.\n결과가 없습니다.");
		}
		
		
	}
}
