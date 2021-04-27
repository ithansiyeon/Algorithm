package com.test.inheritance;

import java.util.Calendar;
import java.util.Random;

public class Ex32_Object_basic {
	public static void main(String[] args) {

		// Object 클래스
		// - java.lang.Object
		// - 중요 클래스
		// -Class Object is the root of the class hierarchy.Every class has Object as a
		// superclass.
		// All objects,including arrays, implement the methods of this class.
		// 클래스들은 상속관계를 맺고 있어 클래스 계층구조
		Temp t = new Temp();

		t.a = 10;
		// t.equals()
		// t.hashCode()
		// t.toString()
		System.out.println(t.hashCode()); // t의 주소값, 임시 ID, 366712642
		System.out.println(t.toString()); // 16진수의 주소값, com.test.inheritance.Temp@15db9742

		// 모든 자료형을 담을 수 있는 최상위 클래스 Object
		// 참조형
		Object o1 = new Object();
		Object o2 = new AA();
		Object o3 = new BB();
		Object o4 = new CC();
		Object o5 = new Random(); // 형변환
		Object o6 = Calendar.getInstance(); // 정적 메소드 -> 클래스 이름으로 들어가서, 그레고리력
		Object o7 = "홍길동"; // "홍길동"도 객체임
		// 값형(***)
		Object o8 = 10;
		Object o9 = true;

		Object[] list = new Object[10];

		AA a = new AA();
		AA b = new BB();
		AA c = new CC();

		Random rnd2 = new Random();

		Object rnd1 = new Random();
		list[0] = new Random(); // 배열은 하나데 서로 다른 자료형을 넣어야할때
		// object
		// System.out.println(rnd1.nextInt);
		// System.out.println((Random)rnd1.nextInt()); 뒤에 부터 실행이 돼
		System.out.println(((Random) rnd1).nextInt()); // ***
		System.out.println(((Random) list[0]).nextInt());
		System.out.println(o2);

		int num1 = 10;
		Object num2 = 20; // Boxing - 성능 저하, 값형일때만 Boxing이 일어남
		System.out.println(num1 + 10); // 10+10
		System.out.println((Integer) num2 + 10); // 값형은 boxing이 일어남, 주소값과 10을 더할려고 시도해서 안됨. 주소값은 피연산자가 될 수 없어
		// Object를 Integer클래스로 바꾼것 (int)도 가능함, 상자안에서 데이터를 뽑아내 unboxing 다운 캐스팅하면 언박싱이 자동으로 일어남, 추가로 하는 작업
		// 박싱: primitive type -> Wrapper 클래스
		// 언박싱: Wrapper 클래스(Byte,Short,Integer,..) -> primitive type(int,short,byte,boolean,...)

	}// main

}// Ex32

class AA {

}

class BB extends AA {

}

class CC extends BB {

}

class Temp extends Object { // extends를 생략하면 자동으로 Object의 친자식이 됨
	public int a;

}
