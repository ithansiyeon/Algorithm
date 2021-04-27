package com.test.datetime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex09_DateTime_question_03 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("태어난 년도 : ");
		int Year_of_birth = Integer.parseInt(reader.readLine());
		Calendar now = Calendar.getInstance();
		System.out.printf("나이 : %d세",now.get(Calendar.YEAR)-Year_of_birth+1);
	}

}
