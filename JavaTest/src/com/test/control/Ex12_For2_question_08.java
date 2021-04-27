package com.test.control;

public class Ex12_For2_question_08 {
	public static void main(String[] args) {
		m1();
		//m2();
		
	}
//3중 for문
	private static void m2() {

	for(int i=2;i<=9;i+=4) {
		for(int j=1;j<=9;j++) {
			for(int k=i;k<=i+3;k++)
				System.out.printf(" %d x %d = %2d ",k,j,i*j);
			System.out.println(); }
	System.out.println();
	}
	
}
		
		
//2중 for문 2개 사용
	private static void m1() {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=5;j++) {
				System.out.printf(" %d x %d = %2d ",j,i,j*i);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=9;i++) {
			for(int j=6;j<=9;j++) {
				System.out.printf(" %d x %d = %2d ",j,i,j*i);
			}
			System.out.println();
		}
		
	}

	
}
