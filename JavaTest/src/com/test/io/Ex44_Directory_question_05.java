package com.test.io;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class Ex44_Directory_question_05 {
	public static void main(String[] args) {
		
		File dir = new File("C:\\파일_디렉토리_문제\\확장자별 카운트");
		File[] list = dir.listFiles();
		HashMap<String,Integer> map = new HashMap<String,Integer>(); 

		for(int i=0;i<list.length;i++) {
			String c = list[i].getName().substring(list[i].getName().lastIndexOf(".") + 1, list[i].getName().length());
			map.put(c, 0);
		}
		
		
		for(int i=0;i<list.length;i++) {
			String c = list[i].getName().substring(list[i].getName().lastIndexOf(".") + 1, list[i].getName().length());
			int val = map.get(c)+1;
			map.put(c,val);
		}
	
		Set<String> set = map.keySet(); 
		
		for(String item : set) {
			System.out.println("*."+item + " : " + map.get(item)+"개");
		}
		
	}

}
