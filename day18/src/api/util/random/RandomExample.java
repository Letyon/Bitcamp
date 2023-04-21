package api.util.random;

import java.util.Random;

public class RandomExample {
	
	public static void main(String[] args) {
		Random ra = new Random();
		
		// nextDouble() : 0.0 ~ 1.0미만의 실수 난수를 리턴
		double d = ra.nextDouble();
		System.out.println("실수 랜덤값 : " + d);
		
		// nextBoolean() : true or false 리턴
		boolean b = ra.nextBoolean();
		System.out.println("논리 랜덤값 : " + b);
		
		// nextInt() : 정수 랜덤값을 리턴(정수 int가 저장할 수 있는 모든 범위에서 난수 발생)
		int i = ra.nextInt();
		System.out.println("정수 랜덤값 : " + i);
		
		// 정수 0 ~ 10미만의 난수 발생
		int j = ra.nextInt(10);
		System.out.println("정수(0~9) : " + j);
		
		// 정수 1 ~ 11미만의 난수 발생
		int k = ra.nextInt(10) + 1;
		System.out.println("정수(1~10) : " + k);
	}

}
