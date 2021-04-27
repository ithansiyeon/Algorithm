package com.test.method;

public class Ex08_Method_use_02 {
	public static void main(String[] args) {
		
		//요구사항] 2개의 int -> 매개변수 -> 서로 교환 + 출력 메소드
		
		int a = 10;
		int b =20;
		
		swap(a,b);
		
		//재귀 메소드(Recursive Method)
		// - 메소드가 구현부에서 자기 자신을 호출하는 형태
		// - 트리 구조의 자료형을 조작할때 많이 사용(윈도우 탐색기 구조 - 파일 시스템 구조)
		
		//팩토리얼(Factorial)
		// 4! = 4*3*2*1
		// 4! = 24
		
		int n = 4;
		int result = factorial(n);
		
		System.out.printf("%d! = %d\n",n,result);
		
		test();
		
	}// main
	
	public static void test() {
		System.out.println("테스트 입니다.");
		test();
		System.out.println("테스트 입니다."); // 평생 실행할 일이 없어, 접근할 수 없는 코드
		
	}
	
	public static int factorial(int n) {
		
		int temp =(n==1) ? 1:n*factorial(n-1); //(n==1)이 끝내는 조건이 됨 
		return temp;
		
	}
	
	public static void swap(int a,int b) {
		// 정렬 할때 많이 쓰임, 데이터를 다룰 때 
		System.out.printf("스왑 전 : a= %d, b = %d\n",a,b);
		//빈컵
		int temp;
		
		temp = a;
		a=b;
		b=temp;
		
		System.out.printf("스왑 후 : a= %d, b = %d\n",a,b);
	}
	
	
}
