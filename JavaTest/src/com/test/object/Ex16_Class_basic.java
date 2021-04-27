package com.test.object;

public class Ex16_Class_basic {
	public static void main(String[] args) {
		// Ex16_Class_basic.java

		/*
		  
		  클래스, class - 객체 지향 프로그래밍(Object Oriented Programming) 
			  - 프로그램을 객체의 행동과 상태 중심으로 풀어나가는 방식 
			  - 코드의 집합(같은 성질의 코드를 묶어서) - 붕어빵틀
		  
		  객체, Object 
		  	- 클래스로부터 실체화된 결과물 
		  	- 붕어빵
		  
		  인스턴스,Instance 
			   - 클래스로부터 실체화된 결과물
			   - 붕어빵 
			   - 메모리에 실체화된 객체를 인스턴스
		  
		  속성, Property 
			  - 객체가 가지는 데이터 
			  - 멤버 변수
		  
		  메소드, Method, 행동, Behavior 
			  - 객체가 가지는 행동 
			  - 멤버 메소드 -> 멤버 변수를 항상 활용해서 사용함
	
		  자바에서 클래스 만들기
		  		class 클래스명 { //내용물 -> 클래스 멤버, Class Member 1. 멤버 변수 2. 멤버 메소드 }
		 
		 
		 
		 */
		// 요구사항] 지도 -> 우리집의 좌표 표시 + 저장 + 불러오기 등등...

		// Case 1.

		// 우리집
		String name = "우리집";
		int x = 100;
		int y = 200;

		// 마트
		String name1 = "마트";
		int x2 = 300;
		int y2 = 400;

		// Case 2.
		name = "우리집";
		int[] a1 = { 100, 200 }; // x,y
		name1 = "마트";
		int[] a2 = { 300, 400 }; // x,y

		System.out.println(a1[0]); // x?
		System.out.println(a1[1]); // x? 의미를 알기가 어려워

		// 안의 세부 데이터의 성질을 알 수 없고 다른 타입의 자료형을 집어 넣을 수 없음

		// Case3.
		// - 클래스 사용 => 클래스의 객체(인스턴스)를 생성한다.
		Point p1 = new Point(); // x + y + name

		p1.x = 100;
		p1.y = 200;
		p1.name = "우리집";

		Point p2 = new Point(); // x + y + name

		// p1.x와 p2.x는 다른 x임
		p2.x = 300;
		p2.y = 400;
		p2.name = "마트";
		// 그룹인건 변수명 때문에 확실함
		// 배열은 index 클래스는 이름으로 접근

		Size s1 = new Size(); // 메모리의 공간을 할당 받는 것
		s1.width = 100;
		s1.heigth = 100;

		System.out.println(s1.width);
		System.out.println(s1.heigth);

		// 클래스 선언시 권장(필수) 사항
		// 1. 하나의 클래스는 하나의 파일로 저장한다.
		// 2. 선언된 클래스의 이름이 파일의 이름과 같아야 한다.
		// 3. 하나의 파일에 2개 이상의 클래스 선언 시
			// a. 반드시 public 키워드 클래스 딱 1개 존재
			// b. public 키워드 클래스의 이름이 파일명이 된다. -> 대표 클래스

		// int Num;
		// int Num; 대문자로 변수를 만들면 안돼, 읽기 전용 변수로 생각
		// Test();
		// 변수는 캐멀 표기법으로 사용

		Student2 st1 = new Student2();

		st1.name = "홍길동";
		st1.kor = 100;
		st1.eng = 100;
		st1.math = 100;
		st1.total = st1.kor + st1.eng + st1.math;
		st1.avg = st1.total / 3.0;

		// A.(3번 물어봐서)
		// 학생 정보 출력
		System.out.printf("이름: %s\n", st1.name);
		System.out.printf("총점: %d\n", st1.total);
		System.out.printf("평균: %.1f\n", st1.avg);

		// B.(학생정보를 넘겨서 이름,총점,나이를 가져다가 print가 출력, 중앙에서 몰아서)
		print(st1);

		// C.(st1,st2,st3 객체 스스로가 출력하는 것, 개인이 알아서 출력)
		st1.print();

		int a = 10;
		int b = 5;

		// add(a,b); 호출과 선언이 하나의 클래스에 있을때

		MyMath.add(a, b); // 다른 클래스의 내의 메소드는 클래스명을 생략할 수 없다.
		MyMath.substract(a, b); // add,substract의 행동을 관리하기 위한 용도, 행동의 집합
		Ex16_Class_basic.test(); // FM
		test(); // 같은 클래스의 내의 메소드는 클래스명을 생략할 수 있다.

		Phone t1 = new Phone();
		// t1이라는 참조변수에
		t1.model = "아이폰";
		t1.number = "010-1234-5678";
		t1.owner = "홍길동";

		t1.info();
		t1.call();

		Phone t2 = new Phone();
		t2.model = "갤럭시";
		t2.number = "010-2345-3456";
		t2.owner = "아무개";
		// 하나 객체안에서만 이루어짐
		t2.info();
		t2.call();

	} // main

	private static void print(Student2 st1) {

		System.out.printf("이름: %s\n", st1.name);
		System.out.printf("총점: %d\n", st1.total);
		System.out.printf("평균: %.1f\n", st1.avg);

	}

	public static void test() {

	}

}// Ex16

//클래스 선언하는 위치 
//-데이터 집합으로써 사용하기 위해 클래스를 선언함!!, 틀
class Point {

	// 클래스 멤버 변수
	public int x;
	public int y;
	public String name; // 클래스는 안의 멤버 변수의 타입을 따로 가리지 않아

}

class Size {

	public int width;
	public int heigth;

}

//클래스을 생성하는 목적
//1. 데이터 집합 = 멤버 변수 //***** 적당
//2. 행동 집합 = 멤버 메소드  //별로 없음
//3. 데이터 + 행동 집합 = 멤버 변수 + 멤버 메소드  //**************** 가장 많음

//행동 집합
class MyMath {
	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void substract(int a, int b) {
		System.out.println(a - b);
	}
}

//데이터 + 행동
class Phone {

	// 멤버 변수
	public String model;
	public String number;
	public String owner;

	// 멤버 메소드 : 항상 객체 메소드는 자신의 정보(데이터)를 바탕으로 행동해야 한다.

	public void info() {
		// System.out.println("전화기입니다.");
		System.out.printf("%s가 소유하고 있는 전화기입니다. 번호는 %s입니다.\n", owner, number); // 자신의 정보를 바탕으로 행동해야 돼
	}

	public void call() {
		System.out.printf("%s의 전화기로 전화를 겁니다.\n", owner);
	}

}


