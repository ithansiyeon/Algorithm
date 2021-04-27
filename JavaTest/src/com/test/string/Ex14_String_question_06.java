package com.test.string;

public class Ex14_String_question_06 {
	public static void main(String[] args) {
		String txt = "  하하하     나     둘     셋            "; // 원본
		String rtxt = txt.trim(); //하     나     셋
		String ctxt = rtxt.replace(" ", "");
		int i=0;
		int lcount=0, rcount=0;
		while(txt.charAt(i)==' ') {
			lcount++;
			i++;
		}
		
		int j=txt.length()-1;
		
		while(txt.charAt(j)==' ') {
			rcount++;
			j--;
		}
		
		for(int k=1;k<=lcount;k++) {
			ctxt=" "+ctxt;
		}
		
		for(int k=1;k<=rcount;k++) {
			ctxt=ctxt+" ";
		}

		System.out.printf("원본 문자열 : \"%s\"\n",txt);
		System.out.printf("결과 문자열 : \"%s\"\n",ctxt);
		
		
	}

}
