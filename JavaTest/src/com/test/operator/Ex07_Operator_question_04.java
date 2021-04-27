package com.test.operator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ex07_Operator_question_04 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader 
		= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("사용자가 페달을 밟은 횟수 : ");
		String x = reader.readLine();
		int real_x = Integer.parseInt(x);
		System.out.print("기어비:");
		String y = reader.readLine();
		int real_y = Integer.parseInt(y);
		System.out.printf("%d단: 페달 1회전 == 자전거 바퀴 %d",real_y,real_y);
		//1 인치는 정확히 2.54 센티미터, 반지름*2*3.14
		double distance = real_x*26*3.14/100*real_y*2.54; 
		
		System.out.println();
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,d를 달렸습니다.",real_y*real_x,(int)distance);
		
		
	}
}
