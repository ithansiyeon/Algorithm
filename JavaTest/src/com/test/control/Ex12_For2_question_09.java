package com.test.control;

public class Ex12_For2_question_09 {
	public static void main(String[] args) {
		//m1();
		m2();
	
		
		
	}// main
	//단일 for문
	private static void m2() {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%10!=0)
				sum+=i;
			else { //10의 배수 단위로 끝어서 마지막에 10,20,30...만 출력을 함
				sum+=i;
				System.out.printf("1 ~ %3d : %4d\n",i,sum);
			}
			
		}
		
	}
	//2중 for문
	private static void m1() {
		int sum=0;
		for(int i=10;i<=100;i+=10) {
			sum=0;
			for(int j=1;j<=i;j++) {
			sum+=j;
			}
			System.out.printf("1  ~ %3d : %4d\n",i,sum);
		}
		
	}

}






