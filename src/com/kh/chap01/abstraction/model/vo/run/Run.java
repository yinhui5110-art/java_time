package com.kh.chap01.abstraction.model.vo.run;

import com.kh.chap01.abstraction.model.vo.Puppy;

public class Run {

	
	public static void main(String[] args) {
		
		// 현실세계의 강아지 => 자바세상의 객체로 구현
		// 종 : 푸들, 이름 : 나폴레옹, 나이: 5, 몸무게 : 8, 성별 : 암
		// 강아지 객체 생성해보기

		Puppy puppy = new Puppy(); // <= 객체생성 / 자바에서 기술적으로 heap에 생성되는 것을 객체라고 한다.
		 // puppy type에 heap영역에 있는 주소값이...
		//new 라는 예약어 사용
		// memory heap영역에 데이터를 생성
		// RAM의 데이터를 연산은 CPU가 한다
		
		System.out.println(puppy); // @ :구분할때 쓰는 문자이다
		// heap영역에 있는 주소값이 출력이 된다.
		System.out.println(puppy.name);
		// heap영역에 주소에 있는 puppy를 찾아야한다.
		//'.'직접접근 하는 것을 참조연산자 라고 한다./
		// 참조자료형의 기본 값은 null(아무것도 없음을 나타낸다/주소값을 대체 할 수 있는)
		// **String = 참조자료형 이다.
		
		//**배열과 다른점은 배열은 다른 자료형만 가져올 수 있지만
		 puppy.name = "나폴레옹";
		System.out.println(puppy.name);
		// 종 : 방하르, 이름 : 징기스칸, 나이 : 5, 몸무게 : 15, 성별 : 수
		Puppy khan = new Puppy(); //변수선언-> 자료형->
		khan.name = "징기스칸"; //주소를 담고있는 변수->참조해서->이름을 공간에 대입
		System.out.println(khan.name);// 주소값을 가져오고 참조하여 heap영역에 있는 이름을 대입한다.
		
		//class는 자바에서 나만의 자료형이다
		// 정수값 => 정수자료형 it, SThaor byte Log
		 // 실수값 => 실수자려형 float, double
		 // 논리값 =>
		
		// 현실 세계의 강아지의 값 => 개발자가 직접 강아지 자료형 => 이것이 곧, 클래스
		// 클래스란? 객체들의 정보(속성,행위)들을 남아내는 그릇 또는 설계도 또는 명세
		//			붕어빵 틀과 같다.
		//소프트웨어 == 실체가 없음
		 
		
		//Puppy khan = new Puppy(); // 변수선언
		//System.out.println(khan); // heap영역에서 주소값 출력해보기
		//System.out.println(khan.name); // 주소값을 가져오고 heap영역에 있는 'name'을 참조(직접접근,즉 내가 찾고 있는 것을 heap영역에서 가리킨다)
		
		//khan.name = "징기스칸"; // 이름을 공간에 대입
		//System.out.println(khan.name); // 주소값을 가져오고 참조하여 heap영역에 있는 이름을 대입한다.
		
		puppy.bark();
		khan.bark();
		// bark();메서드를 호출하고 싶으면 바크가 메모리에 올라가 있어야 한다. 
		//바크라는 주소가 있어야한다 변수에 담는다.
		
		
		// 주소값에있는 객체안에 있는 weight 필드안에 있는 값을 구해보기
		puppy.weight = 8;
		System.out.println(puppy);
		System.out.println(puppy.weight);
		
		khan.weight = 45;
		System.out.println(khan);
		System.out.println(khan.weight);
		khan.sit();
		khan.sit();
		khan.sit();
		System.out.println(khan.weight );
		
	}
	
		
		
		
	
	
	
}
