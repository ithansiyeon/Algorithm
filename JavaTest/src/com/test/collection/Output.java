package com.test.collection;

import java.util.Scanner;

public class Output {

	public void begin() {
		
		System.out.println();
		System.out.println("▣▣▣▣▣ 프로그램을 시작합니다. 　▣▣▣▣▣");
		System.out.println();
		
		
	}

	public void end() {
		
		System.out.println();
		System.out.println("▣▣▣▣▣ 프로그램을 종료합니다. 　▣▣▣▣▣");
		System.out.println();
		
		
	}

	public void menu() {
		
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.println("회원 정보 관리");
		System.out.println("1. 회원 추가");
		System.out.println("2. 회원 목록");
		System.out.println("3. 회원 삭제");
		System.out.println("4. 회원 검색(이름)");
		System.out.println("5. 회원 검색(전화)");
		System.out.println("6. 이름 검색(이름)");
		System.out.println("7. 종료");
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.print("선택(번호): ");
		
		
		
		
	}

	public void title(Title type) {
		String title = "";
		if(type == Title.ADD) {
			title = "학생 추가하기";
		} else if(type == Title.LIST) {
			title="학생 목록보기";
		} else if(type == Title.DELETE) {
			title="학생 삭제하기";
		} else if(type == Title.SEARCH) {
			title="학생 검색하기";
		}
		
		System.out.println();
		System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
		System.out.println(title);
		System.out.println("▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨▨");
		System.out.println();
	}

	public void pause(Scanner scan) {
		
		System.out.println();
		System.out.println("완료되었습니다.");
		System.out.println("계속하려면 엔터를 입력하세요.");
		
		//Scanner scan = new Scanner(System.in);
		
		scan.nextLine();
		
	}
	
}
