package com.test.operator;
import java.io.*;
public class Ex07_Operator_question_02 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader 
		= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자 : ");
		String num1 = reader.readLine();
		System.out.print("두번째 숫자 : ");
		String num2 = reader.readLine();
		int realnum1 = Integer.parseInt(num1);
		int realnum2 = Integer.parseInt(num2);
		System.out.printf("%d + %d = %,d\n",realnum1,realnum2,realnum1+realnum2);
		System.out.printf("%d - %d = %,d\n",realnum1,realnum2,realnum1-realnum2);
		System.out.printf("%d * %d = %,d\n",realnum1,realnum2,realnum1*realnum2);
		System.out.printf("%d / %d = %,.1f\n",realnum1,realnum2,(double)realnum1/realnum2);
		System.out.printf("%d %% %d = %,d\n",realnum1,realnum2,realnum1%realnum2);
		
	}

}
