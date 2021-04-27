package com.test.io;

public class Ex04_Output_basic {
	public static void main(String[] args) {
		
		//Ex04_Output_basic.java
		
		//메소드 = 기능 
		
		//콘솔 입출력, Console Input/Output, Console IO
		// - 기본 입력 장치 : 키보드
		// - 기본 출력 장치 : 모니터
		// - 기본 에러 장치 : 모니터 
		
		//콘솔 출력 
		//1. System.out.println() 메소드
		//2. System.out.print() 메소드
		//3. System.out.printf() 메소드
		
		//형식 문자를 사용해서 복잡한 문자열을 손쉽게 출력한다.
		//형식 문자 
		//1. %s : String
		//2. %d : Decimal(byte, short, int, long)
		//3. %f : Float(float,double)
		//4. %b : Boolean
		//5. %c : Char
		
		//형식 문자 추가 기능
		//1. %숫자d 정수 자리 바꿔줌 
		// -  출력 너비(문자수)
		// - +(우측), -(좌측) 
		// - %숫자d, %숫자f, %숫자s, %숫자b, %숫자c
		//2. %,d 
		// - 자릿수(천단위) 표기 
		// - %,d, %,f
		
		//3. %.숫자f 
		// - 소수이하 출력 자릿수 표기
		// - %f
		// - 반올림
		
		//4. %,너비.소수f
		
		
		
		//println() : line > 내용을 출력 후에 개행을 한다., 각 라인별 출력 
		System.out.println(100);
		System.out.println(3.14);
		System.out.println("문자열");
		System.out.println('A');
		System.out.println(true);
		
		//print() :내용을 출력한다.
		System.out.print("빨강");
		System.out.print("노랑");
		System.out.print("파랑");
		
		//printf() : 형식 문자 사용해서 출력한다.
		System.out.printf("%d",100);
		System.out.printf("%f",3.14);
		System.out.printf("%s","홍길동");
		System.out.printf("%b",true);
		System.out.printf("%c",'A');
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
