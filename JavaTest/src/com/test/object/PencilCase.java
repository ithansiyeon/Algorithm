package com.test.object;

//필통
public class PencilCase {
	private String size; //대,중,소
	private String color;
	
	private String item1; //="볼펜";
	private String item2; //="연필";
	private String item3; //="지...";
	
	private String[] items = new String[10];
	
	//Case A. 주소값이 넘어가, private으로 만들어 놓은게 의미가 없어져 
	public String[] getItems() {
		return items;
	}
	public void setItems(String[] items) {
		this.items = items;
	}
	
	
	//Case B.
	public void setPencil(String item) {
		
		int i=0;
		for(i=0;i<items.length;i++) {
			if(items[i]==null) {
				break; 
			}
		}
		this.items[i]=item; //처음으로 만난 빈칸이야 
	}
	
	public String getPencil(int index) {
		String item = this.items[index];
		this.items[index] = null;
		return item;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
