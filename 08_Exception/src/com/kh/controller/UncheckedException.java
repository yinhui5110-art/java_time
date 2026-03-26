package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException { 
	/*
	 * 프로그램 실행 시 발생하는 예외들 RuntimeException(조상클래스)
	 * 
	 * NullPointerException : 주소값이 있을거라 예상하고 객체를 참조했더니 null값이 들어있을 경우 발생하는 예외
	 * ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근했을 때 발생하는 예외
	 * ArithmeticException : 나누기 연산을 0으로 나누면 발생하는 예외 InputTypeMissMatchException :
	 * 입력버퍼의 값이 자료형과 일치하지 않을 때 발생하는 예외
	 * 
	 * 공통점 : 개발자가 예측이 가능한 예외들이다
	 * 
	 * ClassCastException : 허용할 수 없는 형변환을 진행할 경우 발생하는 예외
	 * 
	 */

	// ArithmeticException
	public void divZero() {

		// 사용자에게 두 개의 정수값을 입력받아서 나눗셈을 한 뒤 결과를 출력
		Scanner sc = new Scanner(System.in);

		System.out.println("나누기 프로그램 입니다~!");
		System.out.println("첫 번째 정수를 입력해주세요 >");
		int num1 = sc.nextInt();
		System.out.println("두 번쨰 정수를 입력해주세요(제발 숫자 0은 입력하지말아주세요) > ");
		int num2 = sc.nextInt();

		// 예외가 발생기 문제를 해결하는 방법!!
		/*
		 * if(num2 != 0) { System.out.println("연산 결과 : " + (num1 / num2)); }else {
		 * System.out.println("0은 나누기 연산을 수행 할 수 없습니다.");
		 * 
		 * }
		 */

		// 예외처리 : 예외상황을 감지하고 예외상황 발생 시
		// 프로그램이 비정상적인 종료가 되는것을 방지하고 적절한 대응 조취를 취하는 모든 절차
		/*
		 * 예외처리 구문
		 * 
		 * try ~ catch문 try { (num1 / num2)예외가 발생할 수도 있는 구문
		 * 
		 * } catch(발생할예외클래스명 변수명){ 해당 예외가 발생했을 때 실행할 구문
		 * 
		 * }
		 * 
		 * 예외가 일어났을때 catch를 사용한다
		 * 
		 */

		// 예외가 try 부분에 발생하면 트라이 밑에있는 코드는 무시하고 catch부분으로 내려가서 입력 받는다
		try {
			System.out.println("연산 결과 : " + (num1 / num2));

			System.out.println("참 잘했어요!!");
		} catch (ArithmeticException e) {
			System.out.println("두 번째 정수에 0을 입력하시면 나눌 수 없습니다.");

		}
		sc.close();
		System.out.println("메소드 호출 끝 ~ !!");

	}

	public void code() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 추가하기");
			System.out.println("2. 삭제하기");
			System.out.println("3. 종료하기");
			System.out.println(" 1번 또는 2번을 입력해주세요 > ");

			int menu = 0;
			try {
				menu = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요");
				//
			}

			sc.nextLine();
			System.out.println(menu + "번 메뉴를 선택하셨습니다.");
			// 문제가 발생한 이유 -> int 트라이 블럭 안에서만 사용가능한데 scope 밖에 있어서 생긴 문제

		}
	}
	/*
	 * 오버로딩 | 오버라이딩
	 * 
	 * 하나의 클래스 내부에서 | 상속구조의 자식클래스에서(2개가 있어야한다/부모클래스 + 자식클래스)
	 * 
	 */
	
	
	public int multiCatch() {
		Scanner sc =new Scanner(System.in);
		// 사용자에게 정수값을 하나 입력받아서
		// 100을 사용자가 입력한 정수값으로 나눈 결과를 출력
		
		System.out.println("정수를 입력해주세요 > ");
		/*
		try {
		int num = sc.nextInt(); // 자료형이 int형이 아닌 값이 들어올 시
								// InputMismatchException이 발생할 것이다.
		}catch() {
			                   
		}
		
		System.out.println("결과 :" + (100 /num)); //num에 대입된 값이 0일 시
			*/									 //ArithmeticException이 발생
		
		
		try {
		int num = sc.nextInt();
		//System.out.println("결과 :" + (100 /num));
		  // sc.close();
		   return (100 /num); 
		}catch(InputMismatchException e) {
			System.out.println("숫자값을 입력해주세요.");
			//sc.close();
			return 0;
		}catch(ArithmeticException e) {
			System.out.println("0이 아닌 정수값을 입력해주세요.");
			return 0;
		} finally { 
			sc.close(); //리턴하기 직전에 무조건 finally 블럭을 수행한다.
			
		}
		
	
		
	}
	
	
	public void orderByCatch() {
		
		// 배열
		// 사용자에게 정수값을 입력받아서
		// 입력받은 만큼의 크기를 가진 배열을 생성 및 할당하고
		// 이 배열의 100번째 인덱스에 대입되어있는 기본값을 출력해보기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 > ");
		
		 //InputMismatchException : 스케너 메소드의 자료형과 일치하지 않는다면
		// NegativeArraySizeException : 배열의 크기를 음수로 할당하려고 하면
		// ArrayIndexOutOfBoundsException : 배열의 크기보다 큰 인덱스에 접근하면
		
		try {
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println(arr[100]);
		}catch(ArrayIndexOutOfBoundsException e) { //exception handle
			System.out.println("101이상이면 정수값을 입력~");
		}catch(RuntimeException e) { //런타임의 후손들이기 때문에 런타임의 자료형을 사용할 수 있다.
			e.printStackTrace();//개발단계에서만 사용가능하다
			System.out.println("정수값을 입력해주세요");
		}finally {
			sc.close();
		
		
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
