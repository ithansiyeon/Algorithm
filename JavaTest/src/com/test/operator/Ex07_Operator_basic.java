package com.test.operator;

public class Ex07_Operator_basic {
	public static void main(String[] args) {
	//com.test.operator.Ex07_Operator_basic.java
		//연산자, Operator 
		// - 피연산자(Operand)를 대상으로 미리 정해진 연산(계산,행동)을 한 후 연산의 결과값을
		//반환하는 역할(주로 기호로 표시) 
		
		//1. 표현식, Expression // 연산자와 피연산자를 조합하여 계산하고자 하는 바를 표현 한다.
		//2. 문장,Statement
		//3. 연산자
		//4. 피연산자
		//5. 연산자 우선순위
		//6. 연산 방향 
	
		
		//1. 산술 연산자 
		// - +,-,*,/,%( mod 연산자, 나머지 연산자)
		// - 2항 연산자(피연산자 2개)
		
		int a = 10;
		int b = 3;
		System.out.printf("%d + %d = %d\n",a,b,a+b);
		System.out.printf("%d - %d = %d\n",a,b,a-b);
		System.out.printf("%d * %d = %d\n",a,b,a*b);
		System.out.printf("%d / %d = %d\n",a,b,a/b);
		System.out.printf("%d %% %d = %d\n",a,b,a%b); // %를 %d로 인식해서임 
		System.out.println();
		//2. 비교 연산자 
		// - >, >= ,< ,<= ,==(equal),!=(not equal)
		// - 2항 연산자
		// - 피연산자들의 비교 우위를 반환하는 역할 
		// - 연산의 결과가 항상 boolean으로 반환
		
		a = 10;
		b = 3;
		
		System.out.println(a > b); //true
		System.out.println(a >= b); //true
		System.out.println(a < b); // false
		System.out.println(a <= b); // false
		System.out.println(a == b); // false
		System.out.println(a != b); // true
		System.out.println();
		
		//비교 연산자
		a = 10; // int
//		double c = 10.0; //double
//		System.out.println(a>c); //false
//		System.out.println(a==c); //true
//		System.out.println();
		int age = 25; //키보드로 입력
		
		//자격 
		//1. 19세 이상
		System.out.println(age>=19); //권장
		System.out.println(19<=age); //비권장
		System.out.println();
		//2. 60세 미만
		System.out.println(age<60);
		System.out.println();
		
		//3. 논리 연산자
		// -&&(and), ||(or), !(not)
		// - &,| : 비트 연산자
		// - 피연산자를 대상으로 정해진 규칙에 따라 정해진 연산 결과를 반환함 
		// - && , || :2항 연산자 
		// - ! : 1항 연산자
		// - 피연산자는 반드시 boolean 
		// - 연산의 결과는 boolean을 반환 
		
		boolean b1 =true;
		boolean b2 =false;
		System.out.println(b1&&b2); //false
		System.out.println(b1||b2); //true
		System.out.println(!b1); //false
		System.out.println(!b2); //true
		System.out.println();
		
		//연산자 우선 순위 
		//산술 > 비교 > 논리 > 대입 
		
		//4. 대입(할당) 대입자
		// - =
		// - +=, -=, *=, /=, %= : 복합 대입 연산자 // 복잡한 일을 한다.
		// - LValue(변수) = RValue(상수,변수)
		// - LValue와 RValue는 반드시 자료형이 동일해야 한다.
		// - 대입 연산자는 모든 연산자를 통틀어 우선 순위가 가장 낮다.
		// - 연산자 방향이 오른쪽 -> 왼쪽이다.
		// - 2항 연산자
		
		int c;
		int d;
		int e;
		
//		c=100;
//		d=100;
//		e=100;
//		
//		c=100;
//		d=c;
//		e=c;
//		
		c=d=e=100;
		
		//A+=B
		
		int n = 10;
		
		//누적 
		n = n+1;
		System.out.println(n); //11
		
		n+=1; 
		System.out.println(n); //12
		
		n = n-2;
		System.out.println(n); //10
		
		n-=2;
		System.out.println(n); //8
		
		//n=2-n; // n-=2
		
		n = n*3;
		System.out.println(n); //24
		
		n*=3;
		System.out.println(n); //72
		
		n=n/2;
		System.out.println(n); //36
		
		n/=2;
		System.out.println(n); //18
		
		n=n%8;
		System.out.println(n); //2
		
		n=n%2;
		System.out.println(n); //0
		System.out.println();
		
		//5. 증감 연산자
		// - ++(증가),--(감소)
		// - 1항 연산자 
		// - 피연산자의 값을 +1, -1 누적한다.
		// - 피연산자의 위치에 따라 전위 연산자와 후위 연산자로 나뉜다.
		// 		- ++n : 전위 배치(전치). 연산자 우선 순위가 가장 높다.
		//		- n++ : 후위 배치(후치). 연산자 우선 순위가 가장 낮다.
		
		n=10;
		
		n=n+5;
		
		n+=5;
		++n; // 증감 연산자
		
		System.out.println(n);
		
		n=n-1;
		n-=1;
		--n;
		
		System.out.println(n); 
		
		//6. 조건 연산자
		//?:
		//-A ? B : C (boolean) ? c(true일 경우):d(false일 경우)
		//- 3항 연산자
		// - A :boolean
		// - B,C: 값(상수, 변수 ,계산식 등)
		// - B와 C는 자료형이 동일해야 한다.
		// - if문과 유사한 역할 
		
		int age1 = 25;
		
		String result = age1>= 19 ? "성인":"미성년자";
		
		System.out.println(result);
		
		
		

	
	
		
	}
}
