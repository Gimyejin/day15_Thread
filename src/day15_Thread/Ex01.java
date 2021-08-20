package day15_Thread;
class A01{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("A01 : " + i);
		}
	}
}
class B01 {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("B01 : " + i);
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * Thread 
		 * - 프로그램을 동작시키기 위한 최소단위 
		 * - 동작중인 프로그램을 process라고 한다
		 * 
		 * -스레드가 하나 있으면 한번에 한줄씩만 실행시킬수있다.
		 */
		A01 a = new A01();
		B01 b = new B01();
		a.run();//이거 작동하는동안 메인은 일시중지(현재 쓰레드가 1개니깐)
		b.run();
		
		
	}

}
