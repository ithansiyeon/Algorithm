package com.test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex12_For2_question_11 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean loop = true; 
		int money=100000,amount=0;
		System.out.println("My Bank를 시작합니다.");
		for(;loop;) {
		System.out.println("===========================");
		System.out.println("         My Bank           ");
		System.out.println("===========================");
		System.out.println("1. 계좌 입금");
		System.out.println("2. 계좌 출금");
		System.out.println("3. 잔액 조회");
		System.out.println("4. 종료");
		
		System.out.println("===========================");
		System.out.print("선택(번호) : ");
		int num = Integer.parseInt(reader.readLine());
		System.out.println();
		
		switch(num) {
			case 1:
				System.out.println("===========================");
				System.out.println("         계좌 입금      ");
				System.out.println("===========================");
				System.out.println();
				System.out.print("계좌 비밀번호: ");
				String password = reader.readLine();
				if(password.equals("1234")) {
				System.out.print("입금액: ");
				amount= Integer.parseInt(reader.readLine());
				money=deposit(amount,money);
				 }
				else {
					System.out.println("잘못된 비밀번호를 입력하셨습니다.");
					pause();
				}
				break;
			case 2:
				System.out.println("===========================");
				System.out.println("         계좌 출금        ");
				System.out.println("===========================");
				System.out.println();
				System.out.print("계좌 비밀번호 : ");
				password = reader.readLine();
				if(password.equals("1234")) {
					System.out.print("출금액 :");
					amount = Integer.parseInt(reader.readLine());
					money=withdraw(amount,money);
					
				}
				else {
					System.out.println("잘못된 비밀번호를 입력하셨습니다.");
					pause();
				}
				break;
			case 3:
				check(money);
				break;
			case 4:
				loop = false;
				
			}
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		
	}
	private static void pause() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("계속하시려면 엔터를 누르세요.");
		reader.readLine();
		}
	
	private static void check(int money) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("===========================");
		System.out.println("         잔액 조회       ");
		System.out.println("===========================");
		System.out.println();
		System.out.printf("현재 잔액 : %,d원\n",money);
		pause();
	}

	private static int withdraw(int amount,int money) throws Exception {
		System.out.printf("%,d원이 출금되었습니다.\n",amount);
		money = money-amount;
		pause();
		return money;
	}

	private static int deposit(int amount,int money) throws Exception{
		System.out.printf("%,d원이 입금되었습니다.\n",amount);
		money+=amount;
		pause();
		return money;
	}
	
	

}
