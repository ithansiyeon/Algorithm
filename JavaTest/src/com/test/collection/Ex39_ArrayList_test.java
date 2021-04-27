package com.test.collection;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex39_ArrayList_test {
	private static Output output; 
	private static Scanner scan;
	private static ArrayList<Student> list;
	static {
		output = new Output();
		scan = new Scanner(System.in);
		list = new ArrayList<Student>(); 
	}
	
	public static void main(String[] args) {
		//학생 정보 관리 프로그램
		
		//학생 정보
		// - 이름
		// - 나이
		// - 주소
		// - 연락처
		// - 번호(1~ 순차적 할당)
		
		//기능
		// - 학생 추가
		// - 학생 목록
		// - 학생 삭제 
		// - 학생 검색 
		// - 학생 수정(X)
		
		//생각?
		//1. 학생 1명 정보 > 관리 > 클래스 선언 > Student
		//2. 학생 여러명 관리 > 집합 자료형 > 가변 > ArrayList<Student>
		
		//클래스 파일 추가
		//1. Student.java : 학생 정보
		//2. Output.java : 출력 코드 담당 클래스(업무 분산) 
		
		//프로그램 흐름
		// -> (메뉴 출력 -> 항목 선택 -> 기능 실행) x 무한 반복 
		
		
		
		//Output output = new Output();
		
		dummy();
		
		output.begin(); // 프로그램 시작하는 메소드
		
		boolean loop = true;
		//Scanner scan = new Scanner(System.in);
		
		while(loop) {
			
			output.menu();
			
			
			String sel = scan.nextLine();
			
			if(sel.equals("1")) {
				//학생 추가
				add();
			} else if(sel.equals("2")) {
				// 학생 목록
				list();
			} else if(sel.equals("3")) {
				// 학생 삭제
				delete();
			} else if(sel.equals("4")) {
				// 학생 검색(이름), 회원 검색(이름)
				search();
			} else if(sel.equals("5")) {
				// 학생 검색(전화)
				search2();
			} else if(sel.equals("6")) {
				// 학생 검색(이름),  이름 검색(이름)
				search3();
			}	else  {
				// 프로그램 종료
				loop = false;
			}
			
			
		}
		
		
		
		output.end();
		
		
		
	} // main

	private static void search3() {
		output.title(Title.SEARCH);
		
		System.out.print("검색(이름): "); // 토큰 검색, space를 넣어서 제각각 검색하게 끔
		String word = scan.nextLine(); // 김 이 박, 세 토막으로 쪼개(구분자가 스페이스)
		
		String[] wordList = word.split(" "); // 방이 3개짜리
		
		System.out.println("[번호]\t[이름]\t[나이]\t[연락처]\t[주소]");
		
		for(Student s : list) {
			
			if(isName(s.getName(),wordList)) { 
			System.out.printf("%5d\t%s\t%5d\t%s\t%s\n",
								s.getSeq()
								,s.getName()
								,s.getAge()
								,s.getTel()
								,s.getAddress());
			}
		
		}
		
		output.pause(scan);
	
		
	}


	private static boolean isName(String name, String[] wordList) {
		
		boolean flag = false;
		
		//김 - 유 처럼 김을 포함하고 유로 끝나지 이름을 출력 시켜줌
		for(String word : wordList) {
			
			if(name.contains(word.replace("-", "")) && !word.startsWith("-")) {
				flag = true;
			} else if (name.contains(word.replace("-", "")) && word.startsWith("-")) {
				flag =  false;
				break;
			}
		}
		return flag;

	}

	private static void search2() {
		
		output.title(Title.SEARCH);
			
			System.out.print("검색(전화번호): "); // 홍길동 > 길동 검색률을 높임 
			String word = scan.nextLine();
			
	
			listName(word);
			
			output.pause(scan);
		
		
	}

	private static void listName(String word) {
		System.out.println("[번호]\t[이름]\t[나이]\t[연락처]\t[주소]");
		
		for(Student s : list) {
			
			if(s.getTel().replace("-", "").contains(word)) { 
			System.out.printf("%5d\t%s\t%5d\t%s\t%s\n",
								s.getSeq()
								,s.getName()
								,s.getAge()
								,s.getTel()
								,s.getAddress());
			}
		
		}
	}

	private static void dummy() {
		//테스트용 데이터 x 10명
		String[] temp1 = {"김","이","박","최","정"};
		String[] temp2 = {"유","정","석","인","지","은","형","순","성","민"};
		String[] temp3 = {"서울시","인천시","부산시","대전시","광주시"};
		String[] temp4 = {"강남구","강서구","강북구","강동구"};
		
		Random rnd = new Random();
		
		for(int i=0;i<10;i++) {
			Student s = new Student();
			Student.temp++;
			s.setSeq(Student.temp);
			
			String name = temp1[rnd.nextInt(temp1.length)]
					+ temp2[rnd.nextInt(temp2.length)]
					+ temp2[rnd.nextInt(temp2.length)];
			
			int age = rnd.nextInt(10)+20;
			
			String address = temp3[rnd.nextInt(temp3.length)]
					+ " "
					+ temp4[rnd.nextInt(temp4.length)];
			String tel = "010-"+(rnd.nextInt(9000)+1000) 
					+ "-"+ (rnd.nextInt(9000)+1000);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			s.setTel(tel);
			
			list.add(s); //목록 추가
			
		}

	}
	private static void search() {
		
		output.title(Title.SEARCH);
		
		//검색?
		// -> list() 작업과 유사
		// 1. list(): 모든 데이터 출력
		// 2. search(): 일부 데이터 출력. 조건부 list()
		
		System.out.print("검색(학생명): "); // 홍길동 > 길동 검색률을 높임 
		String word = scan.nextLine();
		

		System.out.println("[번호]\t[이름]\t[나이]\t[연락처]\t[주소]");
		
		for(Student s : list) {
			
			//if(s.getName().contains(word)) {
			//if(s.getName().toUpperCase().contains(word.toUpperCase())) // 대소문자 구분 없이 한쪽으로 몰아야 돼 그걸 안하면 철저하게 찾는 거임
			if(s.getName().indexOf(word)>-1) { 
			System.out.printf("%5d\t%s\t%5d\t%s\t%s\n",
								s.getSeq()
								,s.getName()
								,s.getAge()
								,s.getTel()
								,s.getAddress());
			}
		
		}
		
		output.pause(scan);
		
	}

	private static void delete() {
		
		output.title(Title.DELETE);
		
		listName();
		
		System.out.print("삭제할 번호: ");
		int seq = scan.nextInt();
		 scan.skip("\r\n");
		//삭제? -> 배열(ArrayList) -> remove() -> 몇번째 방? -> 배열 탐색 -> 각각 확인?
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getSeq()==seq) {
				list.remove(i);//학생 목록 제거, 실제 삭제가 되는 거임
				break;
			}
		}
		
		
		output.pause(scan);
	}

	private static void list() {
		
		listName();
		
	}

	private static void listName() {
		
		
		System.out.println("[번호]\t[이름]\t[나이]\t[연락처]\t[주소]");
		
		for(Student s : list) {
			System.out.printf("%5d\t%s\t%5d\t%s\t%s\n",
								s.getSeq()
								,s.getName()
								,s.getAge()
								,s.getTel()
								,s.getAddress());
		}
		
		
	}

	private static void add() {
		
		output.title(Title.ADD);
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		System.out.print("나이: ");
		int age = scan.nextInt(); // nextInt() -> scan.skip() -> nextLine()
		scan.skip("\r\n");
		
		System.out.print("주소: ");
		String address = scan.nextLine(); // 입력X
		
		System.out.print("연락처: ");
		String tel = scan.nextLine();
		
		//입력받은 정보 > Student 객체 포장 
		Student s = new Student();
		
		Student.temp++; // 공용변수, 살아있는 변수
		
		s.setSeq(Student.temp); // 자기 개인 번호로 받아
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		s.setTel(tel);
		
		//학생 목록 추가(*****)
		list.add(s); // 지역변수인 s는 죽어, 하지만 인스턴스는 살아있어 list에 인스턴스의 주소를 넣어서 살아있어 
		
		//잠시 멈춤
		output.pause(scan); // 매개변수로 scan하면 복잡성이 증가
		
		
	}

}
