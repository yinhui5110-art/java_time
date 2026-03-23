package com.kh.chap05.model.vo.view;

import com.kh.chap05.model.vo.Member;

public class MemberView {
	
	public void memberMenu() {
		
		//회원가입을 위해 사용자의 정보를 저장하기 위해서 member를 생성했다.
		Member member = new Member();
		System.out.println(member.info()); //info : 값을 저장하고,재사용하고, 관리하기 위해서
		
		Member member1 = new Member("user01");
		System.out.println(member1.info());
		
		Member member2 = new Member("user02", "pass02");
		System.out.println(member2.info());
		
		Member member3 = new Member("user03", "pass03", "홍길동");
		System.out.println(member3.info());
		
	}
	
	
		
}
