package com.kh.chap01.confition;

import java.util.Scanner;

public class Conditionif {
	/*
	 * (단일) if문 
	 * 
	 * [표현법]
	 * 
	 * if(조건식) { //괄호안에는 true 아니면 false 값이 나와야한다.
	 * 		조건식이 true일 경우 실행하고자 하는 코드;
	 * }
	 * => 조건식의 결과값이 true일 경우 : if문 Scope({})안의 코드가 수행
	 * => 조건식의 결과값이 false일 경우 : if문 Scope({})를 건너뛴다!
	 * 
	 */
	public void method1() {
		//System.out.println("메소드가 잘 수행되는가");
		
		if(0 < 1) { //만약에 0이 1보다 작다면/괄호안에있는 조건검사어!를 수행한다
			System.out.println("0이 1보다 작습니다.");
		}
		//if문의 조건식 자리에는 결론적으로 true아니면 false값이 들어가도록 만들어야함!
		if(true) {
			System.out.println("이 코드는 if문을 만나면 무조건 수행되는 코드");
			
		}
		if(false) {
			System.out.println("이 코드는 if문을 만나면 절대 동작하지 않 코드");
		} //false가 나오면 블럭다음부터 나온다.
	}
		public void quiz() {
			
			int count = 0; //증가연산 사용
			int wrongCount = 0;
			// 문제를 출력해준 뒤
			System.out.println("문제 : 고양이는 호랑이과 일까요? ");
			//사용자 에서 o 또는 x를 입력받아서
			Scanner sc = new Scanner(System.in);
			System.out.println("정답을 o또는 x로 입력해주세요 > ");
			char answer = sc.nextLine().charAt(0); //o아니면 x가 나와야한다.
		
			// 정답입니다~ / 오답입니다~ 를 출력해주는 퀴즈 프로그램
			// 1. 무슨 값을 가지고 == 사용자가 입력한 값 ==answer
			//					'x'
			// 2. 무슨 연산을 할지 => ==
			// 사용자가 입력한 값이 x와 같다면
			// 1절 소문자로 체크하기 => 대문자로 입력해도 정답 오답 처리 해주세요
			// 2절 사용자가 입력한 값 == answer /'X' , 'O'
			//		무슨 연산을 사용하는지? => ==
			// 코드의 중복이 발생하면 => 유지보수를 어렵게함 => 이럴 경우 중복을 제거해주면 좋다.
			// 사용자가 입력한 값이 소문자 x 이거나 대문자 X라면
			// => o랑 x랑 이거 두 개만 입력해야하는데 넷 다 아니면 메시지를 띄워주는~~~
			if(answer == 'x' || answer == 'X') { 
				System.out.println("정답입니다~!!!!!!!!");
				count++;
			}
			//if(answer == 'x') {
			// System.out.println("정답입니다~~!!!");
			//   }
			
			if(answer == 'o') {
				System.out.println("오답입니다ㅠㅠㅠㅠㅠㅠㅠㅠㅠ");
				wrongCount++;
			}
			
			// 경우의 수 사용자가 입력한 값이 x, X, o, O일 경우 --> 빠짐
			//즉, "x, X, o, O 중 아무것도 아닐 때"
			//O또는 X를 입력해주세요.
			// 1. 무슨값을 가지고? (answer) 
			// 2. 무슨 연산을 가지고?
			if((answer != 'x')&&(answer != 'X')&&(answer !='o')&&(answer !='O')){
				System.out.println("O 또는 X를 입력해주세요.");
			}
			
			System.out.println("문제 : 여우는 개과일까요?");
			System.out.println("정답을 o / x로 입력해주세요 > ");
			answer =sc.nextLine().charAt(0);
			
			if(answer == 'o' || answer == 'O') {
				System.out.println("정답입니다 ★");
				count++;
			}
			
			if(!(answer =='o' || answer == 'O' || answer == 'x' || answer == 'X')) {
				System.out.println("O 또는 X를 입력해주세요.");
			}
			
			if(answer == 'x'|| answer == 'X') {
				System.out.println("오답입니다ㅠㅠㅠ");
				wrongCount++;
			}
			
			// 정답은 몇 개 -> 오답은 몇 개
			// 문제를 몇개를 풀었는지 ★저장먼저 -> 출력
			System.out.printf("퀴즈 끝 ~ 정답 %d개, 오답 %d개 입니다!", count,wrongCount);
			
		}
	
	
	
	
	
	
	
	
	
}
