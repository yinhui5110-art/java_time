package com.kh.array;

import java.util.Arrays;

public class Array {

	// 변수(Variable)
	//메모리(RAM) 공간에 DATA(VALUE)값을 저장하는 공간
	
	// 변수 특징
	// 자료형이 정해져있다, 고유한 식별자를 가졌다, 자료형은 크기가 정해져있다, 새로운 값 대입해서 쓸 수있음
	// 선언되 Scope에서만 사용할 수 있다, ****하나의 변수공간에는 하나의 값만 대입될 수 있음****
	
	
	/*
	 * 배열(Array) : 하나의 배열에 **여러 개**의 값을 담을 수있음
	 * (자료구조이다)	단, "같은 자료형의 값들"만 담을 수 있음
	 * 				동종모음(homogeneous collection)이라고도 부름
	 * 
	 * 
	 *  => 배열이란 정수가 나열되어 있는 것을 말한다.
	 *  실제 메모리에서 변수공간을 이어붙인다
	 *  배열은 논리적인 구조와 물리구조가 동일하다.
	 *  
	 *  => 배열의 각 공간에 접근할 때 사용하는 개념 index
	 *  => index는 0부터 시작한다.
	 *  
	 */
	public void method1() {
		// 다섯 개의 정수를 변수에 대입한 뒤 정수값을 모두 더한 값을 출력
		/*
		int num1 = 15;
		int num2 = 19;
		int num3 = 22;
		int num4 = 33;
		int num5 = 10;
		int sum = num1 + num2 + num3 + num4 + num5;
		
		System.out.println(sum);
		*/
		
		// 배열 써보기!
		// 1. 배열을 선언해야 사용할 수 있다.
		/* 변수 선언할 때:  앞쪽에 자료형 뒷쪽에 변수명;
		 * 
		 * 배열 선언 방법
		 *  1) 자료형 배열명[];
		 *  2) 자료형[] 배열명; -> 두 번째 방법을 많이 사용한다.
		 */
		
		// 변수 선언!
		//int num = 0;
		
		// 배열 선언!
		//int[] nums = 0;
		
		// 2. 배열 할당해야만 배열을 쓸수있다.
		/*
		 * 배열에 몇 개의 값이 들어갈것인지 배열의 크기를 정해주는 과정
		 * 지정한 개수만큼의 값이 들어갈 공간이 할당됨
		 * 
		 * [표현범]
		 * 
		 * int[] nums; <-- 배열 선언
		 * nums = new int[5]; <-- 이코드를 할당이라고 한다.// 선언과 동시에 할당한다.
		 *              // '5'라는 할당이 필요해
		 * 
		 * int[] arr = new int[5]; <-- 선언과 동시에 할당
		 * 참조자료형 = int[]
		 * 
		 * 배열은 참조 자료형이다.
		 */
		
		//nums라는 정수형 배열을 선언하고 2탄 할당받음
		int[] nums = new int[2]; //new = heap영역이다(heap영역은 기본 값이 들어있다.
								//       공간에 필요한 만큼 메모리 공간을 만들어준다
		
		// 배열에 값 대입 => index개념 :heap 안에 있는 메모리는 각각의 주소가 달려있다.
		nums[0] = 10; //0인텍스에 대입 하기위해서 대입연산 '=' 사용했다.
		nums[1] = 15; //원하는 값을 넣는다
		//배열에 1번 인텍스에 대입되어 있는 값을 확인하기 위해서 주소값을 찾아 가야한다
		//배열이라는 곳에 배열에 첫번째 인텍스에 대입되어 있는 값을
		//nums라는 식별변수를 heap영역에 생긴 int형 변수 공간에() 생긴 순번을 '인덱스'라고 한다. 주소값을 
		//System.out.println(nums[0]);
		//System.out.println(nums[1]);
		
		//배열을 사용해서 반복문은 사용할 수 있다.
		int sum = 0;
		for(int i = 0; i < 2; i++) {
			sum += nums[i];
		}
		//System.out.println("배열 요소의 값 합계 :" + sum);
		
	}
	
	
	   public void method2() {
		// 배열은 아주 중요하다~!!
		
		// 1. 배열 선언 및 할당
		int i;
		int[] integers = new int[3]; //new : heap영역에 공간을 만든다
		// 결과 : 0, 1, 2
		
		// 배열식별자.length : 배열의 크기(길이) => 정수
		System.out.println(integers.length);
		
		//localvariable == 초기화를 진행하지 않으면 사용할 수 없다.
		System.out.println(integers[0]);
		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double
		 *          => 변수 공간에 실제 값을 바로 담을 수 있음
		 * 
		 * 참조자료형 : int[], boolean[], char[], byte[]... String
		 * 			=> 변수 공간에 주소 값을 담을 수 있음 
		 */
		// 301강의실, 302강의실, 501강의실, 502강의실, 사무실
		//도달하고자 하는 목적지 => 501강의실
		String[] KH정보교육원종로점 = new String[5];
		System.out.println(KH정보교육원종로점);
		KH정보교육원종로점[0] = "301강의실";
		KH정보교육원종로점[1] = "302강의실";
		KH정보교육원종로점[2] = "501강의실";
		KH정보교육원종로점[3] = "502강의실";
		KH정보교육원종로점[4] = "사무실";
		
		System.out.println(KH정보교육원종로점[2]);
		
		int number1 = 3;
		int number2 = 3;
		System.out.println(number1 == number2);
		
		int[] numbers1 = new int[3];
		int[] numbers2 = new int[3];
		System.out.println(numbers1 == numbers2);
		
		// 참조자료형의 경우 == 사용시
		// 주소값을 비교하기 때문에 원하는 결과를 얻을 수 없음
		// 문자열 ==
		// 문자열.equals("비교할 문자열");
		
		// 해시코드 : 주소값을 10진수(int형)형태로 나타낸 것이다.
		// 문자형을  곱하고 나누고 더해서 10진수(int형)로 나타내는것
		//해시코드가 다르면 다른 배열로 간주 한다.
		System.out.println(numbers1.hashCode());
		System.out.println(numbers2.hashCode());
		
		
	} 
	
		public void createLottoNumber() {
			int[] lottoNumbers = new int[6]; //인텍스 0 ~ 5중에 넣어 줄 수 있다.
			//lottoNumbers[0] = (int)(Math.random()* 45) + 1;
			
			for(int i = 0; i < 6; i++) {
				lottoNumbers[i] = (int)(Math.random()* 45) + 1;
			}
			// Arrays.toString(배열식별자) => 배열의 요소들을 출력해줌
			System.out.println(Arrays.toString(lottoNumbers));
			
			
		}

	
		public void method3() {
			// 1. 배열 선언 및 할당
			String[] gugudan = new String[10];
			// 2. 
			gugudan[0] = "2 X 1 = 2";
			gugudan[1] = "2 X 2 = 4";
			gugudan[2] = "2 X 3 = 6";
			gugudan[3] = "2 X 4 = 8";
			gugudan[4] = "2 X 5 = 10";
			gugudan[5] = "2 X 6 = 12";
			gugudan[6] = "2 X 7 = 14";
			gugudan[7] = "2 X 8 = 16";
			gugudan[8] = "2 X 9 = 18";
			gugudan[9] = "2 X 10 = 20";  //문법적으로 문제가 없다
			// ArrayIndexOutOfBounds
			/*
			 * 	ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
				at com.kh.array.Array.method3(Array.java:178)
				at com.kh.array.run.Run.main(Run.java:12)
				-> 배열의 인덱스 범위 바운드을 벗어났다 라고 경고로 알려주고있다.
			 */
			/*
			 * AI를 활용해서 현재 내 코드의 잘못된 점을 파악
			 * -> 내것으로 만들지 못하고 다음에 또 기억이 안나거나 모르면
			 * 	  AI를 사용하게된다.
			 * 
			 * -> AI 사용할때 질문을 구체적으로 물어보고 나의 상황을 명확하게 공유하고
			 * 	  피드백의 주페를 명확하게 설정해야 한다.
			 * 
			 */
			
			//3. 출력
			System.out.println(Arrays.toString(gugudan));
		}
	
	
	
	
	
	
	
	
	
}
