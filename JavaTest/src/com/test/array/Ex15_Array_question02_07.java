package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15_Array_question02_07 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("국어 점수: ");
		int kor=Integer.parseInt(reader.readLine());
		System.out.print("영어 점수: ");
		int eng=Integer.parseInt(reader.readLine());
		System.out.print("수학 점수: ");
		int math=Integer.parseInt(reader.readLine());
		m9(kor,eng,math);
	}

	
	
	private static void m9(int kor,int eng, int math) { 
		String [][]score = new String[10][3];

			for(int j=0;j<score[0].length;j++) {
				if(j==0) {
					for(int i=0;i<score.length;i++) {
						if(i<kor/10) 
							score[i][j]="■";
						else 
							score[i][j]=" ";
						
					}
				}
				if(j==1) {
					for(int i=0;i<score.length;i++) {
						if(i<eng/10) 
							score[i][j]="■";
						else 
							score[i][j]=" ";
						
					}
				}
				
				if(j==2) {
					for(int i=0;i<score.length;i++) {
						if(i<math/10) 
							score[i][j]="■";
						else 
							score[i][j]=" ";
						
					}
				}
				
				
				
			}
		

		
			for(int j=score.length-1;j>=0;j--) {
		for(int i=0;i<score[0].length;i++) {
					System.out.printf(" %s ",score[j][i]);
			}
			System.out.println();
		}
		
		

	}
	
	
}
