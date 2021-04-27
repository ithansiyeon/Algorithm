package com.test.io;

import java.io.File;

public class Ex44_Directory_question_10 {
	public static void main(String[] args) {
		
		String path = "C:\\파일_디렉토리_문제\\직원"; 
		File dir = new File(path);
		boolean loop = false;


		if(dir.exists()) {
		for(File sub : dir.listFiles()) {
			int index = sub.getName().indexOf("_");
			String path1 = String.format("%s\\%s\\%s",path,sub.getName().substring(0,index),sub.getName().substring(index+1,sub.getName().indexOf("_",index+1)));
			dir = new File(path1);
			dir.mkdirs();
			//System.out.println(path1+"\\"+sub.getName());
			File file = new File(path1+"\\"+sub.getName());
			loop=sub.renameTo(file);
			}
		} else {
			System.out.println("폴더가 존재하지 않습니다.");
		}
			
		if(loop) {
			System.out.println("분류가 완료되었습니다.");
		} else {
			System.out.println("분류 실패");
		}
		
		
	}
}
