package day15_Thread;

class A02 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("A02 : " + i);
		}
	}
}

class B02 extends Thread {
	// Thread안에 run이라는 메소드가 있는 듯(그걸 지금 오버라이딩 함)
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("B02 : " + i);
		}
	}
}

public class Ex02 {
	public static void main(String[] args) {
		A02 a2 = new A02();
		B02 b2 = new B02();
		// Thread를 이용해서 빠른속도로 a와 b를 번갈아가변서 실행중
		// 빠르게 어느정도 처리하고 다른거 처리하고(를 반복)

		// 현재 스레드는 총 3개(main, A02, B02)

		// setDaemon은 main의 thread가 끝나면 다른 스레드도 끝내주세요란의미.
		/*
		 * :주 스레드가 데몬이 될 스레드의 setDaemon(true)을 호출
		 * 
		 * : 반드시 start() 메소드 호출전에 setDaemon(true)을 호출
		 */
		a2.setDaemon(true);
		b2.setDaemon(true);

		a2.start();
		b2.start();

		System.out.println("프로그래을 종료합니다");
		System.out.println("프로그래을 종료합니다");
		System.out.println("프로그래을 종료합니다");
	}

}
