package com.kh.valiable;

import java.util.Scanner;


public class Casting {

	/*

	* Type Casting(자료형변환 / 형변환) 매우 중요함!!!!

	* 가장 핵심적인 개념이다~!!

	*

	* 자료형을 바꾸는 개념!

	*  ★ 자바에서 값을 처리하는 규칙 ★

	*

	* !!! 1. = (대입 연산자)를 기준으로 왼쪽 = 오른쪽이 같은 자료형이어야 한다.!!!!

	* ex) int = int =>같은 자료형에 해당하는 리터럴값만 대입할 수 있음

	→리터럴 값 : 

	**프로그램 코드에 직접 써 있는 고정된 값**

	을 의미한다

	즉,**변수에 저장하기 전에 이미 코드 안에 그대로 적혀 있는 값.(int a =10 /a:변수/10:리터럴값)**

	* => 자료형이 다를 경우? => 값을 바꿔서 대입해야 함.

	*

	* 2. 같은 자료형들끼리만 연산이 가능함

	* => 자료형이 다른데 연산이 너무 하고 싶을때? 둘 중 하나를 "형변환"을 해서 맞춰야 함

	*

	* 3. 연산의 결과물도 동일한 자료형이여야 한다.

	* => 3 + 7 =10(정수), 1.1 + 3.3 = 4.4(실수)

	*

	*  [표현법] 

	(바꾸고 싶은 자료형)값; //형변환연산자 / cast연산자

	*

	*  형변환의 종류

	*  1. 자동형변환(Promotion) : 자동으로 형변환이 진행됨

	*  작은 크기의 자료형이 큰 크기의 자료형

	*  직접 형변환을 할 필요가 없음

	*

	*  2.강제형변환(Type Casting) : 자동형변환이 이루어지지 않는 경우 진행

	*  직접 형변환을 해야할 때 =>(자료형)를 통해 진행

	*/

	// boolen : 1Byte

	//char : 2Byte

	//byte : 1Byte

	//short : 2Byte

	//int : 4Byte

	//long : 8Byte

	//float : 4Byte

	//double : 8Byte

	// 자동형변환(Promotion) : 작은 자료형 -> 큰 자료형

	public void autoCasting() {

	//System.out.println("이 내용을 콘솔창에 출력해 보세요");

	// 1. int(정수, 4Byte) => double(실수, 8Byte)

	// 변수 선언과 동시에 초기화

	int num = 7; //num은 변수이다 변수안에 7이라는 값이 있는 것이다.

	System.out.println(num);

	double doubleNum = /*(double)*/num;//실수를 저장할 수 있는 8칸짜리doublenum이 생성/num에 대입할 값이 필요함

	//1번    3번  2번

	//같은 자료형만 대입이 가능하기 때문에 (double)num; 왼쪽에 있는 자료형과 같아진다

	System.out.println(doubleNum);

	System.out.println(num);

	// 2.  int(정수, 4Byte) => long(정수,8Byte)

	int bigNum = 120;

	long smallLong = bigNum;// 눈에 보이지 않지만 long형으로 바뀌었다. 작은 자료형에서 큰 자료형으로 형변환.

	System.out.println(smallLong);

	// 3. long(정수,8Byte) -> float(실수, 4Byte) **특이케이스

	long longNumber = 1000L;

	//int i = longNumer;

	float floatNumber = longNumber;

	System.out.println(floatNumber);

	// 정수가 실수로 변환 될 때 큰사이즈의 정수타임을 작은 사이즈의 실수타입으로 자동형변환해줌

	//4Byte float형이 long형보다 표현할 수 있는 값의 범의가 넓기 때문

	System.out.println("===========");

	// 4. char(2Byte), 문자) <-> int(4Byte, 정수)

	char ch ='a';

	//System.out.println(ch);

	int chNum = ch;

	//System.out.println(chNum);

	char ch2 = 97;

	//System.out.println(ch2);

	//**퀴즈쇼쇼show~**

	System.out.println('a'); // -> a 에이가 나온다

	System.out.println((int)'a'); // -> 97

	System.out.println('a' + 3); // -> 100

	System.out.println('a' + '3'); // -> 148

	//유니코드 ‘a’ : 97 / ‘3’ : 51

	System.out.println('a' + "3"); // -> "3"는 문자열이여서 3 그대로 문자로 나온다

	System.out.println ("============");

	// 번외. byte 또는 short형 간의 연산

	// -128 ~ 127까지만 나타낼수 있는데

	byte byteNum= (byte)128;

	//System.out.println(byteNum);

	byte b2 = 126;

	byte b3 = 3;

	System.out.println(b2 + b3); //int로 변환된다

	//결과값은 int형이다 => 연산장치가 값을 처리하는 크기가 int형크기(4Byte)

	// =

	// **비교연산자 (==)**

	// 좌항과 우항의 값을 비교해서 결과값을 변환해준다.

	// true / false

	System.out.println("비교 연산자를 사용해보기");

	System.out.println(1==2); //false

	System.out.println('a' == 'b'); //false

	System.out.println(2==(int)'2'); //false

	System.out.println((char)2 == '2'); //false

	System.out.println((int)'2' == '2');

	//강제 형 변환 : 큰 크기의 자료형 -> 작은 크기의 자료형

	//명시적 형변환이라고도 함

	//(바꿀자료형)값

	//double(8Byte) -> int(4Byte)

	double dNum = 10.123213;

	int iNum = (int)dNum;

	System.out.println(iNum);

	//0.123213 절삭 -> 데이터 손실

	double ddNum = iNum;{
		
	}

	//System.out.println(ddNum);
	
	/*
	 *  삼항 연산자 : 피 연산자가 3개
	 *   => 3개의 값과 1개의 연사자로 구성됨(조건문으 형식으로 쓰인다)
	 *   
	 *   [표현식]
	 *   조건식? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값
	 * 
	 * 	조건문 : 값에 따라서 연산을 처리하는 방식
	 * 			결과 값이 true일 결우 첫 번 째 문장을 처리한다~~
	 *  		결과 값이 false일 경우 두 번째 문장을 처리한다~~
	 */
		
		// 치킨 
		
			
		}
	public void triple() {
			System.out.println("깐부치킨에 오신것을 환영합니다!");
			System.out.println("1. 회장님의 입맛 그대로 AI치킨");
			System.out.println("2. 바삭한 식스팩 치킨");
			System.out.println("3. 치킨의 근본 후라이드 치킨");
			//Ctrl + shift + o (import 자동완성 단축키)
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("메뉴 번호를 입력해주세요 > ");
			int menuNo = sc.nextInt();
			
			
			//계획
			//사용자가 메뉴번호로
			// 1번을 입력하면 회장님의 입맛 그대로 AI치킨을 주문하셨습니다.
			// 2번 입려하면 바삭한 식스팩 치킨을 주문하셨습니다.
			// 3번을 입력하면 치킨의 근본 후라이드 치킨을 주문하셨습니다.
			// 1번, 2번,3번이 아니면 없는 메뉴를 주문하셨습니다.
			//이렇게 출력하고 싶음.
			
			//메뉴번호가 1번일 시 AI치킨 나오게하고 1번이 아닐 시 없는 메뉴 입니다 라고 출력
			String selected = menuNo == 1 ? "회장님의 입맛 그대로 AI치킨을 주문하셨습니다"
							: menuNo == 2 ? "빠싹한 식스팩 치킨을 주문하셨습니다."
							: menuNo == 3 ? "치킨의 근본 후라이드 치킨을 주문하셨습니다."
							: "없는 메뉴를 주문하셨습니다.";
			
			 System.out.println(selected);
			 
	
	
	
	
	
	}	
	
}
