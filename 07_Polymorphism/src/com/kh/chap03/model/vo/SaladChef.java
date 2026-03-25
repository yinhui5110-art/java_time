package com.kh.chap03.model.vo;

public class SaladChef extends Chef{

	public SaladChef(String name) {
		super(name);
	}
	@Override //alt shift S -> alt + v
	public void cooking() {
		System.out.println("샐러드 요리합니다~!");
	}

}
