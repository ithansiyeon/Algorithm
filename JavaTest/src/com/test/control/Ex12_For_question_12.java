package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For_question_12 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String result ="";
		for(int i=1;i<=10;i++) {
		System.out.print("숫자 : ");
		String snum = reader.readLine();
		if(snum.length()>=2) return;
		else {
		switch(snum) {
		case "0" : 	snum="영";
					result+=snum;
					break;
		case "1" : snum="일";
				   result+=snum;
					break;
		case "2" : snum="이";
					result+=snum;
					break;
		case "3" : snum="삼";
					result+=snum;
					break;
		case "4" : snum="사";
					result+=snum;
					break;
		case "5" : snum="오";
					result+=snum;
					break;
		case "6" : snum="육";
					result+=snum;
					break;
		case "7" : snum="칠";
					result+=snum;
					break;
		case "8" : snum="팔";
					result+=snum;
					break;
		case "9" : snum="구";
					result+=snum;
					break;
				}
			}
		}
		System.out.printf("결과 : %s",result);
		
	}
}
