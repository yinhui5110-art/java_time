package com.kh.chap02.encapsulation.model.vo;



		//객체지향에서 클래스를 만들때 필드를 위해서		
		//하나의 클래스는 하나의 책임을 가져야 한다.
		//책임 7~9가지가 있고 추상적이고 이론적인것이다.

		//필드부, 생성자부, 메소드부 =이것을 멤버라고 한다
		public class AutoSellingMachine { // 단 한개의 제품을 파는 자판기
		//필드(field)부
		/*
		 * 객체가 가질 수 있는 속성을 기술하는 부분
		 * 
		 * 값을 담는 부분 (변수를 담는 부분이 필요함)
		 * 위치 : 클래스 블럭안/
		 * 
		 * 필드 == 멤버변수 라고 한다.(클래스 변수이다)
		 * (그냥 *변수*라고 하면 메소드 안에 있는 변수이다/변수는 메소드 수행 시점에 저장하는 용도)
		 * 
		 * 객체들이 가져야할 공통적인 속성을 기술해 놓는 것
		 * (추상화를 끝내고 이러한 값들이 들어가면 겠다고 하는것을 뜻함)
		 * 
		 * 클래스와 객체를 구별해야 한다.
		 * 클래스()
		 * 객체(어떤 것을 추상화 한것을 실체화 한것)
		 * 
		 * 접근제한자 지료형 필드식별자;
		 */
	
		
			// 화면상에서 사용자에게 입력을 해줘야하는 값, 출력을 해줘야하는 값  
			//기획자랑 디자인이 만들어 주면 개발자가 만든다.
			// 개발자가 꼭 알아야하는 것 : 
			/*
			 * 주제 
			 * 1. 직장인들이 부업을 선택할 때 어떤 분야가 수입이 가장 높은 것이 무엇이 있는지?
			 * 2. 주제 선정 이유 및 기획서 작성
			 * 3. 다 개발도하고 배포(필수 구현 기능)
			 * 4. 세션파일을 제출(프롬프트 작성내역)
			 * 
			 *  + 업무에 대한 도메인 지식(취업을 하기 위해선 매우 중요하다)
			 *  AI에게 명확한 지시 상황이 명확해야 정확히 사용할 수 있다.
			 *  내가 어떤 부분의 개발자가 될 것인지 결정해야한다.
			 * 
			 * 주말 숙제 :  어떤 분야 개발자 할지 정해오기!, 관련분야 지식, 자격증 알아보기
			 *  주식회사 사이트, 패션회사 사이트
			 */
			
			// **접근제한 => private**
			// 자판기 == 제품이름, 제품가격, 수량
			private String name;
			private int price; 
			private int amount;
			
			// *중요* Dependency(의존) 관계
			//의존성을 낮추면 외부에서 수정하지 않아도 된다.
			//외부에 노출되지 않도록 숨기는 방법을 *캡슐화* 이다
			// 밖에 보일수록 유지보수가 어려워 지기 때문이다!
			
			private void checkAmount () {
				System.out.println("재고는 총" + amount + "개 입니다." );
			}
			
			private void inser () {
				amount -= 1;
			}
			
			private void selling () { //재고를 채우는 기능
				amount += 3;
				
			}
			/*
			public void openMachine() { 
				checkAmount();
				inser();
				selling();
				checkAmount();
				
			}
			*/
	
			// **setter
			// 객체의 속성 값을 기록 및 수정하는 기능의 메소드 : setter()
			/*
			 * vo -> **setter메소드를 구현하지 않는다.**
			 * DTO -> setter를 구현해서 만든다.
			 * 
			 * DTO를 배우려면 짧게잡아도 한달 반정도는 더 수업을 해야한다.
			 * 그래서 DTO배울 때 까지만 VO에 setter를 구현해서 사용하겠다고 하심.
			 * 
			 * setter만들기 규칙
			 * 
			 *  1. setter메소드는 외부에서 접근이 가능해야 하기 때문에 접근제한자 public을 이용
			 *  2.set필드명으로 식별자를 작성하며 낙타봉표기법(camelCase)를 꼭 지키도록한다!!
			 * 
			 */
			
			//★ 하나의 메소드는 하나의 기능을 수행해야한다.★
			// price필드 값을 set할 수 있는 메소드 구현
			//void (return 형 반환형)- void 반환할게 없다 라는 뜻
			public void setPrice(int price) { //라면가격을 괄호안에 넣어 주었기 때문에 매개변수를 괄호 안에 적재
							/* 암기필요 -> */ // parameter, 매개변수: 메소드 호출 시 초기화가 강제됨 ★매우중요해서 암기!!★
								// 지역변수라고 하지만 괄호 안에 있기 때문에 매개변수라고 함.
								// 지역변수는 1.초기화되어야한다 2.
			System.out.println(price);
			//메모리 구조의 대한 이해!!
			price = price;
			//지역변수에 지역변수를 대입; 한고있다				
			//Scop안에서는 해당 영역안에 있는 지역변수가 식별자 우선권을 가진다.
			System.out.println("내 주소가 뭐지 : " +this);
			// this : 내부객체의 해당 객체의 주소값을 가리키는 역할
			this.price = price;
				
				
			}
				
			//name 필드를 기록 및 수정할 수 있는 메소드
			public void setName(String name) {
				this.name = name; //name의 필드에 대입하기 위한
			}
	
			// amount 필드를 기록 및 수정할 수 있는 메소드
			public void setAmount(int amount){
				this.amount = amount;
			}
	
			// 데이터를 반환해주는 기능의 메소드 : getter()
			// vo라는 패키지 안에는 무조건! getter()는 있어야 함!!!
			/*
			 * 규칙!
			 * 1. getter()는 접근제한자 public을 사용한다.
			 * 2. get필드명으로 짓되, 낙타봉표기법(camelCass)를 사용한다.
			 * 3. VO패키지안에 존재하는 클래스라면 getter는 무조건 꼭 만들어야 한다.
			 * 
			 */
			
			// 메소드를 호출한 곳으로 name필드값을 돌려주고 싶음
			
			/*
			public void getName() {
				  return; //눈에 보이지 않는 return; 존재한다.
			
			
			
			}
			*/
		public String getName() {
			return "네임필드값";
		}
	
	
	
	

}
