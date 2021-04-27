package com.test.io;

import java.io.File;
import java.util.ArrayList;

public class Ex44_Directory_question_09 {
	private static int count;
	private static ArrayList <File> list1 = new ArrayList<File>();

	public static void main(String[] args) {
		File dir = new File("C:\\파일_디렉토리_문제\\크기 정렬");
		countFile(dir);
		
		for(int i=0;i<list1.size();i++) {
			for(int j=0;j<list1.size()-i-1;j++) {
				if(list1.get(j).length()<list1.get(j+1).length()) {
					File temp=list1.get(j);
					list1.set(j,list1.get(j+1));
					list1.set(j+1,temp);
				}
			}
		}
		
		System.out.println("[파일명]\t\t\t    [크기]\t[파일이 들어있는 폴더]");
		for(int i=0;i<list1.size();i++) {
			System.out.printf("%-30s\t%10s\t%s\n",list1.get(i).getName(),length(list1.get(i).length()),
					list1.get(i).getParentFile().getName());
			
			//	list1.get(i).getParent().substring(list1.get(i).getParent().lastIndexOf("\\")+1,(int)list1.get(i).getParent().length())
		}

	}

	public static void countFile(File dir) {
		File[] list = dir.listFiles();
		for (File sub : list) {
			if (sub.isFile()) {
				{
					list1.add(sub);
					count++;

				}

			}

		}

	for(File sub:list) {
		if(sub.isDirectory()) {
			countFile(sub);
		}
	}
		
	}

	public static String length(long len) {
		if (len < 1024) {
			return String.format("%.0fB",(double)len);
		} else if (len >= 1024.0 && len < 1024 * 1024) {
			return String.format("%.0fKB", (double)Math.round(len / 1024));
		} else if (len>= (1024 * 1024) && len < (1024 * 1024 * 1024)) {
			return String.format("%.0fMB",(double) Math.round(len / (1024 * 1024)));
		} else if (len >= (1024 * 1024 * 1024) && len < (1024 * 1024 * 1024 * 1024)) {
			return String.format("%.0fGB",(double) Math.round(len / (1024 * 1024 * 1024)));
		} else if (len >= (1024 * 1024 * 1024 * 1024)) {
			return String.format("%.0fTB",(double) Math.round(len / (1024 * 1024 * 1024 * 1024)));
		} else {
			return "";
		}
	}
}
