package com.kh.operator.controller;




public class OperatorController {

	public void arithmetic() {
		// 산술연산자 -> 이항연산자, 우선순위
		// =, -, *, /
		// % : 모듈러(Modular) => 나눗셈에서의 나머지를 구하는 연산
		int num1 = 10;
		int num2 = 3;
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
		
		System.out.println("num1 + num2 : " + num1 + num2);
							//"num1 + num2: 10"
							// "num1 + num2 : 103"
		
		//결과값은 "num1 +num2 : 103"
		System.out.println("num1 + num2 :" + (num1 + num2));
		int sum = num1 +num2;
		System.out.println("num1 + num2 : " + sum);
		System.out.println("num1 + num2 :");
		System.out.println(num1 + num2);
		//System.out.println("num1 + num2 : %d\n", num1 + num2);
		
		System.out.println("num1 - num2 :" + (num1 -num2));
		
		System.out.println("num1 X num2: " + (num1 * num2));
		//*, /,% -> 우선순위가 +,-보다 높기 때문에 묶어주지 않더라도 먼저 연산을 수행
		//다른 개발자들의 가독성을 위해 괄호를 사용하는 것을 권장!!
		System.out.println("num1 mod num2 : " + (num1 % num2));
		System.out.println("num1 mod num2 :" + (num1 % num2));
		
		//조심해야할 부분
		// System.out.println(10 / 0);
		
	}

	public void test() {
		System.out.println("메소드를 호출 할 때 꼭 메인에서만 불러야하는 것을 아니다");
		
		
		
	}
	//사탕 개수 구하기 프로그램 구현
	//메소드 : presentToStudent()
	
	//사용자에게 값을 입력받으세요. <== Scanner
	// 1. 나눠줄 학생의 수   <== nextInt();
	// 2. 사탕 개수        <== nextInt();
	
	// 1인당 받을 수 있는 사탕의 개수 : 사탕 개수 / 학생 수 <==산술 연산자
	//남은 사탕의 개수 : 사탕 개수 % 학생 수
	
	//출력형식
	// 학생 한 명당 받을 수 있는 사탕 개수 : X개   <==println();
	//남은 사탕 개수 : x개 					<==println();
	


		//public void presentToStudent() {
			//System.out.println();
			
			//Scanner sc = new Scanner(System.in);
			
			//String str = sc.nextLine();
			//System.out.println(str);
			//System.out.println("학생 수를 입력해주세요 > ");
			//int students = sc.nextInt();
			//System.out.println("학생수: " + students);
			
			//System.out.println("사탕 개수를 입력해주세요 > ");
			//int candies = sc.nextInt();
			//System.out.println("사탕수 :" + candies);
			
			//int result = candies / students;
			//int mod =  candies % students;
			// System.out.println(result);
			// System.out.println(mod);
			
			//System.out.println("두 당 가질 수 있는 사탕의 개수 :" + result + "개");
			//system.out.println("남은 사탕의 개수 :" + mod + "개");
			
		public void inDecrease() {
			
			/*
			 * 증감연산자 : 단항연산자로 한 번에 1증가하거나 / 1감소하는 연산을 함
			 * 
			 * [표현법]
			 * 
			 * ++ : 값을 1증가 시킴
			 * -- : 값을 1감소 시킴
			 * 
			 * => 증감을 먼저 할건지, 아니면 나중에 할건지에 따라 연산자의 위치가 달라짐
			 * 
			 * 전위 연산 : ++값, --값 -> 먼저 값을 증가 또는 감소시키고 나서 작업을 처리
			 * 후위 연산 : 값++, 값--  -> 먼저 값을 처리하고 나서 증가하거나 감소
			 * 
			 */
			System.out.println("-------------");
			int num = 10;
			System.out.println(num);
			num++;
			System.out.println(num);
			num--;
			System.out.println(num);
			
			
		}
			
			
			
			
			
			
			
		}