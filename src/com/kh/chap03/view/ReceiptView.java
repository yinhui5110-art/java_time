package com.kh.chap03.view;

import java.util.Scanner;

import com.kh.chap03.model.vo.Receipt;

//view ==화면 담당(입/출력)
public class ReceiptView {

	public void mainMenu() {
		//System.out.println("ㅎㅎㅎ");
		
		// 사용자에게 영수증 정보를 입력받고
		// 입력받은 영수증 정보를 출력해주는 프로그램
		Scanner sc = new Scanner(System.in); //sc : scanner객체의 주소값이 대입되어있다.
		
		// Receipt라는 클래스를 가지고 객체를 생성한다
		Receipt r = new Receipt(); // ->객체를 생성한 목적 : 영수증 정보 값을 저장해야 하는데 
					// 객체(Odject) ==> 객체의 추상적인 개념
					// Instance ==> 객체에 실제 메모리에 올라간 데이터
		// 1. 참조자료형이다(자료형 == type)
		// 클래스를 만든다는 행위 ==  개발자가 자신에게 필요한 사용자 정의 자료형을 만들겠다.
		// 2. 여러 자료형에 각각 여러 개의 값을 보관가능 + 기능
		
		
		//영수증 객체는 영수증 입력을 받고 출력할때까지 
		//heap영역에 사라지지 않도록 receipt변수에
		
		// 가격, 결제수단, 상점명, 날짜
		System.out.println("가격이 얼마인가요? > ");
		int price = sc.nextInt();
		r.setPrice(price);
		// 메소드 호출부에서 메소드를 호출하면서 넘길수 있는것은 오직 값뿐이다.
		
		System.out.println("결제수단은 무엇인가요? > ");
		String payment = sc.nextLine();
		r.setPayment(payment);
		
		System.out.println("상점명은 무엇인가요? > ");
		String storeName = sc.nextLine();
		r.setStoreName(storeName);
		
		
		System.out.println("날짜는 언제 인가요? > ");
		String date = sc.nextLine();
		r.setDate(date);
		
		System.out.println("=======================");
		String info = r.info();
		System.out.println(info);
		
		sc.close();
	}
	
	
}
