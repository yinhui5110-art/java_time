package com.kh.chap01.studyswitch;

import java.util.ArrayList;
import java.util.List;

public class Switchmoon {
	
	
	public void method1() {
		/*
		System.out.println("몇층 가세요? (B1 / B2 / B3) > ");
		String floor = sc.nextLine();
		Scanner sc = new Scanner(System.in);
		switch(floor) {
		
		case "1","2","3" : System.out.println("숫자 입력하면 오류! 다시 입력해주세요 >");
			break;
		case "B1" : System.out.println("지하 1층 입니다");
			break;
		case "B2" : System.out.println("지하 2층 입니다");
			break;
		case "B3" : System.out.println("지하 3층 입니다");
			break;
		
		
		}
		*/
		
	}
	
	//로그인 기능 구현해보기
	/*
	public void login() {
		
		Scanner sc = new Scanner(System.in);
		
		String id ="kh123";
		String password = "1234";
		String name = "호호호";
		
		System.out.println("문구도매 사이트 입니다.");
		System.out.println("-------------------");
		System.out.println("로그인 페이지 입니다.");
		System.out.println("--------------------");
		System.out.print("아이디를 입력해주세요 > ");
		String userid = sc.nextLine();
		System.out.println("------------------------");
		System.out.println("비밀번호를 입력해주세요 > ");
		String pwd = sc.nextLine();
		System.out.println();
		
		if(userid.equals(id) && pwd.equals(password)) {
			System.out.println("로그인에 성공했습니다!");
		
		}else {
			System.out.println("아이디 혹은 비밀번호를 다시입력해주세요!");
			
		}
		
				
	}
	*/

	
	// while문
	/*
	public void method2() {
		
	System.out.println("회원가입 서비스 입니다★");	
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("아이디는 10글자 이하로 입력해주세요 >");
		String userId = sc.nextLine();
		
		if(userId.length() <=10) {
			System.out.println("사용 가능한 아이디 입니다.");
			
		}else {
			System.out.println("주의!! 아이디는 10자 이하만 사용 가능합니다 다시입력해 주세요.");
			continue;
			
		}
		
	}
			
	*/		
		
		
	
	
	public void method3() {
		/*
		int i = 1;
		int sum = 0;
		while(i <= 4) {
			sum += i;
			i++;
			System.out.println(i);
			
		}
		*/
		
		int num1 = (int)(Math.random() * 35) + 1;
		int num2 = (int)(Math.random() * 35) + 1;
		int num3 = (int)(Math.random() * 35) + 1;
		int num4 = (int)(Math.random() * 35) + 1;
		
		System.out.printf("오늘의 번호~ %d,%d,%d,%d",num1,num2,num3,num4);
		
	}
	
	public void method4() {
		List<String> names = new ArrayList<>();
		
		names.add("짱구");
		names.add("철수");
		names.add("유리");
		names.add("짱구");
		
		
		// i = 0; -> 0번부터 시작해서
		//i < names.size() -> 끝까지 반복
		//i++ -> 하나씩 이동 찾고자 하는 문자열이 아니면 넘어가고 찾고자 하는 문자열 발견하면 출력해준다.
		//equals는 문자열 비교할 때 사용한다.
		//names(배열에 들어있는 값 중에 리스트에서 "유리"라는 문자열을 꺼낸다.
			
		for(int i =0; i < names.size(); i++) {
			if(names.get(i).equals("짱구")) {
				System.out.println("짱구는 "+ i +"인덱스에 있습니다.");
		}
			
		}
		
		
	}
	
	
	
}
