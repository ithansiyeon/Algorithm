package com.test.io;

import java.io.File;
import java.util.Scanner;

public class Ex43_Directory_question_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("폴더 선택 : ");
		String path = scan.nextLine();
		System.out.print("파일 확장자 : ");
		String extension = scan.nextLine();
		
		File dir = new File(path);
		
		
		if(dir.exists()) {
			File[] list = dir.listFiles();
			for(File file: list) {
				if(file.getName().substring(file.getName().lastIndexOf(".") + 1, file.getName().length()).toUpperCase().equals(extension.toUpperCase())) {
					System.out.printf("%s\n",file.getName());
				}
			}
			
		} else {
			System.out.println("디렉토리 없음");
		}
		
		
		
	}

}
