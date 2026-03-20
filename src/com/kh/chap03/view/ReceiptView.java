package com.kh.chap03.view;

import java.util.Scanner;

import com.kh.chap03.model.vo.Receipt;

//view ==화면 담당(입/출력)
public class ReceiptView {

	public void mainMenu() {
		//System.out.println("ㅎㅎㅎ");
		
		// 사용자에게 영수증 정보를 입력받고
		// 입력받은 영수증 정보를 출력해주는 프로그램
		Scanner sc = new Scanner(System.in);
		
		// Receipt라는 클래스를 가지고 객체를 생성한다
		Receipt r = new Receipt();
					// 객체(Odject) ==> 추상적인 개념
					// Instance ==> 실제 메모리에 올라간 데이터
		//영수증 객체는 영수증 입력을 받고 출력할때까지 
		//heap영역에 사라지지 않도록 receipt변수에
		
		
		
		
		sc.close();
	}
	
	
}
