package com.test.object;

public class Ex16_Class_question_03 {
	//Ex16_Class_question_03.java
	//Bugles.java
	public static void main(String[] args) {
		Bugles snack = new Bugles();
		snack.setWeight(500);
		snack.setCreationTime("2020-04-22");
		System.out.printf("가격 : %,d원\n", snack.getPrice());
		System.out.printf("유통 기한이 %d일 남았습니다.\n", snack.getExpiration());
		snack.eat();

		Bugles snack2 = new Bugles();
		snack2.setWeight(300);
		snack2.setCreationTime("2020-04-10");
		System.out.printf("가격 : %,d원\n", snack2.getPrice());
		System.out.printf("유통 기한이 %d일 남았습니다.\n", snack2.getExpiration());
		snack2.eat();    
		
		
	}

}
