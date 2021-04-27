package com.test.collection;

import java.util.Arrays;

public class MyHashMap {

	// private String[] keyList;
	// private String[] valueList;
	private MapItem[] list; // 객체 변수를 인덱스만큼 생성 
	private int index;

	// put은 keyList와 valueList에 넣어
	// index++ 둘의 같은 쌍

	// 키와 값을 요소에 추가 & 수정
	
	public MyHashMap() {
		this(10);
	}
	
	public MyHashMap(int capcity) {
		list = new MapItem[capcity];
		this.index=0;
	}
	
	public void put(String key, String value) {
		boolean loop = true;
		if(this.index>=list.length) {
			
			MapItem[] temp = new MapItem[list.length*2];
			
			for(int i=0;i<this.index;i++) {
				//temp[i].key=list[i].key;
				//temp[i].value=list[i].value;
				temp[i] = list[i]; // 주소를 넣는다.
			}
			
			MapItem tempItem = new MapItem();
			tempItem.key = key;
			tempItem.value  = value;
			//temp[this.index].key=key;
			//temp[this.index].value=value;
			temp[this.index] = tempItem;
			this.index++;
			list=temp;
		}
		else {
			for (int i = 0; i < this.index; i++) {
				if (this.list[i].key.equals(key)) {
					this.list[i].value = value;
					loop = false;
					break;
				} 
			}
			
			if(loop) {
				MapItem tempItem = new MapItem();
				tempItem.key = key;
				tempItem.value  = value;
				list[this.index] = tempItem;
				this.index++;
			}
		}
	}

	// 키에 대응하는 요소의 값을 가져온다.
	public String get(String key) {
		for (int i = 0; i < this.index; i++) {
			if (this.list[i].key.equals(key)) {
				return this.list[i].value;
			}
		}
		return null;

	}

	// 요소의 개수를 반환
	public int size() {
		return this.index;

	}

	// 원하는 키의 요소를 같으면 삭제된 index위치를 기준으로 왼쪽 shift 해서 넣음
	public void remove(String key) {
		for (int i = 0; i < this.index; i++) {
			if (this.list[i].key.equals(key)) {
				for (int j = i; j < this.index - 1; j++) {
					this.list[j].key = this.list[j + 1].key;
					this.list[j].value = this.list[j + 1].value;
					this.index--;
					break;
				}
			}
		}
	}

	

	// 해당 키가 존재하는지 확인한다.
	public boolean containKey(String key) {
		for (int i = 0; i < this.index; i++) {
			if (this.list[i].key.equals(key)) {
				return true;
			}
		}
		return false;
	}

	// 해당 값이 존재하는지 확인
	public boolean containsValue(String value) {
		for (int i = 0; i < this.index; i++) {
			if (this.list[i].value.equals(value)) {
				return true;
			}
		}
		return false;
	}

	// 배열의 모든 요소를 삭제한다.
	public void clear() {
		this.index = 0;
	}

	@Override
	public String toString() {
		return String.format("길이: %d, 배열: %s, 인덱스: %d\n",this.list.length,Arrays.toString(this.list),this.index);
	}

}

class MapItem {
	public String key;
	public String value;
	@Override
	public String toString() {
		return String.format("(%s,%s)", key,value);
	}

	
}
