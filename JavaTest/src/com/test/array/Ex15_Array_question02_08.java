package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15_Array_question02_08 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행: ");
		int row=Integer.parseInt(reader.readLine());
		System.out.print("열: ");
		int col=Integer.parseInt(reader.readLine());
		m9(row,col);
	}

	private static void m9(int row, int col) {
		/*
		int [][] nums = new int [row][col];
		
		int n=1;
		int spin = nums.length*2-1;
		// 행: 0->0->1->0->1->2->0->1->2->3->
		//0->1->2->3->4->1->2->3->4->2->3->4->3->4->4
		for(int i=0;i<spin;i++) { //0~8: 9회전 : 대각선
			for(int j=0;j<nums.length;j++) { //0~4: 5회전:행
				int k=i-j; //열, 공식: 회전수 - 행이 열이 나와서 
				if(k>=0 && k<nums.length) { // 0보다 크거나 같고 5보다 작은 경우에만 대입
					nums[j][k]=n;
					n++;
				}
			}
		}
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
					System.out.printf("%4d",nums[i][j]);
			}
			System.out.println();
		}
		*/
	int [][] nums = new int [row][col];
		
		int n=1;
		int spin = nums.length*2-1;
		// 행: 0->0->1->0->1->2->0->1->2->3->
		//0->1->2->3->4->1->2->3->4->2->3->4->3->4->4
		for(int i=0;i<spin;i++) { //0~8: 9회전 : 대각선
			for(int j=0;j<nums.length;j++) { //0~4: 5회전:행
				int k=i-j; //열, 공식: 회전수 - 행이 열이 나와서 
				if(k>=0 && k<nums[0].length) { // 0보다 크거나 같고 5보다 작은 경우에만 대입
					nums[j][k]=n;
					n++;
				}
			}
		}
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
					System.out.printf("%4d",nums[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
