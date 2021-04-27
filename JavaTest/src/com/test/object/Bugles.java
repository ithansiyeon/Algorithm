package com.test.object;

import java.util.Calendar;

public class Bugles {
	private int price;
	private int weight;
	private Calendar creationTime;
	private int expiration;
	
	
	public int getPrice() {
		return price;
	}



	public void setWeight(int weight) {
		if(weight==300 || weight==500||weight==850) {
			{this.weight = weight;
			if(weight==850) {
				price=1950;
				this.expiration=15;
			}
			else if(weight==500) {
				price = 1200;
				this.expiration=10;
			}
			else {
				price = 850;
				this.expiration=7;
				}
			}
		}
	}

	public void setCreationTime(String creationTime) {
		int year = Integer.parseInt(creationTime.substring(0,4));
		int month = Integer.parseInt(creationTime.substring(5,7));
		int date = Integer.parseInt(creationTime.substring(8,10));
		Calendar c = Calendar.getInstance();
		c.set(year,month-1,date);
		this.creationTime=c;
		
	}

	public int getExpiration() {
		Calendar now = Calendar.getInstance();
		return expiration-(int)((now.getTimeInMillis()-this.creationTime.getTimeInMillis())/1000/60/60/24);
	}



	public void eat() {
		if(getExpiration()<0)
			System.out.println("유통기한이 지나 먹을 수 없습니다.");
		else System.out.println("과자를 맛있게 먹습니다.");
		}
	
}
