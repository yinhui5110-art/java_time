package com.kh.sw.util;

import com.kh.sw.controller.SwitchUtil;
import com.kh.sw.model.vo.Switch;

public class SwitchUtilImpl extends SwitchUtil {

	@Override
	public boolean toggle(Switch s) {
		boom();
		s.setOn(!s.isOn());
		return s.isOn();

	}
	
	/**
	 * 
	 */
	private void boom() {
		
		int rand = (int)(Math.random() * 100 +1);
		
		// rand == (1 ~10) ~100
		if(rand < 11) {
			throw new RuntimeException("스위치가 폭발을 일으켰습니다.");
		}
	}
	
}
