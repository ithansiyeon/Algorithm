package com.test.datatype;

public class Ex02_Variable_use_02 {
public static void main(String[] args) {
	//Ex02_Variable_use_02 
	//자바 자료형 8개 + 변수 만들기 
	
	//1. byte : -128~127
	byte b1;
	b1 = 10; //Type mismatch: cannot convert from int to byte, int에서 byte로 변환할 수 없습니다.
	System.out.println(b1);
	
	
	//2. short: -32768 ~ 32767
	
	short s1;
	s1= 10;
	System.out.println(s1);
	
	//3. int :-21억 ~21억
	int n1;
	n1 = 10;
	System.out.println(n1);
	
	//4. long: -922경 ~ 922경 
	long l1;
	l1=10000000000L; //The literal 10000000000 of type int is out of range
	System.out.println(l1);
	
	//데이터 -> 상수, 리터럴(Literal)
	// 상수는 변하지 않는 변수, 참조변수 메모리의 주소값(메모리값)이 변하지 않는다는 의미
	// 리터럴(메모리 위치안의 값)은 변수에 넣는 변하지 않는 데이터를 의미 
	// ex) final int a =1; a는 상수, 1은 리터럴, 1과 같이 변하지 않는 데이터(boolean,char,double
	// long, int etc..)를 리터럴  
	System.out.println(10);
	System.out.println(10);
	System.out.println(10);
	System.out.println(10);
	
	//실수
	//1.float
	float f1;
	f1=3.14F; //Type mismatch: cannot convert from double to float 실수형 상수도 정해져 있어 
	f1=1.234567890123456789F; // 이게 정밀도를 의미함, detail 한거에 적합하지 않음 
	System.out.println(f1);
	
	//2. double
	double d1;
	d1=6.28;
	d1=1234567890123456789D;
	System.out.println(d1);
	
	//문자형 
	//1. char
	char c1;
	c1 = 'A'; // 문자 리터럴, 2Byte 문자는 ''로 감싼다.
	System.out.println(c1);
	c1='가';
	System.out.println(c1);
	
	c1='*';
	System.out.println(c1);
	
	c1='1';
	System.out.println(c1);
	
	//논리형
	//1. boolean
	boolean flag;
	flag = true; // true,false: 논리 상수 , boolean literal
	flag = false;
	
	System.out.println(flag);
	
	//자바 자료형
	// 1.기본형: byte,short,int,long,float,double,boolean,char
	// 2.참조형 : String
	
	// 문자열,String 
	// -참조형
	
	//문자 , char
	
	//'홍길동' -> 변수 저장
	char name1 = '홍'; 	
	char name2 = '길'; 	
	char name3 = '동';
	
	//문자들의 열을 저장하는 자료형 -> 문자열(String)
	String name;
	name = "홍길동"; // 문자열 상수, String Literal 
	System.out.println(name);
	
	name = "홍";
	
	/*
	
	영문식 표현
 	~(tild), !(exclamation point), @, #, $, %, ^(xor,circumflex), &, *(all(wildcard),asterisk), 
 	-(minus,dash,hyphen,horizontal-bar), :,;,|(pipe,vertical bar),/,\,',",`, , ,. 

	괄호
	() 
	[]
	{}
	<> // 화살표 괄호
	
	//영어 표현 자주 나옴 
	A>B // A greater than B
	A>=B // A greater than or equal to B
	A<B // A less than B
	A<=B // A less than or equal to b B
	
	나이 > 20
	
	http://blog.daum.net/jcnet/15625303
	 */	
	
	
	
	}
}
