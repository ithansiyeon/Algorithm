package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15_Array_question_03 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("학생 수 : ");
		int num = Integer.parseInt(reader.readLine());
		String [] name = new String[num];
		for(int i=num-1;i>=0;i--) {
			System.out.print("학생 명 : ");
			name[i]=reader.readLine(); 
		}
		view(name,num);
		
	}
	private static void view(String[] list1,int num) { // 그냥 integer값은 상관없지만, 참조형은 한놈을 
		// 건드려서 많은 생각을 해야 돼, 경우의 수가 많아져
		System.out.printf("입력한 학생은 총 %d명입니다.\n",num);
		for(int i=1;i<=num;i++) {
			System.out.println(i+ "." + list1[i-1]); // 모든 방의 값을 출력하는 행동 
		}
	}

}
