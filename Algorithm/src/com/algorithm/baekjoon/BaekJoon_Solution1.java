package com.algorithm.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_Solution1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int []nums = new int[num];
		for(int i=0;i<num;i++) {
			nums[i] = scan.nextInt();
		}
		
		scan.close();
		Arrays.sort(nums);
		System.out.printf("%d %d",nums[0],nums[num-1]);
	}
}

