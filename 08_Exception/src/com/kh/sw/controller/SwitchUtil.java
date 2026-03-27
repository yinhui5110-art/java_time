package com.kh.sw.controller;

import com.kh.sw.model.vo.Switch;

public class SwitchUtil {


		
		
		public boolean toggle(Switch s) {
			s.setOn(! s.isOn()); 
			// 현재 on의 필드값 => 돌려주기전에 반전을 해주어야함
			s.isOn();
			return s.isOn();
		
		}
	

}
