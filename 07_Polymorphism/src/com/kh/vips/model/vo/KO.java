package com.kh.vips.model.vo;

public class KO {
	private String name;
	public KO(String name) {
		this.name = name;
	}
	public void cooking() {
		System.out.println(name + "main 요리시작~!");
	}
	public void breakTime() {
		System.out.println(name + "쉬는시간!");
	}
}
