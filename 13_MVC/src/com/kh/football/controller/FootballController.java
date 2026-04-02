package com.kh.football.controller;

import java.util.List;

import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.service.FootballService;
import com.kh.football.model.vo.FootballPlayer;

// View와 Model사이에서 제어
public class FootballController {
	private FootballService fs = new FootballService();
	
	
	
	// View에서 축구선수들 값 출력하기 위해 호출하는 메소드
	public List<FootballPlayer> selectAll() {
		List<FootballPlayer>list = fs.selectAll();
		return list;
		
		
	}
	
	
	// 뷰에서 축구선수를 추가 하고 싶을때 호출하는 메소드
	public void addFootballPlayer(String name, String position, int backNumber) {
		
		// 귀찮음 이슈로 
		//fs.addFootballPlayer(name,position,backNumber); //코드를 순서를 맞춰서 적는다
		
		
	}
	
	public FootballPlayer addFootballPlayter(FootballPlayerDto fpd) {
		return fs.addFootballPlayer(fpd);
		
		
	}
	
	public boolean idCheck(int id) {
		return fs.idCheck(id);
		
	}
	public void updateFootballPlayer(int id, FootballPlayerDto player) {
		fs.updateFootballPlayer(id,player);
	}


	public FootballPlayer addFootballPlayer(FootballPlayerDto footballPlayerDto) {
		// TODO Auto-generated method stub
		return null;
	}


	public String deleteFootballPlayer(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
