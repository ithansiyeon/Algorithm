package com.test.control;

public class Ex12_For_use_03 {
	public static void main(String[] args) {
		m1();
		//m2();
		//m3();
	}
	
	private static void m3() {
		//별찍기
		for(int i=0;i<5;i++) { //행
			for(int j=0;j<5;j++) { //열
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		

		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//변수들을 건드리는 것
		for(int i=0;i<5;i++) { //행
			for(int j=i;j<5;j++) { //열, 점점 늘어나면 회전수가 줄어들어 
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void m2() {
		//*****
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				//if(true) {
				//if(i==5) //i가 5일때 continue에 의해서 두번째 for문으로 가지만 계속 i가 5라서 실행이 안됨
				if(j==5) {	//5바퀴도는 for문 총 50번이 실행이 됨 
					//if(i%2==0 && j>5) {
					break; //자신이 포함된 제어문을 탈출한다. jO
					//continue;
				}
				System.out.printf("i: %d, j: %d\n",i,j);
				}
			}
		
		}
	

	private static void m1() {
		//구구단 
		//2단 ~ 9단 
		
	for(int j=2;j<10;j++) {
		for(int i=1;i<10;i++) {
			System.out.printf("%d * %d = %2d\n",j,i,j*i);
		}
		System.out.println();
	}
}
}
