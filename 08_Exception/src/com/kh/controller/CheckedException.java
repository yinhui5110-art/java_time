package com.kh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedException {
	/*
	 * CheckedException
	 * 예외처리를 해야한다는 사실을 체크를 해주는 예외들이다~!!
	 * 문법적으로 반드시 예외처리를 해야한다.
	 * 
	 * 
	 * uncheckedexception : 체크를 해주지 않아서 직접해야 한다.
	 * 
	 */
	public void readString() {
		System.out.println("나는 체크드 익셉션");
		//사용자에게 문자열을 하나만 입력받아서 입력받은 문자열의 길이를 출력
		
		//버퍼 : 임시저장공간이다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력 버퍼
		Scanner sc = new Scanner(System.in);
		
		//CheckedException에 대한 예외처리 방법
		// 방법 1. try ~ catch 문을 작성한다.
		
		try {
		   String str = br.readLine(); //IOException ->컴파일러가 동작시킬수 있다.
		   System.out.println(str.length());
		   method();
		}catch (IOException e ) { // 주로 외부매체 입 / 출력 시 거의~ checkedException가 문제를 알려준다
			e.printStackTrace();
		}
		sc.nextLine();
		
	}
	
	
	private void method() throws IOException { //IOException에서 예외처리 해야하는데 throws가 던지고 있다.
		
		System.out.println("아주 위험한 코드 들어있음!!!");
		throw new RuntimeException("예외발생!!"); 
		// throw : 사용자가 예외를 발생 시키는 것이다
		// 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}