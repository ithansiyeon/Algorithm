package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15_Array_question02_03 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행: ");
		int row=Integer.parseInt(reader.readLine());
		System.out.print("열: ");
		int col=Integer.parseInt(reader.readLine());
		m9(row,col);
	}
	private static void m9(int row, int col) { //문제 base
		
		int [][] nums = new int [row][col];
			
			int n =1;
			//입력
			for(int i=0;i<nums[0].length;i++) {
				for(int j=0;j<nums.length;j++) {
					nums[j][i] = n; //순서  ji 층이 빨라
					n++;
				}
			}
			//출력 금지
			for(int i=0;i<nums.length;i++) {
				for(int j=0;j<nums[0].length;j++) {
					System.out.printf("%5d",nums[i][j]); // 한층 
				}
				System.out.println();
			}
		}
}
