package example.thread3;

public class MainClass {
	
	public static void main(String[] args) {
		// Runnable 구현체를 따로 선언하기 귀찮다면, 익명 클래스 생성으로 대체 가능
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println("스레드 1번 간다.");
				}
			}
			
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println("스레드 2번 간다.");
				}		
			}
		});
		System.err.println("------------------");
		System.err.println("메인 스레드 시작");
		t1.start();
		t2.start();
		System.out.println("메인은 끝났습니다.");
	}
}
