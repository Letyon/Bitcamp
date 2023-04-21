package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapLoginQuiz {

	public static void main(String[] args) {
		/*
		 * <로그인 입력값 검증>
		 * 
		 * 1. 입력한 아이디가 맵에 입력된 키값에 해당하는 지 여부 체크(containsKey 메서드)
		 * 2. 맵에 입력된 키값이 맞다면, 비밀번호 값과 비교 후,
		 * -> 비밀번호도 일치하면, "로그인 성공"을 콘솔에 출력하고 반복문 탈출
		 * -> 비밀번호가 다르다면, "비밀번호 틀렸습니다."를 콘솔에 출력
		 * 3. 입력한 아이디가 맵에 입력된 키값이 아니라면, "아이디가 존재하지 않습니다."를 콘솔에 출력
		 * 
		 * 문제 : Scanner 이용하여, 아이디/비밀번호 입력 -> HashMap에 저장
		 * 		그리고 입력이 완료되면, Id와 Pw를 다시 물어보고 로그인 입력값 검증대로 수행하는 코드 작성
		 */
		
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		
		System.out.println("아이디를 설정해주세요.");
		String id = scan.next();
		
		System.out.println("비밀번호를 설정해주세요.");
		Integer pw = scan.nextInt();
		
		map.put(id, pw);
		// map에 id, pw의 초기 설정값이 저장되어 있음
		// 다시 입력했을 때, 맞다면/아니라면 ??
		
		// Set<String> kSet = map.keySet();
		
		System.out.println("아이디를 입력해주세요.");
		String id2 = scan.next();
		System.out.println("비밀번호를 입력해주세요.");
		Integer pw2 = scan.nextInt();
		
		while(true) {
			if(map.containsKey(id2) && map.containsValue(pw2)) {
				System.out.println("로그인 성공");
				break;
			}else if(map.containsKey(id2)) {
				System.out.println("비밀번호 오류");
				System.out.println("비밀번호 재입력");
				pw2 = scan.nextInt();
			}else {
				System.out.println("아이디가 존재안함");
				id2 = scan.next();
			}
		}
     }
}



		
		
		
		
