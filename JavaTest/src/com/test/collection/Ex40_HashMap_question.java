package com.test.collection;

public class Ex40_HashMap_question {
	public static void main(String[] args) {
		//  Ex40_HashMap_question.java
		//MyHashMap.java
		
		//배열 생성
		MyHashMap map = new MyHashMap();

		//추가
		map.put("국어", "합격");
		map.put("영어", "불합격");
		map.put("수학", "보류");
		
		MyHashMap map1 = new MyHashMap(3);
		System.out.println(map1);
		
		map1.put("국어", "합격");
		map1.put("영어", "불합격");
		map1.put("수학", "보류");
		map1.put("과학", "합격");
		
		System.out.println(map1.toString());
		
		//읽기
		System.out.println("읽기");
		System.out.println(map.get("국어"));
		System.out.println(map.get("영어"));
		System.out.println(map.get("수학"));
		System.out.println(map.toString());
		//개수
		System.out.println(map.size());

		//수정
		System.out.println("수정");
		map.put("영어", "합격");
		System.out.println(map.get("영어"));
		System.out.println(map.toString());
		//삭제
		System.out.println("삭제");
		map.remove("영어");
		System.out.println(map.get("영어"));
		System.out.println(map.toString());
		//검색(key)
		if (map.containKey("국어")) {
		    System.out.println("국어 점수 있음");
		} else {
		    System.out.println("국어 점수 없음");
		}

		//검색(value)
		if (map.containsValue("합격")) {
		    System.out.println("합격 과목 있음");
		} else {
		    System.out.println("합격 과목 없음");
		}

		//초기화
		map.clear();
		System.out.println(map.size());
		System.out.println(map.toString());
	}

}
