package com.kh.chap01.abstraction.view;

import java.util.Scanner;

import com.kh.chap01.abstraction.model.vo.Puppy;

public class PuppyCare {

	//사용자에게 강아지의 정보를 입력받아서
	//입력받은 강아지의 정보를 출력해주고
	//강아지와 함께 놀아줄 수 있는 프로그램
	
	public void run() {
		System.out.println("🐕🐕🐕강아지 다마고치🐕🐕🐕");
		/*스캐너 타입의 변수 선언*/Scanner sc = new Scanner(System.in); //스캐너 객체 생성
		
		//sc.nextInt();
		/*String[]puppyString = new String[3];
		int[] puppyInt = new int[2];
		puppyString[0] = sc.nextLine();
		puppyString[1] = sc.nextLine();
		puppyString[2] = sc.nextLine();
		puppyInt[0] = sc.nextInt();
		puppyInt[1] = sc.nextInt();
		*/
		
		//변수선언 ->Puppy puppy = new Puppy(); //<-heap영역에 puppy객체를 생성
		Puppy puppy = new Puppy();
		//
		System.out.println("아이구 강아지 너무 귀여워요 이름이 무엇? >");
		puppy.name = sc.nextLine();
		System.out.println("아이구~ 무슨 종? > ");
		puppy.species = sc.nextLine();//
		System.out.println("아이구~ 암컷? 수컷? > ");
		puppy.gender = sc.nextLine();
		System.out.println("몇살? >");
		puppy.age = sc.nextInt();
		System.out.println("몸무게는..? >");
		puppy.weight = sc.nextInt();
		
		while(true) {
			System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
			System.out.println(puppy.name + "의 정보!");
			System.out.println("나이 : " + puppy.age);
			System.out.println("성별 :" + puppy.gender);
			System.out.println("종 :" + puppy.species);
			System.out.println("몸무게 :" + puppy.weight);
			System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
			break;
		}
		
	}
	
}
