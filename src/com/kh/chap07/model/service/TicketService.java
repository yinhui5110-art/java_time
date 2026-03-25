package com.kh.chap07.model.service;

import com.kh.chap07.model.vo.Ticket;

public class TicketService {
	//private int ticketCount;
	/*
	private Ticket firstTicket;
	private Ticket secondTicket;
	private Ticket thirdTicket;
	*/
	
	private Ticket[] tickets = new Ticket[3];//3칸 인덱스 0,1,2
	
	//배열
	//프로그램이 시작되었을때 배열이 만들어 져야한다.
	//배열이 호출되 었을때와 메소드가 끝나면 종료된다.
	//   저장), 공간의 크기를 못바꿈.
	//-> 물리구조와 논리구조가 같다.
	//-> **같은 자료형의 값을 담을 수 있다.**
	//기본값은 null이다

	public Ticket[] findAll() {
		return tickets;
		
	}
	
	
	/*
	public int getTicketCount() {
		return ticketCount;
	}
   */
	

	// 사용하는 기술에 따라서 돌려주는 값이 달라짐
	// 1. 정수 값 -> 성공하면 1번 실패하면 2번
	// 2. 주소 값 
	//public int saveTicket(Ticket ticket) {
		//티켓타입의 매개변수
		//여러개의 변수가 같은 변수를 가지고 있는것은 => 얕은복사 라고 한다.
		// 1. 티켓 개수 확인
		// 2. 티켓 개수가 2이하라면 티켓 등록하고 티켓카운트 + 1 => if문
		
		/*
		if(firstTicket == null) {
			this.firstTicket = ticket;
			return 1; // 성공했을때 값을 반환해준다
		}else if(secondTicket == null) {
			this.secondTicket = ticket;
			return 1;
		}else if(thirdTicket == null) {
			this.thirdTicket = ticket;
			return 1;
		
		}
		
		return 0; //실패 했을때의 값을 반환해준다
		
	}
	*/	
		/*
		for(int i = 0; i < tickets.length; i++) {
				if(tickets[i] == null) {
					Ticket[] tickers;
					Ticket ticket1 = tickers[0];
					return 1;
				}
			}
		/*
	
		Ticket printTicket() {
			// view로부터 시작된 요청이 컨트롤러를 거쳐서 도달함
			// 1. 티켓이 발급된게 있나 없나 확인후
			// 2. 발급된게 있으면 티켓의 주소값을 반환해주고
			// 3. 주소값을 담은 필드 비워주기
			// first티켓이 있는지 확인해보기
			//-> 퍼스트티켓에 있는 null 주소값이 대입되어 있다
			
		/*	
			if(firstTicket != null) {
				Ticket ticket = firstTicket;
				firstTicket = null;
				return ticket;
			}else if(secondTicket != null) {
				Ticket ticket = secondTicket;
				secondTicket =null;
			return ticket;
		}else if(thirdTicket != null) {
			Ticket ticket = thirdTicket;
			thirdTicket = null;
			return ticket;
		
			}
			*/
		//}
		
		/*	
		if(tickets[0]!= null) {
			Ticket ticket = tickets[0];
			tickets[0] = null;
			return ticket;
		}
		
		if(tickets[1]!= null) {
			Ticket ticket = tickets[0];
			tickets[1] = null;
			return ticket;
		}
		if(tickets[2]!= null) {
			Ticket ticket = tickets[0];
			tickets[2] = null;
			return ticket;
		}
		
		return null;
		
		*/
		
		
		
	/*
		if(tickets[0] == null) {
			tickets[0] =ticket;
			return 1;
			
		}
		if(tickets[1] == null) {
			tickets[1] = ticket;
			return 1;
		}
		if(tickets[2] == null) {
			tickets[2] = ticket;
			return 1;
		}
			*/
	
	
	
	
	
	
	
	
	
  //}



	public Ticket printTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	public int saveTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
