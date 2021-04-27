package com.test.array;

import java.util.Arrays;

public class answer07 {
	public static void main(String[] args) {
		q007();
	}

	private static void q007() {
		// TODO Auto-generated method stub
		//중복값 제거 난수
		int[] nums = new int[5];
		//난수 생성 -> (중복체크)-> 배열 대입 
		
		for(int i=0;i<nums.length;i++) {
			int n=(int)(Math.random()*10)+1; //1~10사이의 난수
			
			if(!duplicate(i,n,nums)) {
			nums[i]=n;
			} else {
				i--; //전 방향으로 되돌림, 중복값이면 횟수 하나 복원
			}
		}//for
		
		System.out.println(Arrays.toString(nums));
		
	}
	public static boolean duplicate(int i,int n,int[] nums) {
		boolean duplicate = false;
		
		for(int j=0;j<i;j++) {
			if(nums[j]==n) {
				duplicate = true;
				break;
			}
		}
		return duplicate;
	}
}
