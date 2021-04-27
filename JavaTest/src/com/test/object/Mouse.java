package com.test.object;

public class Mouse {
	private String model;
	private int button = 3;
	private int price;
	private String color;
	
	//setter & getter 구현
	//1. 일반적인 setter & getter
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		//유효성 검사
		this.model = model;
	}
	
	//2. getter만 구현 > 읽기 전용
	public int getButton() {
		return this.button;
	}
	
	//3. setter만 구현 > 쓰기 전용
	public void setPrice(int price) {
		this.price = price;
		}
	
	//4. 마우스 상, 중, 하
	public String getLevel() {
		
		if(this.price < 30000 && this.button >=5) {
			return "상";
		} else if(this.price<5000 && this.button >=4) {
			return "중";
		} else {
			return "하";
		}
	}
	
	
	
	
	
	
	
}
