package com.test.io;

import java.io.File;

public class Ex44_Directory_question_04 {
	public static void main(String[] args) {

		File dir = new File("C:\\파일_디렉토리_문제\\음악 파일\\Music");
		File[] list = dir.listFiles();
		boolean loop = false;
		if (dir.exists()) {
			for (int i = 0; i < list.length; i++) {
				// String name =
				String path = "C:\\파일_디렉토리_문제\\음악 파일\\Music\\";
				path += String.format("[%03d]", i) + list[i].getName();
				File file = new File(path);
				loop = list[i].renameTo(file);
				if (loop) {
					System.out.printf("[%03d]%s\n",i,list[i].getName());
				}
			}

		} else {
			System.out.println("디렉토리가 존재하지 않습니다.");
		}
		
	}

}
