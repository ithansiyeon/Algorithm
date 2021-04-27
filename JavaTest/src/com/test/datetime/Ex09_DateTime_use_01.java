package com.test.datetime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;


public class Ex09_DateTime_use_01 {
	public static void main(String[] args) throws IOException {
		//m1(); Ctrl +'1'
		m2();	
		m3();
		//m4();
		m5();
	}

	private static void m5() {
		//시각 - 시각 //tick
		//시각 + 시간 //add
		//시각 - 시간  //add
		//시간 + 시간 //+
		//시간 - 시간 //-
		
		//시간의 최대 자릿수: 시간(일)
		
		//2시간 30분
		int hour = 2;
		int min = 30;
		
		//2시간 30분 + 40분 -> 3시간 10분 
		min +=40;
		
		// 자릿수 재정비 
		hour += min / 60; 
		min = min % 60;
		
		System.out.printf("%d시간 %d분\n",hour,min); 
		
		
		
	}

	private static void m4() {
		// TODO Auto-generated method stub
		//시각 - 시각 = 시간 
		// 현재 시각의 tick
		// - 1970.01.01 00:00:00 ~ 현재 시각 -> 밀리초 
		Calendar now = Calendar.getInstance();
		//1586847766154 자정으로 부터 몇 밀리초인지
		System.out.println(now.getTimeInMillis()); //long형의 return 값
		
		Calendar birth = Calendar.getInstance();
		birth.set(1995, 5, 10); //월은 하나를 빼야 돼, 생일
		long nowTick = now.getTimeInMillis();
		long birthTick = birth.getTimeInMillis();
		System.out.printf("내가 태어난지 %,d일이 지났습니다.\n",(nowTick-birthTick)/1000/60/60/24); // 내가 태어난지 몇 밀리초가 흘렀는지 보여줌 
		
		//올해 크리스마스가 며칠 남았느지?
		Calendar christmas = Calendar.getInstance();
		christmas.set(2020,11,25);
		
		long christmasTick = christmas.getTimeInMillis();
		
		System.out.printf("올해 크리스마스는 %,d일 남았습니다.\n",(christmasTick-nowTick)/1000/60/60/24);
		//시각과 시각의 차를 구하는 행동
		
		
		
	}

	private static void m3() {
		
		//시각 + 시간 
		//시각 - 시간 
		// - void add(int,int)
		
		Calendar c1 = Calendar.getInstance();
		
//		c1.add(Calendar.HOUR,5); //set 메소드와 같아, 상대값으로 수정 // set은 절대적 
//		c1.add(Calendar.HOUR,2);
//		c1.add(Calendar.DATE, 100);
		c1.add(Calendar.MONTH, -1);
		c1.add(Calendar.MINUTE, -40);

				
		System.out.printf("%tF %tT\n",c1,c1); //2020-03-14 21:45:50
		
	}
	

	private static void m2() {
		//시각
		//1. 현재 시각
		//2. 특정 시각
		//  a. void set(int,int)
		//	b. void set(int,int,int)
		// 	c. void set(int,int,int,int,int)
		//	d. void set(int,int,int,int,int,int) => 세트로 만든거임 

		// 내 생일 -> 1995, 4, 30
		Calendar birthday = Calendar.getInstance();
		
		birthday.set(Calendar.YEAR, 1995);
		birthday.set(Calendar.MONTH, 3); //*****
		birthday.set(Calendar.DATE, 30);
		birthday.set(Calendar.HOUR,2);
		
		
		//뭉탱이로 바꿀때 씀 set으로 수정 , get으로 원하는 값을 얻음 
		birthday.set(1996, 2, 15); //3줄을 한꺼번에 쓴것, 약속한 것 
		birthday.set(1996, 2, 15,2,30);
		birthday.set(1996, 2, 15,2,30,50); //초까지 넣은 것 
		
		System.out.printf("%tF %tT\n",birthday,birthday); // 시 분 초는 안바뀌었음 
		

		
	}

	private static void m1() throws IOException {
		
		Calendar c1 = Calendar.getInstance(); // 이 때 시각(***), 유동적인 개념이 아니야 
		System.out.printf("%tT\n",c1);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//getInstance에서 값을 가져와서 미리 저장해 두어서 시간이 흐른다고 착각을 하지만 흐르지 않는 것임 
		System.out.print("이름: ");
		String name = reader.readLine();
		System.out.println(name);
		
		System.out.printf("%tT\n",c1); // 당겨져 오는 거를 재사용
		
	}

	
}
