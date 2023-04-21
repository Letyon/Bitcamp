package example.thread;

// 주 스레드 역할을 할 클래스
public class MainThread {

	public static void main(String[] args) {
		// 보조 스레드 실행을 위해서는 먼저 Thread 객체를 생성해야 함
		
		// 1. Runnable 구현체를 생성해 주세요.
		Runnable trd = new MultiThread();
		
		// 2. Thread 클래스의 인스턴스를 생성해 주세요.
		Thread sTrd = new Thread(trd);
		
		System.out.println("보조스레드 준비 완료!");
		// 3. 보조스레드는 .run()으로 호출 가능
		sTrd.start();
		System.out.println("먼저 끝날지 알 수 없는 메인 스레드");

		}

}
