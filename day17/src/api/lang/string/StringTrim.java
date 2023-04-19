package api.lang.string;

public class StringTrim {
	
	public static void main(String[] args) {
		
		String trimBefore = "    ㅇㅇ    ";
		System.err.println(trimBefore);
		String trimAfter = trimBefore.trim();
		System.out.println(trimAfter);
	
	}

}
