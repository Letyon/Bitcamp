package api.lang.string;

public class StringIndexOf {

	public static void main(String[] args) {
		// 특정 문자열의 시작 인덱스값을 반환
		String to = "tomatoes";
		
		// 단일 파라미터로 조회만 할 경우, 0번에서 제일 가까운 단어 하나만 조회
		System.out.println(to.indexOf("to"));
		
		// 두 번째 파라미터로 조회할 경우, 시작 파라미터를 지정할 수 있음
		System.out.println(to.indexOf("to",1));
		
		// 없는 단어 조회시 -1이 나옴
		System.out.println(to.indexOf("na"));
	}

}
