package com.test.object;


//학생 1명의 정보를 저장하는 단위
public class Student2 {
	public String name;
	public int kor;
	public int eng;
	public int math;
	public int total;
	public double avg;
	
	public void print() {
		
		System.out.printf("이름: %s\n",name);
		System.out.printf("총점: %d\n",total);
		System.out.printf("평균: %.1f\n",avg);
		
	}
	
}
