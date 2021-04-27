package com.test.object;

public class Ex21_Class_basic {
	
	public static void main(String[] args) {
		
		//static 키워드
		// - 클래스 멤버에 붙이는 키워드(멤버 변수, 멤버 메소드)
		
		//※ static int a = 10;  지역변수는 안됨
		
		//변수의 종류 
		//1. 멤버 변수(클래스영역)
		// a. 객체 멤버 변수: 여태껏 선언한 변수
		// b. 정적 멤버 변수: static 키워드 작성한 변수
		//2. 지역 변수 
		// a. 메소드내에서
		// b. 제어문내에서
		// c. 매개변수
		
		//객체 메소드
		// - 개인 데이터(객체 변수) 읽기/쓰기 
		// - 공용 데이터(정적 변수) 읽기/쓰기 
		
		//정적 메소드
		// - 공용 데이터(정적 변수) 읽기/쓰기
		// - 개인 데이터(객체 변수)는 접근 불가
		
		//학생 객체 x 3명
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(14);
		//s1.setSchool("역삼 중학교");
		Student.setSchool("역삼중학교"); //s1-> Student 클래스이름.setSchool();,메모리 낭비X, 유지보수 O
										
		//s1.setSchool("역삼 중학교"); // 300명의 학교이름을 정하는데 한 학생한테 맡긴거
		Student s2 = new Student();
		s2.setName("아무개");
		s2.setAge(14);
		//s2.setSchool("역삼 중학교");
		//Student.setSchool("역삼중학교");
		
		Student s3 = new Student();
		s3.setName("하하하");
		s3.setAge(15);
		//s3.setSchool("역삼 중학교");
		//Student.setSchool("역삼중학교");
		
		//질문의도가 다른거임 
		s1.hello2();
		s2.hello2();
		s3.hello2(); // s1이 어디에 학교 다니는지 궁금해서 질문한거임, 개인 플레이 
		
		Student.hello2(); // 공용:너희들 어디다니니? 하나의 집합으로 인식한 것 따라서 틀한테 물어본것
		
	}//main
}//Ex21

//학생 클래스
// - 학생 정보를 저장하는 객체
// - 역삼 중학교(*****)
class Student {
	
	private String name;
	private int age;
	//private String school;
	private static String school; //접근지정자와 자료형 사이에 옴
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		}
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school;		
//	}
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Student.school = school;
	}
	
	//자기소개를 하는 메소드
	//1. 객체마다 다른 행동 요구 > 객체 메소드 
	//2. 객체마다 동일 행동 요구 > 정적 메소드
	
	public void hello() {
		System.out.printf("안녕하세요. 저는 %s입니다.\n",
							this.name); // 개인 객체로 들어갔을때만 유용함, this가 세명중에 누군지 몰라
		
		
	}
	public static void hello2() {
		System.out.printf("저는 %s에 다닙니다.\n"
				, Student.school);
	}
	
}




