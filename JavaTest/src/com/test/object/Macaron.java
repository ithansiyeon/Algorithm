package com.test.object;
//container역할 
class Maron {
    private int size;
    private String color;
    private int thickness;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		if(size>=5 && size<=15)
			this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
			this.color = color;
	}
	public int getThickness() {
		return thickness;
	}
	public void setThickness(int thickness) {
		if(thickness>=1 && thickness<=20)
		this.thickness = thickness;
	}
    
    
    
}