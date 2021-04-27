package com.test.object;

public class Ruler {
	private int length;
	private String shape;
	
	public String info() {
		String info="";
		info+=length+"cm 줄자";
		return info;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getLength() {
		return length;
	}

	public String getShape() {
		return shape;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
