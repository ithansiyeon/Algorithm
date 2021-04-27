package com.test.array;

public class Ex15_Array_question_05 {
	public static void main(String[] args) {
	int [] list = new int[20];
	
		for(int i=0;i<20;i++) {
			list[i]=(int)(Math.random()*20)+1;
		}
		
		int max=0,min=100;
		for(int i=0;i<20;i++) {
			if(list[i]>max) max=list[i];
		}
		
		for(int i=0;i<20;i++) {
			if(list[i]<min) min=list[i];
		}
		
		view(list);
		System.out.printf("최댓값 : %d\n",max);
		System.out.printf("최소값 : %d\n",min);
		
	}
	private static void view(int[] list1) { // 그냥 integer값은 상관없지만, 참조형은 한놈을 
		// 건드려서 많은 생각을 해야 돼, 경우의 수가 많아져
		System.out.print("원본 : ");
		for(int i=0;i<list1.length;i++) {
			System.out.print(list1[i] +","); // 모든 방의 값을 출력하는 행동 
		}
		System.out.println();
	}
}
