package com.test.io;


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class answer {
	
	private static int fileCount = 0;
	private static int directoryCount = 0;
	private static int duplicateCount = 0;
	private static int deleteCount = 0;
	
	
	public static void main(String[] args) {
		
		//m10();
		//m9();
		//m8();
		//m7();
		//m6();
		//m5();
		m4();
		//m3();
		
	}

	private static void m3() {
		
		
		
	}

	private static void m4() {
		
		final String path = "C:\\파일_디렉토리_문제\\음악 파일";
		File dir = new File(path);
		File[] list = dir.listFiles();
		
		for (int i=0; i<list.length; i++) {
			
			File renameFile = new File(path + "\\" + String.format("[%s]%s"
																, getNum(i + 1)
																, list[i].getName()));
			
//			File renameFile = new File(path + "\\" + String.format("[%03d]%s"
//																, i + 1
//																, list[i].getName()));
			list[i].renameTo(renameFile);
			System.out.println(list[i]);
			
		}
		
		
	}

	private static Object getNum(int num) {
		
		if (num < 10) {
			return "00" + num;
		} else if (num < 100) {
			return "0" + num;
		} else {
			return "" + num;
		}
		
	}

	private static void m5() {
		
		HashMap<String,Integer> count = new HashMap<String,Integer>();
		
		final String path = "D:\\파일_디렉토리_문제\\확장자별 카운트";
		File dir = new File(path);
		File[] list = dir.listFiles();
		
		for (File file : list) {
			
			String fileName = file.getName();
			String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
			
			if (count.containsKey(ext)) {
				count.put(ext, count.get(ext) + 1);
			} else {
				count.put(ext, 1);
			}
			
		}
		
		System.out.println(count);
		
	}

	private static void m6() {
				
		final String path = "D:\\파일_디렉토리_문제\\파일 제거";
		File dir = new File(path);
		File[] list = dir.listFiles();
		
		for (File file : list) {
			if (file.isFile() && file.length() == 0) {
				file.delete();
				deleteCount++;
			}
		}
		
		System.out.printf("총 %d개의 파일이 삭제되었습니다.\n", deleteCount);
		
	}

	private static void m7() {
		
		final String pathA = "D:\\파일_디렉토리_문제\\동일 파일\\MusicA";
		final String pathB = "D:\\파일_디렉토리_문제\\동일 파일\\MusicB";
		
		File dirA = new File(pathA);
		File dirB = new File(pathB);
		
		File[] listA = dirA.listFiles();
		File[] listB = dirB.listFiles();
		
		for (int i=0; i<listA.length; i++) {
			for (int j=0; j<listB.length; j++) {
				if (listA[i].getName().equals(listB[j].getName())) {
					System.out.println(listA[i].getName());
					duplicateCount++;
				}
			}
		}
		
		System.out.println(duplicateCount);
		
	}

	private static void m8() {
		
		final String path = "D:\\파일_디렉토리_문제\\폴더 삭제\\delete";
		File dir = new File(path);
		
		deleteDirectory(dir);
		
		System.out.printf("총 %d개의 파일과 %d개의 디렉토리를 삭제했습니다.\n"
							, fileCount, directoryCount);
		
		
	}

	private static void deleteDirectory(File dir) {
		
		File[] list = dir.listFiles();
		
		for (File sub : list) {
			if (sub.isFile()) {
				fileCount++;
				sub.delete();
			}
		}
		
		for (File sub : list) {
			if (sub.isDirectory()) {
				deleteDirectory(sub);
			}
		}
		
		directoryCount++;
		dir.delete();
		
	}

	private static void m9() {
				
		ArrayList<File> allList = new ArrayList<File>();
		
		final String path = "C:\\파일_디렉토리_문제\\크기 정렬";
		File dir = new File(path);
		
		
		searchFiles(dir, allList);
		
		
		for(int i=0; i<allList.size(); i++) {
	        for(int j=0; j<allList.size()-i-1; j++) {
				
				if (allList.get(j).length() < allList.get(j+1).length()) {
					File temp = allList.get(j);
					allList.set(j, allList.get(j+1));
					allList.set(j+1, temp);
				}
				
			}
		}
		
		
		System.out.println("[파일명]\t\t\t    [크기]\t[파일이 들어있는 폴더]");
		
		for (File file : allList) {
			System.out.printf("%-30s\t%10s\t%s\n"
								, file.getName()
								, getSize(file.length())
								, file.getParentFile().getName());
		}
		
		
	}
	
	private static void searchFiles(File dir, ArrayList<File> allList) {
		
		File[] list = dir.listFiles();
		
		for (File sub : list) {
			if (sub.isFile()) {
				allList.add(sub);
			}
		}
		
		for (File sub : list) {
			if (sub.isDirectory()) {
				searchFiles(sub, allList);
			}
		}
		
	}
	
	private static String getSize(long length) {
		
		if (length < 1024) {
			return String.format("%,dB", length);
		} else if (length < 1024 * 1024) {
			return String.format("%,dKB", length / 1024);
		} else if (length < 1024 * 1024 * 1024) {
			return String.format("%,dMB", length / 1024 / 1024);		
		} else {
			return String.format("%,dGB", length / 1024 / 1024 / 1024);
		}
		
	}

	private static void m10() {
		
		final String path = "D:\\파일_디렉토리_문제\\직원";
		File dir = new File(path);
		File[] list = dir.listFiles();
		
		for (File file : list) {
			
			if (file.isFile()) {
				String[] temp = file.getName().split("_");
				
				//String subPath = path + "\\" + temp[0];
				//File subDir = new File(subPath);
				//subDir.mkdir();
				
				String subPath = path + "\\" + temp[0] + "\\" + temp[1];
				File subDir = new File(subPath);
				subDir.mkdirs();	
				
				String movePath = subDir.getAbsolutePath() + "\\" + file.getName();
				File moveFile = new File(movePath);
				
				file.renameTo(moveFile);
				
			}
			
		}
		
		
	}

}
 