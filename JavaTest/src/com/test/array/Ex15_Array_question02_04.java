package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15_Array_question02_04 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행: ");
		int row=Integer.parseInt(reader.readLine());
		System.out.print("열: ");
		int col=Integer.parseInt(reader.readLine());
		m9(row,col);
	}

	private static void m9(int row,int col) { //문제 base
		
		int [][] nums = new int [row][col];
			int k=nums.length;
			int n =1;
			//입력
			for(int i=0;i<nums.length;i++) {
				for(int j=0;j<k;j++) {
					nums[i][j] = n; 
					n++;
				
				}
				k--;
			}
			//출력 금지
			for(int i=0;i<nums.length;i++) {
				for(int j=0;j<nums[0].length;j++) {
					System.out.printf("%5d",nums[i][j]);
				}
				System.out.println();
			}
		}
}
