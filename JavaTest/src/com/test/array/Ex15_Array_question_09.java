package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15_Array_question_09 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("삭제 위치: ");
		int del = Integer.parseInt(reader.readLine());
		int[] list = new int[5];
		int temp=0;
		for(int i=0;i<list.length;i++) {
			list[i]=(int)(Math.random()*10);
		}
		
		System.out.print("원본 : [");
		for(int i=0;i<list.length;i++)
		System.out.printf(", %d",list[i]);
		System.out.print("]");
		System.out.println();
		
		
		for(int i=del;i<list.length-1;i++) {
			list[i]=list[i+1];
		}
		
		list[list.length-1]=0;
		
		System.out.print("결과 : [");
		for(int i=0;i<list.length;i++)
		System.out.printf(", %d",list[i]);
		System.out.print("]");
	}
}
