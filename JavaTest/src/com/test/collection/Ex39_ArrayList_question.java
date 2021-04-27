package com.test.collection;

import java.util.Arrays;

public class Ex39_ArrayList_question {
	public static void main(String[] args) {
		
		//요구사항] ArrayList 클래스를 구현하시오.
		// - MyArrayList.java
		//배열 생성
		//배열 생성
		MyArrayList list = new MyArrayList();
		MyArrayList list1 = new MyArrayList(3);
		//추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");
		
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");
		

		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");		

		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");
		
		list1.add("홍길동");
		list1.add("아무개");
		list1.add("하하하");
		
		System.out.println("읽기");
		//읽기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		
		System.out.println(list.get(6));
		System.out.println(list.get(7));
		System.out.println(list.get(8));
		
		System.out.println(list.get(9));
		System.out.println(list.get(10));
		System.out.println(list.get(11));
		
		System.out.println("\n생성자 매개변수에 공간변수");
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		//개수
		System.out.println(list.size());
		System.out.println();
		
		System.out.println("탐색 + 읽기");
		//탐색 + 읽기
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}
		System.out.println();
		
		System.out.println("수정");
		//수정
		list.set(0, "우하하");
		System.out.println(list.get(0));
		System.out.println();
		
		System.out.println("삭제");
		//삭제
		list.remove(1);
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}
		System.out.println();
		
		System.out.println("삽입");
		//삽입
		
		list.add(1, "호호호");
		list.add(2, "홍길동");
		list.add(3,"하하하");
	
//		list.add(4, "호호호");
//		list.add(5, "홍길동");
//		list.add(6,"하하하");
//	
//		list.add(7, "호호호");
//		list.add(8, "홍길동");
//		list.add(9,"하하하");
//	
//		list.add(10, "호호호");
//		list.add(11, "홍길동");
	
	
		
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}
		System.out.println();
		
		System.out.println("검색");
		//검색(indexOf)
		if (list.indexOf("홍길동") > -1) {
		    System.out.println("홍길동 있음");
		} else {
		    System.out.println("홍길동 없음");
		}
		System.out.println();
		
		System.out.println("초기화");
		//초기화
		list.clear();
		System.out.println(list.size());
		System.out.println();
		//----------------------------------------

		//다시 추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");
		
		System.out.println("검색");
		//검색(contains)
		System.out.println(list.contains("홍길동"));
		System.out.println(list.contains("호호호"));
		System.out.println();
		
		System.out.println("빈 배열 확인");
		//빈 배열 확인
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list.isEmpty());

		//다시 추가
		list.add("빨강");
		list.add("주황");
		list.add("노랑");
		list.add("초록");
		list.add("파랑");
		list.add("남색");
		list.add("보라");
		
		System.out.println();
		
		System.out.println("부분 배열 추출");
		//부분 배열 추출
		MyArrayList rainbow = list.subList(2, 5);

		for (int i=0; i<rainbow.size(); i++) {
		    System.out.println(rainbow.get(i));
		}


		
	}

}
