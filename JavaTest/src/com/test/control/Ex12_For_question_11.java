package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For_question_11 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("최대 숫자 : ");
		int num = Integer.parseInt(reader.readLine());
		int one;
		int two;
		int three;
		int num1=0;
//		124
//		1
//		2
//		4
//		
//		num = 123;
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
		

		
		for(int i=1;i<=num;i++) {
			num1=i;
			one=num1%10;
			num1=i/10;
			two=num1%10;
			num1=num1/10;
			three=num1%10;
			
			
			int size = 0;
			if(one==3||one==6||one==9) size++;
			if(two==3||two==6||two==9) size++;
			if(three==3||three==6||three==9) size++;
			
			if (size == 0) {
				System.out.printf("%d",i);
			} else {
				for (int j=0;j<size;j++) {
					System.out.print("짝");
				}
			}
			System.out.print(" ");
			
		}
		
		
	}

}