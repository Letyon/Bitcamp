package example.thread;

// 보조 쓰레드에서 실행할 내용을 정의하기 위해서
// 1. Runnable 인터페이스를 구현

public class MultiThread implements Runnable {

	// 2. Runnable 인터페이스의 run()메서드를 오버라이딩해 실행할 내용 적기
	@Override
	public void run() {
		// 여태까지 코드는 순차적으로 쉬는 시간 없이 실행되었음
		// Thread.stop(초); 는 해당 스레드 실행을 입력한 초만큼 중단
		// 스레드 중지는 try~catch 블록에 반드시 넣기
		try {
		System.out.println("보조쓰레드 : 실행1");
		Thread.sleep(1000);
		System.out.println("보조쓰레드 : 실행2");
		Thread.sleep(1000);
		System.out.println("보조쓰레드 : 실행3");
		Thread.sleep(1000);
		System.out.println("보조쓰레드 : 실행4");
		Thread.sleep(1000);
		System.out.println("보조쓰레드 : 실행5");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
