package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For_question_08 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("종료할 누적값: ");
		int end = Integer.parseInt(reader.readLine());
		int sum=0;
		for(int i=1;true;i++) {
			if(sum>end) break;
			else { sum+=i;
			System.out.printf("%d +",i);
			}
			
		}
		System.out.printf("\b = %d",sum);
	}

}
