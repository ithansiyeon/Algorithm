package com.test.object;

public class Ex23_Class_question_04 {
	public static void main(String[] args) {
		//학생 1
		Student1 s1 = new Student1(); //기본 생성자 호출
		System.out.println(s1.info());

		//학생 2
		Student1 s2= new Student1("홍길동", 13); //오버로딩 생성자 호출
		System.out.println(s2.info());

		//학생 3
		Student1 s3= new Student1(3, 10, 30); //오버로딩 생성자 호출
		System.out.println(s3.info());

		//학생 4
		Student1 s4= new Student1("아무개", 12, 1, 5, 11); //오버로딩 생성자 호출
		System.out.println(s4.info());
	}
}
class Student1{
	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private int number;
	static private String school;

		static {
		Student1.school="역삼 중학교";
	}
	public Student1() {
		this("미정",0,0,0,0);
		
	}
	
	public Student1(String name,int age,int grade,int classNumber,
			int number){
		this.name=name;
		this.age=age;
		this.grade=grade;
		this.classNumber=classNumber;
		this.number=number;
	
	}
	
	public Student1(String name,int age) {
//		this.name=name;
//		this.age=age;
		this(name,age,0,0,0);
	}
	public Student1(int grade, int classNumber, int number) {
		this("미정",0,grade,classNumber,number);
	}
	public String info() {
		String info="";
		info=name+"("+"나이 : "+age+"세, "+"학년 : "+grade+", 반 : "+classNumber+", 번호 : "+number+")";
		return info;
	}
}