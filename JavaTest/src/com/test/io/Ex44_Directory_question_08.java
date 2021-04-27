package com.test.io;

import java.io.File;

public class Ex44_Directory_question_08 {
	private static int count = 0;
	private static int count1=0;
	public static void main(String[] args) {
		File dir = new File("C:\\파일_디렉토리_문제\\폴더 삭제");
		boolean loop = true;
		if (dir.exists()) {
			countFile(dir);
			//countFolder(dir);

		} else {
			loop = false;
			System.out.println("파일 없음");
		}
		
		if(loop) {
			System.out.println("폴더를 삭제했습니다. ");
			System.out.printf("삭제된 폴더는 %d개이고, 파일은 %d개입니다.\n", count1,count);
		}
		
	}


	private static void countFile(File dir) {
		//1. 자식 목록 가져오기
		File[] list = dir.listFiles();
		
		//2. 파일 개수 세기
		for(File sub : list) {
			if(sub.isFile()) { // isDirectory이면 폴더의 개수를 셈
				count++; // count+=sub.length() eclipse 크기를 구할 수 있어 
				sub.delete();
			}
			
		}
		//3. 자식 폴더를 대상으로 본인이 했던 행동을 다시하기
		
		for(File sub : list) {
			if(sub.isDirectory()) {
				//똑같은 행동을 반복 
				countFile(sub); // 재귀 호출 
			}
		}
		
		dir.delete();
		count1++;
		
	}
	//delete가서 countFile을 호출하고 자식들이 없어서 one이 countFile(one)에서 자식 파일들을 지우고 자식 폴더가 없어서 one이 없어지고 count1을 증가시키고 
	//자기를 호출했던 곳으로 가서 two가 countFile(two)가 되고 자식 파일들을 지우고 자식 폴더가 없어져서 two없어지고 count1이 증가 
	// 다시 자기를 호출했던 곳으로 가서 three가 countFile(three)가 되고 자식 파일들을 지우고 자식 폴더가 없어져서 three가 없어지고 count1이 증가되고 
	// delete의 자식파일들이 없어 dir.delete가 됨
	
	
	
	

	
	
}
