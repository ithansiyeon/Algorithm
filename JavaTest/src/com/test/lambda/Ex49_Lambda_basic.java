package com.test.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex49_Lambda_basic {
	public static void main(String[] args) {
		
		//람다식을 지원하는 빌트인 인터페이스 
		// 오직 람다식을 저장하기 위해 만들어진 인터페이스 
		// - 책 P802 정리되어 있음 : 목록 참고
		//람다식 익명객체는 지역변수를 읽기만 가능하고 수정을 못함 
		
		//Consumer,BiConsumer,Supplier,Function,BiFunction
		//1. Consumer : 매개변수 O, 반환값 X 
		//2. Supplier : 매개변수 X, 반환값 O 
		//3. Function : 매개변수 O, 반환값 O 매개변수를 반환값으로 변환 후 반환
		//4. Operator : 매개변수 O, 반환값O 매개변수를 연산 후 반환
		//5. Predicate : 매개변수 O, 반환값O 매개변수를 논리 판단 후 반환
		// Function의 하위가 Operator, Predicate 가독성을 위해서 존재 
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		m7();
		
	}

	private static void m7() {
		
		//함수형 인터페이스 조합(결합)
		// - 여러개의 람다식을 하나의 람다식으로 합치는 작업 
		
		
		//andThen()
		// - A.andThen(B)
		// - A 실행 -> B 실행
		
		
		User hong = new User("홍길동",20);
		Consumer<User> c1= user -> System.out.println(user.name); //m1()
		c1.accept(hong);
		Consumer<User> c2 = user -> System.out.println(user.age); //m2()
		c2.accept(hong);
		
		//이름 출력 + 나이 출력 -> 한꺼번에 하는 업무 생성
		
		Consumer<User> c3 = c1.andThen(c2); //람다식 + 람다식 
		c3.accept(hong); // 기존에 미리 짜놨던 업무를 재사용한것 새로운 업무를 만들때 쓴것, 필요하면 조합해서 써라 
		
		Consumer<User> c4 = c2.andThen(c1);
		c4.accept(hong); // 순서가 존재
		
		Consumer<User> c5 = c1.andThen(c2).andThen(c1).andThen(c2); // 홍길동 20 홍길동 20
		System.out.println();
		c5.accept(hong);
		System.out.println();
		
		Consumer<User> c6 = c3.andThen(c4); // 홍길동 20 20 홍길동 c1.andThen(c2).andThen(c2).andThen(c1)
		c6.accept(hong);
		
		
		
		// compose() 
		Function<String,Integer> f1 = str -> str.length();
		System.out.println(f1.apply("홍길동입니다."));
		
		Function<Integer,String> f2 = num -> num >5 ? "길다":"짧다";
		System.out.println(f2.apply(10));
		System.out.println(f2.apply(3));
		
		
		System.out.println(f2.apply(f1.apply("홍길동입니다."))); //가독성이 떨어짐 
		
		Function<String,String> f3 = f2.compose(f1); //f1의 매개변수, f2의 output값 
		System.out.println(f3.apply("안녕~"));
		
		
		
		//and(), or(), negate() ! 부정연산자
		// - Predicate 
		Predicate<Integer> p1 = n -> n % 2 == 0; //2의 배수
		Predicate<Integer> p2 = n -> n % 5 ==0; //5의 배수
		
		int num = 10;
		System.out.println(p1.test(num));
		System.out.println(p2.test(num));
		System.out.println();
		
		System.out.println(p1.test(num) && p2.test(num)); //2와 5의 공배수인지 
		System.out.println();
		
		Predicate<Integer> p3 = p1.and(p2); // A && B
		Predicate<Integer> p4 = p1.or(p2); // A || B
		Predicate<Integer> p5 = p1.negate(); // !A 
		
		System.out.println(p3.test(num)); // 2와 5의 공배수
		System.out.println(p4.test(num)); // 2의 배수 혹은 5의 배수
//		System.out.println(p5.test(num)); // 2의 배수가 아니냐?
		
	}

	private static void m6() {
		 //5개와 binaryOperator와 Predicate 만 봐~
		//Predicate 
		// - 매개변수O,반환값O
		// - 매개변수를 가지고 어떤 조건을 증명 후 결과를 반환하는 메소드를 구현할 때 사용 
		
		Function<Integer,Boolean> f1 = age -> age >= 19; 
		
		Predicate<Integer> p1 = age -> age >= 19; // 위에꺼 전용으로 만든것
		System.out.println(f1.apply(25));
		System.out.println(p1.test(25));
		
		System.out.println(f1.apply(15));
		System.out.println(p1.test(15));
		
	}

	private static void m5() {
		
		//Operator 
		// - 매개변수O, 반환값O
		// - 구현 목적: 연산을 하는 메소드를 구현할 때 사용 
		// - Function 하위 호환 인터페이스(서브셋)
		// - 연산자는 보통 피연산자와 연산결과가 자료형이 동일하다. 
		
		BiFunction<Integer,Integer,Integer> f1 = (a,b) -> a+b; // 연산 
		BiFunction<Integer,Integer,String> f2 = (a,b) -> "업무 완료"; // 프로세스 진행..
		
		//	BiFunction<Integer,Integer,Integer>
		BinaryOperator<Integer> b1 = (a,b) -> a+b;
		System.out.println(b1.apply(10, 20));
		
		BinaryOperator<String> b2 = (a,b) -> a+b;
		System.out.println(b2.apply("홍", "길동"));
		
		
		
	}

	private static void m4() {
		
		//정리 
		//1. 익명 객체 사용하는 경우 > 표현 단축 > 람다식( = 익명 객체의 구현된 추상 메소드)
		//2. 람다식 선언에는 반드시 인터페이스가 필요 > 함수형 인터페이스(추상 메소드 1개)
		//3. 자주 사용할만한 패턴의 추상 메소드를 가지는 여러 함수형 인터페이스를 제공 
		// - java.util.function : 함수형 인터페이스들을 제공
		// 	a. Consumer : 매개변수O,반환값X
		//	b. Supplier : 매개변수X, 반환값O
		//	c. Function : 매개변수O, 반환값O
		
		Consumer<Integer> c1 = num -> System.out.println(num);
		BiConsumer<Integer,Integer> c2 = (a,b) -> System.out.println(a+b);
		
		Supplier<Integer> s1 = () -> 100;
		
		Function<Integer,String> f1 = num -> num>0 ? "양수": "음수";
		BiFunction<Integer,Integer,Integer> f2 = (a,b) -> a*b;
		
		
		
		c1.accept(10);
		c2.accept(10, 20);
		System.out.println(s1.get()); //강제로 만들어라고 시킨게 accept,get 메소드 
		System.out.println(f1.apply(10)); // 인터페이스를 상속받는 객체에 구현된 추상메소드를 구현한 것 
		System.out.println(f2.apply(10, 20)); 
		
		
		
	}

	private static void m3() {
		
		//Function
		// - 매개변수O, 반환값O
		// - applyXXX()
		
		//매개변수 1개 -> 반환값 
		Function<String,Integer> f1 = name -> name.length(); 
		
		System.out.println(f1.apply("홍길동"));
		
		Function<String,Integer> f2 = new Function<String,Integer>(){
			@Override
			public Integer apply(String t) {
				return 10;
			}
		};
		
		Function<Integer,String> f3 = num -> num % 2 ==0 ? "짝수":"홀수";
		System.out.println(f3.apply(10));
		System.out.println(f3.apply(3));
		
		BiFunction<Integer,Integer,String> f4 = (a,b) -> a>b ? "크다":"작다";
		System.out.println(f4.apply(10, 5));
		System.out.println(f4.apply(5, 10));
		
	}

	private static void m2() {
		
		//Supplier 
		// - 반환값만 제공(공급)하는 역할 
		// - getXXX() 메소드를 제공하는 함수형 인터페이스
		
		Supplier<String> s1 = () -> {return "문자열";};
		Supplier<String> s2 = () -> "문자열";
		
		System.out.println(s1.get());
		System.out.println(s2.get());
		
		Supplier<Integer> s3 = () -> {
			Calendar c = Calendar.getInstance();
			return c.get(Calendar.HOUR_OF_DAY);
		};
		
		System.out.println(s3.get());
		
		Supplier<User> s4 = () -> new User("홍길동",20);
		
		User hong = s4.get();
		System.out.println(hong);
		
		Supplier<User[]> s5 = () -> new User[] {new User("가가가",20), new User("나나나",25), new User("다다다",27)}; // 초기화를 바로 한것 
		User[] list = s5.get();
		System.out.println(Arrays.toString(list));
		
		int num = 10;
		
		Supplier<List<User>> s6 = () -> {
			List<User> alist = new ArrayList<User>();
			alist.add(new User("하하하",20));
			alist.add(new User("호호호",20));
			return alist;
			//System.out.println(num); // 외부자원을 쓸 수 있음
		};
		
		List<User> result = s6.get();
		System.out.println(result);
		
		Supplier<Double> s7 = () -> Math.random(); // 범용
		DoubleSupplier s8 = () -> Math.random(); //전용
		
		
	}

	private static void m1() {
		
		//Consumer
		// - 매개변수를 받아서 소비하는 업무 구현 
		// - acceptXXX() 메소드를 제공하는 함수형 인터페이스
		
		//인터페이스 
		Consumer<String> c1 = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.printf("%s : 글자수(%s)\n",t,t.length());
			}
		};
		
		Consumer<String> c2 = t -> System.out.printf("%s : 글자수(%s)\n",t,t.length());
		
		c1.accept("홍길동");
		c2.accept("대한민국"); //매개변수를 받아서 소비하는 
		
		Consumer<Integer> c3 = num -> {
			for(int i=0;i<num;i++) {
				System.out.println(i);
			}
		};
		
		c3.accept(10);
		
		
		Consumer<User> c4 = user -> System.out.println(user.name);
		c4.accept(new User("홍길동",20));
		
		Consumer<User> c5 = user -> {
			if(user.age>18) {
				System.out.println(user.name + ": 성인");
			} else {
				System.out.println(user.name + ": 미성년");
			}
		};
		
		c5.accept(new User("홍길동",20));
		
		//3개 짜리 람다식은 우리가 직접 인터페이스를 만들어서 써야돼 
		BiConsumer<String,Integer> bc1 = (name,age) -> {
			User user = new User(name,age);
			System.out.println(user);
		};
		bc1.accept("아무개", 25);
		
		//Consumer<Integer>
		IntConsumer ic1 = num -> System.out.println(num);
		
		ic1.accept(100);
		
		//ObjIntConsumer (Object, Int) 매개변수 
		// 제너릭 버전을 기억하기
		
		
		
		
		
	}// main
	

}

class User {
	
	public String name;
	public int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}




