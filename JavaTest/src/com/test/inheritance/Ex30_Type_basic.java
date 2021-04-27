package com.test.inheritance;

public class Ex30_Type_basic {
	public static void main(String[] args) {

		// 일반클래스 vs 추상클래스 vs 인터페이스
		// 1. 객체 생성 유무
		// 2. 서로간의 상속 관계

		// 1. 객체는 일반 클래스만 만들수 있음
		M706 m = new M706(); // 일반클래스
		// 업캐스팅 용도로 쓰여
		// AMouse m2 = new AMouse(); // 추상클래스 , 모든 멤버가 불안전한거 아니지만 구분을 못해(추상메소드는 접근 불가)
		// IMouse m3 = new IMouse(); // 인터페이스 , 구현부가 없어서 안됨

		// 2.
		// a. 일반클래스(자식) -> 일반클래스(부모) //O
		// b. 일반클래스(자식) -> 추상클래스(부모) //O
		// c. 일반클래스(자식) -> 인터페이스(부모) //O
		// d. 추상클래스(자식) -> 일반클래스(부모) //O -> 사용하지 말 것, 논리적으로 말이 안됨, 위에가 구체적일 수 없음
		// e. 인터페이스(자식) -> 일반클래스(부모) //X -> 구현 멤버 상속받기 때문
		// f. 추상클래스(자식) -> 추상클래스(부모) //O
		// g. 인터페이스(자식) -> 인터페이스(부모) //O
		// implements가 안되는 이유는 인터페이스인데 구현을 해야 되기 때문에 extends로 가야됨
		// h. 일반클래스 -> (추상클래스) -> 인터페이스

		// 일반 클래스는 추상 메소드를 가질 수가 없어서 꼭 구현을 해야 하지만 추상 메소드가 추상 메소드를
		// 상속 받을 때는 추상 메소드는 구현 멤버도 가질 수 있기 때문에 선언만 해도 되고 구현도 해도 된다.
		// 인터페이스를 인터페이스를 implements로 받을 때는 구현하지 못하기 때문에 이걸로 하면 안되고
		// extends로 받아야 함.
		// 인터페이스가 인터페이스를 implements로 받으면 인터페이스의 자식이 메소드를 구현을 해야 하기 때문에
		// extends로 받아서 상속만 받을 수 있게 끔 한다. => 맞나?

	}// main

}

class AAAA {
	public int a;
}

abstract class BBBB extends AAAA {

}

//interface CCCC extends AAAA{}

abstract class DDDD {
	public int a;

	public abstract void aaa();

}

abstract class EEEE extends DDDD {

	// 선택 -> 부모의 추상 메소드 구현O vs 구현X
	public void aaa() {

	}

}

class FFFF extends EEEE {

	// 구현O -> 에러X
	// 구현X -> 에러O

}

interface GGGG {
	void aaa();

	void bbb();

}

interface HHHH extends GGGG {
	// 선택X
	// public void aaa() {}
	void ccc(); // 메소드를 늘리는 역할을 함
}

//interface HHHH implements GGGG{
//	//선택X
//	//public void aaa() {} 
//	void ccc(); //메소드를 늘리는 역할을 함 
//}

class IIII implements HHHH {

	@Override
	public void aaa() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ccc() {
		// TODO Auto-generated method stub

	}

}

//직원
//1. 정규직
// a. 간부
// b. 사원
//2. 계약직
// a.사원

//c,e를 합친것, 중복적인 행동이 없어짐
interface 직원 {
	void 출근하다();

	void 퇴근하다();

}

interface 정규직 extends 직원 {
	void 보너스();

	void 연차지급();

}

interface 계약직 extends 직원 {
	void 근무조정가능();
}

class 정규직간부 implements 정규직 {
//휠씬 더 체계화 시켜줌 
	@Override
	public void 출근하다() {
		// TODO Auto-generated method stub

	}

	@Override
	public void 퇴근하다() {
		// TODO Auto-generated method stub

	}

	@Override
	public void 보너스() {
		// TODO Auto-generated method stub

	}

	@Override
	public void 연차지급() {
		// TODO Auto-generated method stub

	}

}

class 계약직사원 implements 계약직 {

	@Override
	public void 출근하다() {
		// TODO Auto-generated method stub

	}

	@Override
	public void 퇴근하다() {
	}

	@Override
	public void 근무조정가능() {
	}

}

//다중 상속 
// - 2개의 부모를 가지는 상속(자바는 불가능)
// - 인터페이스에 한해서 다중 상속을 지원(부모가 인터페이스라면 여러개 부모로부터 상속 가능하다.
interface AAAAA {
	void aaa();
}

interface BBBBB {
	void bbb();
}

//하나의 클래스가 두개이상의 부모를 상속받는것 
class CCCCC implements AAAAA, BBBBB {

	@Override
	public void bbb() {
	}

	@Override
	public void aaa() {
	}

}

interface 아빠 {
	void 책임진다();

	void 돈을번다();

}

interface 과장 {
	void 프로젝트를책임진다();

	void 보고서를작성한다();

}

interface 남자 {
	void 군대를간다();
	// 목적에 부합하는 코드를 섰느냐가 중요.
}

class 호호호 implements 과장 {

	@Override
	public void 프로젝트를책임진다() {
	}

	@Override
	public void 보고서를작성한다() {
	}

}

class 아무개 implements 과장, 남자 {

	@Override
	public void 군대를간다() {
	}

	@Override
	public void 프로젝트를책임진다() {
	}

	@Override
	public void 보고서를작성한다() {
	}

}

class 홍길동 implements 아빠, 과장, 남자 {

	@Override
	public void 군대를간다() {
	}

	@Override
	public void 프로젝트를책임진다() {
	}

	@Override
	public void 보고서를작성한다() {
	}

	@Override
	public void 책임진다() {
	}

	@Override
	public void 돈을번다() {
	}

}
