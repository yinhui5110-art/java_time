package com.kh.chap03.escape;

import java.util.Scanner;

public class EscapeBreak {
	/*
	 *   **주의 사항 : switch문 내부에 작성하는 break;문과는 구분을 해야한다!
	 *   			switch문 내부에 있는 break는 switch문을 빠져나가나는 용도로 사용
	 *   
	 *   break : break문을 만나는 순간 "가장 가까운 반복문"을 빠져나간다.
	 * 				속해 있는 반복문 "한 겹" 을 빠져나간다.
	 * 
	 */
	
	public void method1() {
		//무한 반복을 돌리면서
		// 매 번 사용자에게 문자열을 입력받은 후
		//해당 문자열의 길이를 출력
		// 단, 사용자가 입력한 문자열 "exit"과 같다면 반복을 종료한다.
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 조건식에는 true / false 만 들어갈 수 있다.
			System.out.println("글자수 체크(종료하고싶으시면 'exit'을 입력하세요 > ");
			String keyword = sc.nextLine();
			System.out.println(keyword + "은(는)" + keyword.length() + "글자 입니다!");
			
				//순서는 상관 없다 :keyword.("exit")equals
			if(keyword.equals("exit")){
				break; //반복하고 있는 곳을 빠져나온다.
				// return; //메서드에서 빠져나가기 위해서 리턴을 호출한 곳으로 빠져나간다.
			}
			
		}
		
		System.out.println("다음에 또 오세요 ~~");
	}
	
	/*
	 *  continue: 반복문안에서 사용하는 문법
	 * 
	 * 반복문안에서 continue를 만나며 이후에 모든 코드를 pass
	 * 반복문 최상단 scope로 이동
	 */
	
	public void checkId() {
		
		System.out.println("회원가입 서비스 입니다.");
		Scanner sc = new Scanner(System.in);
		//사용자에게 아이디 값을 입력 받을 것인데 10글자가 넘으면 다시 입력하게 할 것
		//									10글자가 넘지 않으면 다음 파트로 진행 할 것
		
		
		while(true) {
			System.out.println("아이디를 입력해주세요 (10글자 이하) > ");
			String userId = sc.nextLine();
			
			if(userId.length() <= 10) {
				System.out.println("사용 가능한 아이디 입니다.");
				break;
			} else {
				System.out.println("아이디는 10자 이하만 사용 가능합니다. ");
				continue;
			}
			
			
		}
		
		System.out.println("비밀번호를 ㅇㅇㅇㅇ~ ");
		
		
	}
	
	
	
	
	
	
	
}
