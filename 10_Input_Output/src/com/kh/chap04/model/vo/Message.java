package com.kh.chap04.model.vo;

import java.io.Serializable;

public class Message implements Serializable{
	
	
	//sevice : 비즈니스 로직(개발자가 생각을 펄치는 공간)
	
	private String to;
	private String content;
	public Message(String to, String content) {
		super();
		this.to = to;
		this.content = content;
	
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}