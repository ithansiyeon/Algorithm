package com.test.collection;

import java.util.Arrays;

//FIFO 
public class MyQueue {
	
	private String[] list;
	private int index; // 내부적인 방번호
	
	public MyQueue() {
		this(10);
	}
	
	public MyQueue(int capacity) {
		list = new String [capacity];
		this.index=0;
	}
	
	public void add(String value) {
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
	
	public String poll() {
		if(this.index>0) {
		String temp = list[0];
		for(int i=1;i<this.index;i++) {
			list[i-1]=list[i];
		}
		this.index--;
		return temp;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public int size() {
		return index;
	}
	
	public String peek() {
		return list[0];
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
