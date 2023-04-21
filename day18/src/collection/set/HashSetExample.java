package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// 제네릭으로 내부 자료형을 결정
		Set<String> set = new HashSet<>();
		
		// add() : set에 객체를 추가
		set.add("후라이드");
		set.add("김밥");
		set.add("뼈해장국");
		set.add("멸치국수");
		set.add("황금족발");
		
		// size() : set에 저장된 객체의 수
		System.out.println("set에 저장된 객체의 수 : " + set.size());
		System.out.println(set);
		
		/*
		 * set의 객체 데이터를 사용하려면, 반복자(Iterator)를 통해
		 * 모든 객체를 대상으로 한 번씩 반복해서 꺼내야 함
		 */
		Iterator<String> iter = set.iterator(); // set을 반복할 수 있도록 처리
		
		/*
		 * 반복자 객체가 next() 메서드를 통해 set 내부의 데이터를 반복해서 소진할 때
		 * 더 이상 조회할 데이터가 없다면 예외를 발생시키므로
		 * hasNext()를 이용해 더 이상 소모할 데이터가 있는지 여부를 확인
		 */
		while(iter.hasNext()) {
			String s = iter.next();
			if(s.equals("멸치국수")) {
				System.out.println(s);
				break;
			}
		}
		
	//	for(int i = 0; i < 5; i++) {
	//		System.out.println(iter.next());
	//	}
		
		// remove(), clear() : set의 내부 데이터 삭제
		set.remove("김밥");
		System.out.println(set);
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("set이 빔");
		}else {
			System.out.println("set이 아직 있음");
		}
		System.out.println(set);
		
	}
}
	
