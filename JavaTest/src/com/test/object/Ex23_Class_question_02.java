package com.test.object;

public class Ex23_Class_question_02 {
	public static void main(String[] args) {
	
	//바리스타
	Barista barista = new Barista();

	//손님 1
	//에스프레소 1잔 주문 - 원두 30g
	Espresso e1 = barista.makeEspresso(30);
	e1.drink();

	//손님 2
	//라테 1잔 주문 - 원두 30g, 우유 250ml
	Latte l1 = barista.makeLatte(30, 250);
	l1.drink();

	//손님 3
	//아메리카노 1잔 주문 - 원두 30g, 물 300ml, 각얼음 20개
	Americano a1 = barista.makeAmericano(30, 300, 20);
	a1.drink();

	//손님 4
	//에스프레소 10잔 주문 - 원두 25g
	Espresso[] e2 = barista.makeEspressoes(25, 10);

	for (Espresso e : e2) {
	    e.drink();
	}

	//손님 5
	//라테 5잔 주문 - 원두 25g, 우유 300ml
	Latte[] l2 = barista.makeLattes(25, 300, 5);

	for (Latte l : l2) {
	    l.drink();
	}

	//손님 6
	//아메리카노 15잔 주문 - 원두 20g, 물 350ml, 각얼음 30개
	Americano[] a2 = barista.makeAmericanos(20, 350, 30, 15);

	for (Americano a : a2) {
	    a.drink();
	}

	//결산
	barista.result();

	}
}