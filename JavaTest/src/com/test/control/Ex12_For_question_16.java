package com.test.control;


public class Ex12_For_question_16 {
	public static void main(String[] args) {
		int sum=0,num=1;
		for(int i=1;i<100;i++) {
			sum+=num;
			System.out.printf("%d + ",num);
			num+=i;
			if(num>=100) break;
		}
		System.out.printf("\b\b = %d",sum);
	}

}
