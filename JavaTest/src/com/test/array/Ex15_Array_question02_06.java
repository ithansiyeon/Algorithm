package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15_Array_question02_06 {
	public static void main(String[] args) throws Exception {
		/*
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행: ");
		int row=Integer.parseInt(reader.readLine());
		System.out.print("열: ");
		int col=Integer.parseInt(reader.readLine());
		m9(row,col);
	}
	private static void m9(int row,int col) { 
	int [][] nums = new int [row][col];
	int n=1;
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1;j++) {
				nums[i][j]=n;
				n++;
			}
		}

		for(int i=0;i<nums.length;i++) {
			int sum=0;
			for(int j=0;j<nums.length;j++) {
				if(j==4) {
					nums[i][j]=sum;
				}
				else {
				sum+=nums[i][j];
				}
			}
		}
	
		
		for(int i=0;i<nums.length;i++) {
			int sum=0;
			for(int j=0;j<nums.length;j++) {
				if(j==4) {
					nums[j][i]=sum;
				}
				else {
				sum+=nums[j][i];
				}
			}
		}
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(nums[i][j]==0) {
					System.out.printf("%4d",nums[i][j]);
				}
				else {
					System.out.printf("%4d",nums[i][j]);
				}
			}
			System.out.println();
		}
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행: ");
		int row=Integer.parseInt(reader.readLine());
		System.out.print("열: ");
		int col=Integer.parseInt(reader.readLine());
		m9(row,col);
	}
	private static void m9(int row,int col) { 
	int [][] nums = new int [row][col];
	int n=1;
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums[0].length-1;j++) {
				nums[i][j]=n;
				n++;
			}
		}

		for(int i=0;i<nums.length;i++) {
			int sum=0;
			for(int j=0;j<nums[0].length;j++) {
				if(j==nums[0].length-1) {
					nums[i][j]=sum;
				}
				else {
				sum+=nums[i][j];
				}
			}
		}
	
		
		for(int i=0;i<nums[0].length;i++) {
			int sum=0;
			for(int j=0;j<nums.length;j++) {
				if(j==nums.length-1) {
					nums[j][i]=sum;
				}
				else {
				sum+=nums[j][i];
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
