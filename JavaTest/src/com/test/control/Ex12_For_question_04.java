package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For_question_04 {
	public static void main(String[] args) throws Exception {
		
		//5.누적 변수(짝수용,홀수용)
		//3.반복문 실행(for) {
		//1.BufferedReader 만든다.
		//2.숫자를 입력받는다.
		//6.짝수인지? 홀수인지?
		//7.짝수면 > 짝수용 누적 변수에 누적
		//8.홀수면 > 홀수용 누적 변수에 누적
		//4. }
		
		m1();
		m2();
	}
	//선생님 코드
	private static void m2() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //1.
		int oddSum=0,evenSum=0;
		
		for(int i=0;i<10;i++) { //3.
		System.out.print("숫자: "); //2.
		int num= Integer.parseInt(reader.readLine());
		if(num%2==0) evenSum+=num; //8.
		else oddSum+=num;//8.
		}
		System.out.printf("짝수합: %d,홀수합: %d\n",evenSum,oddSum);
		
	}

	private static void m1() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int evensum=0;
		int oddsum=0;
		System.out.print("입력 받을 숫자의 개수: ");
		int count = Integer.parseInt(reader.readLine());
		for(int i=1;i<=count;i++) {
		System.out.print("숫자: ");
		int num = Integer.parseInt(reader.readLine());
		if(num%2==0) { evensum+=num;}
		else { oddsum+=num;}
		
		}
		System.out.printf("짝수의 합: %,d\n",evensum);
		System.out.printf("홀수의 합: %,d",oddsum);
	}

}
