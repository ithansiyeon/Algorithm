package com.test.two;

import com.test.one.Student;

//다른 동네의 멤버를 접근해 보자 
public class Item {
	
	public void test() {
		Student s1 = new Student();
		// 패키지가 바뀌면 public 빼고 다 안돼
		System.out.println("다른 패키내에의 다른 클래스에서 접근");
		//System.out.println("private a : "+s1.a);
		System.out.println("public b : "+s1.b);
		//System.out.println("protected c : "+s1.c);
		//System.out.println("default d : "+s1.d);
		System.out.println();
		
	}
	
	
}
