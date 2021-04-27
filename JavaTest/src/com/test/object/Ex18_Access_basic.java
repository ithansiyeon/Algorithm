package com.test.object;

public class Ex18_Access_basic {
	public static void main(String[] args) {
		//Ex18_Access_basic.java
		//user.java
		//main 수많은 클래스 중 하나만 가져 
		
		User hong = new User(); //메모리영역에 User 멤버 변수를 실체화 시켜
		hong.setName("홍길동");
		hong.setGender(1);
		System.out.println(hong.getName()); // 홍길동
		hong.setName("홍길동2");
		hong.setId("hong");
		System.out.println(hong.getName()); // 이름은 한글 2~5자 이내로 입력
		System.out.println(hong.getGender()); //1
		System.out.println(hong.getId());
		
		User lee = new User(); //원하는 갯수많큼 찍어낼 수 있어 
		lee.setName("이순신");
		lee.setGender(2);
		lee.setId("lee005가가");
		System.out.println(lee.getName()); // 이순신
		System.out.println(lee.getGender()); //2 성별은 1과 2만 가능
		System.out.println(lee.getId());
		
		Mouse m1 = new Mouse();
		m1.setModel("로직텍 M705"); //쓰기
		System.out.println(m1.getModel()); //읽기

		//m1.setButton();
		
		//(읽기 전용 멤버)
		System.out.println(m1.getButton()); //읽기 
		
		//쓰기 전용 멤버
		m1.setPrice(50000);
		
		//계산된 프로퍼티(멤버), 가상 멤버 
		System.out.println(m1.getLevel()); // 멤버변수들을 가공이나 조작을 통해서
		//m1.setLevel("상"); 좀 더 어려워
		}//main

}
