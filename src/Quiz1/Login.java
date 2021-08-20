package Quiz1;

import java.util.Scanner;

public class Login extends Win7{

	public Login() {
		Scanner input = new Scanner(System.in);
		member ex = new member();
		int num = 0;
		String inputId = null;
		String inputPw = null;
		Frame frame = new Frame();
		
		while (true) {
			System.out.println("1.로그인 2.가입 3.로그아웃");
			System.out.println(">>>");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.print("아이디: ");
				inputId = input.next();
				System.out.print("비밀번호: ");
				inputPw = input.next();
				if (ex.getId() == null)
					//가입이 안되어있을때
					System.out.println("회원가입을 해주세요.");
				else if (ex.getId().equals(inputId) && ex.getPw().equals(inputPw)) {
					//로그인 성공
					System.out.println("로그인 성공");
					start();
					frame.run();
				} else if (ex.getId().equals(null))
					//로그인 실패
					System.out.println("로그인 실패");
				break;
			case 2:
				System.out.print("가입 id: ");
				inputId = input.next();
				if (ex.getId() == null) {
					// 아이디가 없을때
					System.out.print("가입 pw: ");
					inputPw = input.next();

					ex.setId(inputId);
					ex.setPw(inputPw);
					System.out.println("저장 완료");

				} else if (ex.getId().equals(inputId)) {
					// 아이디가 같을 때
					System.out.println("이미 가입된 아이디입니다.");
				} else {
					// 아이디가 있지만 다를때
					System.out.print("가입 pw: ");
					inputPw = input.next();

					ex.setId(inputId);
					ex.setPw(inputPw);
					System.out.println("저장 완료");
				}
				break;
			case 3:
				System.out.println("로그아웃 합니다.");
				;
				System.exit(1);
				;
			}

		}

	}

}
