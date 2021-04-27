package com.test.object;

class Box {
	private Maron[] list = new Maron[10];
	private String[] color = { "red", "blue", "yello", "white", "pink", "purple", "green", "black"};
	private String[] txt = new String[10];
	private int pass = 0;
	private int fail = 0;

	public void cook() {
		for (int i = 0; i < 10; i++) {
			list[i] = new Maron();
			list[i].setSize((int) (Math.random() * 11) + 5);
			list[i].setColor(color[(int) (Math.random() * 8)]);
			list[i].setThickness((int) (Math.random() * 16) + 3);
		}
		
	}

	public void check() {
		for (int i = 0; i < 10; i++) {
			String color = list[i].getColor();
			int size = list[i].getSize();
			int thick = list[i].getThickness();
			if (color.equals("Black") || (size < 8 || size > 14) || (thick < 3 || thick > 18)) {
				fail += 1;
				txt[i] = "불합격";
			} else {
				pass += 1;
				txt[i] = "합격";
			}

		}
		System.out.printf("QC 합격 개수 : %d\n", pass);
		System.out.printf("QC 불합격 개수 : %d\n", fail);
	}

	public void list() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d 번 마카롱 : %dcm(%s,%dmm) : %s\n", i, list[i].getSize(), list[i].getColor(),
					list[i].getThickness(), txt[i]);
		}
	}
}
