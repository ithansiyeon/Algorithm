package com.test.array;

import java.util.Arrays;

public class answer09 {
	public static void main(String[] args) {
		q009();	
	}

	private static void q009() {
		// TODO Auto-generated method stub
		//배열 삭제 
		String[] color = {"빨강","노랑","파랑","검정","하양","초록","보라"};
		
		//System.out.println(Arrays.toString(color));
		
		int deleteIndex = 2;
		
		for(int i=deleteIndex;i<color.length-1;i++) {
			color[i]=color[i+1];
			System.out.println(Arrays.toString(color));
		}
		color[color.length-1]="";
		System.out.println(Arrays.toString(color));
	}
}
