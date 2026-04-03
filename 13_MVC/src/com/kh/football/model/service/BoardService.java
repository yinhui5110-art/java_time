package com.kh.football.model.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kh.football.model.dto.BoardDto;
import com.kh.football.model.vo.Board;

public class BoardService {
	
	
	private List<Board> boards =new ArrayList();
	private int id;
   {
	   
	   boards.add(new Board(++id, "첫 글입니다~", " 재밌다", "관리자","1234",
			   	  new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
	   boards.add(new Board(++id, "또 글입니다~","하하오오","관리자", "1234",
			      new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
}

   public List<Board> findAll(){
	   return boards;
	   
   }
   public Board findById(int boardNo) {
	   if(boards.get(0).getBoardNo()== boardNo) {
		   return boards.get(0);
		   
	   }
	   if(boards.get(1).getBoardNo() == boardNo) {
		   return boards.get(1);
		   
	   }
	   for(Board board : boards) {
		   if(board.getBoardNo() == boardNo) {
			   return board;
		   }
	   }
	   
	   
	return boards.stream()
			    . filter(b -> b.getBoardNo() == boardNo)
			    . findFirst()
			    . orElse(null);
			
	   
	   
	   
   }

   public void saveBoard(BoardDto board) {
		// 사용자에게 입력받은 값을 가지고 리스트에 요소를 추가한다.
		// 유효성 검증 먼저해야한다 -> 뷰에서 값을 검증하는 것을 사용자에게 안내메시지를 주기 위해서
	   //*아이디는 5~20자의 영문소문자,숫자와 특수기호 만 사용 가능합니다 -> 1차 유효성검사
		// 사용자에게 받은 값이 4개이다 ->
	  
	  
	   boards.add(new Board(++id, board.getBoardTitle(),
			   						board.getBoardContent(),
			   						board.getBoardWriter(),
			   						board.getPassword(),
			   						new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
	   
   }
   
   public Board updateBoard(int boardNo,BoardDto board) {
	   // boardNo를 이용해서 boards에서 boardNo와 일치하는 Board객체의 인덱스를 찾는다.
	   //찾아온 board객체의 writer필드, password필드와
	   // 사용자가 입력한 writer필드, password필드를 각각 동등비교한다.
	   // 두 개의 필드가 모두 동일할 시 새로운 BoardVO객체를 생성한 뒤 list의 set메소드로 갱신한다.
	   
	   int index = 0;
	   for(int i = 0; i < boards.size(); i++) {
		   if(boards.get(i).getBoardNo() == boardNo) {
			   index = i;
		   }
	   }
	  Board b = boards.get(index);
	   if(b.getBoardWriter().equals(board.getBoardWriter())&&
		  b.getPassword().equals(board.getPassword())) {
			  boards.set(index, new Board(boardNo,
					   					  board.getBoardTitle(),
					   					  board.getBoardContent(),
					   					  b.getBoardWriter(),
					   					  b.getPassword(),
					   					  b.getCreateDate()));
			   
	   
	   return boards.get(index);
	   
   }
   return null;
   
   
   }

   public int deleteBoard(int boardNo) {
	   // 삭제 성공 시 1을 반환
	   // 삭제 실패 시 0을 반환
	   
	   if(boardNo < 0) {
		   return 0; //인덱스는 0번부터 시작이여서 -1 이나와도 출력할게 없다.
	   }
	   int index = -1;
	   for(int i = 0; i < boards.size(); i++) {
		   if(boards.get(i).getBoardNo()==boardNo) {
			   index = i;
			   break;
		   }
		   
	   }
	   if(index > -1) {
		   boards.remove(index);
		   return 1;
	   }
	   return 0;
	   
	   
	   
	   
   }
   
   
   
   
   
   
   
   
   

}