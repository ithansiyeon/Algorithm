package com.test.string;

public class Ex14_String_basic {
	public static void main(String[] args) {
		//Ex14_String_basic.java
		
		//문자열,String
		//-숫자, 문자,논리, 문자열,날짜시간 
		
		
		//문자열 조작 기능 
		//-> 메소드 제공 
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		m10();
	} //main

	private static void m10() {
		
		//"10" -> 10
		String str = "10"; //원본
		System.out.println(Integer.parseInt(str));
		
		//10 -> "10"
		int num = 10;
		System.out.println(String.valueOf(num)); //FM
		System.out.println(num+""); // 10 +"" -> "10"
		System.out.println(""+num); 
		System.out.println(true+"");
		//String.value 따옴표를 붙여줘 
		
	}

	private static void m9() {
		// 문자열 치환
		//-String replace(char old, char new)
		// -String replace(String old, String new) , 앞에 거를 찾아서 뒤에 걸로 교체
		String txt = "안녕하세요. 홍길동입니다.";
		// 바꿔치기 해주는 아이 반환만 해줘, 복사본을 반환해 줘 
		System.out.println(txt.replace("홍길동", "아무개"));
		System.out.println(txt.replace("하하하","아무개")); // 아무런 에러가 않생겨
		//System.out.println(txt); //원본은 건드리지 않음 
		
		txt = "     하나     둘     셋     ";
		System.out.println(txt.replace(" ","")); //전체 공백 삭제, space를 찾아서 빈 문자열로 반환해라
		
		
		
	}

	private static void m8() {
		//문자열 검색 
		// - indexOf 
		// - lastIndexOf()
		// - boolean contains(String)
		
		//포함 여부를 알려줌
		String txt = "안녕하세요. 홍길동입니다.";
		System.out.println(txt.contains("홍길동"));
		System.out.println(txt.indexOf("홍길동")>-1); 
		System.out.println(txt.contains("아무개"));
		
		
	}

	private static void m7() {
		
		//문자열 추출
		// - char charAt(int index) : 문자추출
		// - String substring(int start, int end) : 문자열 추출, 부분 문자열 추출
		//	- start : inclusive
		//	- end 	: exclusive
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.substring(3,8)); // 앞에 숫자는 포함하고 뒤에 숫자는 포함이 안돼 
		System.out.println(txt.substring(3,3)); // 면적이 존재하지 않아, 0글자
		System.out.println(txt.substring(3,4)); // 한글자, 최소 숫자의 차이는 1
		
		System.out.println(txt.substring(3)); // 문자열의 끝까지 잘라 
		System.out.println(txt.substring(3,txt.length())); 
		
		

		
		
		
		
	}

	private static void m6() {
		
		//(패턴)검색
		// - boolean startsWith(String word)
		// - boolean endWith(String word)
		
		String name = "홍길동";
		
		//'홍'씨?
		System.out.println(name.charAt(0)=='홍');
		System.out.println(name.indexOf('홍')==0);
		System.out.println(name.startsWith("홍")); // 가독성을 높이기 위해서 
		//'동'으로 끝나느냐?
		System.out.println(name.charAt(2)=='동'); //일반
		System.out.println(name.charAt(name.length()-1)=='동'); //좋은
		System.out.println(name.indexOf("동")==2); // 일반, 중간에 있는 위치 일 수도 있어 
		System.out.println(name.indexOf("동")==name.length()-1); // 좋은
		System.out.println(name.endsWith("동")); 
	}

	private static void m5() {
		//대소문자 변환
		// - String toUpperCase()
		// - String toLowerCase()
		
		//영어 쓸때만 관련된 애 
		String txt = "Hello Hong";
		
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		
	}

	private static void m4() {
		
		//문자열 검색
		// - 문자열 내에서 원하는 문자(문자열)검색 -> 발견한 위치 반환
		// - int indexOf(char c)
		// - int indexOf(String s) ** 자주 사용 
		// - int indexOf(char c,int index)
		// - int indexOf(String s,int index)
		
		// 위치 값을 하나 더 받음 
		
		String txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다.";
		
		int index = txt.indexOf('홍');
		System.out.println(index);
		
		index = txt.indexOf("홍");
		System.out.println(index);
		
		// 시작하는 값의 위치를 반환
		index = txt.indexOf("홍길동");
		System.out.println(index);
		
		// 기억해야돼~!
		index = txt.indexOf("아무개"); //0~13을 반환 있다면, 없는 애를 찾으면 -1 
		System.out.println(index);
		//문장내에 '아무개'가 있느냐?
		if(txt.indexOf("홍길동")>-1) {
			System.out.println("발견O"); 
		} else {
			System.out.println("없음;;;"); 
		}
		//"안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다.";
		System.out.println();
		index = txt.indexOf("홍길동",0); // 시작 위치 0 
		System.out.println(index);
		
		index = txt.indexOf("홍길동",10); // 그 다음 위치 부터 시작 
		System.out.println(index);
		
		
	}

	private static void m3() {
		//문자열 공백 제거
		// - String trim()
		String txt = "     하나     둘     셋     ";
		
		System.out.printf("[%s]\n",txt);
		System.out.printf("[%s]\n",txt.trim()); //좌우에 잇는 공백을 없애줌, 시작,끝
		
		
		
	}

	private static void m2() {
		//문자열 추출
		// - 특정 위치의 문자를 반환
		// - char charAt(int index) 
		// - Zero-based Index
		
		//0~length()-1
		String txt = "안녕하세요. 홍길동님.";
		System.out.println(txt.charAt(0));
		System.out.println(txt.charAt(3));
		System.out.println(txt.charAt(11));
		System.out.println(txt.charAt(txt.length()-1)); // 최대 index, 마지막 index
		
		//java.lang.StringIndexOutOfBoundsException
		//String에서 사용할 수 있는 length()-1을 넘어갑니다. -> if문으로 검사
		System.out.println(txt.charAt(100)); 
		
		
		
	}

	private static void m1() {
		
		//문자열의 길이
		// - 문자열을 구성하는 문자의 갯수
		// - int length() 
		
		String txt = "Hello";
		System.out.println(txt.length()); //integer 문자의 갯수
		System.out.println("Bye".length());
		System.out.println("안녕하세요".length());
		
		
		
		
	}

}
