package com.test.io;

import java.io.File;

public class Ex44_Directory_question_07 {
	public static void main(String[] args) {

		File dir = new File("C:\\파일_디렉토리_문제\\동일 파일\\MusicA");
		File dir1 = new File("C:\\파일_디렉토리_문제\\동일 파일\\MusicB");
		int count = 0;
		File[] list = dir.listFiles();
		File[] list1 = dir1.listFiles();

		if (dir.exists() && dir1.exists()) {
			for (int i = 0; i < list.length; i++) {
				for (int j = 0; j < list1.length; j++) {
					if (list[i].getName().equals(list1[j].getName())) {
						System.out.printf("%s\n", list[i].getName());
						count++;
					}
				}
			}
			System.out.printf("%d개의 파일이 중복됩니다.", count);
		} else {
			System.out.println("폴더가 존재하지 않습니다.");
		}
	}

}
