package com.test.lambda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import com.test.lambda.Item.Color;

public class Ex51_Stream_basic {
	public static void main(String[] args) {
		
		//스트림 = 파이프의 조합 
		// 1. 원본 파이프 : stream()
		
		//앞에 있는 String과 같은 String을 반환, 똑같은 자료형을 반환함 
		// 3. 정렬 파이프 : sorted() 
		// 4. 필터 파이프 : filter() // 일부요소가 사라진 얘들을 반환하지만 같은 자료형
		// 5. 중복 제거 파이프 : distinct()
		
		// 원본하고 다른 이질적인 거를 반환할 수 있어, 가공해서 반환을 해
		// 6. 변환 파이프 : map() 
		
		// 2. 최종 소비 파이프 : forEach() 리턴한 요소를 소비하는 루프 파이프
		
		//입출력 기능(io) + 람다식 사용
		
//		Item item = new Item();
//		item.color = Item.red;
//		item.color = Item.Color.BLUE; // 사전지식이 필요함 
		
		m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		
	} //main

	private static void m6() {
		
		//map()
		// - Mapping(연결 + 변환)
		// -> 추출 일부분만 돌려줌
		// -> 변환 A 자료형 -> B자료형
		// -> 축소 추출하고 비슷, 객체데이터를 받아와서 일부 데이터만 반환함 
		
		List<String> names = Item.getListString();
		
		System.out.println(names);
		
		names.stream().map(name -> name)
			.forEach(name -> System.out.println(name));	
		System.out.println();
		
		// 문자열 -> Integer로 끝났어, 중간에 조작한것 
		names.stream().map(name-> name.length()) // 숫자를 받아옴 
			 .forEach(length -> System.out.println(length)); // length은 map이 들어가야 완성됨, 이름의 글자수를 반환함
		
		System.out.println(); 
		
		List<Item> items = Item.getList();
		
		items.stream().map(item -> {
			if(item.getSize()>50 && (item.getColor() == Item.Color.BLACK
					|| item.getColor() == Item.Color.WHITE)) {
				return "고가품";
			}
			else {
				return "저가품";
			}
		}).forEach(result -> System.out.println(result)); // 고가품인지 저가품인지 판단하는 거를 만든 것, map을 거쳐서 변환된 stream을 다른걸로 만들 수 있어
		System.out.println();
		
		items = Item.getList(); //이름, 크기, 색상
		
		items.stream().map(item -> item.getColor()).forEach(color -> System.out.println(color)); // color 배열을 얻을 수 있음 
		
		//정리
		items = Item.getList();
		
		items.stream()
			.filter(item -> item.getName().length() >= 2)
			.map(item -> item.getName())
			.sorted((name1,name2) -> name1.length() - name2.length()) // 같은 얘들은 2차,3차 정렬을 하면돼 글자수 같은 얘들은...
			.distinct()
			.forEach(name -> System.out.println(name));
		System.out.println();
		
	
	}

	private static void m5() {
		
		//distinct();
		// - 중복값 제거 -> 1개만 남기는 작업
		List<Integer> nums = Item.getListInt();
		
		System.out.println(nums);
		
		//중간 파이프 역할 -> 반환값 Stream을 리턴 : filter,sort
		nums.stream().distinct().forEach(num -> System.out.print(num + " "));
		System.out.println();
		
		//객체 배열 -> 중복값 제거
		List<Item> items = Item.getList();
		System.out.println(items);
		items.stream().distinct().forEach(item -> System.out.println(item)); // 다른 선풍기로 인식 함 
		System.out.println();
		
		//
		items.stream() 													 // 원본 파이프
					.filter(item -> item.getColor() == Item.Color.BLACK) // 필터 파이프
					.distinct()											//중복제거 파이프
					.sorted((item1,item2)-> item1.getName().compareTo(item2.getName())) // 정렬
					.forEach(item -> {
						System.out.println("이름 : "+item.getName());
						System.out.println("크기 : "+item.getSize());
						System.out.println("색상 : "+item.getColor());
						System.out.println();
					});
		
		
		
	}

	private static void m4() {
		
		//필터 
		// - 스트림의 요소 중 원하는 것 추출
		// - 검색 
		
		List<Integer> nums = Item.getListInt();
		
		//인자를 넘어주면 true,false 반환, 만족하는 얘들만 추가 집합을 만들어
		nums.stream().filter(num -> num>50).forEach(num->System.out.println(num)); 
		System.out.println();
		
		// 독립적인 파이프로 생각 stream : 원본 공급 + filter : 불순물을 걸러내(원하는 얘들만) : foreach(해당 요소를 사용을 하는 것) , 연속적으로 붙일 수도 있고 순서를 바꿀 수 있어
		// stream + sort,filter + foreach(소비)
		
		List<String> names = Item.getListString();
		
		names.stream()
					.filter(name-> name.length()>=3)
					.sorted()
					.forEach(name -> System.out.println(name));; 
		System.out.println();
		
		List<Item> items = Item.getList();
		
		//이름,크기,색상 
		items.stream()
					.filter(item -> item.getColor() == Item.Color.BLACK)
					.forEach(item -> System.out.print(item));
		System.out.println();
		
		items.stream()
					.filter(item -> item.getSize()>=30 && item.getColor() ==Item.Color.RED)
					.forEach(item-> System.out.print(item));
			System.out.println();
			
			items.stream()
			.filter(item -> item.getSize()>=30)
			.filter(item -> item.getColor() ==Item.Color.RED)
			.forEach(item-> System.out.print(item)); //filter를 계속 조합시켜서 층층이 쌓아둬도 돼 
	System.out.println();
	
			
			
	}

	private static void m3() {
		
		//정렬 
		List<Integer> nums = Item.getListInt();
		
		System.out.println(nums);
		
		//스트림에서 정렬 하는 방법 arraylist가 아닐때 정렬하는 것 
		
		// List 정렬, 단일값일때
//		Collections.sort(nums);
//		nums.sort((n1,n2) -> n2-n1); // 누가 크다 작다 비교문만 넣으면 돼 , 객체 메소드를 통한 정렬
		
		//Stream 정렬
		nums.stream().sorted().forEach(num->System.out.print(num+" ")); //오름차순올 정렬해서 처음부터 끝까지 가져와서 소비하고 끝남 
		System.out.println();
		
		nums.stream().sorted((n1,n2)->n2-n1).forEach(num-> System.out.print(num+" ")); // 정렬의 규칙을 만든것 Comparator, 코드 밀도가 높아
		System.out.println();
		
		List<String> names = Item.getListString();
		names.stream().sorted().forEach(name-> System.out.print(name+" "));
		System.out.println();
		
		names.stream().sorted((s1,s2)-> s2.compareTo(s1)).forEach(name->System.out.print(name+" "));
		System.out.println();
		
		names.stream()
					.sorted((s1,s2)-> s1.length()-s2.length()) // 가져온 스트림으로 정렬을 먼저하고 뺑뺑이 돌려서 출력
					.forEach(name->System.out.print(name+" "));
		System.out.println();
		
		List<Item> items = Item.getList();
		//items.stream().sorted().forEach(item->System.out.println(item)); // 복합값이라서 sorted에서 에러가 나 기준이 없어서 
		items.stream()
					//.sorted((item1,item2)->item1.getName().compareTo(item2.getName()))
					//.sorted((item1,item2)->item1.getSize()-item2.getSize())
					.sorted((item1,item2)->item1.getColor().compareTo(item2.getColor())) //enum이 선언된 순서를 복원한 것
					.forEach(item->System.out.println(item));
		System.out.println();
		
		
	}

	private static void m2() {
		
		//데이터 소스를 여러가지로 테스트
		
		//1. 데이터 소스 : List
		List<String> names = Item.getListString();
		names.stream().forEach(name -> System.out.print(name+" "));
		System.out.println();
		
		//2. 데이터 소스 : 배열 
		String[] list = new String[] {"빨강","노랑","파랑","검정","하양"};
		Arrays.stream(list).forEach(color -> System.out.println(color));
		System.out.println();
		
		//3. 데이터 소스 : 파일
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\JavaTest\\src\\com\\test\\io\\Ex04_Output_basic.java"));
			reader.lines().forEach(line -> System.out.println(line)); // 한줄을 받아다가 읽어
			reader.close();
			
			//4. 데이터 소스 : 디렉토리
			//dir.listFiles();
			
			Files.list(Paths.get("C:\\Users\\PC\\OneDrive\\바탕 화면\\java")).forEach(path -> System.out.println(path.getFileName()));
			System.out.println();

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	
		

	}

	private static void m1() {
		
		// 스트림, Stream 
		// - JDK 1.8 추가
		// - 주로 배열(컬렉션)을 탐색하기 위한 도구(디렉토리, 파일 등 탐색 용도)
		// - 람다식으로 구현 많음 (= 익명 객체 요구)
		// - Iterator 작업과 유사(외부 반복자) 작업과 유사
		// - 내부 반복자 
		
		List<Integer> nums = Item.getListInt();
		
		System.out.println(nums);
		
		//nums 탐색 
		//1. for : index 사용 O
		for(int i=0;i<nums.size();i++) {
			System.out.print(nums.get(i) + " ");
		}
		
		System.out.println();
		
		//2. for : index 사용 X
		for(int num : nums) {
			System.out.print(num+ " ");
		}
		System.out.println();
		
		//3. Iterator : index 사용 X
		Iterator<Integer> iter = nums.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
		//4. Stream : index 사용 X 
		Stream<Integer> stream = nums.stream();
		
		//매개변수로 인터페이스가 적혀있으면 할 수 있는 방법3가지 
		//A. 인터페이스 + 클래스 선언 -> 객체 생성  => Consumer라는 인퍼페이스를 상속받는 클래스를 선언해서 객체 생성해서 forEach를 통해서
		//오버라이드된 구문을 호출?
		stream.forEach(new Test());
		stream.close();
		System.out.println();
		
		//B. 인터페이스 -> 익명객체
		//stream의 요소의 타입을 넣어 
		stream = nums.stream();
		stream.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.print(t+" ");
			}
			
		});
		stream.close();
		System.out.println();
		
		//C. 인터페이스 -> 람다식 구현
		stream = nums.stream();
		stream.forEach(t -> System.out.print(t+" "));
		System.out.println();
		
		List<String> names = Item.getListString();
		
		//함수형 스타일
		names.stream().forEach(name -> System.out.print(name +" "));
		//item이 10개이면 첫번째걸 가져와서 람다 메소드를 호출해
		System.out.println();
		Item.getList().stream().forEach(item->System.out.print(item.getColor()+" "));
		
	}

} //Ex51

//****** 이 클래스는 다른데서는 사용 안함. 오직 62 라인에서 사용하기 위한 클래스
class Test implements Consumer<Integer> {
	
	@Override
	public void accept(Integer t) {
		System.out.print(t+" ");
	}
	
}

class Item{ // 패키지라고 생각 
	
	private String name; // 자유 입력
	private int size; 	// 자유 입력
	//private String color; // 선택 입력 > public final static vs enum(권장)
										// 약간 자유도가 있지만 사전 지식이 필요
	
//	public int color;
//	public final static int red = 1;
//	public final static int yellow = 2;
//	public final static int blue = 3;
	// enum 자료형은 public static final 필드 형태로 제공 => 다시
	//Item에서만 쓰는 enum이다.
	
	private Color color; //데이터를 저장할 변수의 역할
	
	
	
	//정의
	public enum Color {
		
		RED,YELLOW,BLUE,BLACK,WHITE,PURPLE,GREEN
		
	}
	//생성자


	//source -> generate constructor
	public Item(String name, int size, Color color) {
		this.name = name;
		this.size = size;
		this.color = color;
	}

	
	//Getter & Setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}
	
	//toString
	@Override
		public String toString() {
			return String.format("(%s,%d,%s)\n",this.name,this.size,this.color);
		}
	
	
	//더미 생성 메소드, 개인의 일이 아니라 중립된 일
	public static List<Item> getList(){
		
		List<Item> list = new ArrayList<Item>();
		
		list.add(new Item("키보드",30,Color.BLACK));
		list.add(new Item("마우스",10,Color.BLACK));
		list.add(new Item("선풍기",25,Color.WHITE)); //**
		list.add(new Item("컵",35,Color.GREEN));
		list.add(new Item("책",45,Color.YELLOW));
		list.add(new Item("소독제",35,Color.BLUE));
		list.add(new Item("책상",100,Color.RED));
		list.add(new Item("의자",50,Color.RED));
		list.add(new Item("프로젝터",55,Color.WHITE));
		list.add(new Item("우산",40,Color.BLACK));
		list.add(new Item("선풍기",25,Color.WHITE)); //**
		//인스턴스랑 메모리 주소가 다르면 쌍둥이 개념이지 같은 얘라고 처리 안함 
		
		return list;
	}
	
	
	//객체 비교 -> 주소값 비교 :: 기본 동작 
	//객체 비교 -> 상태 비교 :: hashCode() & equals() 오버라이드(재정의) 값을 비교해서 동작하게끔
	
	@Override
		public int hashCode() {
		//메모리 주소 반환 -> 멤버 변수 사용 -> 상수 -> 상수 메모리 주소 반환
		
		// a-> "선풍기20BLACK".hashCode -> 12345678
		// b-> "선풍기20BLACK".hashCode -> 12345678 (상수가 똑같으면 hashCode값이 같아 내부적으로 재정의해서 동일한 문자열을 갖은 hashCode는 동일하다)
		// c-> "선풍기19BLACK".hashCode -> 	25415784
		
		// a(BLACK)-> "선풍기20B".hashCode -> 12345678
		// b(WHITE)-> "선풍기20B".hashCode -> 12345678
		
			return (this.name + this.size + this.color).hashCode(); // 같게 보려는 기준을 만들어줘
		}
	
		@Override
			public boolean equals(Object obj) {
				
			//Item.equals(Item)
			
				return this.hashCode()==obj.hashCode();
			}
		
	
	
	
	public static List<Integer> getListInt(){
		List<Integer> list = new ArrayList<Integer>();
		List<Item> items = getList();
		
		for(Item item :items) {
			list.add(item.getSize());
		}
		
		return list;
		
	}
	
	public static List<String> getListString(){
		List<String> list = new ArrayList<String>();
		List<Item> items = getList();
		
		for(Item item :items) {
			list.add(item.getName());
		}
		
		return list;
		
	}
	
	
	
} 


