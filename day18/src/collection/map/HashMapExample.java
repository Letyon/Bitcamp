package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	
	public static void main(String[] args) {
		// Map<key, value>
		Map<String, Integer> map = new HashMap<>();
		
		// Map에 객체를 저장 put(key, value)
		map.put("호두과자", 3000);
		map.put("델리만쥬", 5000);
		map.put("피카츄돈까스", 1500);
		// 중복 key를 넣으면, 가장 마지막에 넣은 하나만 적용됨
		map.put("호두과자", 4000);
		
		System.out.println(map);
		
		// Map에 저장된 key, value 쌍(entry) 개수 측정 size()
		System.out.println(map.size());
		
		// Map에 저장된 value값을 key값으로 얻기 get(key)
		int price = map.get("델리만쥬"); // Integer price = map.get("델리만쥬")도 가능
		System.out.println("델리만쥬의 가격 : " + price + "원");
		
		// Map에서 key를 전부 추출하기
		// 앞서 배운 set 형식으로 추출
		Set<String> kSet = map.keySet();
		System.out.println(kSet);
		
		// Iterator로 변경해서 저장
		Iterator<String> iter = kSet.iterator(); // set에서 배운 거 복습
		System.out.println();
		
		// Iterator를 while문으로 반복시켜, 모든 메뉴의 가격을 콘솔에 찍어보기
		while(iter.hasNext()) {
			String menu = iter.next();
			System.out.println(menu + "의 가격은 " + map.get(menu) + "원");
		}
		
		String food = "타코야끼";
		
		if(map.containsKey(food)) {
			System.out.println("우리식당 " + food + " 팝니다.");
		}else {
			System.out.println("우리식당 " + food + " 안 팝니다.");
		}
		
		// Map 내부 데이터 단일데이터 삭제 remove(key)
		// 일치하는 key값의 entry 한 쌍을 삭제
		map.remove("피카츄돈까스");
		System.out.println(map);
		
		// Map 내부 전체 데이터 일괄삭제 clear()
		map.clear();
		System.out.println(map);
		
		if(map.isEmpty()) {
			System.out.println("비어 있는 Map");
		}else {
			System.out.println("아직 있는 Map");
		}
		
	}

}
