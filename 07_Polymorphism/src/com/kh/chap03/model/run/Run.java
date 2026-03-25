package com.kh.chap03.model.run;

import com.kh.chap03.controller.Cooking;
import com.kh.chap03.controller.CookingController;
import com.kh.chap03.controller.Pasta;
import com.kh.chap03.model.vo.Chef;
import com.kh.chap03.model.vo.MainChef;
import com.kh.chap03.model.vo.SaladChef;

public class Run {

	public static void main(String[] args) {
		
		
		MainChef mc = new MainChef("ddd");
		mc.cooking();
		
		SaladChef sc = new SaladChef("고길동");
		sc.cooking();
		
		//Chef c = new Chef();
		//추상클래스로 선언되었기 때문에 객체 생성이 불가능하다!!
		Chef[] c = {mc, sc};
		for(int i = 0; i < c .length; i++) {
			c[i].cooking();
			
		}
		CookingController pc = new CookingController();
		pc.pastaCooking();// CookingController 클래스에 의존
		
		Cooking cook = new Pasta();
		cook.cooking(); // Cooking 클래스에 의존
		
		
		// 다형성 :  부모타입 자료형으로 여러 자식객체를 다룰 수 있다.
		// 다형성은-> 정보은닉하려고 사용한다.
		// 의존성 주입할 때 처음부터 다시 설명해주신다고함..
		/*
		 * 소프트웨어 개발자들의 목표
		 * 1. 코드 수정이 쉬움, 2. 기능 추가가 쉬움, 3. 기능 교체도 쉬움
		 * 
		 * 
		 * 객체지향언어는 객체와 객체 끼리 값을 주고 받아야 하는데 추상화 기법을 통해서
		 * 밖에서 보여지지 않는 것을 숨기기
		 * 내 자료형까지 숨기기 위해서
		 * **상속 다형성은 객체로 부터 나의 자료형을 숨기기 위해서다**
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
