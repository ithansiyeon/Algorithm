package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_If_question_11 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력 : ");
		String snum = reader.readLine();
		long num = 0;
		//정수형(byte, short,int,long)
		// long 
		// int 
		//키워드 하나 처리
		if(snum.length()<=19) {
			num = Long.parseLong(snum);
			 if(num<=Byte.MAX_VALUE && num>=Byte.MIN_VALUE) {
				System.out.println("Byte형");
			}
			
			if(num<=Short.MAX_VALUE&& num>=Short.MIN_VALUE) {
				System.out.println("short형");
			}
			
			if(num<=Integer.MAX_VALUE&& num>=Integer.MIN_VALUE) {
				System.out.println("int형");
			}
			
			if(num<=Long.MAX_VALUE&& num>=Long.MIN_VALUE){
				System.out.println("long형");
			}
		}
		else {
			System.out.println("숫자가 long형의 길이를 벗어납니다.");
		}
		
	}

}
