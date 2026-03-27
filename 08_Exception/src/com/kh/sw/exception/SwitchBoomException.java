package com.kh.sw.exception;

/**
 * 이 예외 클래스는 RuntimeException을 상속받아 구현하고 있으며,
 * 스위치를 눌렸을때 10%확률로 폭발이 일어나기 때문에 예외를 발생시키려고 구현하였음
 * 
 * @author 501호
 * @since 26-03-27
 * 
 */
public class SwitchBoomException extends RuntimeException {

	public SwitchBoomException() {
		super();
	}
	
	public SwitchBoomException(String msg) {
		super(msg);
	}
	
}
