package com.test.datetime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex09_DateTime_question_06 {
	public static void main(String[] args) throws Exception {
		m1();
		m2();	
		
	}

	private static void m2() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("음식을 받기 원하는 시각\n");
		System.out.print("시 : ");
		int hour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int min = Integer.parseInt(reader.readLine());
		
		Calendar date = Calendar.getInstance();
		
		date.set(Calendar.HOUR_OF_DAY,hour);
		date.set(Calendar.MINUTE,min);
		
		date.add(Calendar.MINUTE, -10);
		System.out.printf("짜장면 : %d시 %d분\n",date.get(Calendar.HOUR_OF_DAY),date.get(Calendar.MINUTE));
		date.add(Calendar.MINUTE, -8);
		System.out.printf("치킨   : %d시 %d분\n",date.get(Calendar.HOUR_OF_DAY),date.get(Calendar.MINUTE));
		date.add(Calendar.MINUTE, -7);
		System.out.printf("피자   : %d시 %d분\n",date.get(Calendar.HOUR_OF_DAY),date.get(Calendar.MINUTE));
		
		
	}

	private static void m1() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("음식을 받기 원하는 시각\n");
		System.out.print("시 : ");
		int hour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int min = Integer.parseInt(reader.readLine());
		
		//짜장면 
		min = hour * 60;
		hour = 0;
		
		
		min -=10;
		hour = min / 60;
		min = min % 60;
		System.out.printf("짜장면 : %d시 %d분\n",hour,min);
		// 치킨 
		min += hour*60;
		hour = 0;
		
		min -=8;
		hour = min/60;
		min = min % 60;
		System.out.printf("치킨 : %d시 %d분\n",hour,min);
		// 피자
		min += hour * 60;
		hour = 0;
		
		//hour = 0;
		min -=7;
		hour = min/60;
		min = min % 60;
		System.out.printf("피자 : %d시 %d분\n",hour,min);
		
		
	}
	
	
}
/*
//2시간 30분
int hour = 2;
int min = 30;

//2시간 30분 + 40분 -> 3시간 10분 
min +=40;

// 자릿수 재정비 
hour += min / 60; 
min = min % 60;
*/

/*
min += hour * 60;
hour = 0;


min -=10;
hour = min / 60;
min = hour % 60;
System.out.printf("짜장면 : %d시 %d분\n",hour,min);

min = hour * 60 + 10;
hour = 0;

//hour = 0;
min -=8;
hour -= min/60;
min = hour % 60;
System.out.printf("치킨 : %d시 %d분\n",hour,min);

min = hour * 60 + 8;
hour = 0;

//hour = 0;
min -=7;
hour -= min/60;
min = hour % 60;
System.out.printf("피자 : %d시 %d분\n",hour,min);
*/

/*
int real_hour = hour;
int real_min = min;

int Jajangmyeon = 10;
int chicken = 18;
int pizza = 25;

real_min = min - Jajangmyeon;


real_hour = real_min < 0 ? hour-1 :hour;
real_min = real_min < 0 ? real_min+60 : real_min;
System.out.printf("짜장면 : %d시 %d분\n",real_hour,real_min);

real_min = min - chicken;
real_hour = real_min < 0 ? hour-1 :hour;
real_min  = real_min < 0 ? real_min+60 : real_min;
System.out.printf("짜장면 : %d시 %d분\n",real_hour,real_min);

real_min = min - pizza;
real_hour = real_min < 0 ? hour-1 :hour;
real_min = real_min < 0 ? real_min+60 : real_min;

System.out.printf("짜장면 : %d시 %d분\n",real_hour,real_min);
System.out.println();

Calendar c1 = Calendar.getInstance();

c1.set(Calendar.HOUR,hour);
c1.set(Calendar.MINUTE,min);

real_hour = c1.get(Calendar.HOUR);
real_min = c1.get(Calendar.MINUTE);
real_min = min - Jajangmyeon;
real_hour = real_min < 0 ? hour-1 :hour;
real_min = real_min < 0 ? real_min+60 : real_min;
System.out.printf("짜장면 : %d시 %d분\n",real_hour,real_min);

real_min = min - chicken;
real_hour = real_min < 0 ? hour-1 :hour;
real_min  = real_min < 0 ? real_min+60 : real_min;
System.out.printf("짜장면 : %d시 %d분\n",real_hour,real_min);

real_min = min - pizza;
real_hour = real_min < 0 ? hour-1 :hour;
real_min = real_min < 0 ? real_min+60 : real_min;
System.out.printf("짜장면 : %d시 %d분\n",real_hour,real_min);


*/