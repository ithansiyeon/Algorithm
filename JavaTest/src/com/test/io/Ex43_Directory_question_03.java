package com.test.io;

import java.io.File;
import java.util.Scanner;

public class Ex43_Directory_question_03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String path = "C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\file\\AAA\\test.txt";
		String path1 = "C:\\Users\\PC\\OneDrive\\바탕 화면\\java\\file\\BBB\\test.txt";
	
		File file = new File(path);
		File file1 = new File(path1);
		System.out.println("파일을 이동합니다.");
		if(file.exists()) {
			boolean loop = file.renameTo(file1);
			if(!loop) {
				System.out.println("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
				String answer = scan.nextLine();
				if(answer.equals("y")) {
					 	file1.delete();
						boolean loop1 = file.renameTo(file1);
						if(loop1) {
							System.out.println("y.파일을 덮어섰습니다.");
						}
				}
				else System.out.println("n.작업을 취소합니다.");
			}
			
		} else {
			System.out.println("파일을 이동했습니다.");
		}
		
	}

}
