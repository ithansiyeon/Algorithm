package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14_String_question_10 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문장 :");
		String txt = reader.readLine();
		String word1 = "바보";
		String word2 = "멍청이";
		//String rtxt="";
		int index1 = -1;
		int index2 = -1;
		index1 = -word1.length();
		index2 = -word2.length();
		int count=0;
		while(true) {
			index1 = txt.indexOf(word1,index1+word1.length());
			index2 = txt.indexOf(word2,index2+word2.length());
			//if문을 반으로 줄여봐~
			/*
			if(index1>-1 && index2>-1) {
				rtxt=txt.replace(txt.substring(index1,index1+word1.length()),"**");
				rtxt=txt.replace(txt.substring(index2,index2+word2.length()),"***");
				count+=2;
			} 
			else if(index1==-1 && index2>-1) {
				rtxt=txt.replace(txt.substring(index2,index2+word2.length()), "**");
				count+=1; }
			else if(index2==-1 && index1>-1) {
				rtxt=txt.replace(txt.substring(index1,index1+word1.length()), "***");
				count+=1;
			}
			else if(index1==-1 && index2==-1) break;
			*/
			if(index1>-1) {txt=txt.replace(txt.substring(index1,index1+word1.length()), "**");
			count+=1;
			}
			if(index2>-1) { txt=txt.replace(txt.substring(index2,index2+word2.length()), "***");
			count+=1;
			}
			if(index1==-1 && index2==-1) break;
			}
			
		
		System.out.printf("%s\n",txt);
		System.out.printf("금지어를 %d회 마스킹했습니다.",count);
		
	}

}
