package scanner;

import java.util.Scanner;

public class Logical {

	


		public void andOper() {
			//사용장에게 정수값을 하나 입력받아서
			//입력받은 정수값을 변수에 대입한 뒤
			//콘솔창에 출력해보기
			
			//Scanner sc = new Scanner(System.in);
			//int num = sc.nextInt();
			//System.out.println(num);
			
			//대소비교  -> num > 0
			//동등비교  -> num % 2 == 0
			
			//AND연산자
			//&&의 의미 : 그리고, ~~이면서, ~~이고
			//boolean result = (num >0 ) && (num % 2 == 0);
			//System.out.println("입력값이 0보다 크면서 짝수인가요? > " + result);
			
			// 1. 무슨값으로 연산을 해야하지?
			// 1.1 사용자가 입력한값 => num
			// 1_2. 1
			// 1_3. 10
			
			// 2. 무슨 연산?
			//대소비교 연산
			// 1 <= 사용자가입력한값 <= 10
			
			//System.out.println(1 <= num <= 10);
			
			//boolean result = (num >= 1) && (num <= 10);
			//System.out.println("입력값이 1부터 10사이의 값인가요? >" + result);
			 
			
			
		}
		
		public void orOper() {
			// 사용자에게 한 글자를 입력 받아서
			// 입력받은 글자가 'A' 또는 'a'인지 확인해서 출력하기
			
			Scanner sc = new Scanner(System.in);
			 System.out.println("꼭 한 글자만 입력해야한다 > ");
			 char letter = sc.nextLine().charAt(0); // index : 0부터 시작한다.
			 System.out.println(letter);
			 
			 //동등비교 연산 ==
			 //단일문자으 경우
			 //char형이 int형으로 자동형변환이 일어난뒤 연산
			 boolean result = (letter == 'a') || (letter == 'A');
			 System.out.println("사용자가 입력한 값이 에이인가요? >");
			 
			 
			 
					
		}
		/*
		 * 삼항 연산자 : 피 연산자가 3개
		 * => 3개의 값과 1개의 연산자로 구성됨(조건문의 형식으로 쓰임)
		 * [표현식]
		 * 조건식 ? 조건식이 true일 경우 결과값: 조건식이 false일 경우 결과값
		 * 
		 */
			
			
}