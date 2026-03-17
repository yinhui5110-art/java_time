package com.kh.chap01.confition;

import java.util.Scanner;

public class ConditionElse {

	/*
	 *  if ~ else // 둘은 세트다 if가 있어야 else을 사용할 수 있다.
	 *  
	 *  [표현법]
	 * if(조건식){
	 * 		조건식의 결과가 true일 경우 실행할 코드 - a
	 * } else {
	 * 		조건식의 결과가 false일 경우 실행할 코드 -b
	 * }
	 * 
	 * 
	 *  -> 조건식의 결과가 true일 경우 a를 실행
	 *  -> 조건식의 결과가 false일 경우 b를 실행
	 */
	public void method1() {
			
		// 핸드폰 번호 뒷자리 입력받아서
		// 당첨자 번호랑 같으면 축하축하 아니면 다음기회에
		// 당첨 핸드폰 번호 뒷자리 => 7777
		
		// 사용자에서 핸드폰 번호 뒷자리를 입력받아서
		// 당첨 핸드폰번호와 일치한다면 축하축하를 출력해주고
		//				 일치하지 않는다면 다음기회에를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("핸드폰 번호 뒷부분 네자리를 입력해주세요 > ");
		String phoneNumber =  sc.nextLine();
		//System.out.println(phoneNumber);
		
		// 어떤 값을 가지고 사용자가 입력한 폰번호 == phoneNumber / 7777
		// 어떤 연산?                   //동등자료로 비교할 수 없다..
		// 문자열 값을 비교하고 싶을때 : ==(동등비교연산자)의 경우 기본타입 자료형 8개까지만 사용가능하기 때믄에
		//							equals()라는 메소드를 호출해서 비교해주어야 함
		//                          문자열 값이 일치할 경우 true를 변환 일치하지 않을경우 false를 반환
		if(phoneNumber.equals("7777")) {
			
			//사용자가 입력한 핸드폰번호와 7777이 일치한다면
			System.out.println("축하합니다~ 백만원 상품권 당첨입니다~~");
		} else {
			System.out.println("아쉽지만 다음기회에~ ");
		}
		/*
		 * if(!(phooneNumber.equals("7777"))) {
		     System.out.println("아쉽지만 다음기회에~");
		 * 
		 */
		// if문의 조건식 결과가 true일 경우 => if Scope가 끝나면 else Scope를 건너 뜀
		// if문의 조건식 결과가 false알 경우 => if Scope를 건너뛰고 else Scope로 진입
		// 불필요한 연산이 줄어든다! =? 처리속도가 향상됨!
		
	}
	
	/*
	 *  if ~ else if문
	 * [표현문]
	 * 
	 * if(조건식1) {
	 * 		조건식1이 true일 경우 실행할 코드;
	 * } else if(조건식2){
	 * 			조건식2가 ture일 경우 실행할 코드;
	 * } else if(조건식3){
	 * 				조건식3이 true일 경우 실행할 코드;
	 * } else{
	 * 		앞에서 기술했던 모든 조건들이 false일 경우 실행할 코드;
	 * }
	 */
	 public void method2() {
		 //핸드폰 뒷자리를 입력받아서 1등, 2등, 3등, 아쉽지만 미당첨 출력해주기
		 //						7777, 1111,  5555
		 Scanner sc = new Scanner(System.in);
		 System.out.println("핸드폰 번호 뒷자리를 입력해주세요 > ");
		 String phoneNumber = sc.nextLine();
		 System.out.println("사용자가 입력한 폰번호 : " + phoneNumber);
		 
		 //내가 해야할 일을 한글로 적어보기
		 
		 
	 }
	
	
	
	
}
