package com.kh.chap03.model.vo;
/*
 * 클래스 내부에 추상메소드들 한 개라도 선언하는 순간
 * 클래스 또한 abstract 키워드를 붙여서 추상 클래스로 정희해야한다.
 * 
 * 추상클래스 == 필드 + 메소드 + 추상메소드(생략가능)
 * -> 추상메소드가 존재하지 않아도 추상클래스로 정의할 수 있다.
 * 
 * 
 * 
 * 
 * => 구현 도중에 코드를 덜 했는데 누군가가 사용하게 되면 문제가 생길 수 있기 때문에
 * 	  추상클래스로 선언한다
 * 
 * => 개발자가 생각했을때 이클래스로는 부모클래스역할만 할 것이고 객체 생성은 불가능해야한다!! 라고 생각이 들면 
 * 	  추상클래스로 선언한다.
 */
public abstract class Chef { //클래스 앞에 abstract 붙여줘야 한다.
	private String name;

	public Chef(String name) {
		this.name = name;
	}

	// 이 메소드는 단순히 자식클래스들이 오버라이딩하기 위해서 사용하는 용도이다.
	//추상화 => 추상메소드
	//		"abstract" <==> "implement
	//
	public abstract void cooking();//추상클래스에서만 사용가능
	
	/*
	public void cooking() {
		System.out.println("요리해야지~~");
	}
	*/
	public void breakTime() {
		System.out.println("쉬는 시간~");
	}

}
