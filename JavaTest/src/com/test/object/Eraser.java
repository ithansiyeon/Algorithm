package com.test.object;

public class Eraser {
	private String size;
	
	public String info() {
		String info="";
		info+=size+" 사이즈 지우개";
		return info;
	}

	

	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		
		this.size = size;
		
	}

}
