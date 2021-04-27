package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14_String_question_05 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자: ");
		String txt = reader.readLine();
		String result="";
		String content= "";
		int j=txt.length();
		
		for(int i=txt.length()-3;i>0;i=i-3) {
			String tmp1 = txt.substring(0,i);
			String tmp2 = txt.substring(i);
			txt=tmp1+","+tmp2;
		}
		System.out.printf("결과: %s",txt);
		
		/*
		 if(txt.length()%3==0)	
			for(int i=1;i<=txt.length()/3;i++) {
				//분기 , 콤마를 써도 돼는 거하고 
				content=","+txt.substring(j-3,j);
				result=content+result;
				j-=3;
			}
		if(txt.length()%3!=0)	
			result=txt.substring(0,txt.length()%3)+result;
		else result="\b"+result;
		System.out.printf("결과: %s",result);
		*/
	}

}
