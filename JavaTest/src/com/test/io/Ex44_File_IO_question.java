package com.test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Ex44_File_IO_question {
	private static BufferedReader reader;
	private static Scanner scan;
	static {
		scan = new Scanner(System.in);
	}

	public static void main(String[] args) throws Exception {
		//8번과 3번 다시 
		// m1();
		// m2();
		//m4();
		//m5();
		//m7();
		//m3();
		//m6();
		// m9();
		// m8();
		//m10(); 잘못됐음
	}

	private static void m10() throws Exception {
		// indexof
		File file = new File("D:\\파일_입출력_문제\\자바소스.java");
		reader = new BufferedReader(new FileReader(file));
		File file1 = new File("D:\\파일_입출력_문제\\자바예약어.dat");
		BufferedReader reader1 = new BufferedReader(new FileReader(file1));
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String line = null;
		while ((line = reader1.readLine()) != null) {
			map.put(line, 0);// *****
		}
		reader1.close();
		Set<String> set = map.keySet();

		while ((line = reader.readLine()) != null) {
			for (String item1 : set) {
				int index = - item1.length();
				if(line.indexOf(item1,index+item1.length())>-1) {
					int num = map.get(item1) + 1;
					map.put(item1, num);
				}

			}
		}
		System.out.println("[결과]");
		for (String item : set) {
			System.out.printf("%s : %d회\n", item, map.get(item));
		}
	}

//stack

	private static void m8() throws Exception {
		// 1. 모든 문자를 루프를 돌린다. 2. 가져온 문자가 열린 괄호인지 닫는 괄호인지 검사한다.
		// 2-1 열린 괄호면 stack에 넣는다. 2-2 닫는 괄호면 stack에서 열린 괄호 하나를 꺼내 둘을 비교
		// 2-2-1 둘이 같다면 짝이 맞음 pass 2-2-2 둘이 다르면 나머지는 검사할 필요없이 이미 이거는 잘못된 소스
		// 3. 루프를 다 돌았음에도 불구하고 stack에 남아있는 개수가 닫는 괄호의 개수가 불일치하면 잘못된 소스
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
		Stack<String> stack = new Stack<String>();
		File file = new File("D:\\파일_입출력_문제\\괄호.java");
		reader = new BufferedReader(new FileReader(file));

		
		String line = null;
		while ((line = reader.readLine()) != null) {
			for (int i = 0; i < line.length(); i++) {
				list.add(i, line.charAt(i) + "");
			}
		}

		// charAt
		int count = 0;
		reader.close();
		boolean loop = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("(") || list.get(i).equals("{")) {
				stack.add(list.get(i));
				if (list.get(i).equals("{")) {
					count++;
				}
			} 
			if (list.get(i).equals(")")) {
				if (!(stack.pop().equals("("))) {
					loop = true;
					break;
				}
			}

		}
		System.out.println(loop);
		//count가 23개인데
		System.out.printf("%d,%d", count, stack.size());
		if (!(count == stack.size()) || loop == true) {
			System.out.println("올바르지 않는 소스입니다.");
		} else {
			System.out.println("올바른 소스입니다.");
		}

	}

	private static void m9() throws Exception {
		File file = new File("D:\\파일_입출력_문제\\입력.dat");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));

		for (int i = 0; i < 10; i++) {
			System.out.print("숫자 : ");
			String num = scan.nextLine();
			writer.write(num);
			writer.newLine();
		}

		writer.close();
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 입력 순서대로
		System.out.println();
		System.out.println("입력 순서대로");
		reader = new BufferedReader(new FileReader(file));
		String line = null;
		while ((line = reader.readLine()) != null) {
			list.add(Integer.parseInt(line));
			System.out.println(line);
		}

		// for문, 순서만 바뀌는 것
		// 입력 반대 순서대로
		System.out.println("입력 반대 순서대로");
		// Collections.reverse(list);

		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}

		Collections.sort(list); // List<T> <- ArrayList<T>
		Collections.reverse(list);

		System.out.println("내림차순");
		for (Integer c : list) {
			System.out.println(c);
		}

	}

	private static void m6() throws Exception {
		File file = new File("D:\\파일_입출력_문제\\검색_회원.dat");
		File file1 = new File("D:\\파일_입출력_문제\\검색_주문.dat");
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
		reader = new BufferedReader(new FileReader(file));
		BufferedReader reader1 = new BufferedReader(new FileReader(file1));
		HashMap<String, Item> map = new HashMap<String, Item>();

		System.out.print("이름 : ");
		String name = scan.nextLine();

		// 검색 회원
		String line = null;
		while ((line = reader.readLine()) != null) {
			list.add(line);// *****
		}
		reader.close();

		// 검색 주문
		line = null;
		while ((line = reader1.readLine()) != null) {
			list1.add(line);// *****
		}

		reader.close();
		reader1.close();

		for (int i = 0; i < list.size(); i++) {
			String[] data = list.get(i).split(",");
			Item item = new Item();
			map.put(data[0], item);
			map.get(data[0]).num = data[0];
			map.get(data[0]).name = data[1];
			map.get(data[0]).address = data[2];

		}

		System.out.println("====구매내역====");
		System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");
		for (int i = 0; i < list1.size(); i++) {
			String[] data = list1.get(i).split(",");
			if (map.get(data[3]).name.equals(name) && map.get(data[3]).num.equals(data[3])) {
				System.out.printf("%s\t%s\t%s\t\t%s\t%s\n", map.get(data[3]).num, map.get(data[3]).name, data[1],
						data[2], map.get(data[3]).address);

			}
		}

	}

	private static void m3() throws Exception {

		File file = new File("D:\\파일_입출력_문제\\notepad.dat");
		
		BufferedWriter writer = null;
		
		//reader = new BufferedReader(new FileReader(file));
		
		Calendar now = Calendar.getInstance();
		String context = "";
		boolean loop = true;
		
		// 텍스트 파일 입출력
		
		//읽어 오자마자 쓰기
		
		while (loop) {
			System.out.println("-------------------");
			System.out.println("1. write");
			System.out.println("2. read");
			System.out.println("3. 종료");
			System.out.println("-------------------");
			System.out.print("번호 : ");
			String num = scan.nextLine();
		
			switch (num) { 
			case "1": // 쓰기 모드 
				String line = null;
				String txt = "";
				
				reader = new BufferedReader(new FileReader(file));
				
				while((line=reader.readLine())!=null) {
					txt+=(line+"\r\n");
					
				}
				reader.close();
				writer = new BufferedWriter(new FileWriter(file));
				System.out.print("name : ");
				String name = scan.nextLine();
				writer.write(name + "\r\n");
				

				String date = String.format("%tF", now);

				writer.write(date + "\r\n");
				

				System.out.print("content : ");
				while (true) {
					context = scan.nextLine();
					if (context.equals("q")) {
						break;
					}
					writer.write(context + "\r\n");
					
				}
				
				writer.write("-------------------\r\n");
				writer.write(txt);
				writer.close();
				reader.close();
				break;
			case "2":
				ArrayList<String> list = new ArrayList<String>();
				reader = new BufferedReader(new FileReader(file));
				System.out.println("[이름]\t[작성시간]\t[내용]");
				String line1 = null;
				while ((line1 = reader.readLine()) != null) {
					list.add(line1);// *****
					System.out.println(line1);
				}
				
				
				// 이름 날짜 메모, 복사 이동 swap

				for (int i = 0; i < list.size(); i++) {
					if (!list.get(i).equals("-------------------")) {
						System.out.print(list.get(i) + "\t");
					} else if(list.get(i).equals("-------------------")) {
						System.out.println();
					}
				}
				
				
				
				System.out.println();
				reader.close();
				
				break;
			case "3":
				loop = false;
				break;
			}
		}
		
		
	}

	private static void m7() throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		File file = new File("C:\\파일_입출력_문제\\출결.dat");
		reader = new BufferedReader(new FileReader(file));

		
		String line = null;
		while ((line = reader.readLine()) != null) {
			list.add(line);// *****
		}
		reader.close();

		String[] time = new String[2];
		String[] time1 = new String[2];
		ArrayList<String> name = new ArrayList<String>();
		HashMap<String, Data> map = new HashMap<String, Data>();

		System.out.println("[이름]\t[지각]\t[조퇴]");
		//이름별
		for (int i = 0; i < list.size(); i++) {

			Data value = new Data();

			String[] data = list.get(i).split(",");

			map.put(data[1], value);
		} // 중복하면 무시하기 때문에

		for (int i = 0; i < list.size(); i++) {
			String[] data = list.get(i).split(",");
			time = data[2].split(":");
			if ((Integer.parseInt(time[0]) == 9 && Integer.parseInt(time[1]) >= 1) || (Integer.parseInt(time[0]) > 9)) {
				map.get(data[1]).count1 = map.get(data[1]).count1 + 1;
			}
			time = data[3].split(":");
			if (Integer.parseInt(time[0]) < 18) {
				map.get(data[1]).count2 = map.get(data[1]).count2 + 1;
			}

		}

		Set<String> set = map.keySet();

		for (String item : set) {
			System.out.printf("%s\t%d\t%d\n", item, map.get(item).count1, map.get(item).count2);
		}
		System.out.println();
		map.clear();
		//날짜별 
		for (int i = 0; i < list.size(); i++) {

			Data value = new Data();

			String[] data = list.get(i).split(",");

			map.put(data[0], value);
		} 
		
			for (int i = 0; i < list.size(); i++) {
				String[] data = list.get(i).split(",");
				time = data[2].split(":");
				if (((Integer.parseInt(time[0]) == 9 && Integer.parseInt(time[1]) >= 1)
						|| (Integer.parseInt(time[0]) > 9))) {
					map.get(data[0]).count1 = map.get(data[0]).count1 + 1;
				}
				time = data[3].split(":");
				if (Integer.parseInt(time[0]) < 18) {
					map.get(data[0]).count2 = map.get(data[0]).count2 + 1;
				}
			}
		

		Set<String> set1 = map.keySet();
		System.out.println("[날짜]\t\t[지각]\t[조퇴]");
		for (String item : set1) {
			System.out.printf("%s\t%d\t%d\n", item, map.get(item).count1, map.get(item).count2);
		}

	}

	private static void m5() throws Exception {
		// 단일 검색
		ArrayList<String> list = new ArrayList<String>();
		File file = new File("D:\\파일_입출력_문제\\단일검색.dat");
		reader = new BufferedReader(new FileReader(file));

		System.out.print("이름 : ");
		String name = scan.nextLine();

		String line = null;
		while ((line = reader.readLine()) != null) {
			list.add(line);// *****
		}
		reader.close();

		for (int i = 0; i < list.size(); i++) {
			String[] data = list.get(i).split(",");
			if (name.equals(data[1])) {
				System.out.printf("[%s]\n", name);
				System.out.printf("번호 : %s\n", data[0]);
				System.out.printf("주소 : %s\n", data[2]);
				System.out.printf("전화 : %s\n", data[3]);
			}
		}

	}

	private static void m4() throws Exception {

		ArrayList<String> list = new ArrayList<String>();
		File file = new File("D:\\파일_입출력_문제\\성적.dat");
		reader = new BufferedReader(new FileReader(file));

		String line = null;

		while ((line = reader.readLine()) != null) {
			list.add(line);// *****
		}

		reader.close();

		ArrayList<String> pass = new ArrayList<String>();
		ArrayList<String> fail = new ArrayList<String>();
		double avg = 0.0;

		for (int i = 0; i < list.size(); i++) {
			String[] data = list.get(i).split(",");
			avg = (Double.parseDouble(data[1]) + Double.parseDouble(data[2]) + Double.parseDouble(data[3])) / 3;
			if (avg >= 60.0 && Double.parseDouble(data[1]) > 40 && Double.parseDouble(data[2]) > 40 && Double.parseDouble(data[3]) > 40) {
				pass.add(data[0]);
			} else {
				fail.add(data[0]);
			}
		}

		System.out.println("[합격자]");
		for (int i = 0; i < pass.size(); i++) {
			System.out.println(pass.get(i));
		}

		System.out.println("[불합격자]");
		for (int i = 0; i < fail.size(); i++) {
			System.out.println(fail.get(i));
		}
	}

	private static void m2() throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		File file = new File("D:\\파일_입출력_문제 (1)\\숫자.dat");
		reader = new BufferedReader(new FileReader(file));

		String line = null;

		while ((line = reader.readLine()) != null) {
			list.add(line);// *****
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("0")) {
				list.set(i, list.get(i).replace("0", "영"));
			}
			if (list.get(i).contains("1")) {
				list.set(i, list.get(i).replace("1", "일"));
			}
			if (list.get(i).contains("2")) {
				list.set(i, list.get(i).replace("2", "이"));
			}
			if (list.get(i).contains("3")) {
				list.set(i, list.get(i).replace("3", "삼"));
			}
			if (list.get(i).contains("4")) {
				list.set(i, list.get(i).replace("4", "사"));
			}
			if (list.get(i).contains("5")) {
				list.set(i, list.get(i).replace("5", "오"));
			}
			if (list.get(i).contains("6")) {
				list.set(i, list.get(i).replace("6", "육"));
			}
			if (list.get(i).contains("7")) {
				list.set(i, list.get(i).replace("7", "칠"));
			}
			if (list.get(i).contains("8")) {
				list.set(i, list.get(i).replace("8", "팔"));
			}
			if (list.get(i).contains("9")) {
				list.set(i, list.get(i).replace("9", "구"));
			}
		}
		reader.close();

		BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\파일_입출력_문제 (1)\\숫자.dat"));

		for (int i = 0; i < list.size(); i++) {
			writer.write(list.get(i));
			writer.newLine();
		}

		writer.close();
		System.out.println("완료");

	}

	private static void m1() throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		File file = new File("D:\\파일_입출력_문제 (1)\\이름수정.dat");
		reader = new BufferedReader(new FileReader(file));

		String line = null;

		while ((line = reader.readLine()) != null) {
			list.add(line);// *****
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("유재석")) {
				// System.out.println(list.get(i));
				list.set(i, list.get(i).replace("유재석", "메뚜기"));
			}
		}

		reader.close();

		BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\파일_입출력_문제 (1)\\이름수정.dat"));

		for (int i = 0; i < list.size(); i++) {
			writer.write(list.get(i));
			writer.newLine();
		}
		writer.close();
		System.out.println("완료");
	}

}

class Data {
	public int count1;
	public int count2;

}

class Item {
	public String num;
	public String name;
	public String address;
}



