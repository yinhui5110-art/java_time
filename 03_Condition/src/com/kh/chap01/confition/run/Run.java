package com.kh.chap01.confition.run;

import com.kh.chap01.confition.ConditionElse;
import com.kh.chap01.confition.ConditionSwitch;
import com.kh.chap01.confition.Conditionif;
import com.kh.chap02.loop.LoopWhile;
import com.kh.chap02.loop.Loopfor;
import com.kh.chap03.escape.EscapeBreak;


public class Run {

	
		public static void main(String[]args) {
			
			Conditionif ci = new Conditionif();
			//ci.method1();
			//ci.quiz();
			ConditionElse ce = new ConditionElse();
			//ce.method1();
			//ce.method2();
			//ce.ageChek();
			ConditionSwitch cs = new ConditionSwitch();
			//cs.method0();
			//cs.findByName();
			//cs.login();
			Loopfor pf = new Loopfor();
			//pf.method1();
			//pf.gugudan();
			//pf.mainMenu();
			LoopWhile lw =new LoopWhile();
			//lw.method1();
			//lw.method2();
			//lw.method3();
			//lw.lotto();
			EscapeBreak eb = new EscapeBreak();
			//eb.method1();
			eb.checkId();
			
			
		}
		
	
}
