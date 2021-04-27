package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_If_question_03 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자: ");
		int n1 = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자: ");
		int n2 = Integer.parseInt(reader.readLine());
		System.out.print("연산자: ");
		String operator = reader.readLine();
		if(operator.equals("+")) {
			System.out.printf("%d + %d = %d",n1,n2,n1+n2);
		}
		else if(operator.equals("-")) {
			if(n1>n2) {
			System.out.printf("%d - %d =%d",n1,n2,n1-n2);
			}
			else {
				System.out.printf("%d - %d =%d",n2,n1,n2-n1);
			}
		}
		else if(operator.equals("*"))
		{
			System.out.printf("%d * %d =%d",n1,n2,n1*n2);
		}
		else if(operator.equals("/")) {
			System.out.printf("%d / %d = %.1f",n1,n2,(double)n1/n2);
		}
		else if(operator.equals("%")) {
			System.out.printf("%d %% %d = %d",n1,n2,n1%n2);
		}
		
	}
}
