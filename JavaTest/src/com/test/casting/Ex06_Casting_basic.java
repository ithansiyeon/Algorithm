package com.test.casting;

public class Ex06_Casting_basic {
	public static void main(String[] args) {
		//형변환, Type Casting
		// - A라는 자료형을 B라는 자료형으로 바꾸는 작업 
		
		// 1. 암시적인 형변환, 자동 타입 변환 
		// - 큰형 = 작은형 
		// -100% 안전
		
		
		
		//2. 명시적 형변환, 강제 타입 변환 
		// - 작은형 = 큰형
		// - 경우에 따라 다름
		// - 오버플로우(Overflow) 발생
		//  	a. 오버플로우(Overflow)
		//		b. 언더플로우(Underflow)
		// - 원본의 범위를 복사본의 범위와 비교해서 오버플로우를 미연에 방지하는 것이 중요하다!!!!
		
		
		short s1; //2byte
		int n1; //4byte
		
		//원본
		s1 = -32767;
		
		
		//대입 연산자 
		// - **** 좌측의 공간의 자료형과 우측 값의 자료형은 반드시 일치해야 한다.
		//공간(LValue) = 값(RValue) 
		
		
		//암시적인 형변환 
		//큰형 = 작은형
		//int = short
		n1 = s1;  
		
		System.out.println(n1);
		
		short s2;
		int n2;
		
		//원본 
		n2 = 2000000000;
		
		//명시적인 형변환 
		//작은형 = 큰형 
		//short = int
		

		s2 = (short)n2; // 비트로 해서 계산 
		System.out.println(s2);
		
		
		
	}
}
