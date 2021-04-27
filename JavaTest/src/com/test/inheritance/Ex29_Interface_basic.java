package com.test.inheritance;

public class Ex29_Interface_basic {
	public static void main(String[] args) {
		
		//Ex29_Interface_basic.java
		
		//인터페이스, Interface
		// - 클래스(자료형)
		// - 추상 클래스 유사 
		
		
		
		
		
		
		
		
	}//main

} //Ex29

//추상 메소드를 가질 수 있어 
abstract class AbstractTest {
	
	//구현 멤버(일반 클래스과 동일)
	public int a;
	public void aaa() {
		System.out.println(a);
	}
	
	//추상 멤버(구현부X), 이 시그너처를 가지는 메소드를 가졌으면 해서, 알아서 만들었으면 해
	public abstract void bbb(); 
	
}

class Test extends AbstractTest {
	
	@Override
	public void bbb() {
		
		//Test 클래스 맘대로 구현(+bbb() 목적을 벗어나면 안된다.)
		
	}
}


/*

class 일반클래스 {

	구현 멤버;
	
}

abstract class 추상클래스 {
	구현멤버;
	추상 멤버;

}


interface 인터페이스 {

	추상 멤버;

}
*/


//인터페이스 선언(설계)
interface ISpeaker {
	
	//구현 멤버를 가질 수 없다.
	//public int a;
	//public void aaa() {}
	
	//추상 멤버(추상 메소드)만 가질 수 있다.
	//1. public
	//2. abstract
	void on();
	void off();
	
	
}

class Bose100 implements ISpeaker {
	@Override
	public void on() {
		
		
	}
	
	@Override
	public void off() {
		
		
	}
	
	
}