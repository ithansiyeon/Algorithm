 package com.test.inheritance;

public class Ex26_Overriding_basic {
	public static void main(String[] args) {
		
		//Ex26_Overriding_basic.java
		
		//메소드 오버로딩, Method Overloading(Overload)
		//메소드 오버라이딩, Method Overriding(Override)
		
		//메소드 오버라이드
		// - 메소드 재정의(다시 선언)
		// - 메소드의 시그너처(헤더)는 그대로 두고, 구현부를 다시 만드는 작업
		// - 상속 관계에서 나타나는 현상
		// - 상속 관계에 있는 클래스보다 그 클래스 사용하는 쪽에서 더욱 편하다. 여러 메소드명을 기억하지 않아도 되기
		// 때문에...
		
		OverrideParent p = new OverrideParent();
		//p.hello();
		
		OverrideChild c = new OverrideChild();
		//c.hello();
		
		p.hello();
		
		//c.hi();
		c.hello(); // 마을 사람들이 수혜를 봄
		
		 
	} // main

} // Ex26


class OverrideParent {
	
	// 구현 멤버
	
	//인사하는 메소드
	public void hello() {
		System.out.println("안녕하세요.");
	}
}

class OverrideChild extends OverrideParent {
	
//	public void hi() {
//		System.out.println("방가~");
//	}
	
	//오버라이드 발생
	// - 부모가 상속해준 메소드를 동일한 시그너처로 다시 만드는 작업
	// - 부모가 상속해준 메소드 감춰진다.(***)
	//상속에 의해서 하면 에러가 안나
//	public void hello() {
//		System.out.println("방가~");
//	}
	
	@Override //주석 
	public void hello() {
	
		System.out.println("방가~"); // 부모꺼의 시그치너 기억하지 않아도 됨, Ctrl + space
		
	}
	
}

