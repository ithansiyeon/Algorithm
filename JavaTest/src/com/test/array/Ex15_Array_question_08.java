package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15_Array_question_08 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("삽입 위치 : ");
		int place = Integer.parseInt(reader.readLine());
		System.out.print("값 : ");
		int val = Integer.parseInt(reader.readLine());
		int [] list = new int[10];
		int temp1=0;
		int temp2=0;
		
		for(int i=0;i<list.length;i++) {
			list[i]=(int)(Math.random()*10);
		}
		
		System.out.print("원본 : [");
		for(int i=0;i<list.length;i++)
		System.out.printf(", %d",list[i]);
		System.out.print("]");
		System.out.println();
		
		//list[place]=val;
		for(int i=list.length-1;i>=0;i--) {
		//for(int i=0;i<list.length;i++) {
			list[i]=list[i-1];
			if(i==place) { 
				list[i]=val;
				break;
			}
		
			
		}
		System.out.print("결과 : [");
		for(int i=0;i<list.length;i++)
		System.out.printf(", %d",list[i]);
		System.out.print("]");
		
		/*
		int [] list1 = new int[10];
		int temp1=0;
		int temp2=0;
		for(int i=0;i<list.length;i++) {
			list[i]=(int)(Math.random()*10);
		}
		for(int i=0;i<list.length;i++) {
			list1[i]=list[i];
		}
		
		list1[place]=val;
		
		for(int k=place;k<list.length-1;k++) {
			temp1=list[k];
			temp2=list[k+1];
			list1[k+1]=temp1;
			temp1=temp2;
		}
		System.out.print("원본 : [");
		for(int i=0;i<list.length;i++)
		System.out.printf(", %d",list[i]);
		System.out.print("]");
		System.out.println();
		System.out.print("결과 : [");
		for(int i=0;i<list.length;i++)
		System.out.printf(", %d",list1[i]);
		System.out.print("]");
		*/
		
		/*
		 for(int i=0;i<list.length;i++) {
		 if(i<place) list[i]=list[i];
			else if(i==place) {
				temp1=list[place];
				list[i]=val;
			}
			else if(i>place) {
				temp2=list[i];
				list[i]=temp1;
				temp1=temp2;
			}
		}
		 */
		
	}


}
