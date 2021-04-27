package com.test.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Ex47_Collection_basic {
	public static void main(String[] args) throws Exception {

		/*
		 특징 & 장단점
		 > ArrayList, Stack, LinkedList(Queue),HashSet, TreeSet, HashMap, TreeMap
		 > ArrayList,HashSet,HashMap
		  
		 자바 컬렉션 인터페이스 
		  1. Collection 
		  			- List와 Set의 부모 인터페이스
		
		  2. List 
		  			- ArrayList, Stack, LinkedList(Queue), Vector 등 
		  			- 순서가 있는 집합(*********) 
		  			- 방번호(index,첨자)를 사용한다. 
		  			- 데이터 중복을 허용한다.
		 
		  //별표 질문거리가 됨
		 //TreeSet이 특수한 경우, 범위 추출할때  
		 
		  3. Set 
		  			- HashSet, TreeSet 등 
		  			- 순서가 없는 집합(*********) 
		  			- 방번호(index,첨자)가 없다. 
		  			- 데이터 중복을 허용 안한다.(*********)
		  
		  
		  4. Map - HashMap, TreeMap, HashTable, Properties 등 
		  			- 순서가 없는 집합(***) 
		  			- 키와 값을 사용한다.(******) > 연관 배열 
		  			- 키(Key) : 식별자 역할 > 유일해야 한다. > 중복 허용 안함 > Set 사용 
		  			- 값(Value) : 데이터 > 중복 허용 함 > List 사용
		 
		 ** Vector, HashTable, Properties : 호환성 때문에 남겨진 클래스 > 사용 안함 
		 ** 자바 컬렉션 > JDK 1.5
		 
		  Vector > ArrayList 
		  HashTable > HashMap 
		  Properties > XML, JSON 기술
		
		 */

		// m1();
		//m2();
		//m3();
		//m4();
		//m5();
		m6();
		//m7();
		//m8();
		//m9();
		//m10();
		
	} // main

	private static void m10() throws Exception {
		
		//종료 -> 다시 실행 -> 설정 복구 
		Properties prop = new Properties();
		
		prop.load(new FileInputStream("setting.ini"));
		
		System.out.println(prop); // 설정값이 복구가 됨 
		
		
	}

	private static void m9() throws Exception {
		//문자열 전용 배열 + 파일 입출력 
		// - 프로그램 설정 관리 + 보관
		Properties prop = new Properties();
		
		//설정 추가(요소)
		prop.setProperty("path", "C:\\Program Files\\eclipse");
		prop.setProperty("font-family", "D2Coding");
		prop.setProperty("font-size", "16px");
		
		System.out.println(prop); //hashmap 처럼
		System.out.println(prop.getProperty("font-size"));
		
		//프로그램 종료 > prop > 파일 저장 
		// BufferedWriter 
		
		prop.store(new FileOutputStream("setting.ini"), "");
		
		System.out.println("종료");
		
	}

	private static void m8() {
		
		//TreeMap(데이터 중복 가능)
		//내부는 이진 트리 key value로 관리하는 도구 
		// - 이진트리 구조의 Map
		// - 키 + 값 = 요소
		// - 키 자동 정렬
		// - 범위 추출 
		
		TreeMap<String,String> map = new TreeMap<String,String>();
		
		map.put("white", "하양");
		map.put("black", "검정");
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		map.put("tomato", "빨강");
		
		System.out.println(map.size());
		System.out.println(map); // 순서가 있어, 키로 자동 정렬 
		System.out.println(map.get("black"));
		
		//set은 중복값을 가질 수 없고 얘는 키와 value로 관리를 함 
		
		//부분검색(Tree)
		System.out.println(map.firstKey());
		System.out.println(map.firstEntry()); // Entry -> Map 요소 클래스, 키와 값을 동시에 가지고 있어
		
		System.out.println(map.lastKey());
		System.out.println(map.lastEntry());
		//ABCDEFGHIJKLMNOPQRSTUVWXYZ 
		//시작하는 값이 m이전의 값을 출력 
		System.out.println(map.headMap("m"));
		System.out.println(map.tailMap("m"));  //m이후 
		
		System.out.println(map.subMap("m", "w"));
		
		
		
	}

	private static void m7() {
		
		//HashSet : 평범한 Set
		
		//TreeSet
		// - Tree 구조 Set
		// - 중복값X, 순서X, 정렬X
		// - 자동 정렬이 된다.
		// - 이진 트리 구조로 구현되어 있다. 
		// - 범위 검색에 효율적이다.(**)
		
		// 자식은 최대 2개를 가질 수 있어, 사선으로 커져, 요소가 들어갔을 때 부터 크다, 작다로 정렬되어 있어
		// Set 인터페이스를 구현한 것이라서 중복된 데이터의 저장을 허용하지 않으며 정렬된 위치에 저장하므로 저장 순서를 유지
		Set<Integer> set = new TreeSet<Integer>();
		set.add(5);
		set.add(3);
		set.add(2);
		set.add(7);
		set.add(9);
		set.add(6);
		set.add(1);
		
		System.out.println(set);
		
		//부분 검색
		TreeSet<Integer> tset = (TreeSet<Integer>)set;
		System.out.println(tset.first());
		System.out.println(tset.last());
		System.out.println(tset.headSet(5)); // 5보다 이전의 숫자들을 추출해라
		System.out.println(tset.tailSet(5)); 
		System.out.println(tset.subSet(3,8)); // 속도가 빨라 
		
	}

	private static void m6() {
		
		//Set 
		// - List 형제 
		// - 순서가 없는 배열 
		// - 방번호(첨자) 사용X
		// - 중복값을 가지지 못한다.(*******), index가 존재하지 않아서 중복값을 가질 수 없어
		// - HashSet, TreeSet 
		
		// 상황을 앞의 단어로 맞추는 거임 <구현 알고리즘, 사용법> 
		// - HashSet : Hash 알고리즘을 사용해서 Set 인터페이스 구현
		// - HashMap : Hash 알고리즘을 사용해서 Map 인터페이스를 구현 
		// - TreeSet : Tree 알고리즘을 사용해서 Set 인터페이스를 구현
		// - TreeMap : Tree 알고리즘을 사용해서 Map 인터페이스를 구현
		
		//ArrayList<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<String>(); // list가 인터페이스라서 공유하는 규칙안에서만 사용되면 통일되기 때문에  
		
		//HashSet<String> set = new HashSet<String>();
		Set<String> set = new HashSet<String>();
		
		set.add("사과");
		set.add("바나나");
		set.add("포도");
		set.add("바나나"); // 중복된 값은 무시 돼 
		System.out.println(set.add("바나나")); //false
		System.out.println(set.add("복숭아")); //true
		
		System.out.println(set.size());
		
		System.out.println(set);
		
		//데이터 읽기 > Iterator 구현
		Iterator<String> iter = set.iterator();
		
		//중복값을 추가로 못 넣는다가 이점이 되는 하나임 잘 씀
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		//로또 번호 6개(1~45) 
		// 1. ArrayList, Array
		//  - 중복 값 발생 > 중복 값 체크 + 제거
		//	2. Set
		// 	- 자동 중복 제거
		Random rnd = new Random();
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		//for(int i=0;i<6;i++) {
		while(lotto.size()<6) {
			lotto.add(rnd.nextInt(45)+1);
		}
		
		System.out.println(lotto);
		System.out.println();
		
		
		Set<Mouse> cset = new HashSet<Mouse>();
		
		cset.add(new Mouse("M700",3));
		cset.add(new Mouse("S500",5));
		cset.add(new Mouse("A1000",7));
		cset.add(new Mouse("M700",3)); // 중복값 X, 단일값은 중복값 제어를 해줘, 복합개체 참조형 일때는 안해줘 , add는 주소값을 넣어줘 
									  //equals와 hashCode를 재정의 해서 
		//같은 마우스? 다른 마우스?
		//1. 주소값 : 다른 마우스
		//2. 상태값 : 같은 마우스 
		Mouse m1 = new Mouse("M700",3);
		Mouse m2 = new Mouse("M700",3);
		Mouse m3 = new Mouse("A1000",7);
		
		System.out.println(m1.equals(m2)); // 참조형 변수 비교 -> 주소값 비교 
		 
		System.out.println(m1.hashCode()); //1550089733 "M7003".hashCode() -> 72797289
		System.out.println(m2.hashCode()); //865113938 메모리 주소 번지 "M7003".hashCode() -> 72797289
		System.out.println(m3.hashCode()); //"A10007".hashCode() -> 1907624983
		
		//같은 상수는 같은 주소값을 가져 
		System.out.println("홍길동".hashCode());
		System.out.println("홍길동".hashCode());
		System.out.println("홍길동".hashCode());
		
		System.out.println(cset);
		
		
		
		
		
	}

	private static void m5() {
		
		//탐색 도구 
		// - List, Set에서 사용
		// - 컬렉션 프레임워크에서 요소를 순차적으로 읽기 위한 표준 도구 
		// - Enumeration, Iterator(***), ListIterator 만들어진 순서 
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("바나나");
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		
		//탐색 
		//1. for문 : index 사용O
		//2. 향상된 for문 : index 사용X
		//3. Iterator : index 사용X
		
		//***사용 빈도 높음(탐색 구조가 다른 곳에도 많이 보이는 형태)
		Iterator<String> iter = list.iterator();
		
		//1. hasXXX()
		//2. nextXXX()
		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
//		System.out.println(iter.hasNext()); // false
		//System.out.println(iter.next()); //NoSuchElementException element가 없다, 예외처리, 인덱스가 존재하지 않고 커서가 존재함 hasNext를 체크해야 언제까지 읽을지 알 수 있음 
		
		//향상된 for문과 유사 
		// - 전진커서
		while(iter.hasNext()) {
			System.out.println(iter.next()); // 있을 때만 읽기, 순차 탐색
		}
		iter = list.iterator();
		System.out.println(iter.next());
		
		//HashMap 탐색 
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("사장", "홍길동");
		map.put("부장", "아무개");
		map.put("과장", "하하하");
		map.put("대리", "호호호");
		map.put("사원", "후후후");
		
		Set<String> keys = map.keySet(); //일반적인 for문으로 못 돌려
		
		Iterator<String> kiter = keys.iterator(); //list,set계열은 쓸 수 있어
		
		//**자주 쓰임** 
		while(kiter.hasNext()) { //check
			String key = kiter.next();
			System.out.println(key+","+map.get(key)); //kiter.next() 2번 움직인것
		}
		
		Collection<String> vlist = map.values();
		//list와 set의 부모 인터페이스 
		
		Iterator<String> viter = vlist.iterator();
		
		//value를 중심으로 돌린거임
		while(viter.hasNext()) {
			System.out.println(viter.next());
		}
		
		System.out.println();
		System.out.println(list);
		System.out.println();
		
		//ListInterator
		// - 전, 후진 커서 사용
		// - 한번 읽은 데이터를 다시 읽을 수 있다.
		// - List 전용 이터레이터
		ListIterator<String> liter = list.listIterator(); 
		
		while(liter.hasNext()) {
			System.out.println(liter.next()); // 커서를 반대편으로 올릴 수 도 있어
		}
		System.out.println();
		//역순으로 다시 읽어
		while(liter.hasPrevious()) {
			System.out.println(liter.previous());
		}
		
		
		
	}

	private static void m4() {
		//ArrayList vs LinkedList
		// - 작업별 속도 차이
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		LinkedList<Integer> nums2 = new LinkedList<Integer>();
		
		long begin = 0, end = 0;
		
		System.out.println("순차적으로 데이터 추가하기(Append)");
		
		begin = System.nanoTime();
		
		for(int i=0;i<1000000;i++) {
			nums1.add(i);
		}
		
		
		end = System.nanoTime();
		
		System.out.printf("ArrayList 작업 시간 : %,dns\n",end-begin);
		
		begin = System.nanoTime();
		
		for(int i=0;i<1000000;i++) {
			nums2.add(i);
		}
		
		
		end = System.nanoTime();
		//LinkedList 끝방 찾는데 오래걸린거야
		System.out.printf("LinkedList 작업 시간 : %,dns\n",end-begin);
		
		System.out.println();
		System.out.println("중간에 데이터 추가하기(Insert + Shift)");
		
		
		begin = System.nanoTime();
		
		for(int i=0;i<100000;i++) {
			nums1.add(0,i); // 중간에 삽입, 10초간에 걸린거야 
		}
		
		
		end = System.nanoTime();
		
		System.out.printf("ArrayList 작업 시간 : %,dns\n",end-begin);
		
		begin = System.nanoTime();
		
		for(int i=0;i<100000;i++) {
			nums2.add(0,i); // 중간에 삽입, 10초간에 걸린거야 
		}
		
		
		end = System.nanoTime();
		
		System.out.printf("LinkedList 작업 시간 : %,dns\n",end-begin);
		
		
		
		
		
		
		System.out.println();
		System.out.println("중간에 데이터 삭제하기(Delete + Shift)");
		
		
		begin = System.nanoTime();
		
		for(int i=0;i<100000;i++) {
			nums1.remove(0); // 중간에 삽입, 10초간에 걸린거야 
		}
		
		
		end = System.nanoTime();
		
		System.out.printf("ArrayList 작업 시간 : %,dns\n",end-begin);
		
		begin = System.nanoTime();
		
		for(int i=0;i<100000;i++) {
			nums2.remove(0); // 중간에 삽입, 10초간에 걸린거야 
		}
		
		
		end = System.nanoTime();
		
		System.out.printf("LinkedList 작업 시간 : %,dns\n",end-begin);
		
		
		
		
		System.out.println();
		System.out.println("순차적으로 데이터 삭제하기(Delete)");
		
		
		begin = System.nanoTime();
		
		for(int i=nums1.size()-1;i>=0;i--) {
			nums1.remove(i); // 중간에 삽입, 10초간에 걸린거야 
		}
		
		
		end = System.nanoTime();
		
		System.out.printf("ArrayList 작업 시간 : %,dns\n",end-begin);
		
		begin = System.nanoTime();
		
		for(int i=nums1.size()-1;i>=0;i--) {
			nums2.remove(i); // 중간에 삽입, 10초간에 걸린거야 
		}
		
		
		end = System.nanoTime();
		
		System.out.printf("LinkedList 작업 시간 : %,dns\n",end-begin);
		
		//중간에 넣다 뺏다 LinkedList, 순차적으로 하면 ArrayList
		
	}

	private static void m3() {
		
		//LinkedList 클래스
		// - Queue를 구현할 때 사용했던 클래스 
		
		//ArrayList vs LinkedList
		// - 둘 다 List 구현한 클래스 
		// - 겉모습은 거의 동일한데 내부 구조 완전히 다름 
		
		//ArrayList 
		// - 연속적이다.
		// - 요소의 접근 속도가 가장 빠르다.
		// - Append 작업에는 효과적인지만 Insert/Delete 작업에 비효율적(Shift)이다.
		
		//LinkedList
		// - 비연속적이다.
		// - 요소의 접근 속도가 느리다. 
		// - Insert/Delete 작업에 효과적이다. Append는 불리함. 
		
		//LinkedList 종류 
		// 1. LinkedList
		// 2. Double LinkedList
		// 3. Double Circular LinkedList : 자바 LinkedList 
		
		
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		LinkedList<Integer> nums2 = new LinkedList<Integer>();
		
		nums1.add(100);
		nums1.add(200);
		nums1.add(300);
		
		
		
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		
		System.out.println(nums1.size());
		System.out.println(nums2.size());
		
		System.out.println(nums1.get(0));
		System.out.println(nums2.get(0));
		
		
		
	}

	private static void m2() {

		// 정렬
		// - 순서가 있는 집합에서 요소의 순서를 재배치
		// - List 계열만 가능
		// - Set과 Map 계열은 불가능

		// 객체.sort() : 단일값 정렬, 복합값 정렬 > Comparator 반드시 구현
		// Collections.sort() : 단일값 정렬, 복합값 정렬 > Comparator 선택 구현

		// 단일값 정렬
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(5);
		list1.add(2);
		list1.add(8);
		list1.add(3);
		list1.add(7);

		 //Collections.sort(list1);

		list1.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// 요소 2개의 비교 . 누가 더 크고 or 작은지를 판단하는 규칙을 정한다.
				// 1. 양수
				// 2. 음수
				// 3. 0
				// 오름차순
				return o1 - o2;
			}

		});
		System.out.println(list1);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("사과");
		list2.add("귤");
		list2.add("오렌지");
		list2.add("파인애플");
		list2.add("포도");

		// 문자 코드 정렬
		// Collections.sort(list2);

		// 문자 길이 정렬
		list2.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// return o1.compareTo(o2);
				return o2.length() - o1.length();
			}
		});

		System.out.println(list2);

		// 복합값 정렬
		ArrayList<Member> list3 = new ArrayList<Member>();
		Calendar c = Calendar.getInstance();
		c.set(1995, 2, 10);
		
		list3.add(new Member("홍길동", 25, c, "서울")); // 존재하는 생일은 하나 참조형이라서
		c = Calendar.getInstance();
		c.set(1995, 2, 10);
		c.set(Calendar.MONTH, 3);
		
		list3.add(new Member("아무개", 30, c, "부산"));
		c = Calendar.getInstance();
		c.set(1995, 2, 10);
		c.set(Calendar.MONTH, -1);
		
		list3.add(new Member("하하하", 22, c, "서울"));
		c = Calendar.getInstance();
		c.set(1995, 2, 10);
		c.set(Calendar.MONTH, 6);
		
		list3.add(new Member("유재석", 27, c, "서울"));
		c = Calendar.getInstance();
		c.set(1995, 2, 10);
		c.set(Calendar.MONTH, -3);
		
		list3.add(new Member("강호동", 26, c, "대구"));
		c = Calendar.getInstance();
		c.set(1995, 2, 10);
		c.set(Calendar.MONTH, 7);

		//정렬(******)
		// Collections.sort(list3);
		list3.sort(new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				//return o1.name.compareTo(o2.name);
				//return o1.age-o2.age;
				//return o1.birthday.compareTo(o2.birthday); //10월이 나이가 많은 애임
				//return o1.address.compareTo(o2.address); // 지역이 서울인 얘들
				if(o1.address.compareTo(o2.address) != 0) {
					return o1.address.compareTo(o2.address); //원래 하던대로 반환
				} else {
					//지역 동일 > 이름 오름차순
					return o1.name.compareTo(o2.name); 
					
				}
				
			}
		});
		
		list3.sort(new Test());
		//Test 대신해서 만든 것, 클래스를 안만들어서 Comparator로 선언하고 인터페이스라서 이를 구현한 내용을 쓴것
		list3.sort(new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return 0;
			}
		});
		
		
		System.out.println(list3);
	}

	private static void m1() {

		// List 개열
		// 1. Vector : 동기화 지원
		// 2. ArrayList : 동기화 지원안함

		ArrayList<String> list1 = new ArrayList<String>();
		Vector<String> list2 = new Vector<String>();

		list1.add("홍길동");
		list1.add("아무개");

		list2.add("홍길동");
		list2.add("아무개");

		System.out.println(list1.size());
		System.out.println(list2.size());

		System.out.println(list1.get(0));
		System.out.println(list2.get(0));

	}

}


class Test implements Comparator<Member> {

	@Override
	public int compare(Member o1, Member o2) {
		return o1.age - o2.age;
	}
	
}
