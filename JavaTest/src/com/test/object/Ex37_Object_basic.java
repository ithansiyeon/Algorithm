package com.test.object;

public class Ex37_Object_basic {
	public static void main(String[] args) {
		
		//this vs super 연산자
		ObjectParent p = new ObjectParent();
		System.out.println(p.a);
//		System.out.println(p.b);
		
		
		ObjectChild c = new ObjectChild();
		System.out.println(c.a);
		//System.out.println(c.b); 울타리 밖이라서 안보여
		System.out.println();
		c.test();
		System.out.println();
		System.out.println(c);
		
	}

}

class ObjectParent {
	public int a =100;
	private int b = 20; // 자식에게도 비공개!!!
	
	public void check() {
		System.out.println("부모");
	}
	@Override
	public String toString() {
		return "부모";
	}
}

class ObjectChild extends ObjectParent{
	
	public int a = 200;
	private int c = 30;
	
	public void check() {
		System.out.println("자식");
	}
	
	public void test() {
		System.out.println(this.a); // 자식꺼
		System.out.println(super.a); //부모꺼 
		//System.out.println(this.b);
		System.out.println(this.c);
		check(); // this.check();
		super.check(); // 오버라이드를 통해서 감춰진거 호출할때 씀
		
	}
	public String toString() {
		
		return super.toString();
	}
	
	
}