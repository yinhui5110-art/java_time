package com.kh.chap01.model.vo;

public class Parent {
	private int x;
	private int y;
	public Parent() {
		
	}
	
	
	public Parent(int x,int y) {
	     this .x = x;
	     this.y = y;
		
		
	}
	public void printParent() {
		System.out.println("부모클래스 메소드입니다.");
	
	}
	public void printChild1() {// **자식클래스에서 오버라이딩 하기 위함**
		System.out.println("부모클래스의 1 메소드 입니다.");
		
	}

	
	public void print() {
		System.out.println("Parent의 print메소드 입니다.");
		
	} 
	
	
	
}

