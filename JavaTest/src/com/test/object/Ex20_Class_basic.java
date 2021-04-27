package com.test.object;

public class Ex20_Class_basic {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("홍길동");
		
		Person p2 = new Person();
		p2.setName("아무개");
		
		Person p3 = new Person();
		p3.setName("하하하");
		
		
		//참조형 배열
		Person[] list = new Person[3]; //Person 객체가 몇개 생성되었습니까? 3개(X) 0개(O)
									  // 참조변수 3개를 만든것 null 빈방한테 일을 시킨거야
		
										
		list[0] = new Person(); //객체를 만들어서 처음으로 인스턴스 하나가 배열안에 들어가 있어
		list[1] = new Person();
		list[2] = new Person(); 
		
		list[0].setName("홍길동"); //java.lang.NullPointerException 널인 상태에서 들어있는 것처럼 접근을 해서 
		//생긴에러 아무것도 없는데 쓸려고해서 나는 에러
		System.out.println(list[0].getName());
		
		
	
	}
	

}

class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}