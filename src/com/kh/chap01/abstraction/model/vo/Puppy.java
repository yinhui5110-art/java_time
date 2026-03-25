package com.kh.chap01.abstraction.model.vo;
/*
 * public class 클래스식별차{
 * //**클래스 안에 있는메소드는 함수라고 부른다
 *
 * [ 필드부 ]
 * 
 * 
 * [ 생성자부 ]
 * 
 * 
 * [ 메소드부 ]
 * 
 * 
 * 
 * }
 */


public class Puppy {
	
	// [필드부] ->객체가 되는 속성 : 변수 선언
	// 클래스 블럭에서  선언 한 것을 필드부 라고 한다
	// 접근제한자 (없음) 자료형 필드식별자;
	
	
	// 접근제한자 : 이 필드에 접근할 수 있는 접근권한을 제어하는 역할
	//				public > protected > default > private
	// 클래스 내부에 필드를 선언할 때는 반드시 접근제한자를 붙일 것!!
	// 강아지 값을 담을 변수 정하기
	
	// 이름, 종, 성별, 몸무게, 나이
	public String name; //강아지의 이름을 저장할 필드
	public String species; // 강아지으 종을 저장할 필드
	public String gender; // 강아지의 성병을 저장할 필드
	public int weight; // 강아지의 몸무게를 저장할 필드
	public int age; // 강아지의 나이를 저장할 필드
	
	
	
	// [생성자부]
	
	
	
	
	// [ 메서드 ] => Puppy가 수행할 수 있는 행위(기능)
	//짖기, 앉기
	public void bark() { //bark메소드 입장에서 나의 이름은 어디에 있는가?->같은 클래스내부 name필드에 있음
		//System.out.println("멍멍하고 짖습니다");
		System.out.println(name + "이(가) 멍멍하고 짖습니다.");
		
		
	}
	
	public void sit() {
		System.out.println(name + "이(가) 앉습니다." + weight--);
		
		
		
		
		//weight -=1; 몸무게 변화 1감소
		//weight = weight - 1; 몸무게 변화 1감소
		//weight --; 몸무게 변화 1감소
	}
	
	
	

}
