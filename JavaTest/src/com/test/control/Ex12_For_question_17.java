package com.test.control;

public class Ex12_For_question_17 {
	public static void main(String[] args) {
		int sum=1;
		int a=0,b=1;
		int result=1;

		
		for(;;) {
			System.out.printf("%d + ",sum);
			sum=a+b;
			if(sum>100) break;
			result+=sum;
			a=b;
			b=sum;
		
		}
		System.out.printf("\b\b = %d",result);
		
	}

}
