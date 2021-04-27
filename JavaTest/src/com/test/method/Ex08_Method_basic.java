package com.test.method;

//Allman //스타일 엔터 { 단점: 라인을 차지함 장점: 가독성을 얻음
public class Ex08_Method_basic { // K&R 장점:라인을 차지 안함, 단점: 가독성이 떨어짐
	public static void main(String[] args) { 
		// main 메소드
		// - 특수한 메소드
		// 1. 이름이 예약어(main)
		// 2. 실행을 개발자가 직접하지 않고, 자바의 JRE(JVM)가 자동으로 호출한다.
		//main을 먼저 찾아서 실행을 시킴 
		// 3. 프로그램의 시작점(Entry Point) ~ 프로그램의 종착점(End Point) 
		
		//메소드, Method
		// - 메소드, 함수(Function), 프로시저(Procedure), 서브루틴(Sub Routine)..
		// - 객체내에 존재하는 함수로 메소드라고 한다.
		//A -> 함수 -> B
		// f(x) = y
		// - "특정 행동을 하는 코드의 집합" > Behavior(행동)
		
		// 요구사항] "안녕하세요" x 5번 출력
		// 수정사항] "반갑습니다." 수정 
		System.out.println("반갑습니다.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println();
		/*
		 
		 메소드 사용법
		 1. 메소드 정의하기(선언하기)
			public static void 메소드명() {
				실행코드;
				실행코드;
				...
			}
			
			접근지정자 정적키워드 반환타입 메소드명(인자리스트) {
				실행코드;
				실행코드;
				...
			}
			
		 2. 메소드 호출하기(사용하기)
		 	메소드명();
		 	
		 3. 메소드의 사용 목적(이유, 장점)
		   		a. 코드 재사용
		   		b. 유지/보수성 좋음
		   		c. 비용이 절감됨(인건비 감소 등등..)
		   		d. 가독성 향상(코드가 목적에 따라 분리되어 관리) 
		   		
		 
		 */
		
		// 요구사항] "안녕하세요" x 5번 출력
		
		hello(); // 중단-> 이동을 해서 안쪽 코드를 실행 시킴 호출했던 hello()로 돌아감 
		hello();
		hello();
		hello();
		hello(); // 정식으로 재사용을 함 
		
		
		
		
		// 메소드 선언 + 유형 
		// - 매개변수 (인자, Parameter, Argument)유무
		// - 반환값 (return value) 유무 
		
		// 1. 매개변수 X , 반환값 X
		// 2. 매개변수 O , 반환값 X
		// 3. 매개변수 X , 반환값 O
		// 4. 매개변수 O , 반환값 O
		
		 ParamNoReturn(10); // num에 들어갈 숫자를 넣어달라 
		 ParamNoReturn(20); 
		 
		 int a = 100;
		 ParamNoReturn(a); // 공간 X, 값 O 변수에다가 공간을 넣지만 매개변수에 값을 전달함 
		 
		 
		 //변수 = 10;
		 int result = noParamReturn(); // 메소드 반환값 저장
		 System.out.println(result);
		 
		 int b =5;
		 result = paramReturn(10);
		 System.out.println(result);
	
		 
		 
		 
		 // 에러(Error), 오류, 예외(Exception), 버그(Bug)
		 // 에러의 종류
		 
		 //1. 컴파일 오류 
		 // - 컴파일 과정에서 발견되는 오류 
		 // - 프로그래밍 언어 -> 기계어 번역 중에 발견되는 오류
		 // - 문법이 틀린 오류(***)
		 // - 컴파일러가 발견하는 오류(javac.exe)
		 // - 난이도 하, 발견률 상
		 // - 친절한 에러 메시지(원인, 발견 코드 위치)
		 // - 사용자 오타..
		 
		 //2. 런타임 오류(예측을 해야 됨)
		 // - Runtime Error 
		 // - 프로그램을 실행 중에 발생 하는 오류(컴파일이 되어야 실행이 됨,문법 X)
		 // - 예외(Exception)
		 // - 실행 중 발생, 경우에 따라 발생이 안되는 경우도 있음.
		 //	- ex)	숫자 -> 실제 숫자 변환 -> +연산
		 // 		입력: A
		 // - 난이도 중, 발견 중 
		 
		 //3. 논리 오류
		 // - 문법 O, 실행 O -> 결과 문제 발견 
		 // - 난이도 상, 발견 상 
		 
		 
		 int a1=10;
		 int b1 =3;
		 System.out.println(a1+b1);
		 
		 
		// int num = 10; //숫자 입력
//		 
//		 System.out.printf("100 / %d = %d\n",num,100/num);
		 
		System.out.println();
		System.out.println();
		int num = 20; //지역이 다르면 변수 이름을 똑같이 만들어도 상관없어
		 
		 
		 //System.out.println(num); //num cannot be resolved to a variable 선언되지 않은 변수를 쓴것, 뭔지 모른다.
		 // 돌아오는 순간 num은 죽어 모든 지역에서 섰던 자원들을 소멸시킴
		 
		 int m = 20;
		 
		 m1();
		 m1();
		 m1(); // 매번 새로운 매소드가 생성이 되어서 매번 다른 num이 새롭게 생김 
		
		 
		 // 메소드 오버로딩, Method Overloading 
		 // - 메소드가 *매개변수의 구성을 다양한 형태로* 가질 수 있게 하는 기술 
		 // - 같은 이름의 메소드를 여러개 만들 수 있는 기술 
		 // - 개발자의 가독성 때문에 사용하는 기술 
		 
		 //메소드 오버로딩 조건O
		 //1. 인자의 갯수 
		 //2. 인자의 타입 
		 
		 
		 //메소드 오버로딩 조건X
		 //1. 인자의 이름
		 //2. 반환값의 타입 
		 
		 //메소드를 호출
		 //test();					//1.
		 //test(10);				//3. 
		 //test("문자열"); 			//5.
		 //test(10,20); 			//6.
		 //test(10,"문자열"); 		//7.
		 //int result = test(10);	//8. 갈때가 문제 반환값의 유무를 판단하기 어려워, 할 수 없어 
		 
		 
		 
		 //메소드를 만드는 중...
		 //1. public static void test() {} 					//O
		 //2. public static void test() {}					//X, 1.
		 //3. public static void test(int n) {}				//O , 인자가 있어서
		 //4. public static void test(int m) {} 			//X, 3. 
		 //5. public static void test(String n) {}			//O
		 //6. public static void test(int n, int m) {}	 	//O
		 //7. public static void test(int n ,String m) {} 	//O
		 //8. public static int test(int n) {} 				//X, 3.
		 
		 
		 //hello();
		 hello();
		 hello("홍길동"); //메소드 Overloading
		 
		 
		 System.out.println(100);
		 System.out.println("문자열");
		 System.out.println(true); 
		 
		 
	} //main, 핵심이 되는 내용
	public static void println(int num) {
		//구현..
		
	}
	public static void println(String num) {
		//구현..
		
	}
	public static void println(boolean num) {
		//구현..
		
	}
	
	
//	
//	//Duplicate method hello() in type Ex08_Method_basic
//	public static void hello() {
//		
//	}

	public static void hello(String name) {
		System.out.printf("%s님 안녕하세요.\n",name);
	}
	
	public static void m1() {
		//System.out.println(m);  살아는 있지만 지역이 달라서 절대로 접근 할 수 없어 
		//Local Variable, 지역 변수
		// - 메소드 영역내에서 선언되고 사용되는 변수 
		//변수의 생명주기, Life Cycle
		// - 변수가 언제 태어나고, 언제 소멸되는가?
		int num = 10; 
		
		System.out.println(num);
		
	} //m1
	
	// 4. 매개변수 O , 반환값 O > 함수(Function)
	public static int paramReturn(int num) {
		int result = num * 2;
		return result;
		
	}

	// 3. 매개변수 X , 반환값 O
	public static int noParamReturn() {
		// This method must return a result of type int 
		//return 문, 반환문
		
		return 10;
	}
	
	// 2. 매개변수 O , 반환값 X
	public static void ParamNoReturn(int num) { //매개변수는 값을 못 넣어줘
		//(int num) : 매개변수
		// int num; 일반 변수랑 같아
		System.out.println(num + 100);
		
	}
	
	// 1. 매개변수 X , 반환값 X
	public static void noParamNoReturn() {
		//매개변수 X 
		//반환값 X
		// 일을 하고 나서 끝마침
	}
	
	
	// 메소드 선언하기, 의미있는 내용으로 이름을 정함, 하나의 단위 업무
	public static void hello() {
		System.out.println("반갑습니다.22222");
		
	}
	
}//Ex08_Method_basic
