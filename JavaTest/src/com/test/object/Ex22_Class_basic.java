package com.test.object;

public class Ex22_Class_basic {
	public static void main(String[] args) {
		
		StaticItem item = new StaticItem();
		
		System.out.println(item.a); // 남이 부를때
		//System.out.println(item.b); 
		//절대 사용 금지 The static field StaticItem.b should be accessed in a static way
		System.out.println(StaticItem.b);
		
	}//main

}

class StaticItem{
	
	//생명 주기
	// 지역변수가 가장 짧음
	// - 객체 변수 : 객체 생성 태어남 ~ 객체 소멸 죽음(객체 참조 변수 소멸 시 같이)
	// - 정적 변수 : main() 시작 전 태어남 ~ main() 종료 후 죽음 -> 가장 김
	public int a = 10;		  // 객체 변수, 객체참조 변수로만 접근 가능
	public static int b = 20; //정적 변수, 공용 변수, 클래스 변수는 클래스 이름으로 접근 가능 
	
	// 객체 멤버 메소드
	public void aaa() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a); //객체, 내가 부를때
		System.out.println(StaticItem.b); //정적 변수
	}
	
	// 정적 멤버 메소드
	public static void bbb() {
		//System.out.println(a); //Cannot make a static reference to the non-static field a
		System.out.println(b);
		//System.out.println(this.a); //this 객체 접근 연산자, static안에서 this를 쓸 수 없어
		System.out.println(StaticItem.b); // 자기 자신을 가리키는 거라서 접근 가능
	}
	
}