package day15_Thread;

class A02 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("A02 : " + i);
		}
	}
}

class B02 extends Thread {
	// Thread�ȿ� run�̶�� �޼ҵ尡 �ִ� ��(�װ� ���� �������̵� ��)
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
		// Thread�� �̿��ؼ� �����ӵ��� a�� b�� �����ư����� ������
		// ������ ������� ó���ϰ� �ٸ��� ó���ϰ�(�� �ݺ�)

		// ���� ������� �� 3��(main, A02, B02)

		// setDaemon�� main�� thread�� ������ �ٸ� �����嵵 �����ּ�����ǹ�.
		/*
		 * :�� �����尡 ������ �� �������� setDaemon(true)�� ȣ��
		 * 
		 * : �ݵ�� start() �޼ҵ� ȣ������ setDaemon(true)�� ȣ��
		 */
		a2.setDaemon(true);
		b2.setDaemon(true);

		a2.start();
		b2.start();

		System.out.println("���α׷��� �����մϴ�");
		System.out.println("���α׷��� �����մϴ�");
		System.out.println("���α׷��� �����մϴ�");
	}

}
