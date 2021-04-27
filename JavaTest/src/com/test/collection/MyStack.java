package com.test.collection;

import java.util.Arrays;

//LIFO
// 나중에 넣은게 먼저 나옴 
public class MyStack {
	
	private String[] list;
	private int index; // 내부적인 방번호
	
	public MyStack() {
		this(10);
	}
	
	public MyStack(int capcity) {
		list = new String[capcity];
		this.index=0;
	}
	
	public void push(String value) {
		if(this.index>=list.length) {
			String[] temp = new String[list.length*2];
			for(int i=0;i<this.index;i++) {
				temp[i]=list[i];
			}
			temp[this.index]=value;
			this.index++;
			list=temp;
		} else {
			list[this.index]=value;
			this.index++;
		}
	}
	
	public String pop() {
		if(this.index>0) {
		String temp = list[this.index-1];
		this.index--;
		return temp;
		} else {
				throw new IndexOutOfBoundsException();
		}
	}
	
	public int size() {
		return this.index;
	}
	
	public String peek() {
		return list[this.index-1];
	}
	
	public void clear() {
		this.index=0;
	}
	
	public void trimToSize() {
		String[] temp = new String [this.index];
		for(int i=0;i<this.index;i++) {
			temp[i]=list[i];
		}
		list=temp;
		
	}

	@Override
	public String toString() {
		return String.format("길이: %d\n배열: %s\n인덱스: %d",list.length,Arrays.toString(list),this.index);
	}
}
