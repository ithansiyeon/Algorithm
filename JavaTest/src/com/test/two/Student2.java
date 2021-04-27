package com.test.two;

import com.test.one.Student;

public class Student2 extends Student{
	
	public void test() {
		System.out.println("다른 패키지내의 자식 클래스에서 접근");
		//System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c); // protected는 자식 클래스가 접근이 가능함, 상속관계에서 쓰임
		//System.out.println(this.d);
		
	}
}
