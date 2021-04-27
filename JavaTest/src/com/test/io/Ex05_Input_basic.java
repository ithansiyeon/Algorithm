package com.test.io;

//특정 도구(클래스)를 이 페이지에서 사용하겠습니다.


//import java.io.BufferedReader; //java.io 패키지 이름, 클래스 임포트  
//import java.io.InputStreamReader;
//*(all)
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex05_Input_basic {
public static void main(String[] args) throws Exception {
	
	//Ex05_Input_basic.java
	
	// 콘솔 입력
	//1. System.in.read() 메소드
	//2. BufferedReader 클래스
	//3. Scanner 클래스 
	
	//System.in.read()
	//System.out.print()
	
	//사용자로부터 키보드 입력받는다. 대기 중인 것
	System.out.println("입력 전");
	
	//문자 코드
	//'A' -> 65 ~ 'Z' -> 90
	//'a' -> 97 ~ 'z' -> 122
	//'0' -> 48 ~ '9' -> 57
	//'가' -> 44032 ~'힣' -> 55203
	
	int input = System.in.read(); //입력한 값을 integer로 돌려줌 , 버퍼를 통해서 가져옴 
	System.out.println(input);
	
	input = System.in.read(); 
	System.out.println(input);
	
	input = System.in.read(); 
	System.out.println(input);
	
	input = System.in.read(); 
	System.out.println(input);
	
	input = System.in.read(); 
	System.out.println(input);

	System.out.println("입력 후");
	
	System.out.println();
	
	//BufferedReader
	BufferedReader reader 
						= new BufferedReader(new InputStreamReader(System.in)); //reader 입력도구 
	System.out.println("입력 전");
	input = reader.read(); // 입력 스트림으로부터 한개의 문자(2byte)를 읽고 4byte int 타입으로 리턴
	System.out.println((char)input); // 위에서 못읽어준 \n을 출력해 줌 
	
	input = reader.read();
	System.out.println((char)input);
	
	input = reader.read();
	System.out.println((char)input);
	
	System.out.println("입력 후");
	
	System.out.println();
//	reader.read() 메소드
//	reader.readLine() 메소드
//	reader.readLine();
	
	System.out.println("이름을 입력하세요 : ");
	
	String name = reader.readLine();
	System.out.printf("안녕하세요. %s님\n",name);

	
	
	
	}	
}
