package com.kh.controller;

import com.kh.run.Run;

public class StringController {
	
	// String 클래스 => 특징-> 불변입니다.(변하지 않음을 의미한다) immutableness
	
	public void method1() {
		//String abc = "abc"; // string은 몇바이트? -> 4byte
		String str1 = new String("hello"); // <= String 객체 생성 호출
		String str2 = new String("hello");
		 Run run = new Run();
		
		
		System.out.println(str1);
		System.out.println(run); // => 출력하면 com.kh.run.Run@7960847b 나온다
		System.out.println(str2.toString()); //toString은 string 클래스에서 오버라이딩이 되어있다
		// *** 1. String 클래스의 toString()의 경우
		// 실제 담겨있는 문자열 value값을 반환하게끔 오버라이딩
		
		// equals()
		System.out.println(str1.equals(str2));
		// 스트링 클래스에서 == 오버라이딩 한것이다
		
		Run run2 = new Run();
		System.out.println(run.equals(run2));
		// ***2. 문자열 value를 비교하도록 오버라이딩 한다
		
		
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("hello".hashCode());
		// 해쉬코드(같은 값을 가지고 해쉬하면 항상 같은 결과값이 나온다)
		// 해쉬코드란? 객체를 숫자로 바꾼 값(정수값) /객체를 빠르게 찾기 위한 주소 같은 값
		// ***3. 주소값을 해싱하는 것이 아니라 실제 담긴 문자열값을 기반으로 해싱을 돌리도록 오버라이딩 한것이다.
		
		//system.identityHashCode(참조형변수) 각 객체마다 해쉬코드를 만들어주는 
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1 == str2);
		
		
	}
	
	public void method2() {
		
		String str1 = "hello";
		String str2 = "hello";
		
		//toString()
		System.out.println(str1);
		System.out.println(str2);
		
		//eqauls()
		System.out.println(str1.equals(str2));
		
		//hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// identityHashCode()
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1 == str2); //결과값이 false가 나와야 하는데 true가 나온다
		
		
		
	}
	public void method3() {
		// 이 둘은 왜 다른가?
		String str1 = new String("hello"); //메모리에 직접 공간을 사용한다 그래서 절대 금지 문법~!
		String str2 = "hello";// StringPool 공간에서 찾아본다
		// 문자열 리터럴은 대입연산자를 사용해 대입할 때
		//StringPool (heap) 영역에 등록됨
		// StringPool : 동일한 내용의 문자열 value가 존재할 수 없음
		// 같은 문자열을 재사용해서 메모리를 아끼는 공간
		
		//차형배열은 객체이다 (다차원 배열) 배열 안에 배열이 들어있는 구조
		//여러 개의 배열을 묶은 배열이다
		//여러개의 단일 문자를 저장할려면 여러개의 배열이 필요한데 메모리 공간을 너무 낭비하게 되기 때문에
		// 자바에서는 스트링자료형에 대입연산자를 통해서 값을 대입하면 스트링풀이라는 공간에 동일한 문자열이 있는지
		// 없는지 찾아보고 동일한 문자열이 있으면 얇은복사해서 주소값을 알려준다
		
		
		System.out.println(System.identityHashCode(str2));
		str2 += "bye"; // 새롭게 대입해서 새롭게 만들어진 배열이 생겼다.
		System.out.println(System.identityHashCode(str2));
		System.out.println(str2);
		
		
		
	}
	
	
	public void method4() {
		
		StringBuffer sb = new StringBuffer();
		String str = "Hello" + "World";
		sb.append("Hello");
		sb.append("World");
		System.out.println(sb);
		
		// 문자열임시저장공간
		// 문자열이 불변객체라서 내용물 변경이 일어나면 계속 새로운 공간을 할당해서 올릴것
		// 이를 해결하기 위해 임시공간(Buffer)를 준비해서 임시공간에 차곡차곡 담았다가 
		// 한번에 처리하는 클래스
		
		StringBuilder sr = new StringBuilder(); 
		//문자열을 수정 가능하게 만들어주는 클래스
		// 속도가 빠르고 메모리 적게 사용한다.
		sr.append("Hello");
		sr.append("World");
		System.out.println(sr);
		
		// 두개의 차이점
		// 동시제어기능(Thread-Safe)
		// Tomcat , Jetty -> 서버들에서 제공이 많이 되고있음
		// 충돌나겠다! 가 아니라면 굳이 구현할 필요가 없음
		
		
		
		
	}
	
	
	public void method() {
		String str1 = "은총알은 없다";
		
		// 1. 문자열.length() : int
		// 문자열의 길이를 반환해주는 역할
		
		System.out.println("str1의 길이 : " + str1.length());
		
		String userId = "gggg";
		if(8 <= userId.length()&& userId.length() <= 20) {
			throw new RuntimeException("아이디 글자수 점점점");
		}
		
		// 2. 문자열.charAt() : char
		char ch = userId.charAt(0);
		System.out.println(ch);
		
		String phoneNumber = "010-1234-5678"; 
		//필요한 부분만 잘라서 사용할때
		// 3. 문자열.susbstring(int beginindex) : String
		System.out.println(phoneNumber.substring(4));
		System.out.println(phoneNumber.substring(4, 8));
									//4번부터 8번까지
		
		// 4. 문자열.indexOf(String) : int
		
		System.out.println(str1.indexOf("없다"));
		
		String[] emails = {"hong@kh.com", "lee@kh.com","hahahoo@kh.com"};
		
		//System.out.println(emails[0].substring(0,4));
		//System.out.println(emails[1].substring(0,3));
		
		// for 문을 사용하는 이유 : 정해진 만큼
		for(int i = 0; i < emails.length; i++) {
			System.out.println(emails[i].substring(0,emails[i].indexOf("@")));
			
		}
		
		String fileName =  "sdfsdfdgdgsd.jpg";
		System.out.println(fileName.substring(fileName.indexOf(".") + 1));
		
		String fileName2 = "sd.g.dfdf.etg.fgdg.png";
		System.out.println(fileName2.substring(fileName2.lastIndexOf(".")));
		
		// 문자열.toCharArray() : char[]
		String str2 = "배열로만들문자열"; 
		char[] chArr = str2.toCharArray();
		for(int i = 0; i <chArr.length; i++) {
			System.out.println(chArr[i]);
			
		}
		
		for(char c : chArr) {
			System.out.println(c);
			
		}
		
		System.out.println(String.valueOf);
	}
	
	
	
	
	
	
	

}
