package com.kh.sw.controller;

import com.kh.sw.model.vo.Switch;
import com.kh.sw.util.SwitchUtilImpl;



public class SwitchController  {
	private Switch s = new Switch(false);
	//heap영역에 소멸될때 까지 유지해준다
	
	
	// 내필드의 필드값을 반전을 시켜서 반환하는 메소드 -> 반전시키는 곳은 SwitchutilIml
	public boolean toggleSwitch() {
		SwitchUtilImpl su = new SwitchUtilImpl();
		boolean on = su.toggle(s);
		//System.out.println(on);
		return on;
		
		
		
	}
	
	
	
	

}
