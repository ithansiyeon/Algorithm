package com.test.method;

public class Ex08_Method_question_12 {
	public static void main(String[] args) {
		int count = positive(10);
		System.out.printf("양수 : %d개\n",count);
		count = positive(10,20);
		System.out.printf("양수 : %d개\n",count);
		count = positive(10, 20,-30);
		System.out.printf("양수 : %d개\n",count);
		count = positive(10, 20, -30,40);
		System.out.printf("양수 : %d개\n",count);
		count = positive(10, 20, -30,40,50);
		System.out.printf("양수 : %d개\n",count);
	}
	
	
	
	public static int positive(int a) {
		int result1 = a>0  ? 1:0;
		int count = result1;
		return count;
	}
	
	public static int positive(int a,int b) {
		int result1 =  a>0 ? 1:0;
		int	result2 =  b>0 ? 1:0;
		int count = result1+result2;
		return count;
	}
	
	public static int positive(int a,int b,int c) {
		
		int result1 =  a>0 ? 1:0;
		int	result2 =  b>0 ? 1:0;
		int result3 =  c>0 ? 1:0;
		int count = result1+result2+result3;
		return count;
	}
	
	public static int positive(int a,int b, int c, int d) {
		int result1 =  a>0 ? 1:0;
		int	result2 =  b>0 ? 1:0;
		int	result3 =  c>0 ? 1:0;
		int	result4 =  d>0 ? 1:0;
		int count = result1+result2+result3+result4;
		return count;
	}
	
	public static int positive(int a,int b, int c, int d, int e) {
		int result1 =  a>0 ? 1:0;
		int	result2 =  b>0 ? 1:0;
		int	result3 =  c>0 ? 1:0;
		int	result4 =  d>0 ? 1:0;
		int result5 =  e>0 ? 1:0;
		int count = result1+result2+result3+result4+result5;
		return count;
	}
	
}
