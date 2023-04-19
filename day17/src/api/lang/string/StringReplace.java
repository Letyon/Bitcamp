package api.lang.string;

public class StringReplace {

	public static void main(String[] args) {
		// 자바 15버전부터 멀티라인 문자열을 지원
		// 자바 문자열은 여닫는 "를 한 줄에 작성
		// String a = "가나다라";(허용)
		// String b = "가나다라
		//             마바사";(허용 안 함)"
		
		// 여닫는 따옴표를 여러 줄에 걸쳐서 작성할 때는 """ 세 개를 이용
		String notice = """
				이차늬의 암기사항
				1. 파이썬
				2. 자바
				3. C언어
				4. 삽삭갱/단통시인/원자성격리성일관성 등
				""";   	
		
		System.out.println(notice);
		// replace()는 String을 리턴하고, 첫 단어를 두 번째 단어로 바꾸기
		String newNotice = notice.replace("파이썬", "자바");
		System.out.println(newNotice);
	}

}
