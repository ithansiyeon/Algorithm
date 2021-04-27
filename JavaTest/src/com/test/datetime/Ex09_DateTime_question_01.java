package com.test.datetime;

import java.util.Calendar;

public class Ex09_DateTime_question_01 {
	public static void main(String[] args) {
	nowTime();
	nowTime_AMPM();
}

private static void nowTime_AMPM() {
	Calendar now = Calendar.getInstance();
	System.out.printf("%s 현재 시간 : %d시 %d분 %d초\n",now.get(Calendar.AM_PM)==0?"오전":"오후",now.get(Calendar.HOUR_OF_DAY),
			now.get(Calendar.MINUTE),now.get(Calendar.SECOND));
	
}

private static void nowTime() {
	
	Calendar now = Calendar.getInstance();
	System.out.printf("현재 시간 : %d시 %d분 %d초\n",now.get(Calendar.HOUR_OF_DAY),
			now.get(Calendar.MINUTE),now.get(Calendar.SECOND));
	
	
}
}
