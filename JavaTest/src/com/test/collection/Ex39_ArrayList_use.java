package com.test.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex39_ArrayList_use {
	public static void main(String[] args) {
		//Ex39_ArrayList_use.java
		//m1();
		m2();
		//m3();
	}



	private static void m3() {
		
		//배열 : 길이 불변
		//컬렉션 : 길이 가변. 배열 Wrapper 클래스 
		
		ArrayList<Integer> list = new ArrayList<Integer>(1000); // 처음으로 1000칸으로 시작함, 한번에 미리 많은 양의 데이터를 넣을 것이라고 예측이 되면
		System.out.println(list.size());
		
		for(int i=0;i<1000;i++) {
		//10 -> 20 -> 40 -> 80 -> 160 -> 320 -> 640 -> 1280
		// 앞에 꺼들 희생된 양들 
			list.add(i);
		}

		
		list.trimToSize(); // 현재 데이터의 갯수와 동일한 배열로 교체
		
		System.out.println(list.size());
		
		list.remove(100);
		System.out.println(list.size()); 
		
	}



	private static void m2() {
		//요소의 타입
		
				//1. 단일값 배열
				//2. 다중값 배열
				
				int[] list1 = new int[3]; // 단일값 배열(방 1개 = int)
				String[] list2 = new String[3]; // 단일값 배열(방 1개 = String)
				Item[] list3 = new Item[3]; // 다중값 배열(방 1개 = 데이터 3개) -> 데이터 3개라는게 a,b,c ??
				
				ArrayList<Integer> list4 = new ArrayList<Integer>(); // 단일값 배열
				ArrayList<String> list5 = new ArrayList<String>(); // 단일값 배열
				ArrayList<Item> list6 = new ArrayList<Item>(); // 다중값 배열
				
				list3[0] = new Item(); // *
				list3[1] = new Item();
				list3[2] = new Item();
				
				list3[0].a=100;
				list3[0].b=200;
				list3[0].c = "홍길동";
				
				list6.add(new Item()); // *
				list6.add(new Item());
				list6.add(new Item());
				
				list6.get(0).a=100;
				list6.get(0).b=200;
				list6.get(0).c="홍길동";
				
				int[][] list7 = new int[2][3];
				list7[0][0] = 100;
				
				ArrayList<ArrayList<Integer>> list8 = new ArrayList<ArrayList<Integer>>();
				list8.add(new ArrayList<Integer>());
				list8.add(new ArrayList<Integer>());
				
				// 우선 구조 2차원을 만들고 나서
				// ArrayList를 실제로 만들어서 생성하고 값을 넣어서 2차원 배열을 완성함??
				
				list8.get(0).add(100);
				list8.get(0).add(200);
				list8.get(0).add(300);
				
				list8.get(1).add(400);
				list8.get(1).add(500);
				list8.get(1).add(600);
				
				ArrayList<Integer> sub = new ArrayList<Integer>();
				sub.add(700);
				sub.add(800);
				sub.add(900);
				
				list8.add(sub);
				
				//ArrayList<ArrayList<ArrayList<Item>>> items = new ArrayList<ArrayList<ArrayList<Item>>>(); // 3차원은 만들었지만 1,2차원은 만들지 않았어.
				//items.get(0).get(0).get(0).a = 100;
	}
	
	private static void m1() {
		// 배열 vs ArrayList
					// - 길이 고정? 
					
					// 요구사항] 학생 명단 관리, 배열 중심으로 연습해야 돼
					// 1. 5명 고정, 순수 배열이 빠름 > 배열 사용
					// 2. 고정 불확실 > ArrayList 사용 
					
//					Scanner scan = new Scanner(System.in);
//					
//					String[] names = new String[5];
//					
//					for(int i=0;i<names.length;i++) {
//						System.out.print("이름 : ");
//						names[i]=scan.nextLine();
//					}
//					System.out.println();
//					System.out.println(Arrays.toString(names)); // 인원수를 고쳐달라고 하면 소스를 고쳐야됨 
					
					Scanner scan = new Scanner(System.in);
					
					ArrayList<String> names = new ArrayList<String>(); // 가변
					
					//int count=5;
					
					//for(int i=0;i<count;i++) {
					for(;;) {
						System.out.print("이름 : ");
						String input = scan.nextLine();
						if(input.equals("exit")) {
							break;
						}
						names.add(input); // nextLine은 유일하게 한번만 받아야 돼~! 
					}
					
					System.out.println();
					System.out.println(names.toString()); 
	}

} // Ex39

class Item{
	public int a;
	public int b;
	public String c;
}
