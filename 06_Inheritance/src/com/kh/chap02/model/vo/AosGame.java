package com.kh.chap02.model.vo;

 /*부모클래스(상속을 해주는쪽/**항상 먼저 호출된다**) 자식클래스(상속받는 쪽)
슈퍼클래스			   서브클래스
 상위클래스			   하위클래스
 조상클래스             후손클래스
 확장클래스              파생클래스
*/

public class AosGame extends Game { //예약어 extends ->확장하다 라는 뜻이다. 예약어 뒤에 상속 받을 클래스명을 적는다.
	private int characterCount;


	public AosGame() {
	super(); //Game(); 게임 클래스의 기본 생성자이다
		System.out.println("나는 자식 클래스다");
	
	}

		
	public AosGame(int characterCount) {
		super();
		this.characterCount = characterCount;
	}




	public int getCharacterCount() {
		return characterCount;
	}



	public void setCharacterCount(int characterCount) {
		this.characterCount = characterCount;
	}


	
	
}
	

	
	
	



	

