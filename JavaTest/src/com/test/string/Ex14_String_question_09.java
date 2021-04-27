package com.test.string;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Ex14_String_question_09 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("주민등록번호 : ");
		String jumin = reader.readLine();
		String num = jumin.replace("-", "");
//		String num = jumin.substring(0,jumin.indexOf("-"))+
//					 jumin.substring(jumin.indexOf("-")+1,jumin.length());
		//- 없어도 만족하게끔, 위에 한꺼번에 처리
		int sum=0;
		
		//for문 한줄 
		
		for(int i=0;i<num.length()-1;i++) {
			if(i<8)
			sum+=((int)num.charAt(i)-48)*(i+2);
			else sum+=((int)num.charAt(i)-48)*(i-6);
		}
		
		
		//1->1
		//10->0
		//11->1
		
		switch(11-sum%11) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				if((int)(num.charAt(12)-48)==11-sum%11) System.out.println("올바른 주민등록번호입니다.");
				else System.out.println("올바르지 않는 주민등록번호입니다.");
			break;
			case 10:
				if((int)(num.charAt(12)-48)==0) System.out.println("올바른 주민등록번호입니다.");
				else System.out.println("올바르지 않는 주민등록번호입니다.");
			break;
			case 11:
				if((int)(num.charAt(12)-48)==1) System.out.println("올바른 주민등록번호입니다.");
				else System.out.println("올바르지 않는 주민등록번호입니다.");
			}
		

		
	}
}