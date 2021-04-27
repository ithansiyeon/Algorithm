package com.test.datatype;

public class Ex02_Variable_use_01 {
	public static void main(String[] args) {
		//Ex02_Variable_use_01.java
		
		//변수를 만드는 방법 
		//1.
		int a;
		a=10;
		System.out.println(a);
		
		//2. 
		int b = 20; // 선언과 동시에 초기화 
		System.out.println(b);
		
		//3.
	//	int c;
	//	int d;
	//	int e;
		int c,d,e;
		
		c=30;
		d=40;
		e=50;
		// Ctrl + Alt + 위(아래) : 복제 
		// Alt + 위(아래) : 이동
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		//4. = 2 + 3
		int f = 60,g=70,h=80;
		int i=90,j,k,l=100;
		
		//Duplicate local variable a
		// - 로컬 변수 a가 중복됩니다.
		//int a = 100;
		//System.out.println(a);
		
		//The value of the local variable m is not used
		// - 로컬변수의 값이 사용된적이 없습니다.
		int m;
			
		//The local variable m may not have been initialized
		// - 로컬변수 m이 초기화되지 않았습니다. , null 상태이기 때문에 사용이 불가함 
		//System.out.println(m);
		
		//주석을 다는 방법 
		int x1 = 100; // 국어 
		int x2 = 90; 	// 영어 
		int x3 = 80; 	// 수학
		
		//국어
		int x4 = 100;
		//영어
		int x5 = 90;
		//수학 
		int x6= 80;
		
		int y1=100,y2=90,y3=80; // 국어, 영어 , 수학 
		
		int y4=100, 	// 국어, enter를 달기 전까지 주석 
			y5 = 90, 	//영어 
			y6=80; 		//수학
		
		int tota = 10;
		
		//total cannot be resolved to a variable
		// - 선언되지 않은 변수를 사용합니다.
		//System.out.println(total);
		
		//식별자 수정 Ctrl + '1'
		int abc= 10;
		
		System.out.println(abc);
		System.out.println(abc);
		System.out.println(abc);
		
		//자바는 대소문자 구분하는 언어 
		int kor;
		int KOR = 100;
		int Kor;
		int kOr;
		int KOr;
		int koR = 90;
		int KoR;
		int kOR;
		
		//변수명 만들기 - 규칙(**********)
		//1. 영문자 + 숫자 + '_'
		//2. 숫자로 시작 X
		//3. 예약어 사용 불가 
		//4. 의미있게(******)
		
		//int num10;
		//int 10num;
		//int _20200408study; // 오류가 안남 _ 사용해서 
		
		//byte byte;
		
		byte score_english = 80; // 영어 점수
		System.out.println(score_english);
		
		//명명법 
		//1. 헝가리언 표기법
		// - 자료형을 식별자에 넣는 방법 
		// - 사용) 인터페이스명 
		// 		interface IEmployees {}
		
		int num=100;
		int i_num;
		int int_num;
		int inum; 
		
		System.out.println(num);
		
		//2.파스칼 표기법
		// - 식별자가 한 단어 혹은 여러 단어 표기되는 경우 
		// - 모든 단어를 공백없이 연결 (_사용 안함)
		// - 각단어의 첫문자를 대문자 표기, 나머지를 소문자로 표기 
		// - 사용) 클래스명 
		
		//3. 캐멀 표기법
		// - 식별자가 한 단어 혹은 여러 단어 표기되는 경우 
		// - 모든 단어를 공백없이 연결 (_사용 안함)
		// - 각단어의 첫문자를 대문자 표기, 나머지를 소문자로 표기 
		// - 식별자의 첫문자를 소문자로 표기 
		// -사용) 변수명, 메소드명
		
		
	byte ScoreEnglishTest; //파스칼
	byte scoreEnglishTest; //캐멀 
	
	byte MathScore = 100; //파스칼
	
	//4. 스네이크 표기법
	// - 식별자가 한 단어 혹은 여러 단어 표기되는 경우
	// - 각단어를 '-'로 연결
	
	byte score_math = 100;
	
	//5. 케밥 표기법
	//- 자바는 지원 불가
	// - 식별자가 한 단어 혹은 여러 단어 표기되는 경우
	// - 각단어를 '-'로 연결 
	//byte score-math = 100; 연산자로 인식함 
	
	
	
	
	
			
	
	
		
		
		
		
		
		
		
		
		
		
	
				
		
		
		
		
		
		
		
	
	}
}
