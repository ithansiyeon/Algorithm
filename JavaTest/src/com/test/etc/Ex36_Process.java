package com.test.etc;

public class Ex36_Process {
	public static void main(String[] args) throws Exception {
		
		//외부 프로세스(프로그램) 호출 
		//Process p1 = new ProcessBuilder("notepad.exe").start();
		//Process p1 = new ProcessBuilder("mspaint.exe").start();
		//Process p1 = new ProcessBuilder("explorer.exe").start();
		//Process p1 = new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe").start();
		
		//Process p1 = new ProcessBuilder("notepad.exe","C:\\Users\\한시연\\Desktop\\java\\JavaTest\\src\\com\\test\\datatype\\Ex02_Variable_question_01.java").start();
		Process p1 = new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","https://youtu.be/jANE8lpoj2c").start();
		//열고 싶은 파일을 외부의 도움으로 열수 있음 
		System.out.println("종료");
		
	}//main

}//Ex36_Process
