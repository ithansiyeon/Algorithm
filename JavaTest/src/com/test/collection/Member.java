package com.test.collection;

import java.util.Calendar;

public class Member {
	
	public String name;
	public int age;
	public Calendar birthday;
	public String address;
	
	public Member(String name, int age, Calendar birthday, String address) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
		this.address = address;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", birthday=" + String.format("%tF",birthday) + ", address=" + address + "\n";
	}
	

}
