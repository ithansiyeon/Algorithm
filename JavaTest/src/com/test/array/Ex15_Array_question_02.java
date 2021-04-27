package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15_Array_question_02 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int [] result = new int[5];
		int [] list = new int[5];
		
		for(int i=0;i<5;i++) {
		System.out.print("숫자 : ");
			list[i]=Integer.parseInt(reader.readLine());
			result[i]=list[i];
			
		}
		view(result);
	}
	private static void view(int[] list1) { // 그냥 integer값은 상관없지만, 참조형은 한놈을 
		// 건드려서 많은 생각을 해야 돼, 경우의 수가 많아져

		for(int i=list1.length-1;i>=0;i--) {
			System.out.println("nums["+i+"]" + " = " + list1[i]); // 모든 방의 값을 출력하는 행동 
		}
	}
}
