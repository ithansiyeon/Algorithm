package com.test.control;

public class Ex12_For_question_18 {
	public static void main(String[] args) {
	for(int i=2;i<100;i++) {
		int count=0;
		for(int j=1;j<=i;j++) 
			{if(i%j==0) count+=1; 

			}
		if(count==2) 
			System.out.printf("%d,",i);
		}
	
		
		System.out.print("\b");
			
		}
	}
