package com.test.collection;
public class question {
	public static void main(String[] args) {
		answer list = new answer(5);
		
		System.out.println(list);
		
		list.add("빨강");
		list.add("주황");
		list.add("노랑");
		list.add("파랑");
		list.add("초록");
		
		list.add("보라");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		list.set(0, "오렌지");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.add(1,"분홍");
		System.out.println(list);
		
		System.out.println(list.IndexOf("분홍"));
		
		//list.clear();
		System.out.println(list);
		
		list.contains("초록");
		
		list.trimToSize();
		System.out.println(list);
		
		answer temp = list.subList(1, 4);
		System.out.println(temp);
	}

}
