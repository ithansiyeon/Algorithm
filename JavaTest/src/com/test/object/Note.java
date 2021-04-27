package com.test.object;

public class Note {
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price = 500;
	private String thickness;

	public void setSize(String size) {
		if (size.equals("A3")) {
			this.size = size;
			price += 400;

		} else if (size.equals("A4")) {
			this.size = size;
			price += 200;

		} else if (size.equals("B3")) {
			this.size = size;
			price += 500;

		} else if (size.equals("B4")) {
			this.size = size;
			price += 300;

		} else if (size.equals("B5")) {
			this.size = size;
			price += 100;

		} else if (size.equals("A5")) {
			this.size = size;
			price += 500;

		}
		// return ;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.equals("검정색")) {
			this.color = color;
			price += 100;
		} else if (color.equals("노란색")) {
			this.color = color;
			price += 200;
		} else if (color.equals("파란색")) {
			this.color = color;
			price += 200;
		} else if (color.equals("흰색")) {
			this.color = color;
		}

	}

	public void setPage(int page) {
		if (page >= 10 && page <= 200) {
			this.page = page;
			if (page >= 10 && page <= 50) {
				thickness = "얇은";
			} else if (page >= 51 && page <= 100)
				thickness = "보통";
			else
				thickness = "두꺼운";
		}
		if (page > 10) {
			price += (page - 10) * 10;
		}
	}

	public void setOwner(String owner) {
		if (owner.length() >= 2 && owner.length() <= 5) {
			for (int i = 0; i < owner.length(); i++) {
				char c = owner.charAt(i);
				if (c >= '가' && c <= '힣') {
					this.owner = owner;
				}

			}
		}

	}

	public String info() {
		String info = "";
		// void printf()
		// String format()
		if (owner != null) {
			info += "■■■■■■  노트 정보 ■■■■■■\n";
			info += String.format("소유자:%s\n", this.owner);
			info += String.format("특성 :%s %s %s\n", this.color, this.thickness, this.size);
			info += String.format("가격: %,d원\n", this.price);
			info += "■■■■■■■■■■■■■■■■■■■■■■■■\n ";
			return info;
		}
		else {
			info += "■■■■■■  노트 정보 ■■■■■■\n";
			info +="주인 없는 노트\n";
			info+="■■■■■■■■■■■■■■■■■■■■■■■■\n ";
			return info;
		}
	}
}