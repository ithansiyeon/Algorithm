package com.test.operator;
import java.io.*;
public class Ex07_Operator_question_03 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader 
		= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("너비(cm) : ");
		String width = reader.readLine();
		System.out.print("높이(cm) : ");
		String height = reader.readLine();
		
		int real_width = Integer.parseInt(width);
		int real_height = Integer.parseInt(height);
		
		
		System.out.printf("사각형의 넓이는 %d㎠입니다.\n",real_width*real_height);
		System.out.printf("사각형의 둘레는 %dcm입니다.",real_width*2+real_height*2);
		
	}
}
