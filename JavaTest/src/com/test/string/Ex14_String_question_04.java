package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14_String_question_04 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int gcount=0,jcount=0,pcount=0,hcount=0,dcount=0;
		/*
		for(int i=0;i<10;i++) {
			System.out.print("파일명: ");
			String txt = reader.readLine();
			switch(txt.substring(txt.indexOf(".")+1,txt.length()).toLowerCase()) {
				case "gif": gcount+=1;
				break;
				case "jpg": jcount+=1;
				break;
				case "png": pcount+=1;
				break;
				case "hwp": hcount+=1;
				break;
				case "doc": dcount+=1;
				break;
				default: System.out.println("확장자를 잘못입력하셨습니다.");
				break;
			}
			}
		*/
		for(int i=0;i<10;i++) {
			System.out.print("파일명: ");
			String txt = reader.readLine();
			if(txt.toLowerCase().endsWith(".gif")) gcount++;
			else if(txt.toLowerCase().endsWith(".jpg")) jcount++;
			else if(txt.toLowerCase().endsWith(".png")) pcount++;
			else if(txt.toLowerCase().endsWith(".hwp")) hcount++;
			else if(txt.toLowerCase().endsWith(".doc"))	dcount++;
			else System.out.println("확장자를 잘못입력하셨습니다.");
		}
 		
		
		System.out.printf("gif: %d개\n",gcount);
		System.out.printf("jpg: %d개\n",jcount);
		System.out.printf("png: %d개\n",pcount);
		System.out.printf("hwp: %d개\n",hcount);
		System.out.printf("doc: %d개\n",dcount);
		
		
		
	}

}
