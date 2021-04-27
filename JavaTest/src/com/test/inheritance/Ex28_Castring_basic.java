package com.test.inheritance;

public class Ex28_Castring_basic {
	public static void main(String[] args) {
		
		//형변환 
		//1. 값형 형변환
		// - 값형은 값형끼리만 형변환 가능(7개 자료형 -> 숫자형)
		//2. 참조형의 형변환
		// - 참조형은 참조형끼리만 형변환이 가능하다.(클래스들끼리의 형변환)
		
		//값형 형변환
		// - 큰형 -> 자료형 : 명시적 형변환(경우에 따라)
		// - 작은형 -> 큰형 : 암시적 형변환(100%안전)
		
		//참조형 형변환
		// - 상속 관계에 있는 클래스끼리만 가능(부모-자식 클래스간에 발생)
		// - 부모 클래스 -> 자식 클래스 : 명시적, 다운 캐스팅(Down Casting)
		//		-불가능 작업(100% 불가능)
		// - 자식 클래스 -> 부모 클래스 : 암시적, 업 캐스팅(Up Casting)
		//		- 가능 작업(100% 가능)

		CastingParent p1;
		CastingChild c1;
		c1 = new CastingChild(); //원본
		
		//형변환 발생 
		//CastingParent = CastingChild 
		////CastingParent =(CastingParent) CastingChild 
		//부모 클래스 = 자식 클래스 
		//업캐스팅(****) 발생 
		p1=c1;
		p1=(CastingParent)c1;
		
		//복사 검증 방법
		// - 복사된 참조 변수의 사용이 문제가 없으면 복사가 제대로 됐다고 판단(***)
		// - 사용자 눈앞의 A4 용지의 뚫린 구멍으로 데이터가 보이면 된다고 판단 
		p1.a=10;
		p1.b=20;
		//p1.c
		//p2.d
		
		CastingParent p2;
		CastingChild c2;
		
		p2=new CastingParent();
		//명시적인 형변환
		// 자식 클래스 = 부모 클래스 
		// 다운캐스팅 발생
		//c2=(CastingChild)p2;
		
//		c2.a=10; //문제 없음
//		c2.b=20; //문제 없음 
//		c2.c=30; //문제 발생
//		c2.d=40; //문제 발생
		
		CastingParent p3;
		CastingChild c3;
		c3=new CastingChild();
		p3 = c3; 
		
		CastingChild c4;
		
		//다운캐스팅(100% 불가능)
		c4=(CastingChild)p3; //원래 타입으로 되돌리는 작업 
		
		c4.a=10;
		c4.b=20;
		c4.c=30;
		c4.d=40;
		
		System.out.println("종료");
		
	}//main
}


class CastingParent {
	public int a =10;
	public int b =20;
	
}

class CastingChild extends CastingParent{
	public int c=30;
	public int d=40;
	
}