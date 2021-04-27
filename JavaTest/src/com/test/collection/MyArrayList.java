package com.test.collection;

public class MyArrayList {

	public String[] list;
	private int index; // 마지막 방번호

	public MyArrayList() {
		this.list = new String[10]; // 중요~!!!!!
		this.index = 0;
	}

	public MyArrayList(int capacity) {
		this.list = new String[capacity]; // 중요~!!!!!
		this.index = 0;
	}

	// 맨 끝에 추가
	public void add(String item) {
		String[] list1;
		if (this.list.length <= this.index) {
			list1 = new String[this.list.length * 2];
			for (int i = 0; i < this.index; i++) {
				String temp = this.list[i];
				list1[i] = temp;
			}
			list1[this.index] = item;
			this.list = list1;
			// 기존 배열 -> 2배 크기 배열 교체
		} else {
			this.list[this.index] = item;
		}
		this.index++;
	}

	// 원하는 위치의 요소를 가져옴
	public String get(int index) {
		// 배열(10) : size(5)

		if (index >= 0 && index < this.size()) {
			return this.list[index];
		} else {
			throw new IndexOutOfBoundsException(); // 강제 에러 발생(억지로 에러낸것 중단돼)
		}

	}

	// 사이즈를 반환
	public int size() {

		return this.index;
	}

	// 수정
	public void set(int index, String string) {
		if (index >= 0 && index < this.size()) {
			list[index] = string;
		} else {
			throw new IndexOutOfBoundsException(); // 강제 에러 발생(억지로 에러낸것 중단돼)
		}
	}

	public void remove(int index) {
		if (index >= 0 && index < this.size()) {
			for (int i = index; i <= this.index - 1; i++) {
				list[i] = list[i + 1];
			}
			this.index--;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	// index를 중심으로 list1에 붙이고 나머지 옮기고 중간에 삽입한거임
	public void add(int index, String value) {
		if (index >= 0 && index < this.size()) {
			if (this.list.length <= (this.index + 1)) {
				String[] list1;
				list1 = new String[list.length * 2];
				for (int i = 0; i < index; i++) {
					list1[i] = list[i];
				}
				for (int i = this.index; i > index; i--) {
					String temp = list[i - 1];
					list1[i] = temp;
				}
				list1[index] = value;
				list = list1;
			} else {
				for (int i = this.index; i > index; i--) {
					list[i] = list[i - 1];
				}
				list[index] = value;

			}
			this.index++;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	public int indexOf(String value) {
		for (int i = 0; i < this.index; i++) {
			if (list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(String value) {
		for (int i = this.index - 1; i >= 0; i++) {
			if (list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}

	public void clear() {
		this.index = 0;
	}

	public boolean contains(String value) {
		for (int i = 0; i < this.index; i++) {
			if (list[i].equals(value)) {
				return true;
			}
		}
		return false;
	}

	public void trimToSize() {
		String list1[] = new String[this.index];
		for (int i = 0; i < this.index; i++) {
			list1[i] = this.list[i];
		}
		this.list = list1;
	}

	public boolean isEmpty() {
		boolean loop = false;
		if (this.index == 0) {
			loop = true;
		}
		return loop;
	}

	public MyArrayList subList(int fromIndex, int toIndex) {
		MyArrayList subList = new MyArrayList();
		for (int i = fromIndex; i <= toIndex - 1; i++) {
			subList.add(this.list[i]);
		}
		return subList;
	}

}
