package com.test.object;


public class Book {
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2020";
	private String isbn;
	private int page;
	
	
	public String getTitle() {
		
		return title;
	}
	
	private boolean checkTitle(String title) {
		if(title.length()>50) {
			return false;
		}
		for(int i=0;i<title.length();i++) {
			//좀 더 간단하게 char c = title.charAt(i);
			if((title.charAt(i) <'a' || title.charAt(i)>'z') 
					&&(title.charAt(i)<'0' || title.charAt(i)>'9')
					&&(title.charAt(i)<'가'||title.charAt(i)>'힣')
					&& (title.charAt(i)!=' ')) // 공백도 포함 잘못된거를 찾는거니까 이(한글)에서 false니까
			{return false;}
			
		} 
		return true;
	}
	
	public void setTitle(String title) {
		if(checkTitle(title)) 
			this.title = title;
		else System.out.println("유효하지 않은 제목입니다.");
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(checkPrice(price))
		this.price = price;
		else System.out.println("가격은 0~1000000원 사이가 유효합니다.");
	}
	
	private boolean checkPrice(int price) {
		if(price <0 || price>1000000) return false;
		return true;
	}

	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		if(checkPage(page))
		this.page = page;
		else System.out.println("페이지는 0부터 무제한이 유효합니다.");
	}
	
	private boolean checkPage(int page) {
		if(page>=1) return true;
		else return false;
		
	}
	
	
	public String getPubYear() {
		return pubYear;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String info() {
		String inform = title+", "+price+", "+author+", "+publisher+", "+pubYear+", "+isbn+", "+page;
		return inform;
	}








}
