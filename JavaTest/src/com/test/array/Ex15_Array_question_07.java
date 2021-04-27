package com.test.array;

public class Ex15_Array_question_07 {
	public static void main(String[] args) {
		boolean loop = true;
		int[] list = new int[5];

		
		int i = 0;
		boolean a = false;
		while (loop) {
			// for(int i=0;i<list.length;i++)f {
			// if(i>=list.length) i%=list.length;
			a = false;
			int temp = ((int) (Math.random() * 10) + 1) % 10;
				for (int j = 0; j < list.length; j++) {
					if (list[j] == temp) {
						a = true;
						// i--;
						break;
					}
				}
			
			if (!a) {
				list[i] = temp;
				i++;
			}
			if (i == 5)
				loop = false;
		}

		System.out.print("[");
		for (int k = 0; k < 5; k++) {
			System.out.printf("%d ,", list[k]);
		}
		System.out.print("]");

	}// main

}
