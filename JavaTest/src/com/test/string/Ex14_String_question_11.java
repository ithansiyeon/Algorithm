package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14_String_question_11 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("금액(원):");
		String money = reader.readLine();
		String result="";
		boolean loop = false;
		if(money.length()<=5) {
			for(int i=0;i<money.length();i++) {
				switch(money.charAt(i)) {
					case '0':
						result+='영';
						break;
					case '1':
					result+='일';
					break;
					case '2':
						result+='이';
						break;
					case '3':
						result+='삼';
						break;
					case '4':
						result+='사';
						break;
					case '5':
						result+='오';
						break;
					case '6':
						result+='육';
						break;
					case '7':
						result+='칠';
						break;
					case '8':
						result+='팔';
						break;
					case '9':
						result+='구';
						break;
						}
				if(money.length()==5) {
					if(i==0) result+="만";
					if(i==1) result+="천";
					if(i==2) result+="백";
					if(i==3) result+="십";

				}
				if(money.length()==4) {
					if(i==0) result+="천";
					if(i==1) result+="백";
					if(i==2) result+="십";
					
				}
				if(money.length()==3) {
					if(i==0) result+="백";
					if(i==1) result+="십";
					
				}
				if(money.length()==2) {
					if(i==0) result+="십";
					
					}
				
				}
		}
		else  
			loop = true;
		
		if(loop) System.out.println("최대자릿수가 5자리를 넘어갔습니다.");
			else System.out.printf("일금 %s원",result);
		
	}

}
