package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_If_question_01 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자: ");
		int n1 = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자: ");
		int n2 = Integer.parseInt(reader.readLine());
		int max = 0;
		int min = 0;
		if(n1>n2) {
			max = n1;
			min = n2;
		}
		else {
			min = n2;
			max = n1;
		}
		System.out.printf("큰수는 %d이고, 작은수는 %d입니다.\n",max,min);
		System.out.printf("두 수의 차이: %d",max-min);
		
		
	}

}
