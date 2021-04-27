package com.test.object;

import java.util.Calendar;

public class Ex34_Generic_use_01 {
	public static void main(String[] args) {
		// Ex34_Generic_use_01.java

		// 일반클래스, 추상클래스, 인터페이스, 열거형, 제네릭 클래스

		// 제네릭 클래스, Generic Class

		// m1(); //같은 동네에선 클래스 이름 생략 가능
		// m2();

		WrapperInt n1 = new WrapperInt(100); // 하나라도 만들면 기본생성자는 생성이 안됨.
		System.out.println(n1.getData() + 100);
		n1.setData(200);
		System.out.println(n1); // 만약에 toString을 오버라이드 정의해 주지 않았다면 com.test.object.WrapperInt@73f792cf
		System.out.println();

		WrapperObject n2 = new WrapperObject(200); // Boxing
		System.out.println((int) n2.getData() + 200); // 단점 뭐가 들어있는지 알기 어려워
		n2.setData(300);
		System.out.println(n2); // WrapperObject [date=300]
		System.out.println();

		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1.getData().length());
		s1.setData("아무개");
		System.out.println(s1);
		System.out.println();

		WrapperObject s2 = new WrapperObject("유재석");
		System.out.println(((String) s2.getData()).length()); // String인지 알기 어려워
		s2.setData("강호동");
		System.out.println(s2);
		System.out.println();

		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1.getData() ? "참" : "거짓");
		b1.setData(false);
		System.out.println(b1);
		System.out.println();

		WrapperObject b2 = new WrapperObject(true);
		System.out.println((boolean) b2.getData() ? "하하" : "호호");
		b2.setData(false);
		System.out.println(b2);
		System.out.println();

		Wrapper<Integer> n3 = new Wrapper<Integer>(300);
		System.out.println(n3.getData() + 300); // **** 다운 캐스팅 필요 없다. 전용 클래스처럼
		n3.setData(400);
		System.out.println(n3);

		Wrapper<String> s3 = new Wrapper<String>("하하하");
		System.out.println(s3.getData().length()); // ***
		s3.setData("호호호");
		System.out.println(s3);
		System.out.println();

		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3.getData() ? "통과" : "거절");
		b3.setData(false);
		System.out.println(b3);

		// 범용적인 업무를 할때 제너릭, 특정 자료형에 한정적인 업무를 못함 생각보다 쓰임새가 넓지는 않음

	}// main

	private static void m2() {
		// 2:30
		// 2-30
		// 230
		// 2시간 30분
		UserTime t1 = new UserTime(2, 30);
		System.out.println(t1); // com.test.object.UserTime@2ed94a8b
		System.out.println(t1.toString()); // 주소값이 들어있는 걸 만나면 UserTime을 찾아가면 변수,메소드가 많이 있어
		// 출력을 어떻게 해야 되는지.. 경우의 수가 많아서 객체를 넣으면 출력 format을 컴이 정할 수 없어
		// t1은 toString을 호출해 최상위 루트에서 선언된 거라서 지구상에 모든 거는 toString을 갖고 있어
		// 패키지명.클래스명@해쉬코드
		// 오버라이드를 함

		Calendar c1 = Calendar.getInstance();
		System.out.println(c1); // java.util.Calendar@1351657
		System.out.println(c1.toString()); // 메소드 오버라이드

		// 모든 자바 개발자는
		// 객체.toString() -> 객체가 가지는 데이터를 문자열로 반환 -> 무조건 기대
	}

	public static void m1() { // static 반드시 붙여야 돼, 정적메소드에선 객체 메소드를 못 불러 static에선 this를 못써
							 // static 안쓰면 객체를 생성해서 불러야 돼

		int a = 10; // 값형 -> 정수
		Integer b = new Integer(10); // 참조형 -> 정수, 쌍둥이로 생각 참조형에 속하는 Integer가 있으면 편할거 같아서 만듦
		// 정수 Wrapper Class, Util Class, 여러가지 행동을 하는 클래스

		long c = 10;
		Long d = new Long(10); // char빼고 다 있음

		System.out.println(a + b); // 값 + 주소, 언박싱이 자동으로 되어 있어
		Integer.parseInt("10"); // 정적메소드, 10이라는 숫자를 주면 진짜 숫자로 바꿔줘 범용적인 일
		// 객관적인 행동을 하고 있어서 정적메소드로

		// 1. static 변수
		// 2. final 변수 -> 읽기 전용
		System.out.println(Integer.MAX_VALUE); // 고정된 값을 변함없이 제공하는 것

	}

}// Ex34

//요구사항
// - int -> Integer 
//1. int값 1개를 중심으로 그 값을 조작하는 클래스를 설계하시오.
//2. String값 1개를 중심으로 그 값을 조작하는 클래스를 설계하시오.
//3. boolean값 1개를 중심으로 그 값을 조작하는 클래스를 설계하시오.
//4. double
//5. char
//6. byte -> int
//7. short -> int
//8. float -> double
//9. long
//10. Random
//11. Calendar
//12. UserTime

class WrapperInt {

	private int data; // 중심 데이터

//	public WrapperInt() {
//		this.data = 0;	
//	}

	// 오버로딩
	public WrapperInt(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {

		return this.data + ""; // String.valueOf(this.data)
	}

}

class UserTime {
	private int hour;
	private int min;

	public UserTime(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}

	// toString() 재정의
	@Override
	public String toString() {
		return String.format("%d:%d", this.hour, this.min);
	}

}

class WrapperString {

	private String data;

	// 오버로딩
	public WrapperString(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {

		return this.data + "";
	}

}

class WrapperBoolean {

	private boolean data;

	// 오버로딩
	public WrapperBoolean(boolean data) {
		this.data = data;
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}

	@Override
	public String toString() {

		return this.data + "";
	}

}

class WrapperObject {
	private Object data; // ****모든 데이터 담을 수 있는 변수

	public WrapperObject(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "WrapperObject [data=" + data + "]";
	}

} // WrapperObject

class Wrapper<T> {
	private T data;

	public Wrapper(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data; // 유효성 검사는 똑같아서 setData만 유효성 검사를 해도 OK
	}

	@Override
	public String toString() {
		return "Wrapper [data=" + data + "]";
	}

}
