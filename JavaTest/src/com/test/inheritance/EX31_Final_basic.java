package com.test.inheritance;

import java.util.Calendar;

public class EX31_Final_basic {
	public static void main(String[] args) {

		// final 키워드
		//- 한번 정하면 수정이 불가능하다!!
		
		// 1. 변수에 적용(자주 이용해야 됨)
		// a.지역 변수(final)
		// b.멤버 변수(private,static,final)
		
		// 2. 메소드에 적용
		//  - 상속 받은 메소드를 수정하면 안되는 경우.
		//  - 프로그램 안정성을 위해서...
		//  a.상속 구현 시(Override 금지)
		
		// 3. 클래스에 적용
		// 	- 상속을 더 이상 하지 못하게 막는 역할
		// 	a. 상속 구현 시
		
		// final 변수
		// - 상수(constant) : 변하지 않는 수
		// - 값을 한번 할당하면 다시는 변경할 수 없는 변수
		// - 이름이 있는 리터럴(상수)
		// - 되도록 변수명을 모두 대문자로

		int a = 10;
		final int b = 20;

		// pi = 3.14; //절대로 이값을 써야되는 값들, 일반변수로 만들면 안돼
		final double PI = 3.14;

		a = 20;
		// b=30; 한번 할당하면 더 이상 고칠수 없는 변수, 상수에 가까워

		// final int num;
		// num=10;
		// num=20;

		System.out.println(a);
		System.out.println(b);

	//1. final 변수? 
	final int YEAR=1; // 한번 만들면 수정하면 안되는 값
	
	System.out.println(Calendar.YEAR); //1 static 변수 
	
	//MyCalendar my = new MyCalendar(); //객체 변수 인스턴스 만들어야지 존재함
	//System.out.println(my.YEAR); //1
	
	System.out.println(MyCalendar.YEAR); //두 줄을 쓰는게 싫어서 static을 만든거임, static final 변수 
										//어디서든 쓸 수 있는 변치않는 값
		
	}// main

}// Ex31

class MyCalendar {
	public final static int YEAR = 1; // 상수임 
	public final static String PATH = "D:\\Java\\Data";
	public final static String ID = "admin"; //관리자 id, 대신 누구나 읽을 수 있음
}

//아무도 나를 부모 삼지 못함.
final class FinalParent {
	public final void test() {
		System.out.println("뭔가 구현..");
	}
}

//class FinalChild extends FinalParent {
//	@Override
//	public void test() { //cannot override the final method from FinalParent
//		System.out.println("자식 재정의");
//	}
	
//}
