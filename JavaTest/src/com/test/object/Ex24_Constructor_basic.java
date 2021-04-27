package com.test.object;

public class Ex24_Constructor_basic {
	public static void main(String[] args) {
		// 생성자, Constructor
		// - 특수한 목적을 가지는 메소드
		// - 객체(멤버변수)를 초기화하는 역할(***)
		// - 메소드명이 클래스명과 동일하다.
		// - 반환타입을 명시하지 않는다.

		// 자료형 변수명 = 객체생성연산자 생성자(메소드);
		// 참조변수의 성질을 나타내는 대표적인 식별자 자료형
		Cup c1 = new Cup(); // 실행하기전에 static이 만들어지기 때문에 정적 변수는 초기화를 하지 않음
		// 1. new: 클래스를 찾아가 거기있는 설계도대로 새롭게 객체를 만들어
		// 2. Cup() : 모든 변수는 null로 시작하는데 Cup이 호출되면서 모든 값형의 변수를
		// 실제값으로 초기화함. new가 만들어진 공간에 setting을 함. 초기작업을 해주는 전용 메소드
		// 생성할때 초기셋팅을 해주어서 생성자, 생성자로 불리는 특수한 메소드

		// 시점 문제
		// 1. 초기값 : 생성자
		// 객체 생성 후 나중에 값을 변경할 때 사용. 수정 : setter
//		c1.setName("종이컵"); //null->"종이컵"
//		c1.setSize(150);

		System.out.println(c1.getName());
		System.out.println(c1.getSize()); // 값형은 셋팅이 되는 이유가 기본적인 생성자가 동작하고 있어서임.

		Cup c2 = new Cup("스테인레스 컵", 850); // 처음부터 태어남

		System.out.println(c2.getName());
		System.out.println(c2.getSize());

		Cup c3 = new Cup("나무컵");
		Cup c4 = new Cup(1000); // 다양성을 제공함, 오로지 클래스를 사용하는 입장에서 좀 더 편하게 쓸 수 있도록

	}// main

}

class Cup {

	// 멤버 변수, 선언만 하는 곳
	private String name;
	private int size;
	private static int count;

	// 초기화만 하는 곳
	// 객체 변수 -> 객체 생성자
	// 정적 변수 -> 정적 생성자

	// 정적 생성자
	static {
		Cup.count = 0; // static 변수만 초기화를 함
	}

	// 기본 생성자(좁은 범위의 생성자)
	public Cup() {
		// this.setName("종이컵");
		// this.setSize(150);
		this("종이컵", 150); // this 키워드를 사용해서 Cup(String name, int size)를 불러옴, 다른 생성자를 호출함으로써 중복을 없앰
	}

	// 생성자 오버로딩(메소드 오버로딩)
	public Cup(String name, int size) { // setter랑 유사함
		this.name = name;
		if (size > 0) {
			this.size = size;
		}
	}

	public Cup(String name) {
		// this.name=name;
		// this.size=0;
		this(name, 0);
	}

	public Cup(int size) {
		// this.size = size;
		// this.name = "이름없음";
		this("이름없음", size);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}