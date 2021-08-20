package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 {

	public static void main(String[] args) {
		// j프레임 - 기본 틀을 만드는 것이다
		JFrame frame = new JFrame("TEST");
		
		//프레임 위에 까는거(방바닥 위에 장판을 덮은 것 같음 > 이제 가구들(라벨)을 올릴 수 있음)
		Container c = frame.getContentPane();
		JLabel label = new JLabel("Hello GUI");		
		c.add(label);
		
		//위치 지정
		frame.setLocation(1000,200);//가로 세로위치
		
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack();//설정값 적용
		
		Font font = new Font(null,Font.ITALIC,32); //글꼴, 형태,크기
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		//기본틀을 시작함 / 세팅한것들을 보여줌
		frame.setVisible(true);
		
		//창의 x를 누르면 시스템도 같이 꺼짐
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i=0;;i++)
		label.setText(i+"안녕하세요");//글자 넣기
	}

}
