package com.kh.chap03.model.vo;

//중복될 것이 많을 경우 부모클래스 사용
public class Webtoon {
	private String title;
	private String author;
	private String day;
	private String payment;
	public Webtoon() {
		super();
	}
	public Webtoon(String title, String author, String day) {
		super();
		this.title = title;
		this.author = author;
		this.day = day;
		this.payment = payment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
	
	public String info() {
		return "웹툰정보 = [웹툰제목 : " + title + ", 작가 : " + author + ", 요일 : " + day + "]";
	}

}
