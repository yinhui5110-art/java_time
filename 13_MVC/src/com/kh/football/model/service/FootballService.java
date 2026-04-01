package com.kh.football.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.football.model.vo.FootballPlayer;

// 축구선수 저장된걸 가지고 연산 등등 해보는 곳
public class FootballService {
	// 정석적으로 가려면 DAO클래스가 존재해야하지만 그러면 규모가 너무 커지기 때문에 Service단에서 저장
	private List<FootballPlayer> list = new ArrayList();
	private int id;

	
	// 초기화 블럭에서 작업 해보기
	{
		list.add(new FootballPlayer(++id,"손흥민","공격수", 7));
		list.add(new FootballPlayer(++id, "호날도", "공격수",7));
		list.add(new FootballPlayer(++id, "메시", "미드필더",10));
		
		
	}
	public FootballService() {
		//System.out.println("순서3");
		
		
	}
	
	//View가 축구선수들 정보를 출력하기 위해서 건너건너 왔다.
	public List<FootballPlayer> selectAll() {
		return list; //필드값 반환하는 getter같은 것이다
		
		
	}
	
	
	
	
}
