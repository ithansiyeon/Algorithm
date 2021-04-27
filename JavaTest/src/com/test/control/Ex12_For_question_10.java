package com.test.control;

import java.util.Calendar;

public class Ex12_For_question_10 {
	public static void main(String[] args) {
		int year = 1;
		int month =1;
		int day=1;
		//int sday = year*365+1;
		//평년 28일
		//윤년 29일 
		//2월 달이아닌 나머지 달이 31일 
		//2019x12
		//2019 x 365
		//+1 366

		int sday = 0;
		
		for(year=1;year<=2019;year++){
			sday += 365;
			if(year%4!=0) {
				// "평년"
			}
			else if(year%100!=0) {
				// "윤년"
				sday+=1;
			}
			else if(year%400!=0) {
				//"평년"
			}
			else {
				// "윤년"
				sday+=1;
			}
		}
		
		for(month=1;month<4;month++) {
		switch (month) {
		case 2:	
			if(year%4!=0) {
				// "평년"
				sday+=28;
			}
			else if(year%100!=0) {
				// "윤년"
				sday+=29;
			}
			else if(year%400!=0) {
				//"평년"
				sday+=28;
			}
			else {
				// "윤년"
				sday+=29;
			}
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			sday+=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			sday += 30;
			break;
		}
		}
		
		
		sday+=17;
		
		
	
		
		System.out.printf("2020년 4월 17일은 %,d일째 되는 날입니다.\n",sday);
		System.out.println(sday%7);
		
		Calendar before = Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		before.set(1,1,1);
		now.set(2020,4,17);
		System.out.println();
		System.out.printf("%,d\n",(now.getTimeInMillis()-before.getTimeInMillis())/1000/60/60/24);
		System.out.printf("%,d",((now.getTimeInMillis()-before.getTimeInMillis())/1000/60/60/24)%7);
		
	}

}
