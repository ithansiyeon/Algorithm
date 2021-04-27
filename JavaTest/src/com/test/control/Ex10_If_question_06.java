package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_If_question_06 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력: ");
		int n1 = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력: ");
		int n2 = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력: ");
		int n3 = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력: ");
		int n4 = Integer.parseInt(reader.readLine());
		System.out.print("숫자 입력: ");
		int n5 = Integer.parseInt(reader.readLine());
		int evencount=0;
		int oddcount=0;
		
		if(n1%2==0) {
			evencount+=1;
		}
		else {
			oddcount+=1;
		}
		

		if(n2%2==0) {
			evencount+=1;
		}
		else {
			oddcount+=1;
		}
		

		if(n3%2==0) {
			evencount+=1;
		}
		else {
			oddcount+=1;
		}
		

		if(n4%2==0) {
			evencount+=1;
		}
		else {
			oddcount+=1;
		}
		

		if(n5%2==0) {
			evencount+=1;
		}
		else {
			oddcount+=1;
		}
		
		int diff=0;
		if(evencount>oddcount) {
			diff=evencount - oddcount;
		} else {
			diff=oddcount - evencount;
		}
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n",evencount,oddcount);
		System.out.printf("%s가 %s보다 %d개 더 많습니다.\n",evencount>oddcount? "짝수":"홀수",
															evencount>oddcount?"홀수":"짝수",diff);
		System.out.print("1~10 사이의 숫자 입력:");
		int num = Integer.parseInt(reader.readLine());
		if(num<=10 && num>=1) {
			if(num==1) {
				System.out.printf("%d -> 하나",num);
			}
			else if(num==2) {
				System.out.printf("%d -> 둘",num);
			}
			
			else if(num==3) {
				System.out.printf("%d -> 셋",num);
			}
			else if(num==4) {
				System.out.printf("%d -> 넷",num);
			}
			else if(num==5) {
				System.out.printf("%d -> 다섯",num);
			}
			else if(num==6) {
				System.out.printf("%d -> 여섯",num);
			}
			else if(num==7) {
				System.out.printf("%d -> 일곱",num);
			}
			else if(num==8) {
				System.out.printf("%d -> 여덟",num);
			}
			else if(num==9) {
				System.out.printf("%d -> 아홉",num);
			}
			else {
				System.out.printf("%d -> 열",num);
			}
		}
		else {
			System.out.println("1부터 10사이의 정수가 아니거나 잘못입력했습니다.");
		}
		
		
		
	}
}
