package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex10_If_question_07 {
	public static void main(String[] args) throws Exception {
		 m1();
		 m2();
	
	}

	private static void m2() throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("[들어온 시간]");
		System.out.print("시 :");
		int ihour = Integer.parseInt(reader.readLine());
		System.out.print("분 :");
		int imin = Integer.parseInt(reader.readLine());
		
		System.out.println("[나간 시간");
		System.out.print("시 :");
		int ohour = Integer.parseInt(reader.readLine());
		System.out.print("분 :");
		int omin = Integer.parseInt(reader.readLine());
		
		Calendar before = Calendar.getInstance();
		before.set(Calendar.HOUR,ihour);
		before.set(Calendar.MINUTE, imin);
		
		Calendar after = Calendar.getInstance();
		after.set(Calendar.HOUR,ohour);
		after.set(Calendar.MINUTE,omin);
		System.out.printf("주차 요금은 %,d원입니다.\n",((after.getTimeInMillis()-before.getTimeInMillis())/1000/60-30)/10*2000);
		
		
	}

	private static void m1() throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("[들어온 시간]");
		System.out.print("시 :");
		int ihour = Integer.parseInt(reader.readLine());
		System.out.print("분 :");
		int imin = Integer.parseInt(reader.readLine());
		
		System.out.println("[나간 시간]");
		System.out.print("시 :");
		int ohour = Integer.parseInt(reader.readLine());
		System.out.print("분 :");
		int omin = Integer.parseInt(reader.readLine());
		
		imin+=ihour*60;
		ihour=0;
		
		omin+=ohour*60;
		ohour=0;
		int pay =0;
		
		if(omin-imin<=30) {
			pay =0;
			
		}
		else {
			pay= (omin-imin-30)/10*2000;
		}
		
		System.out.printf("주차 요금은 %,d원입니다.\n",pay);
		
	}
	
	
}

