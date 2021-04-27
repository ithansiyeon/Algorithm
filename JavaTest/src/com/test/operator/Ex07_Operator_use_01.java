package com.test.operator;

public class Ex07_Operator_use_01 {
	public static void main(String[] args) {
		
		//산술 연산자
		int a =10;
		int b =3;
		double c =2.5;
		double d = 5;
		System.out.println(a+b); // 정수 + 정수 = 정수
		System.out.println(a+c); // 정수 + 실수 = 실수
		System.out.println(c+d); // 실수 + 실수 = 실수
		System.out.println();
		
		System.out.println(a-b); //정수 - 정수 = 정수
		System.out.println(a-c); //정수 - 실수 = 실수
		System.out.println(c-d); // 실수 - 실수 = 실수
		System.out.println();
		
		System.out.println(a / b); //정수 / 정수 = 정수
		System.out.println(a / c);// 정수 / 실수 = 실수
		System.out.println(c / d); // 실수 / 실수 = 실수 
		System.out.println();
		a=10;
		b=3;
		c=3;
		
		//*** 산술 연산자는 연산자의 결과를 두 피연산자 중 더 큰 자료형으로 반환한다.
		//정수와 정수를 나누기 연산을 하면 결과가 정수가 된다.
		//정수와 실수를 나누기 연산을 하면 결과가 실수가 된다.
		System.out.println(a / b); //3 
		System.out.println(a / c); //3.333333
		
		System.out.println();
		//***
		a = 2100000000;
		b = 2100000000;
		System.out.println((long)a + b); // 4byte integer는 표현을 할 수 없어서 overflow가 발생 
		System.out.println(a +(long)b);
		System.out.println((long)a +(long)b); 
		
		System.out.println((long)(a+b)); // 이미 overflow가 발생해서 의미가 없음 
		
		
		//나머지 연산자
		// - 패턴 생성에 많이 사용
		

		boolean b1 =true;
		boolean b2 =false;
		System.out.println(b1&&b2); //false
		System.out.println(b1||b2); //true
		System.out.println(!b1); //false
		System.out.println(!b2); //true
		
		//유효성 검사 
		// - 사용자가 데이터를 입력할 때 올바른 데이터를 입력했는지 검사하는 과정 
		
		// 아이디 -> 영어 소문자(a(97) ~z(122))
		char id = 'T';
		
		System.out.println((int)id >= (int)'a');
		System.out.println((int)id <= (int)'z');
		System.out.println();
		
		a = 10;
		b = 10;
		
		System.out.println(a==b);
		
		String s1 ="홍길동";
		String s2 ="홍길동";
		String s3 = "홍";
		s3 = s3+"길동";
		System.out.println(s3);
		
		// 문자열의 비교는 ==, != 연산자는 사용할 수 가 없다.
		System.out.println(s1==s2);
		System.out.println(s1==s3); //메모리의 물리적인 것 때문에 다르게 나옴
		System.out.println();
		System.out.println(s1.equals(s2)); 
		System.out.println(s1.equals(s3)); 
		System.out.println();
		//논리 연산자
		//나이 : 19세 이상 ~ 60세 미만
		// 		 19 <= age <60
		int age = 25;
		
		//System.out.println(19<=age<60);
		System.out.println(19<=age && age<60);
		System.out.println((19<=age)&&(age<60));
		System.out.println((age>=19)&&(age<60)); // 결론 
		System.out.println();
		
		c = '홍';
		System.out.println(((int)c>(int)'a') && ((int)c <=(int)'z'));
		System.out.println(c>='a' && c<= 'z'); // 암시적 형변환
		
		//** 잘 봐야 됨 **
		//영어 소문자
		System.out.println(c>='a' && c<= 'z'); // 암시적 형변환
		//영어 대문자
		System.out.println(c>='A' && c<= 'Z'); 
		//숫자
		System.out.println(c>='0' && c<= '9'); 
		//한글
		System.out.println(c>='가' && c<= '힣'); 
		System.out.println();
		
		int n = 10;
		int result =0;
		
		//비권장(하나의 문장에 증감 연산자와 다른 연산자를 동시에 사용하지 말것)
		//result =  20+ ++n; // 소괄호 빼고 ++ 먼저 
		//result =  20+ n++; // = 보다도 낮음
		
		//권장 
		
		//result =  20 + ++n;
		++n;
		result = 20+n;
		
		//result =  20 + n++;
		result = 20 +n;
		n++; //++n;
		
	
		System.out.println(result);
		System.out.println(n);
		System.out.println();
		
		int o = 10;
		System.out.println(--o - o--); //o가 9가 된 상태에서 9-9 한 뒤에 0이 출력되고 o가 -1이 됨
		System.out.println(o); // 0001이 1의 보수 법에 의해서 1000이 되어서 출력이 됨
		

		
		
		
	}
}
