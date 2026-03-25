package com.kh.chap04.controller;
/*
 * 필드 : 객체의 속성을 저장하는 변수
 * 필드 == 멤버변수 == 인스턴스변수  == 속성
 * 
 * 클래스를 구성하는 요소 중 하나
 * 데이터를 저장하기 위한 역할(변수)
 * 클래스 블록 안에 존재
 * 어느 영역에 올라가는지 구별해서 부른다.(stack->변수라고 부른다 / heap->필드 라고 부른다)
 * 
 * 필드(멤버변수, 인스턴스 변수)
 * 생성시점 => new 키워드를 사용해서 해당 객체를 생성하는 순간 heap에 할당
 * 소멸시점 => 객체가 소멸 될 때 => GC이 동작을 안하면 OOM(Out Of Memory :메모리 터졌다) 발생
 * 
 * static필드(클래스 변수)
 * static 이라는 예약어가 붙어있는 필드
 * 			=> ClassLoader(객체다)
 * 생성시점=> static필드 호출 시점 Metaspace(static)에 올라감
 * 소멸시점=> 프로그램이 종료되면 소멸 =>ClassLoader를 GC가 소멸시키는 시점
 * 
 * 지역 변수
 * 생성시점=> 특정 영역({ }) 내부에서 선언되는 시점에 메모리 영역에 할당 -> stack
 * 소멸시점=> 특정 영역({ })가 종료될 때 => stack메모리에서 소멸하는 시점에
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class FieldController {
	
	public static String str = "static"; 
	// atatic 키워드는 공유의 목적이 강하자.
	// 프로그램 구동중 계석 값을 사용하기 위해 씀
	public static final String JAVA_VERSION = "21";// final은 상수 키워드다.
	
	// public final static :이 세가지는 세트다.
	// static : 프로그램 전체에서 공유
	// final : 절대 못바꿈
	// 무조건 선언과 동시에 초기화를 진행 해야함!
	
	
	public int global; //이것이 필드다
	public void checkVariable(int parameter) {
								//매개 변수(지역변수) : 외부에서 값을 받아서 사용하는 변수
		int local = 1; //지역변수 :초기화를 해야 사용가능함 
		
	   System.out.println(global); // 필드
	   System.out.println(local); // 지역변수
	   System.out.println(parameter);// 매개변수(지역변수)
	   
	}
	
	
}
