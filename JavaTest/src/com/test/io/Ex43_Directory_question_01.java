package com.test.io;

import java.io.File;
import java.util.Scanner;

public class Ex43_Directory_question_01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("파일 경로 :");
		String path = scan.nextLine();

		File file = new File(path);
		System.out.printf("파일명 : %s\n", file.getName());
		System.out.printf("종류 : %s 파일\n",
				file.getName().substring(file.getName().lastIndexOf(".") + 1, file.getName().length()));
		double len = file.length();
		if(file.exists()) {
		if (len < 1024) {
			System.out.printf("파일 크기 : %.1fB", len);
		} else if (len >= 1024.0 && len < 1024 * 1024) {
			System.out.printf("파일 크기 : %.1fKB", (double)Math.round(len / 1024));
		} else if (len>= (1024 * 1024) && len < (1024 * 1024 * 1024)) {
			System.out.printf("파일 크기 : %.1fMB",(double) Math.round(len / (1024 * 1024)));
		} else if (len >= (1024 * 1024 * 1024) && len < (1024 * 1024 * 1024 * 1024)) {
			System.out.printf("파일 크기 : %.1fGB",(double) Math.round(len / (1024 * 1024 * 1024)));
		} else if (len >= (1024 * 1024 * 1024 * 1024)) {
			System.out.printf("파일 크기 : %.1fTB",(double) Math.round(len / (1024 * 1024 * 1024 * 1024)));
		}
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}

}

