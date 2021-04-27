package com.test.datetime;

import java.util.Calendar;
import java.util.Date;

public class Ex09_DateTime_question_02 {
	public static void main(String[] args) {
		
		Calendar c1 = Calendar.getInstance();
		c1.add(Calendar.DATE,100);
		System.out.printf("백일 : %tF\n",c1);
		c1.add(Calendar.DATE, 265);
		System.out.printf("첫돌 : %tF\n",c1);
		
	}
	
}

