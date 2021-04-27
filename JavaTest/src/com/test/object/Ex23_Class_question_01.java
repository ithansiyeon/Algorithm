package com.test.object;

public class Ex23_Class_question_01 {
	public static void main(String[] args) {
		//Ex23_Class_question_01.java : 테스트 코드
		//Packer.java
		
		//Pencil.java
		//Eraser.java
		//BallPointPen.java
		//Ruler.java
		//포장하는 직원
		Packer packer = new Packer();

		//연필
		Pencil p1 = new Pencil();
		p1.setHardness("HB");
		packer.packing(p1);

		Pencil p2 = new Pencil();
		p2.setHardness("4B");
		packer.packing(p2);

		//지우개
		Eraser e1 = new Eraser();
		e1.setSize("Large");
		packer.packing(e1);

		//볼펜
		BallPointPen b1 = new BallPointPen();
		b1.setThickness(0.3);
		b1.setColor("black");
		packer.packing(b1);

		BallPointPen b2 = new BallPointPen();
		b2.setThickness(1.5);
		b2.setColor("red");
		packer.packing(b2);

		//자
		Ruler r1 = new Ruler();
		r1.setLength(30);
		r1.setShape("줄자");
		packer.packing(r1);

		//결과 확인
		packer.countPacking(0);
		packer.countPacking(1);
		packer.countPacking(2);
		packer.countPacking(3);
		packer.countPacking(4);
	}

}
