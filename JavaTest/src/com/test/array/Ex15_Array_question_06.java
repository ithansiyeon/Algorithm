package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15_Array_question_06 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("최대 범위 : ");
		int max = Integer.parseInt(reader.readLine());
		System.out.print("최소 범위 : ");
		int min = Integer.parseInt(reader.readLine());
		
		int [] list = new int[20];
		int [] rlist = new int [20];
		
		for(int i=0;i<20;i++) {
			list[i]=(int)(Math.random()*20)+1;
		}
		
		for(int j=0;j<20;j++) {
		if(list[j]>=min && list[j]<=max) {
			rlist[j]=list[j];
			}
			
		}
		System.out.print("원본 : ");
		view(list);
		System.out.print("결과 : ");
		view(rlist);
		
	}
	private static void view(int[] list1) { // 그냥 integer값은 상관없지만, 참조형은 한놈을 
		// 건드려서 많은 생각을 해야 돼, 경우의 수가 많아져
		for(int i=0;i<list1.length;i++) {
			System.out.print(list1[i] +","); // 모든 방의 값을 출력하는 행동 
		}
		System.out.print("\b");
		System.out.println();
	}

}
