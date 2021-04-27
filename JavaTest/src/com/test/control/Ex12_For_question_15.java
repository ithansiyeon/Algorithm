package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For_question_15 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int oddsum=0,evensum=0;
		System.out.print("9자리 숫자 입력 : ");
		String snum =reader.readLine();
		int num = Integer.parseInt(snum);
		int inum=num;
		/*
		if(snum.length()>9) return;
		else {
			for(int i=1;i<=snum.length();i++) {
			int each=inum%10;
			if(each%2==0) { evensum+=each;
			inum/=10;
			}
			else {oddsum+=each;
			inum/=10;}
			}
		}
		System.out.printf("짝수의 합: %d\n",evensum);
		System.out.printf("홀수의 합: %d",oddsum);
		*/
		boolean loop = false;
		if(snum.length()>9) return;
		else {
			for(int i=0;i<snum.length();i++) {
			int each=num/(int)Math.pow(10,i);
			each%=10;
			if(each%2==0) { evensum+=each;}
			else {oddsum+=each;}
			}
		}
		System.out.printf("짝수의 합: %d\n",evensum);
		System.out.printf("홀수의 합: %d",oddsum);
		
	}

}
