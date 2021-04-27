package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For_question_13 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
	int cnum = (int)(Math.random()*10)+1;
	int count=0;
	for(int i=1;i<=10;i++) {
		System.out.print("숫자: ");
		int pnum = Integer.parseInt(reader.readLine());
		count++;
		if(pnum!=cnum) System.out.println("틀렸습니다.");
		else { 
			System.out.println();
			System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n",pnum);
			System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n",count);
			break;
		}
		
	}
	System.out.println("프로그램을 종료합니다.");
	}

}
