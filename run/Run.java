package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.AutoSellingMachine;

public class Run {

	
	// **캡슐화(encapsulation) -객체지향에서 말하는 캡슐화
	// 속성(데이터)과 해당 데이터를 조작하는 행동(메소드)를 하나의 단위로 묶는 것
	// 정보은닉(information hiding) :값을 숨기기 위해서
	// 우리나라에서 보편적으로 4대특성 캡슐화 상속 특성
	
	
	public static void main(String[] args) {
		// 객체 생성 == 메모리(heap)에 적재
		
		AutoSellingMachine asm = new AutoSellingMachine();
		// asm.hi();
		// /*객체의 주소값을 참조해서*/new AutoSellingMachine().hi();/*hi 라는 메소드 호출*/
		
		// 변수 공간에 대입될 수 있는 값은 딱 9가지(null값 제외)
		// boolean리터널값, char리터널값, byte리터널 값, short리터널 값, int리터널 값, long리터널 값
		// float리터널 값, double리터널 값 
		// 기본자료형 값 8개랑 + 주소 값으로 되어 있다.
		// 주소값이 나오면 == 아 이거 객체구나~! 라고 생각하면 된다.
		/*
		asm.name = "삼양라면";
		System.out.println(asm.name);
		asm.price = 1100;
		System.out.println(asm.price);
		asm.amount = 8;
		System.out.println(asm.amount);
		*/
		/*
		asm.재고확인하기();
		asm.재고채우기();
		asm.제품판매하기();
        asm.재고확인하기();	
		*/
		//asm.openMachine();
		
		// 필드가 외부에서는 보이지 않아서 오류가 발생!
		// 접근제한자를 public에서 private으로 변경했기 때문!
		// 직접접근이 불가능 => 간접적으로 접근할 수 있는 방법을 만들어주어야함
		
		
		//라면 가격 1500으로 세팅하고싶다.
		//asm.setPrice(1500);
					// argument, 인자값, 인수
		//System.out.println(asm);
		
		asm.setName("삼양라면");
		
		asm.setAmount(8);
		
		asm.getName(); //asm의 name을 달라고 하는것이다. heap영역안에 있는 필드에서 name을 반환해주는 것.
		
		
		// 함수 == BuiltInFunction (내장함수)( 자바에서는 내장함수를 개념하지 않는다.)
		// 자바에서 함수를 호출하기 위해서는 객체가 있어야한다.
		// 자바의 클래스 == 자료형
		// 특정 자료형(객체)만 수행할 수 있는 기능은 ★메소드★ 라고한다
		// 특정 자료형은 개발자가 만든다.
		
		//메모리 개념
		/*
		 * 소스 코드(클래스에 소스코드를 쓴다.)를 작성하고 저장을 하면 디스크(HDD,SSD)에 저장(==기록)을 한다.
		 * 컴파일러(==)
		 * JVM은 바이트코드에 
		 * 
		 */
		
		asm.getName();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
	

}
