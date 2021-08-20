package Quiz1;

import java.io.IOException;
import java.util.Scanner;

public class Win7 extends Thread {
	Scanner input = new Scanner(System.in);
	private int num;
	private String func;
	Time time = new Time();
	
	public void run() {
		
		System.out.println("==== 환 영 합 니 다 ====");
		while (true) {
			System.out.println("1.기능\t2.off");
			System.out.print("입력 >>> ");
			num = input.nextInt();
			switch (num) {
			case 1:
				numberOne();
				break;
			case 2:
				System.out.println("시스템을 종료합니다.");;
				System.exit(1);
			}
		}
	}

	public void numberOne() {
		System.out.println("[사용 가능한 기능]");
		System.out.println("1 : 메모장");
		System.out.println("2 : 계산기");
		System.out.print("사용할 기능 입력: ");
		func = input.next();
		switch (func) {
		case "메모장":
			note();
			break;
		case "계산기":
			calc();
			break;
		default:
			System.out.println("없는 기능입니다");
			break;
		}
	}

	private void note() {
		ProcessBuilder pro = new ProcessBuilder("notepad");
		try {
			pro.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void calc() {
		ProcessBuilder pro = new ProcessBuilder("calc");
		try {
			pro.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
