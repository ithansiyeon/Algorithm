package com.test.casting;

public class Ex06_Casting_use {
	public static void main(String[] args) {
		// Ex06_Casting_use.java
		
		//명시적인 형변환
		byte b1 = (byte)10; // byte(1) = int(4)
		short s1 = (short) 10; // short(2) = int(4)
		byte b2 =10; // 암시적
		short s2 =10; //암시적
		
		int n1 =10; // int(4) = int(4) 가장 가벼워 
		
		// 암시적인 형변환 
		long l1 =(long)10; //long(8) = int(4)
		
		//정수 -> 정수 
		//실수 -> 실수 
		//정수 -> 실수
		//실수 -> 정수
		
		int m1;
		double d1;
		m1=100;
		
		// 큰형 = 작은형 암시적인 형변환 
		//double = int
		d1 = (double)m1;
		System.out.println(d1);
		
		int m2;
		double d2;
		
		d2 = 3.74;
		
		//작은형 = 큰형 
		//int = double
		m2 = (int)d2;
		System.out.println(m2);
		
		float f1;
		int m3;
		
		f1 = 31.4F;
		
		// int : -21억 ~21억
		//float : -10^30 ~ 10^30 
		// int(4) = float(4)
		m3 =(int)f1;
		System.out.println(m3);
		
		long l2;
		//작은형 = 큰형 
		//long(8) = float(4)
		l2 =(long) f1;
		System.out.println(l2);
				
		//byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		// 단지 바이트수로 비교하면 안돼고 정수는 실수를 이길 수가 없어 
		
		//boolean
		// - 형변환이 불가능
		
		//char
		// - 형변환이 가능함 
	
		int m5;
		char c1;
		
		m5 = 44032; //원본
		
		//복사 
		// char(2) = int(4)
		c1 = (char)m5;
		
		System.out.println(c1);
		
		System.out.println((char)65);
		System.out.println((int)'A');
		
		//문자 코드
		System.out.println((int)'A');
		System.out.println((int)'Z');
		System.out.println((int)'a');
		System.out.println((int)'z');
		System.out.println((int)'0');
		System.out.println((int)'9');
		System.out.println((int)'가');
		System.out.println((int)'힣');
		//기억하기 
		System.out.println((int)'\r');
		System.out.println((int)'\n');
		System.out.println((int)'\t');
		System.out.println((int)'\b');
		System.out.println((int)' ');
		


		//## ? char를 int로 형변환 가능합니까? 이유는 뭡니까
		
		//## ? short를 char로 형변환 가능합니까? 이유는 뭡니까(*****)
		
		//short(2byte) == char(2byte)
		//short : -32768 ~ 32767 : signed type
		//char : 0 ~ 65535 : unsigned type 
		//부분적으로 형변환이 안되는 얘들이 있어 검사하는게 더 힘들어, 그냥 int를 써
		//short를 char로 쓰지만 표현 못하는 얘들이 있어서 아예 안해 
		
		//char(2byte) <-> int (4byte)
		//char : 0 ~65534 : unsigned type
		//int : -21억 ~ 21억 
		//int에서 char은 검사를 하고 가 



	
		
		
		
	}
}
