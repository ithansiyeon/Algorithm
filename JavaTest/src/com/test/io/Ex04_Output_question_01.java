package com.test.io;

public class Ex04_Output_question_01 {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;
		String gender = "남자";
		String address = "서울시 강남구 역삼동";
		
		System.out.printf("안녕하세요. 제 이름은 '%s'입니다.\n",name);
		System.out.printf("나이는 %d살이고 %s입니다.\n",age,gender);
		System.out.printf("저는 '%s'에 살고 있습니다.\n",address);
		
		System.out.println();
		String name1 = "홍길동";
		int kor1 = 80;
		int eng1 = 90;
		int math1 = 95;
		
		String name2 = "아무개";
		int kor2 = 76;
		int eng2 = 86;
		int math2 = 79;
		
		String name3 = "하하하";
		int kor3 = 89;
		int eng3 = 92;
		int math3 = 85;
		
		System.out.println("[학생]\t[국어]\t[영어]\t[수학]\t[평균]");
		System.out.println("---------------------------------------");
		System.out.printf("%s:\t%d\t%d\t%d\t%d\n",name1,kor1,eng1,math1,(kor1+eng1+math1)/3);
		System.out.printf("%s:\t%d\t%d\t%d\t%d\n",name2,kor2,eng2,math2,(kor2+eng2+math2)/3);
		System.out.printf("%s:\t%d\t%d\t%d\t%d\n",name3,kor3,eng3,math3,(kor3+eng3+math3)/3);
		
		System.out.println();
		
		String date1 = "2020-01-01";
		String date2 = "2020-01-02";
		String date3 = "2020-01-03";
		
		String product1 = "카페라떼";
		String product2 = "돼지불백";
		String product3 = "마트 장본것들";
		String product4 = "교통 카드 충전";
		String product5 = "편의점";
		
		int money1 = 4800;
		int money2 = 8500;
		int money3 = 125840;
		int money4 = 45000;
		int money5 = 16200;
		
		System.out.println("[날짜]\t\t[내역]\t\t\t\t[금액]");
		System.out.println("------------------------------------------------------");
		System.out.printf("%s\t%s\t%,20d원\n",date1,product1,money1);
		System.out.printf("%s\t%s\t%,20d원\n",date1,product2,money2);
		System.out.printf("%s\t%s\t%,20d원\n",date2,product3,money3);
		System.out.printf("%s\t%s\t%,20d원\n",date3,product4,money4);
		System.out.printf("%s\t%s\t%,28d원\n",date3,product5,money5);
		
		
		
		
	}
}
