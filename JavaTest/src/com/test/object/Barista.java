package com.test.object;

public class Barista {
	
	public Espresso makeEspresso(int bean) {
		 Espresso coffee = new Espresso();
		 coffee.setBean(bean);
		 Coffee.espresso+=1;
		 Coffee.bean+=bean;
		 Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice;
		 return coffee;
	 }
	 
	public Espresso[] makeEspressoes(int bean,int count) {
		Espresso[] coffee = new Espresso[count];
		for(int i=0;i<count;i++) {
			coffee[i]= new Espresso();
			 coffee[i].setBean(bean);
			 Coffee.bean+=bean;
			 Coffee.espresso+=1;
			 Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice;
		}
		return coffee;
	}
	
	public Latte makeLatte(int bean,int milk) {
		Latte coffee = new Latte();
		coffee.setBean(bean);
		coffee.setMilk(milk);
		Coffee.latte+=1;
		Coffee.bean+=bean;
		Coffee.milk+=milk;
		Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice;
		Coffee.milkTotalPrice+=milk*Coffee.milkUnitPrice;
		return coffee;
	}
	
	
	public Latte[] makeLattes(int bean,int milk, int count) {
		Latte[] coffee = new Latte[count];
		for(int i=0;i<count;i++) {
			coffee[i]= new Latte();
			 coffee[i].setBean(bean);
			 coffee[i].setMilk(milk);
			 Coffee.latte+=1;
			 Coffee.bean+=bean;
			 Coffee.milk+=milk;
			 Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice;
			 Coffee.milkTotalPrice+=milk*Coffee.milkUnitPrice;
		}
		return coffee;
	}
	
	public Americano makeAmericano(int bean,int water,int ice) {
		Americano coffee = new Americano();
		coffee.setBean(bean);
		coffee.setIce(ice);
		coffee.setWater(water);
		Coffee.americano+=1;
		Coffee.bean+=bean;
		Coffee.water+=water;
		Coffee.ice+=ice;
		Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice;
		Coffee.waterTotalPrice+=water*Coffee.waterUnitPrice;
		Coffee.iceTotalPrice+=ice*Coffee.iceUnitPrice;
		return coffee;
	}
	
	public Americano[] makeAmericanos(int bean,int water,int ice,int count) {
		Americano[] coffee = new Americano[count];
		for(int i=0;i<count;i++) {
			coffee[i]=new Americano();
			coffee[i].setBean(bean);
			coffee[i].setWater(water);
			coffee[i].setIce(ice);
			Coffee.americano+=1;
			Coffee.bean+=bean;
			Coffee.water+=water;
			Coffee.beanTotalPrice+=bean*Coffee.beanUnitPrice;
			Coffee.waterTotalPrice+=water*Coffee.waterUnitPrice;
			Coffee.iceTotalPrice+=ice*Coffee.iceUnitPrice;
		}
		return coffee;
	}

	public void result() {
		System.out.println("==================");
		System.out.println("판매 결과");
		System.out.println("==================");
		
		
		System.out.println("------------------");
		System.out.println("음료 판매량");
		System.out.println("------------------");
		System.out.printf("에스프레소 : %d잔\n",Coffee.espresso);
		System.out.printf("아메리카노 : %d잔\n",Coffee.americano);
		System.out.printf("라떼 : %d잔\n",Coffee.latte);
		System.out.println();
		
		System.out.println("--------------------");
		System.out.println("원자재 소비량");
		System.out.println("--------------------");
		System.out.printf("원두 : %dg\n",Coffee.bean);
		System.out.printf("물 : %,dml\n",Coffee.water);
		System.out.printf("얼음 : %d개\n",Coffee.ice);
		System.out.printf("우유 : %,dml\n",Coffee.milk);
		System.out.println();
		System.out.println("--------------------");
		System.out.println("매출액");
		System.out.println("--------------------");
		System.out.printf("원두 : %,d원\n",Coffee.beanTotalPrice);
		System.out.printf("물 : %,d원\n",Coffee.waterTotalPrice);
		System.out.printf("얼음 : %,d\n",Coffee.iceTotalPrice);
		System.out.printf("우유 : %,d\n",Coffee.milkTotalPrice);
		
		
		
	}
}
