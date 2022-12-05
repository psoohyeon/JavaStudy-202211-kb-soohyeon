package j20_함수형인터페이스;

public class Main1 {
	public static void main(String[] args) {
		int a = 10;

		Runnable application1 = () -> { // 메소드안에서 메소드를 정의
			// 매개변수가 딱 1개 일때만 생략가능 ()안에 비어있어도 생략이 안됨
			System.out.println("프로그램을 시작합니다.");
			System.out.println("a: " + a);
		};

		application1.run();
//		
//		Runnable timer = () -> {
//			for(int i = 0; i < 100; i++) {
//				try {
//					System.out.println(i + " : " + (i + 1));
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		};

		Thread t1 = new Thread();
		{
			for (int i = 0; i < 100; i++) {
				try {
					System.out.println("채팅기능");
					System.out.println(i + " : " + (i + 1));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		;

		Thread t2 = new Thread();
		{
			for (int i = 0; i < 100; i++) {
				try {
					System.out.println("알림 기능");
					System.out.println(i + " : " + (i + 1));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		;

		t1.start();
		t2.start();
	}

}
