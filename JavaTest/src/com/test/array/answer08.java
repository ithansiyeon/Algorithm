package com.test.array;

import java.util.Arrays;

public class answer08 {
	public static void main(String[] args) {
	q008();	
	}

	private static void q008() {
		//배열 삽입(우측 시프트 -> Right Shift)
		String[] color = {"빨강","노랑","파랑","검정","하양","초록","보라"};
		
		System.out.println(Arrays.toString(color));
		
		String newColor ="주황";
		int insertIndex = 2;
		
		//기존의 요소들을 우측으로 옮긴다 -> 빈방 발생 -> 새 요소를 삽입
		
		for(int i=color.length-2;i>=insertIndex;i--) { //******
			
			color[i+1]=color[i];
			System.out.println(Arrays.toString(color));
			
		}
		color[insertIndex]=newColor;
		System.out.println(Arrays.toString(color));
		
		
	}
	
}
