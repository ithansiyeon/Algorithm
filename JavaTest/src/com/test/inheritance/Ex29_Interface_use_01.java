package com.test.inheritance;

public class Ex29_Interface_use_01 {
	
	public static void main(String[] args) {
		
		//상황 -> 홍길동(직원) -> (업무) -> 드라이버 사용(일자) -> 교환(십자)
		
		//main() : 상사
		Employee hong = new Employee();
		hong.name="홍길동";
		hong.work();
		
	}//main
	
	
}//Ex29

//행동 통일
//1. 추상 클래스 
//2. 인터페이스 

// - 부모가 구현된 멤버를 상속해줘야 하는가??
// 	a. 상속 O : 추상 클래스
//	b. 상속 X : 인터페이스

//부모 인터페이스 
interface ITool{
	 void work();
}
class Employee {
	public String name;
	public void work() {
		
		//일자 드라이버 -> 나사 
		//Tool tool = new Tool();
		//tool.use();
		
		//ScrewTool tool = new ScrewTool();
		//tool.work();
		
		//툴 특성에 맞는 구체적인 사용
		//Tool tool = new Tool(); // 일자
		//tool.work();
		//tool.check();
		
		//ScrewTool tool2 = new ScrewTool(); // 십자
		//tool2.work(); // 익숙한 행동 
		//tool2.check();
		//tool2.oliling(); 
		
		//툴의 추상적인 사용
		//업캐스팅, 변수가 하나 부모타입  
		ITool tool = new Tool(); //일자
		tool.work(); // Tool은 check가 있지만 부모는 없어서 check()를 못씀.
		
		ITool tool2 = new ScrewTool(); // 십자
		tool2.work(); // 혼동을 안줌, 도구가 교체되더라도 익숙한 도구를 지속적으로 사용 가능함 
		
		
	}
}


//일자 드라이버 
class Tool implements ITool {
	
	public String name;
	
	public void work() {
		System.out.println("일자 드라이버를 돌려서 나사를 박습니다.");
	}
	
	public void check() {
		
	}
	
}


//십자 드라이버
class ScrewTool implements ITool {
	
	
	public void work() {
		System.out.println("십자 드라이버로 나사...");
	}
	public void oliling() {
		
	}
}
