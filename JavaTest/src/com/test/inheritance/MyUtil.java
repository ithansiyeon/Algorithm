package com.test.inheritance;

import java.util.Random;

public class MyUtil {
	
	//1. tool을 하나로 몰기위한 작업
	public int nextInt() {
		Random rnd = new Random();
		return rnd.nextInt();
	}
	
	//2.
	
	public int nextSmallInt() {
		Random rnd = new Random();
		return rnd.nextInt(10)+1;
	}
	
	//3. 
	public String nextColor() {
		Random rnd = new Random();
		String[] color = {"red","yellow","blue","white","black"};
		return color[rnd.nextInt(color.length)];
		}
	
	//4.
	public boolean nextBoolean() {
		Random rnd = new Random();
		return rnd.nextBoolean();
		
	}
	
}
