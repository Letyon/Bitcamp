package api.lang.system;

public class SystemTimeExample {

	public static void main(String[] args) {
		
		/*
		 * - currentTimeMillis()와 nanoTime() 메서드는
		 * Unix 시간이라는 체계 사용
		 * - Unix 시간이란 1970년 1월 1일 00시 00분 00초를 기점으로
		 * 얼마만큼의 시간이 지났는지 숫자로 표현하는 체계
		 * - 현재까지의 시간을 1000분의 1초로 변환한 epoch시간과
		 * 현재까지의 시간을 10억분의 1초로 변환한 epoch시간을 long타입으로 리턴
		 */
		
		long start = System.currentTimeMillis(); // 메서드의 리턴 타입이 long
		long sum = 0;
		
		for(long i = 1; i < 1000000L; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println("계산에 소요된 시간 : " + (end - start));

	}

}
