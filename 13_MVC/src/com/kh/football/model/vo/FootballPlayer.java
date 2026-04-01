package com.kh.football.model.vo;



// UPDATE를 구현해야하는데 record로 구현하면
// 필드에 final키워드가 붙어 수정이 불가능해지기 때문에
public class FootballPlayer {
	private int id; //식별값을 저장할 필드 => 자료형 => 실제 들어갈 값 =>1 , 2 ,3 ++
	private String name; // 이름 저장할 필드 => 자료형을 무엇을 쓸지? 실제 들어갈 값 =? 크리스티아노 도스 산토스 아베이루
	private String position;// 포지션 저장할 필드 => 자료형 => 실제 들어갈 값 => 공격수, 미드필더, 수비수, 골키퍼
	private Integer backNumber;// 등번호 저장할 필드 => 자료형 => 실제 들어갈 값 => 1234 
	
	public FootballPlayer(int id, String name, String position, Integer backNumber) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.backNumber = backNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Integer getBackNumber() {
		return backNumber;
	}

	public void setBackNumber(Integer backNumber) {
		this.backNumber = backNumber;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
	
	}

	
	
	
	
	
	
	
	
	

}
