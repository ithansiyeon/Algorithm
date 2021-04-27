package com.test.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex41_Stack_basic {
	public static void main(String[] args) {
		
		//Stack, 스택
		// - 후입선출
		// - LIFO, Last Input First Out
		
		//Queue, 큐
		// - 선입선출
		// - FIFO , First In First Out
		
		//m1();
		m2();		
		
		
	}

	private static void m2() {
		
		//인터페이스 Queue 객체를 못 만들어
		Queue<String> queue = new LinkedList<String>(); // LinkedList 큐를 상속 받은 
		//Collection이 부모
		queue.add("빨강");
		queue.add("파랑");
		queue.add("노랑");
		
		System.out.println(queue.size());
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println(queue.poll()); // null이 나옴 
		
		System.out.println(queue.size());
		
		queue.add("빨강");
		queue.add("파랑");
		queue.add("노랑");
		
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println();
		
		while(queue.size()>0) {
			System.out.println(queue.poll());
		}
		
	}

	private static void m1() {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("강아지");
		stack.push("고양이");
		stack.push("병아리");
		
		System.out.println(stack.size());
		
		//System.out.println(stack.pop()); //index 사용 안함 
		//System.out.println(stack.pop());
		//System.out.println(stack.pop());
		// System.out.println(stack.pop()); EmptyStackException
		
		System.out.println(stack.size());
		
		//모든 요소 꺼내기
		while(stack.size()>0) {
			System.out.println(stack.pop());
		}
		
		//if(stack.size()>0) {
			if(!stack.isEmpty()) {
			System.out.println(stack.pop());
			}
		
			stack.push("강아지");
			stack.push("고양이");
			stack.push("병아리");
			stack.push("병아리");
			stack.push("병아리");
			
			System.out.println(stack); //순서가 존재해서 중복이 가능함 
			
			stack.clear();
			
			System.out.println(stack);
		
			stack.push("강아지");
			stack.push("고양이");
			stack.push("병아리");
			
			System.out.println(stack.peek()); // 읽기만, 사전에 check용
			System.out.println(stack.peek());
			System.out.println(stack.peek());
			System.out.println(stack.peek()); 
			System.out.println(stack.pop()); // 읽기 + 삭제
			
			//Vector 기능은 거의 안써 
			//Vector는 ArrayList랑 쌍둥이
			
			
			
			
		
	}

}
