package com.test.collection;

//Student 클래스의 역할 : 데이터 집합
public class Student {
	
	public static int temp;
	private int seq;		//학생번호
	private String name; 	// 이름
	private int age; 		//나이
	private String address; //주소
	private String tel; 	//연락처
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "Student [seq=" + seq + ", name=" + name + ", age=" + age + ", address=" + address + ", tel=" + tel
				+ "]";
	}

}
