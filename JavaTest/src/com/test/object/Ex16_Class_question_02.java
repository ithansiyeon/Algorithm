package com.test.object;

public class Ex16_Class_question_02 {
	public static void main(String[] args) {
		
		//Ex16_Class_question_02.java
		//Note.java
		Note note = new Note();
		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");
		System.out.println(note.info());
		System.out.println();
		Note note2 = new Note();
		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);
		System.out.println(note2.info());
		

		
	}

}
