package com.test.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.test.object.User;

public class Ex50_Exception_basic {
	public static void main(String[] args) {
		
		// com.test.exception > Ex50_Exception_basic.java
		
		//예외 처리, Exception Handling
		// - 예외(Exception) 
		// - 예외를 미리 예측해서 사전에 방지(대응) 하는 코드 작성 행동 
		// 1. 전통적인 방식
		// 2. 전용 도구 
		
		
		//m1();
		//m2();
		//m3();
		//m4();
		
	//	try {
	//		m5();
	//		m6();
	//	} catch (Exception e) {
	//		System.out.println("값쪽에서 처리함");
	//	}
		
		//m5();
		m7();
		
	}
	private static void m7() {
		
		//외부와의 입출력하는 작업 > 예외 미루기 발생 
		//파일 입출력은 예외 미루기가 되어 있어, 미리 예측할 수 없어서 예외 미루기 또는 예외 처리를 해야 돼 
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine(); // 내부에 try 직접 구현
		
	}
	private static void m6() throws Exception {
		
		//예외 미루기 
		int num = 0;
		
		System.out.println(100/num); //나를 불렀던 호출쪽에서 예외처리를 해라
		
		
	}
	
	

	private static void m5() throws Exception {
		
		//예외 미루기 
		int num = 0;
		
		System.out.println(100/num); //나를 불렀던 호출쪽에서 예외처리를 해라
		
		
	}

	private static void m4() {
		
		//숫자 입력 -> 짝수만 사용, 홀수만 에러 
		
		int num = 3;
		
		if(num%2==0) {
			System.out.println("업무 진행");  
		} else {
			System.out.println("오류 발생 - 최대리 연락");
		}
		
		// try-catch로 통일 시켜 
		try {
			
			if(num % 2 == 1) {
				//강제 예외 발생
				throw new Exception(); // 예외 던지기, 강제적으로 낼 수 도 있어, 기억하기
			}
			System.out.println("업무 진행");  
		} catch (Exception e) {
			System.out.println("오류 발생 - 최대리 연락");
		}
		
		
		
	}

	private static void m2() {

		//가독성을 떨어뜨림 
		try {
			// 업무 A.
			int num = 0; // 사용자 입력
			System.out.println(100 / num);
		} catch (Exception e) {
			System.out.println("박과장 연락");
		}
		
		
		try {
			// 업무 B.
			int[] nums = new int[3];
			System.out.println(nums[5]); // 없는 방번호를 입력한거임
		} catch (Exception e) {
			System.out.println("김부장 연락");
		}

		
		try {
			// 업무 C.
			User user = null; // com.test.object.User
			System.out.println(user.getName()); // nullPointException 변수만 만들고 객체를 만들지 않아서 생긴 에러
		} catch (Exception e) {
			System.out.println("최대리 연락");
		}

	}
	
private static void m3() {
	
	//가독성은 살리면서 모든 예외를 구분지은 것 
	// try는 최소한의 묶어야 돼, 따라서 미리 예측을 해야 돼, 왜냐하면 모니터링 비용이 들어가서
	
	try {
		
		// 업무 A.
		int num = 10; // 사용자 입력
		System.out.println(100 / num); // new ArithmeticException() 산술 오류 => 공이라고 생각 catch에서 못 잡으면 pass가 됨 

		// 업무 B.
		int[] nums = new int[3];
		System.out.println(nums[2]); // 없는 방번호를 입력한거임 new ArrayIndexOutOfBoundException() 1번은 형변환이 불가능 

		// 업무 C.
		User user = new User(); // com.test.object.User
		System.out.println(user.getName()); // NullPointException 변수만 만들고 객체를 만들지 않아서 생긴 에러, new NullPointerException()
		
		//업무 D.
		String str = "홍길동";
		System.out.println(str.charAt(5)); // new StringIndexOutOfException(), 못잡으면 프로그램잉 뻑이 남 
		
		
		
	} catch (ArithmeticException e) { // ArithmeticException e = new ArithmeticException() 같은 타입이라서 받을 수 있어, 이 객체를 넣을 수 있는건 얘 밖에 없어 
		System.out.println("산술 연락 오류 - 박과장 연락");
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("배열 첨자 오류 - 김부장 연락");
	} catch (NullPointerException e) {
		// System.out.println(e.toString());
		System.out.println("널 참조 오류 - 최대리 연락"); // catch를 공통적으로 쓰자
	} catch (Exception e){ // Exception의 자식임 모든 에러는, 최상위 클래스임 : 나머지 처리는 반드시 맨 마지막에 넣어야 돼~! 
		System.out.println("나머지 오류 - 정사원 연락");
	}
	}

	private static void m1() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자(0빼고) : ");
		int num = scan.nextInt();
		
		//좋은 코드
		if (num != 0) {
			// 42억분의 1 -> 0
			// 업무 코드, 비즈니스 코드(핵심 코드) 
			System.out.printf("100 / %d = %d\n", num, 100 / num); // 실수일때 0으로 나눌 수 있어
		} else {
			// 예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
		}
		
		//안좋은 코드, 코드의 위치를 뒤집어 놓아서 가독성이 떨어져 
		if (num == 0) {
			System.out.println("0을 입력하면 안됩니다.");
		} else {
			System.out.printf("100 / %d = %d\n", num, 100 / num); // 실수일때 0으로 나눌 수 있어
		}
		
		
		//try : 비즈니스 코드 블럭
		//catch: 예외 처리 코드 블럭 
		// => 가독성이 향상돼~!
		// 0을 try에서 실행하고 에러가 나면 하던 일을 all stop -> catch로 이동해 (사고가 터진 후에 처리)
		// 단점 : 눈에 안보여서 코드 가독성이 떨어져
		try {
			System.out.printf("100 / %d = %d\n", num, 100 / num); 
			System.out.println("업무 완료");
		} catch(Exception e){ // e가 매개변수
			System.out.println("0을 입력하면 안됩니다.");
			System.out.println(e.getMessage()); // 0으로 나눌려고 했습니다.
			System.out.println(e.getStackTrace()); // 어떤 작업중에 났는지
			System.out.println(e.toString()); // 전체적인 정보: 예외 종류 + 메시지 
		}
		
		System.out.println();
	}

}
