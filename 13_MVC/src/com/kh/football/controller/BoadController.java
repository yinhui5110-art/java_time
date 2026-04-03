package com.kh.football.controller;

import java.util.List;

import com.kh.football.model.dto.BoardDto;
import com.kh.football.model.service.BoardService;
import com.kh.football.model.vo.Board;

public class BoadController {
	private BoardService bs = new BoardService();
	
	public List<Board> findAll() {
		return bs.findAll();
		
	}
	
	public Board findById(int boardNo) {
		return bs.findById(boardNo);
		
	}
	public void saveBoard(BoardDto board) {
		bs.saveBoard(board);
		
		
		
	}
	// 1번 나는 성공실패여부를 View에 출력해 줄것이다 -> case 여러개
	// 2 나는 업데이트에 성공한 Board 필드값을 출력해 줄 것이다.
	// 2번 무조건 성공 했다고 가정하면 -> void 반환 타입 사용
	public Board updateBoard(int boardNo,BoardDto board) {
		return bs.updateBoard(boardNo,board);
	}
	
	public int deleteBaord(int boardNo) {
		return bs.deleteBoard(boardNo);
		
	}
	
	
	
	
	
	
	
	
	

}
