package com.test.object;

public class User {
	
	//클래스 => 객체를 만들어내는 틀
	//객체 = 데이터(멤버변수) + 행동(멤버메소드)
	
	//멤버변수 private 함부로 만들면 안돼 
	private String name;
	private String id;
	private int gender;
	
	//멤버들을 제어하는 public method를 안과 밖을 연결하는 인터페이스 메소드
	// getter,setter -> 통로 역할을 해줘서 인터페이스(Interface)
	public void setName(String name) {
		
		if((name.length()>=2 && name.length()<=5) && checkName(name)) {
		//this: 객체 자신을 가리키는 키워드(자신의 주소값 참조) 멤버변수를 가리킬 수 있어
		this.name = name; 
		} else {
			System.out.println("이름은 한글 2~5자 이내로 입력");
		}
		
	}
	
	
	public String getName() {
		return this.name;
	}
	
	//애매할 때는 private
	private boolean checkName(String name) {
			for(int i=0;i<name.length();i++) {
				//한문자씩 추출
				//1. 문자코드값? -> charAt()
				//2. 단순히 문자 1개가 필요? -> substring()
				char c = name.charAt(i);
				if(c<'가' || c>'힣')  {
					return false; // 값 반환 + 메소드 중단
				}
				//String s = "홍";
				//char c = '홍';
				
				//(int)c; // O 숫자->숫자
				//System.out.println((int)s); 
				//X Cannot cast from String to int 주소는 데이터로 못 바꿔,s는 4byte->int
				// 주소값(참조형)->데이터(값형)
				//*** 참조형과 값형간에는 형변환이 불가능!!!
				
			}
			 return true;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		//길이: 4~12자 이내
		//영문자 + 숫자 + _
		//숫자로 시작 X
		if(checkID(id)) {
			this.id = id;
		} else {
			System.out.println("아이디 유효하지 않음");
		}
	}


	private boolean checkID(String id) {
		//길이: 4~12자 이내
		//영문자 + 숫자 + _
		//숫자로 시작 X
		
		if(id.length()<4 || id.length()>12) {
			return false;
		}
		for(int i=0;i<id.length();i++) {
			char c = id.charAt(i);
			
			if((c<'A' || c>'Z') 
					&& (c<'a' || c>'z') 
					&& (c<'0' || c>'9')
					&& c!='_') {
				return false;
			}
		}
		
		if(id.charAt(0) >= '0' && id.charAt(0) <='9') {
			return false;
		}
		return true;
	}


	public int getGender() {
		return gender;
	}


	public void setGender(int gender) {
		if(gender == 1 || gender == 2){
			this.gender = gender;
			}
		else {
			System.out.println("성별은 1과 2만 가능");
		}
	
	}
}
