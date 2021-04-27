package com.test.operator;
import java.io.*;
public class Ex07_Operator_question_10 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader 
		= new BufferedReader(new InputStreamReader(System.in)); //reader 입력도구 
		System.out.print("섭씨(°C) : ");
		String num = reader.readLine();
		int real_num = Integer.parseInt(num);
		System.out.printf("섭씨 %d°C는 화씨 %.1f°F입니다.",real_num,real_num*1.8+32);
		
	}

}
