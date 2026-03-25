package com.kh.chap07.controller; 
//중간 연결해주는 역할,여러 군데에서 서비스를 불러내고 제어 하기 위해서 컨트롤러에서 한번에 보기 위해서 필요.

import com.kh.chap07.model.service.TicketService;
import com.kh.chap07.model.vo.Ticket;

public class TicketController {
	private TicketService ts = new TicketService();
	
	public int saveTicket(Ticket ticket) {
		//System.out.println("Controller : " + ticket);
		return ts.saveTicket(ticket); //티켓타입의 인자값을 전달하기 위해서
		
		
		
		
	}
	
	
	public Ticket printTicket(Ticket ticket) {
		// 서비스야 티켓 남는거 있으면 하나만
		//-> 티켓서비스의 주소값을 참조하여 메소드호출
		Ticket ticket1 = ts.printTicket();
		return ticket1;
		
		
	}
	/*
	public Ticket[] findAll() {
		Ticket[] tickets = ts.findAll();
		return ticket;
	}
	*/
}
