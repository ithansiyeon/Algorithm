package com.test.operator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex07_Operator_question_05 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader 
		= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("한달 수입 금액(원) : ");
		String month_money = reader.readLine();
		int real_money = Integer.parseInt(month_money);
		System.out.printf("세후 금액(원) : %,d원\n",(int)(real_money*(1-0.033)));
		System.out.printf("세금(원) : %,d원\n",(int)(real_money*0.033));
		
	}
}
