package com.kh.football.model.dto;


// DTO : date transfer object
//       값      전송    객체
// 순수하게 데이터를 옮겨담을 용도로 만드는 클래스이다.
public class FootballPlayerDto {
	//필드 기본생성자 매개변수생성자 게터 세터
	
	private String name;
	private String position;
	private int backNumber;
	public FootballPlayerDto() {}
	public FootballPlayerDto(String name, String position, int backNumber) {
		this.name = name;
		this.position = position;
		this.backNumber = backNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getBackNumber() {
		return backNumber;
	}
	public void setBackNumber(int backNumber) {
		this.backNumber = backNumber;
	}
	

	
	
	

}
