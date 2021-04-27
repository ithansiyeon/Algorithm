package com.test.collection;

public class Ex41_Stack_question {
	public static void main(String[] args) {
		
		//MyStack.java
		//MyQueue.java
		
		testQueue();
		testStack();
		
		
	}

	private static void testQueue() {
		System.out.println("큐");
		//배열 생성
		MyQueue queue = new MyQueue();
		
		//추가
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		queue.add("주황");
		queue.add("검정");

		System.out.println("읽기");
		
		MyQueue queue1 = new MyQueue(3);
		queue1.add("빨강");
		queue1.add("노랑");
		queue1.add("파랑");
		queue1.add("주황");
		
		//읽기
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.toString());
		
		System.out.println();
		System.out.println(queue1.toString());
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());
		
		//개수
		System.out.println(queue.size());

		//확인
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.size());

		System.out.println("크기 조절");
		//크기 조절
		queue.trimToSize();
		System.out.println(queue.toString());
		//초기화
		queue.clear();
		System.out.println(queue.size());
	}

	private static void testStack() {
		System.out.println();
		System.out.println("스택");
		//배열 생성
		MyStack stack = new MyStack();

		//추가
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("검정");

		MyStack stack1 = new MyStack(3);
		stack1.push("빨강");
		stack1.push("노랑");
		stack1.push("파랑");
		stack1.push("주황");
		System.out.println(stack1);
		
		stack1.pop();
		stack1.pop();
		stack1.pop();
		stack1.pop();
		System.out.println(stack1.size());
		System.out.println();
		System.out.println("읽기");
		//읽기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		
		//개수
		System.out.println(stack.size());
		
		//확인
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		System.out.println("크기 조절");
		//크기 조절
		stack.trimToSize();
		System.out.println(stack.toString());
		
		//초기화
		stack.clear();
		System.out.println(stack.size());
	}

}
