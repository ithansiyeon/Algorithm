package com.test.object;

import java.util.Arrays;

public class Ex16_Class_question_01 {
	public static void main(String[] args) {
		
		//Ex16_Class_question_01.java : 테스트 중심 
		//Book.java : 문제 중심
		Book book = new Book();
		book.setTitle("이것이 자바다"); // 공백도 생각 
		book.setPrice(27000);
		book.setAuthor("신용권");
		book.setPage(300);
		book.setPublisher("한빛미디어");
		book.setIsbn("FBC13");
		//System.out.println(Arrays.toString(colors)); 
		System.out.println(book.getTitle());
		System.out.println(book.getPrice());
		System.out.println(book.getAuthor());
		System.out.println(book.getPage());
		System.out.println(book.getPubYear());
		System.out.println(book.getIsbn());
		
		System.out.println(book.info());
		//System.out.println(book.info());
		
		
		
	}
	
	
	
}
