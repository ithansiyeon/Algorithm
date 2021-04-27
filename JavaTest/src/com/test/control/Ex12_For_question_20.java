package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For_question_20 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자: ");
		int n1 = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자: ");
		int n2 = Integer.parseInt(reader.readLine());
		System.out.println();
		System.out.printf("%d의 약수: ",n1);
		
		//n1의 약수
		for(int i=1;i<=n1;i++) {
			if(n1%i==0)
				System.out.printf("%d, ",i);
			else continue;
		
		}
		System.out.println();
		//n2의 약수
		System.out.printf("%d의 약수: ",n2);
		for(int i=1;i<=n2;i++) {
			if(n2%i==0)
				System.out.printf("%d, ",i);
			else continue;
		
		}
		System.out.println();
		//n1과 n2의 공약수
		System.out.printf("%d와 %d의 공약수: ",n1,n2);
		
		if(n1>n2) {
			for(int i=1;i<=n2;i++) {
				if(n1%i==0 && n2%i==0)
					System.out.printf("%d, ",i);
				else continue;
			}
		}
		else {for(int i=1;i<=n1;i++) {
				if(n1%i==0 && n2%i==0)
					System.out.printf("%d, ",i);
				else continue; }
		}
		
		

	}	
}