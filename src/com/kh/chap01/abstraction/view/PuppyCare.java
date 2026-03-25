package com.kh.chap01.abstraction.view;

import java.util.Scanner;

import com.kh.chap01.abstraction.model.vo.Puppy;

public class PuppyCare {

	//사용자에게 강아지의 정보를 입력받아서
	//입력받은 강아지의 정보를 출력해주고
	//강아지와 함께 놀아줄 수 있는 프로그램
	
	public void run() {
		System.out.println("🐕🐕🐕강아지 다마고치🐕🐕🐕");
		/*스캐너 타입의 변수 선언*/Scanner sc = new Scanner(System.in); //스캐너 객체 생성
		
		//sc.nextInt();
		/*String[]puppyString = new String[3];
		int[] puppyInt = new int[2];
		puppyString[0] = sc.nextLine();
		puppyString[1] = sc.nextLine();
		puppyString[2] = sc.nextLine();
		puppyInt[0] = sc.nextInt();
		puppyInt[1] = sc.nextInt();
		*/
		
		//변수선언 ->Puppy puppy = new Puppy(); //<-heap영역에 puppy객체를 생성
		Puppy puppy = new Puppy();
		System.out.println("아이구 강아지 너무 귀여워요 이름이 무엇? >");
		puppy.name = sc.nextLine();
		System.out.println("아이구~ 무슨 종? > ");
		puppy.species = sc.nextLine();//
		System.out.println("아이구~ 암컷? 수컷? > ");
		puppy.gender = sc.nextLine();
		System.out.println("몇살? >");
		puppy.age = sc.nextInt();
		System.out.println("몸무게는..? >");
		puppy.weight = sc.nextInt();
		sc.nextLine();
		
		while(true) {
			System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
			System.out.println(puppy.name + "의 정보!"); //name이라는변수안에 대입된 주소값을 더하기 의 정보! 문자열을 더해서 출력.
			System.out.println("나이 : " + puppy.age);
			System.out.println("성별 :" + puppy.gender);
			System.out.println("종 :" + puppy.species);
			System.out.println("몸무게 :" + puppy.weight);
			System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
			System.out.println();
			
			System.out.println("메뉴를 선택해주세요 ! ");
			if(puppy.weight >10) {
				System.out.println(" ※ 운동을 위해 앉기를 추천드립니다~!" );
			}
			System.out.println("1. 짖기 / 2. 앉기 / 3. 프로그램 종료 > ");
			/*인트변수 메뉴넘버 선언*/int menuNo = sc.nextInt();
			sc.nextLine();//입력버퍼에 있는것이 날아간다
			
			/* 정수값 1*/switch(menuNo) {
			/*동등비교 연산*/case 1 : puppy.bark();break;//바크라는 메서드 호출
			case 2 : puppy.sit(); break;
			case 3 :  return;
			default : System.out.println("메뉴를 다시 선택해주세요 !");
			
			}
			
			//** 코드 글로 써보기
			//** 코드 말로 해보기
			
			
			
		}
		
	}
	
}
