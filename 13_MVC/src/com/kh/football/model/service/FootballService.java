package com.kh.football.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.football.model.dao.FootballPlayerDao;
import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.vo.FootballPlayer;

// 축구선수 저장된걸 가지고 연산 등등 해보는 곳
public class FootballService {
	// 정석적으로 가려면 DAO클래스가 존재해야하지만 그러면 규모가 너무 커지기 때문에 Service단에서 저장
	private List<FootballPlayer> list = new ArrayList();
	private int id;
      // FootballPlayer fp = new FootballPlayer (++id, "1","2","3");
	
	// 초기화 블럭에서 작업 해보기
	{
		list.add(new FootballPlayer(++id,"손흥민","공격수", 7));
		list.add(new FootballPlayer(++id, "호날도", "공격수",7));
		list.add(new FootballPlayer(++id, "메시", "미드필더",10));
		
		
	}
	public FootballService() {
		//System.out.println("순서3");
		
		
	}
	
	//View가 축구선수들 정보를 출력하기 위해서 건너건너 왔다.
	public List<FootballPlayer> selectAll() {
		return list; //필드값 반환하는 getter같은 것이다
		
		
	}
	// 뷰가 축구선수를 추가하기 위해서 호출되는 메소드
	public FootballPlayer addFootballPlayer(FootballPlayerDto fpd) {
		// 비즈니스로직 == 의사결정코드
		// 1.  이름이 두글자 이상
		// 2. 포지션은 공격수/미드필더/수비수/골키퍼
		// 3. 등번호는 0이상
		
		/*
		if(fpd != null && fpd.getName().length() >= 2) {
			
		// fpd가 정상적으로 돌아오지 못했다면
		// NullPointerException이 발생할 수 있겠구나!
		if("공격수".equals(fpd.getPosition())|| fpd.getPosition().equals("공격수") || fpd.getPosition().equals("미드필더")||
					fpd.getPosition().equals("수비수")|| fpd.getPosition().equals("골키퍼")){
			
			if(fpd.getBackNumber()>= 0) {
				// 코드는 변수 + 조건문 + 반복문 3개로 만든다
				// 기능 구현시
				// 사지선다 :  출력문 / 변수 / 조건문 / 반복문 
				// 여기에서 하나를 고르는 것이다
				// **값에 대한 **유효성검증 == validate
				list.add(new FootballPlayer(++id,fpd.getName(),fpd.getPosition(),fpd.getBackNumber()));
				
				return list.get(list.size() -1); // 마지막에 추가한 값
				
				
			}
			
		}
	
	}
		*/
		
		if(validateFootballPlayer(fpd)) {
			list.add(new FootballPlayer(++id,fpd.getName(),fpd.getPosition(),fpd.getBackNumber()));
			return list.get(list.size() -1);
		}
		return null;
	
	
	
		
	
		
	}
	
	
	public boolean idCheck(int id) {
		
		// 첫 번째 요소랑 비교해보기
		for(int i =0; i < list.size(); i++) {
		if(list.get(0).getId() == id) {
			return true;
		  }
		}
		return false;
		
	}
	public void updateFootballPlayer(int id, FootballPlayerDto player) {
		
		// id값을 가지고 list를 순회해서
		//동일한 id값을 가진 FootballPlayer의 index를 알아내야한다.
		/*
		int index = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				     // i == index
				// 3이라고 입력했을 시 세번째 바퀴에 if문에 들어온다
				index = i;
				break;
			}
		}
		*/
		
		int index = indexOf(id);
		// 유효성검사 해야한다
		boolean result =  validateFootballPlayer(player);
		if(result) {
			list.set(index, new FootballPlayer(id, player.getName(),player.getPosition(),player.getBackNumber()));
		}
		
	}
	private int indexOf(int id) {
	int index = -1;
	for(int i = 0; i < list.size(); i++) {
		if(list.get(i).getId() == id) {
			index = i;
			break;
		}
	}
	return index;
	}
	
	/*
	public String deleteFootballPlayer(int id) {
		int index = indexOf(id);
		if(index != -1) {
			list.remove(index);
		}
	}
	
	*/
	
	
	
	
	private boolean validateFootballPlayer(FootballPlayerDto fpd) {
		if(fpd != null && fpd.getName().length() >= 2) {
			if("공격수".equals(fpd.getPosition())|| fpd.getPosition().equals("공격수") || fpd.getPosition().equals("미드필더")||
			fpd.getPosition().equals("수비수")|| fpd.getPosition().equals("골키퍼")){
			if(fpd.getBackNumber() >= 0) {
				
				return true;
				}
				
			}
		
		}
		return false;
	}
	
	
	public void outputFootballPlayer() {
		new FootballPlayerDao().outputFootballPlayer(list);
		
	}
	
	public List<FootballPlayer> findByKeyword(String keyword) {
		// 검색 => 찾아서
		// 사용자가 입력한 keyword가 포함된 Footballplayer의 name필드값을
		// 하나하나 순화하면서 전부다 검사를해서 만약에 name필드값에
		// 사용자가 입력한 keyword가 포함되어 있다면 이 VO객체의 주소값을
		// 전부다 View로 반환 해주어야하는데
		// 이게 하나도 없을 수도 있는데 엄처 많을 수도 있음
		// 검색결과가 == 1개일 수있음
		// 검색결과가 == 2개일 수 있음
		// 검색결과가 == 0개일 수 있음
		// 검색결과가 == 알 수 가 없음
		// 저장소 == 배열[], List, Map, Set
		//  저장값이 얼마인지 몰라서 배열 X
		// Map은 반복 돌리기 애매모호 하다 △
		// Set : 정렬의 의미가 없어 지기 때문에 △
		// List : 검색할때 정렬기준이 달려있고 O
		
		
		// boolean result = list.get(0).getName().contains(keyword); // list.get(0) => VO객체의 주소값
		//System.out.println(result);							  // getName() => StringPool에서 참조
		
		List<FootballPlayer> searched = new ArrayList();
		for(FootballPlayer player : list) {
			if(player.getName().contains(keyword)) {
				searched.add(player);// 앏은 복사
			}
			
			
		}
		
		return searched; // controller로 리턴한다
		
		
	}
	
	
	
}
