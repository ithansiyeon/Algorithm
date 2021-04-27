package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// 안보고 다시 짜보면 내 로직이 되는 거임
public class Ex15_Array_question02_10 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행: ");
		int row=Integer.parseInt(reader.readLine());
		System.out.print("열: ");
		int col=Integer.parseInt(reader.readLine());
		if(row%2!=0 && col!=0 && row==col)
			m9(row,col);
		else System.out.println("열과 행이 같으며 홀수만 입력하세요.");
		
	}
	
	private static void m9(int row, int col) {
		int [][] nums = new int [row][col];
		//int n=1;
		int r=nums.length/2; //1
		int c=nums.length-1; //2
		int val=1;
		nums[r][c]=val;
		while(val<nums.length*nums.length) {
			
			//오른쪽 상단이동 4가지 방향중에서 하나를 선택을 했으면 그 방법만 왼쪽으로 가야돼 
			if(c+1>=nums.length && val%nums.length!=0) c=0;
			else if(val%nums.length==0) c--;
			else c++;//**
			//0이 아니면 값이 있는 것
			if(r-1<0 && val%nums.length!=0) r=nums.length-1;
			else if(val%nums.length==0) {}
			else r--;//**
			val++;
			nums[r][c]=val;
			
			}
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				System.out.printf("% 3d ",nums[i][j]); 
			}
			System.out.println();
		}
	}
}
