package com.test.object;

import java.util.Arrays;

public class Ex19_Class_basic {
	public static void main(String[] args) {
		//클래스의 멤버 > 배열 멤버 
		//PencilCase.java 
		//String이라서 배열안에 주소 헷갈려서-> 그림 그려봐 
		//Case A-a. 파우치가 따로 있으면 필통안에 볼펜,연필,만년필 넣어서 다시 파우치에 넣은거랑 똑같아
		PencilCase c1 =new PencilCase();
		
		String[] items = new String[10];
		items[0] = "볼펜";
		items[1] = "연필";
		items[2] = "만년필";
		
		c1.setItems(items); 
		
		System.out.println(Arrays.toString(c1.getItems()));
		//스트링안에 주소값이 들어있는데 접근 하는 것
		//Case A-b.
		PencilCase c2 = new PencilCase();
		//채워넣기만 하면 돼~
		c2.getItems()[0]="연필"; //리턴값이 배열이야 items가 남아 items[0],참조형이기 때문에 주소값을 공유해서
		c2.getItems()[1]="볼펜";
		c2.getItems()[2]="만년필";	
		System.out.println(Arrays.toString(c2.getItems())); // 덤프할때도 getter를 써
		
		//Case B. 
		PencilCase c3 = new PencilCase();
		c3.setPencil("볼펜");
		c3.setPencil("연필");
		c3.setPencil("만년필");
		
		System.out.println(c3.getPencil(1));
		System.out.println(c3.getPencil(1)); //X
		
	}

}
