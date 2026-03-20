package com.kh.chap02.loop;

import java.util.Scanner;

import com.kh.chap01.confition.Conditionif;

public class Loopfor {

	public void method0() {
		
		/*System.out.println("힘내자!!!!");
		System.out.println("힘내자!!!!");
		System.out.println("힘내자!!!!");
		System.out.println("힘내자!!!!");
		System.out.println("힘내자!!!!");
		*/
		// 여러번 반복해야 하는 반복문을 원하는 횟수 만큼 가능!
		for(
			int i = 0; //변수 선언 및 초기화
			i < 5 ;
			i++
			) {
			System.out.print(i + 1);
			System.out.println("반복시키고싶은 코드를 작성해 주세요~");
			
		}
		
		/*
		 *  for 문
		 *  
		 *  for() {
		 *  
		 *  }
		 * 괄호안은 반복의 횟수를 지정하는 역할
		 * 초기식; 조건식; 증감식  세가지의 요소로 구성됨
		 * ;; 세미콜론으로 구분함
		 * 
		 * [표현법]
		 * 
		 *  for(초기식; 조건식; 증감식;){
		 *  	반복적으로 실행하고자 하는 코드;
		 *  }
		 *  
		 *  -초기식 : 반복문을 시작할 때 "초기에 단 한번만 실행" 될 구문
		 *  		반복을 할 때 필요한 변수를 선언하고 초기화 하는 구문(제어변수) => int i = 0;
		 *  
		 *  -조건식 : "반복문이 실행될 조건"을 작성하는 구문
		 * 			조건식의 결과가 true일 경우 반복을 수행
		 * 			조건식의 결과가 false일 경우 반복문을 멈추고 for문 블럭을 빠져나옴 => i < 5;
		 * 
		 *  -증감식 :  "반복문을 제어하는 변수에 대입된 값" 를 증감하는 구문
		 *  			꼭 그래야하는것은 아니지만 보통 초기식에서 선언된 변수를 가지고 증감식 작성
		 *  			이 때, 보편적으로 증감연산자를 사용       => i++
		 *  for문에서 식이 끝나는 Scope에서 증감식으로 돌아가고 i++ i공간에 증가하고
		 *  조건식으로 돌아가면 i <=3 같니? 물어보고
		 */
		
		
		
		
	}
	public void method1() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println("1\n2\n3");
		for(/*1*/int i = 1;/*2*/ i <= 10; /*4*/ i++) { //1번int i =1; /2번 i <= 10;
			/*3*/ System.out.println(i + "번 반복");// 여기가 3번/조건식 true가 나오면 여기서 끝난다.
		}
		//제어변수는 보통 i, j ,k
							//i = i + 2
		for(int i = 0; i <10; i+=2) {
			//if(i % 2 ==0) {
				System.out.println(i); 
			//}
			
			//홀수만 아니면 짝수만 출력하기 위해서
		}
		
		for(int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		
	}
		
	
	//260318_수요일
	
	public void gugudan() {
		// 구구단 프로그램
		// 사용자에게 정수를 입력받아서
		// 사용자가 입력한 정수의 단을 출력하기
		
		// 구구단을 외우자 -> 문구 띄어주기
		// 몇 단을 출력하시겠습니까? >4
		// 4단으 출력하겠습니다.
		
		Scanner sc =new Scanner(System.in);
		System.out.println("구구단을 외우자");
		System.out.println("몇 단을 출력하시겠습니까? >");
		int dan = sc.nextInt();
		System.out.println(dan + "단을 출력하겠습니다. ");
	
		// 기획설계 해보기: 4을 입력했다고 가정-> 4를 입력 즉,조건이다
		
		//if(dan == 4) { //if 를 쓸경우
		//System.out.println(" 4 x 1 = 4");
		//System.out.println(" 4 x 2 = 8");
		//System.out.println(" 4 x 3 = 12");
	/*
		System.out.println(dan + " x 1 = " + (dan * 1));
		System.out.println(dan + " x 2 = " + (dan*2));
		System.out.println(dan + " x 3 = " + (dan*3));
		System.out.println(dan + " x 4 = " + (dan *4));
		System.out.println(dan + " x 5 =" + (dan*5));
		System.out.println(dan + " x 6 = " +(dan *6));
		System.out.println(dan + " x 7 =" +(dan*7));
		System.out.println(dan +" x 8 =" +(dan *8));
		System.out.println(dan + " x 9 = " + (dan*9));
		*/
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + "X" + i + "=" +(dan*i));
		}
		
	}
	
	//
	public void mainMenu() {
		
		for(;;) { //;; :무한반복
			//System.out.println("메인메뉴입니다");
			System.out.println("1. 구구단 놀이 시작하기");
			System.out.println("2. O/X퀴즈 시작하기");
			System.out.println("3. 프로그램 종료하기");
			Scanner sc = new Scanner(System.in);
			System.out.println("메뉴를 선택해주세요 >");
			int menuNo = sc.nextInt();
			sc.nextLine();
			//System.out.println(menuNo);
			
			if(menuNo == 1) { //사용작 입력한 값이
				gugudan();
			}else if(menuNo == 2){
				Conditionif ci = new Conditionif();
				ci.quiz();
				
			}else if(menuNo == 3){
				System.out.println("프로그램을 종료합니다.");
				return;
			}else {
				System.out.println("없는 메뉴를 선택했습니다~");
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
