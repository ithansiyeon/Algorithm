package com.test.object;

public class Pencil {
	private String hardness;
	public String info(){
		String info="";
		info+=hardness+"진하기 연필";
		return info;
	}


	public void setHardness(String hardness) {
			this.hardness = hardness;
		
	}


	public String getHardness() {
		return hardness;
	}

}
