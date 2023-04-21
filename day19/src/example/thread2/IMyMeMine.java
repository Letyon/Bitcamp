package example.thread2;

public class IMyMeMine {

	public static void main(String[] args) {
		
		Runnable prt = new Printer();
		Runnable alrm = new AlarmMachine();
		
		Thread prtThread = new Thread(prt);
		Thread alrmThread = new Thread(alrm);
		
		System.out.println("저녁 드세요~~");
		System.out.println("프린터 뽑으세요~~~");
		prtThread.start();
		alrmThread.start();
		
		try {
			System.out.println("밥을 합니다~~");
			Thread.sleep(3000);
			System.out.println("밥을 합니다~~");
			Thread.sleep(3000);
			System.out.println("밥 completed");
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("배식하고 설거지까지 완료");
		
	}

}
