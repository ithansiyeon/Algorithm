package com.test.object;

public class BallPointPen {
	
	private double thickness;
	private String color;

	public String info() {
		String info="";
		info+=color+" 색상 "+thickness+"mm 볼펜";
		return info;
	}

	

	public double getThickness() {
		return thickness;
	}



	public String getColor() {
		return color;
	}



	public void setThickness(double thickness) {
		this.thickness = thickness;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
}
