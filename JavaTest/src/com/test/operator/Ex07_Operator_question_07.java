package com.test.operator;
import java.io.*;
public class Ex07_Operator_question_07 {
	public static void main(String[] args) throws IOException {
		System.out.print("첫번째 숫자 :");
		int num1 = System.in.read()-48;//1(49)
		System.in.read();
		System.in.read();
		System.out.print("두번째 숫자 :");
		int num2 = System.in.read()-48;
		System.in.read();
		System.in.read();
		System.out.print("세번째 숫자 :");
		int num3 = System.in.read()-48;
		System.in.read();
		System.in.read();
		
		int max = num1>num2 ? (num1>num3 ? num1:num3 ):(num2>num3 ? num2:num3);
		System.out.printf("%d, %d 와(과) %d 중에 더 큰 숫자는 %d입니다.",num1,num2,num3,max);
		
		
		
	}

}
