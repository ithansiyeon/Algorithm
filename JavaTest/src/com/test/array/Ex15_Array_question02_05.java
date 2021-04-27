package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//5번 빼고 다 직사각형이 되겠끔
public class Ex15_Array_question02_05 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행: ");
		int row=Integer.parseInt(reader.readLine());
		System.out.print("열: ");
		int col=Integer.parseInt(reader.readLine());
		if(row%2!=0 && col!=0)
		m9(row,col);
		else System.out.println("홀수만 입력하세요.");
		
	}
	
private static void m9(int row,int col) { //문제 base 
	int [][] nums = new int [row][col];
	int cnt=0;
	int st=nums.length/2,end=nums.length/2;
	
//	for(int i=0;i<nums.length;i++) {
//		for(int j=st;j<=end;j++) {
//			cnt++;
//			nums[i][j]=cnt;
//		}
//		if(i<nums.length/2) {
//			st--;
//			end++;
//		}
//		else {
//			st++;
//			end--;
//		}
//	}
//	for(int i=0;i<nums.length;i++) {
//		for(int j=0;j<nums.length;j++) {
//			if(nums[i][j]==0) {
//				System.out.printf("%4d",nums[i][j]);
//			}
//			else {
//				System.out.printf("%4d",nums[i][j]);
//			}
//		}
//		System.out.println();
//	}
	
	
	int n=1;
	int k=nums.length/2;
	int l=nums.length/2;  
	for(int i=0;i<nums.length/2+1;i++) {
		for(int j=k;j<=l;j++) {
			if(k==-1) break;
			nums[i][j]=n;
			n++;
		}
		k--;
		l++;
	}
	
	//n=13;
	k=1;
	l=nums.length-2;
	
	for(int i=nums.length/2+1;i<nums.length;i++) {
		for(int j=k;j<=l;j++) {
			if(k==nums.length/2+1) break;
			nums[i][j]=n;
			n++;
		}
		k++;
		l--;
	}

	for(int i=0;i<nums.length;i++) {
		for(int j=0;j<nums[0].length;j++) {
			System.out.printf("%5d",nums[i][j]); 
		}
		System.out.println();
	}
	
	
	
	
	
		}
		


}
