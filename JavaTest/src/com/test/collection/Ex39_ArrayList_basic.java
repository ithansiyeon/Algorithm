package com.test.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex39_ArrayList_basic {
	
	public static void main(String[] args) {
		
		//com.test.collection > Ex39_ArrayList_basic.java

		/*
		  컬렉션, Collection (목록성 데이터를 처리하는 자료구조)
		  - 배열 -> Wrapping -> 기능 추가 or 용도 지정
		  // queue나 stack 처럼 히스토리 처럼 할거인지 arraylist 처럼 순수 배열로 할건지 hashmap 처럼 할 건지 따로 만들 필요없이 제공해주는 기능
		  - 길이 가변(늘어나거나 줄어드는게 가능)
		  - 배열을 사용 목적에 따른 사용법이나 구조를 특화시켜 놓음 -> 자료구조
		  - 예전 컬렉션(Object 배열) -> 제네릭 컬렉션
		 
		  ArrayList 클래스 
		  - 순수 배열과 가장 비슷함 
		  - 사용 빈도가 가장 높음 
		  - 첨자(index)를 사용해서 요소(element)에 접근 + 제어 
		  - ArrayList(C) > List(I) > Collection(I)
		
		 
		 */
		
		//m1();
		//m2();
		m3();
		
		
		
	} //main



	private static void m3() {
		
		//ArrayList 사용법
		ArrayList <String> list = new ArrayList<String>();
		
		//1. 요소 추가하기 
		// - void add(T value)
		// - 배열의 맨 마지막에 추가하기(Append)
		
		list.add("빨강");
		list.add("노랑"); // list.remove(1), list.remove("노랑")
		list.add("파랑");
		list.add("주황");
		list.add("노랑"); // list.remove(4) list.remove("노랑")
		list.add("보라");

		
		//2. 요소 개수
		// - int size()
		System.out.println(list.size());
		
		//3. 요소 접근하기 
		// - T get(int index)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		// System.out.println(list.get(5));
		System.out.println(list.get(list.size()-1)); // length-1 배열의 성질과 같음
		System.out.println();
		//4.요소 수정하기 
		// - list[0] = 10; // 대입 + 수정 
		// - void set(int index, T value)
		
		System.out.println();
		System.out.println(list.get(2));
		
		list.set(2, "녹색");
		
		System.out.println(list.get(2));
		System.out.println();
		//5. 요소 삭제하기 
		// - 순수 배열의 요소 삭제 불가능(방길이 줄이는 것이 불가능)
		// - 컬렉션을 요소 삭제 가능(방길이 줄이는 행동)
		// - T remove(int index) // 값을 마지막으로 돌려주고 사라짐, 사라진걸 확인해야 될때, 더 많이 사용
		// - boolean remove(T value) 
		
		System.out.println();
		System.out.println(list.size());
		String old =list.remove(2);
		System.out.println(old);
		list.remove("노랑"); // 값 자체를 기억하고 있을 때, 처음 만나는 노랑을 지워줌 
		System.out.println(list.size()); 
		System.out.println(list.get(2));
		
		//6. 탐색
		// - 루프 탐색
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
			
		}
		System.out.println();
		
		
		for(String color : list) {
			System.out.println(color);
		}
		System.out.println();
		
		//7. 요소 추가하기 
		// - 배열의 원하는 위치에 추가하기 
		// - Insert(삽입)
		// - void add(int index, T value) 
		
		list.add(1, "검정");
		
		//right shift 발생
		for(String color : list) {
			System.out.println(color);
		}
		System.out.println();
		
		//8. 요소 검색하기 
		// - boolean contains(T value)
		// - int indexOf(T value) 
		
		
		if(list.contains("빨강")) {
			System.out.println("빨강 있음");
		} else {
			 System.out.println("빨강 없음");
		}
		
		System.out.println();
		
		System.out.println(list.indexOf("주황"));
		System.out.println(list.indexOf("남색"));
		
		//9. 초기화 
		// - 모든 요소 삭제하기 
		// - void clear() // 조작을 해서 지우는 것
		list.clear();
		
		//list = new ArrayList<String>(); // 옛날꺼를 버리고 새걸로 덮어쓰기 한 것 heap에 ArrayList를 만들어서 주소 값을 넣어줌
		
		System.out.println(list.size());
		
		//10. 배열이 비어있는지?
		System.out.println(list.size() == 0);
		System.out.println(list.isEmpty());
		
		
		
		
		
	}

	private static void m2() {
		
		ArrayList list1 = new ArrayList(); // Object[]
		list1.add(100);
		//list1.add("홍길동"); 추가 요소의 타입을 주의!!!
		
		System.out.println((int)list1.get(0)+100); // 요소의 사용시 형변환 주의!!! 메소드의 리턴값을 반환한 값을 int로 형변환하고 나서 언박싱
		//제네릭 버전
		ArrayList<Integer> list2 = new ArrayList <Integer>(); // int[] , 타입을 미리 지정함으로써 입출력이 편리해짐 
		
		list2.add(100);
		//list2.add("홍길동");
		
		System.out.println(list2.get(0)+100); // 자동으로 언박싱함
		
		
		ArrayList<String> list3 = new ArrayList<String>();
		
		list3.add("홍길동");
		
		System.out.println(list3.get(0).length());
		
		
	}

	private static void m1() {
		// 순수 배열
		// - 선언 : 타입 명시 + 길이 명시
		int[] nums1 = new int[3];
		
		//초기화 + 요소 제어 -> 첨자(index) 사용
		nums1[0]=100;
		nums1[1]=200;
		nums1[2]=300;
		
		System.out.println(nums1[0]); // 인덱서(Indexer)
		
		// ArrayList 컬렉션
		// - 선언 : 타입 명시(X) + 길이 명시(X)
		ArrayList nums2 = new ArrayList(); //ArrayList is a raw type. 오래된 거니까 쓰지마세요
		
		//초기화 + 요소 제어
		nums2.add(100); // 데이터를 넣는 행동, append - 배열의 (데이터가 들어있는 방 다음방에) 마지막 방에 추가
		nums2.add(200); //Boxing이 발생 
		nums2.add(300);
		
		//***절대 금지!! > Object 저장 공간은 처음에 데이터를 넣을 때 자유!! > 처음 데이터 넣고 난 후 부터는 절대적으로 처음과 같은 자료형만 넣을 것!!!!
		//nums2.add("홍길동");
		//nums2.add("아무개");
		
		//nums2.add(true);
		//nums2.add(false);
		
		System.out.println(nums2.get(0)); // 꺼낼때 방번호를 씀 , nums2[0] 언박싱 
		System.out.println((int)(Math.random() * 10));
		System.out.println((int)nums2.get(0)+100); // 다운캐스팅을 해야 돼 
		//java.lang.StringIndexOutOfBoundsException : 문자열 첨자
		//java.lang.ArrayIndexOutOfBoundsException : 배열 첨자
		//java.lang.IndexOutOfBoundsException : 컬렉션 첨자
		//System.out.println(nums2.get(5)); // index 에러 
		
		
		System.out.println(nums2.size()); // 배열의 길이 역할(집어넣은 데이터 수)
		
		// - void add(Object Value)
		// - Object get(int index)
		// - int size()

	} 

}
