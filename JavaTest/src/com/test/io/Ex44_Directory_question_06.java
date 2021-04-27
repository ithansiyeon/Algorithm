package com.test.io;

import java.io.File;

public class Ex44_Directory_question_06 {
	public static void main(String[] args) {
		File dir = new File("C:\\파일_디렉토리_문제\\파일 제거");
		File[] list = dir.listFiles();
		int count=0;
		
		for(int i=0;i<list.length;i++) {
			if(list[i].length()==0 && list[i].isFile()) {
				list[i].delete();
				count++;
			}
		}
		
		System.out.printf("총 %d개의 파일을 삭제했습니다.\n",count);
		
	}

}
