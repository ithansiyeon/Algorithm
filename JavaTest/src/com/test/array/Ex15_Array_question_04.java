package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15_Array_question_04 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("배열의 길이 : ");
		int len = Integer.parseInt(reader.readLine());
		int []nums = new int[len];
		int []result = new int[len/2];
		for(int i=0;i<len;i++) {
			nums[i]=(int)(Math.random()*10)+1;
		int k=0;
		for(int j=0;j<len;j+=2) {
			result[k]=nums[j]+nums[j+1];
			k++;
		}
		}
		view1(nums);
		view2(result);
	}
	private static void view1(int[] list1) { // 그냥 integer값은 상관없지만, 참조형은 한놈을 
		// 건드려서 많은 생각을 해야 돼, 경우의 수가 많아져

		for(int i=0;i<list1.length;i++) {
			System.out.println("nums["+i+"]" + " = " + list1[i]); // 모든 방의 값을 출력하는 행동 
		}
	}
	private static void view2(int[] list1) { // 그냥 integer값은 상관없지만, 참조형은 한놈을 
		// 건드려서 많은 생각을 해야 돼, 경우의 수가 많아져

		for(int i=0;i<list1.length;i++) {
			System.out.println("result["+i+"]" + " = " + list1[i]); // 모든 방의 값을 출력하는 행동 
		}
	}
}
