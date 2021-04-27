package com.test.object;

public class Refrigerator {
	private Item[] list = new Item[100];
	private int i = 0;
	private int l = 0;


	public void add(Item item) {
		list[i] = item;
		System.out.printf("'%s'를 냉장고에 넣었습니다.\n", list[i].name);
		i++; //i는 list의 길이 역할을 함

	}

	public Item get(String name) {
		Item c = new Item();
		//System.out.println(i); i=3
		for (l = 0; l < i; l++) {
			if (list[l].getName().equals(name)) {
				c = list[l]; // shift를 해서, 왼쪽 시프를 해서 넣어

				for (int p = l; p < i; p++) {
					list[p] = list[p + 1];

				}
				list[i-1] = null;
				return c;
			}
		}
		return null;
	}

	public int count() {
		int count = 0;
		for (int j = 0; j < i; j++) {
			if (list[j] != null) {
					count += 1;
			} else {
				break;
			}
		}
		System.out.println();
		return count;
	}

	public void listItem() {
		System.out.println("[냉장고 아이템 목록]");
		for (int k = 0; k < i; k++)
			if (list[k] != null)
				System.out.printf("%s(%s))\n", list[k].getName(), list[k].getExpiration());

	}
}
