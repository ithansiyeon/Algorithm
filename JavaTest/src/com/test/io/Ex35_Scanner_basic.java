package com.test.io;

import java.util.Arrays;
import java.util.Scanner;

public class Ex35_Scanner_basic {
	public static void main(String[] args) {
		
		//콘솔 입력
		//1. System.in.read() 클래스 변수(객체) 메소드 -> in 멤버 변수
		//2. BufferedReader
		//3. Scanner
		
		Scanner scan = new Scanner(System.in);
		
		// 사용자가 입력한 데이터를 반환
		// - 실체 : 입력 버퍼의 읽어올 수 있는 다음 데이터 반환
		//scan.nextXXX();
		System.out.print("입력 : ");
		
		//입력받은 \r\n를 자동으로 버림 
		//String input = scan.nextLine(); // reader.readLine() 한줄을 입력 받는 얘임
		//System.out.println(input);
		
		//숫자 + 10
		int num = scan.nextInt(); // 엔터를 자동으로 버리지 않음 
		System.out.println(num + 10);
		
		//scan.skip("\r\n"); // 엔터를 버림, 연속으로 받을때 주의해야 돼
		scan.nextLine();
		
		//String input = scan.nextLine();
		//System.out.println(input);
		
		//nextLine():라인 입력
		//next() : 토큰(Token - 공백으로 구분되는 요소) 입력
		//String input = scan.next(); 
		//System.out.println(input);
		
//		String input = "";
//		
//		while ((input = scan.nextLine()) != "") { //""이면 true라서 while을 빠져나가지 못함, 아무것도 입력을 안하면 while문 빠져나가지 못함
//			System.out.println(input);
//		}
		
		
		String input = scan.nextLine(); // 문자열 하나
		
//		//문자열 메소드
//		// - String[] split(String splitter) 구분자
		
		String[] result=input.split(" "); // ,를 기준으로 자른거임 배열로 3덩어리가 만들어짐 
										 // 공백을 기준으로 잘라서 배열로 만들어줌
		
		System.out.println(Arrays.toString(result));
		System.out.println("종료");
		
		
	}

}
