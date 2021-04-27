package com.test.method;

public class Ex08_Method_question_11 {
	public static void main(String[] args) {
		position("홍길동");
		System.out.println();
		position("홍길동","유재석");
		System.out.println();
		position("홍길동","유재석","박명수");
		System.out.println();
		position("홍길동","유재석","박명수","정형돈");
		
	}
	
	public static void position(String name1) {
		System.out.printf("사원 : %s\n",name1);
		
	}
	
	public static void position(String name1,String name2) {
		System.out.printf("사원 : %s\n",name1);
		System.out.printf("대리 : %s\n",name2);
		
	}
	public static void position(String name1,String name2, String name3) {
		System.out.printf("사원 : %s\n",name1);
		System.out.printf("대리 : %s\n",name2);
		System.out.printf("과장 : %s\n",name3);
		
		
	}
	
	public static void position(String name1,String name2, String name3,String name4) {
		System.out.printf("사원 : %s\n",name1);
		System.out.printf("대리 : %s\n",name2);
		System.out.printf("과장 : %s\n",name3);
		System.out.printf("부장 : %s\n",name4);
		
	}
}
