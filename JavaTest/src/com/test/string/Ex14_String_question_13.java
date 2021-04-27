package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public interface Ex14_String_question_13 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("연산식:");
		String txt = reader.readLine();
		String rtxt = txt.trim();
		rtxt=rtxt.replace(" ","");
		String n1="",n2="";
		int count=0;
		boolean loop = true;
		while(loop) {
		for(int i=0;i<rtxt.length();i++) {
			switch(rtxt.charAt(i)) {
			case '+':
					if(rtxt.startsWith("+") || rtxt.endsWith("+")) {
						System.out.println("피연산자가 부족합니다.");
						count++;
						loop=false;
					}
					else {n1=rtxt.substring(0,rtxt.indexOf('+'));
					n2=rtxt.substring(rtxt.indexOf('+')+1,rtxt.length());
					System.out.printf("%s = %d",txt,Integer.parseInt(n1)+Integer.parseInt(n2));
					count++;
					loop=false;
					}
					break;
			case '-':
					if(rtxt.startsWith("-") || rtxt.endsWith("-")) {
						System.out.println("피연산자가 부족합니다.");
						count++;
						loop = false;
					}
					else {
					n1=rtxt.substring(0,rtxt.indexOf('-'));
					n2=rtxt.substring(rtxt.indexOf('-')+1,rtxt.length());
					System.out.printf("%s = %d",txt,Integer.parseInt(n1)-Integer.parseInt(n2));
					count++;
					loop=false;
					}
					break;
			case '*':
					if(rtxt.startsWith("*") || rtxt.endsWith("*")) {
						System.out.println("피연산자가 부족합니다.");
						count++;
						loop = false;
					}
					else {n1=rtxt.substring(0,rtxt.indexOf('*'));
					n2=rtxt.substring(rtxt.indexOf('*')+1,rtxt.length());
					System.out.printf("%s = %d",txt,Integer.parseInt(n1)*Integer.parseInt(n2));
					count++;
					loop=false;
					}
					break;
			case '/':
					if(rtxt.startsWith("/") || rtxt.endsWith("/")) {
						System.out.println("피연산자가 부족합니다.");
						loop = false;
						count++;
					}
					else {
					n1=rtxt.substring(0,rtxt.indexOf('/'));
					n2=rtxt.substring(rtxt.indexOf('/')+1,rtxt.length());
					System.out.printf("%s = %.1f",txt,Double.parseDouble(n1)/Integer.parseInt(n2));
					count++;
					loop=false;
					}
					break;
			case '%':
					if(rtxt.startsWith("%") || rtxt.endsWith("%")) {
						System.out.println("피연산자가 부족합니다.");
						count++;
						loop = false;
					}
					else {
					n1=rtxt.substring(0,rtxt.indexOf('%'));
					n2=rtxt.substring(rtxt.indexOf('%')+1,rtxt.length());
					System.out.printf("%s = %d",txt,Integer.parseInt(n1)%Integer.parseInt(n2));
					count++;
					loop=false;
					}
					break;
			default: loop = false;
				}
			
			}
		}
		
		if(count==0) {
			System.out.println("연산자가 올바르지 않습니다.");
		}
		
		
		
	}

}
