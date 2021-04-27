package com.test.control;

public class Ex12_For2_question_10 {
	public static void main(String[] args) {
		m1();
		//m2();
	
		
		
	}// main
	//단일 for문
	private static void m2() {
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
			if(i%10==0) {
			System.out.printf("%2d ~ %3d : %4d\n",i-9,i+10,sum);
			sum=0; }
			}
			
		}
		
	
	//2중 for문
	private static void m1() {
		int sum=0;
		for(int i=0;i<=90;i+=10) {
			sum=0;
			for(int j=i+1;j<=i+10;j++) {
			sum+=j;
			}
			System.out.printf("%2d  ~ %3d : %4d\n",i+1,i+10,sum);
		}
		
	}

}




