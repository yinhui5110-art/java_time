package com.kh.chap03.model.vo;

public class KakaoWebtoon extends Webtoon{
	
	private boolean free;
	// boolean 타입의 자료형 케터 사용할 때  뒤에 is 가 붙는다
    public KakaoWebtoon() {}
    public KakaoWebtoon (String title, String author, String day, boolean free) {
    	super(title, author, day);
    	this.free = free;
    }
    
    
	public KakaoWebtoon(boolean free) {
		super();
		this.free = free;
	}
	public boolean isFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free = free;
	}
    
    
}
