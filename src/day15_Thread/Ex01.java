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
		 * - ���α׷��� ���۽�Ű�� ���� �ּҴ��� 
		 * - �������� ���α׷��� process��� �Ѵ�
		 * 
		 * -�����尡 �ϳ� ������ �ѹ��� ���پ��� �����ų���ִ�.
		 */
		A01 a = new A01();
		B01 b = new B01();
		a.run();//�̰� �۵��ϴµ��� ������ �Ͻ�����(���� �����尡 1���ϱ�)
		b.run();
		
		
	}

}
