package com.test.control;

public class Ex12_For_question_19 {
	public static void main(String[] args) {
		
		for(int i=1;i<100;i++) {
			int sum=0;
			for(int j=1;j<i;j++)
				if(i%j==0) sum+=j;
			
			if(sum==i) {
				System.out.printf("%d = [",i);
				for(int j=1;j<i;j++)
					if(i%j==0)
						System.out.printf("%d,",j);
			System.out.print("\b]\n");
			}
		}
		
		
		
		
	}
}
