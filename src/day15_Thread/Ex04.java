package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 {

	public static void main(String[] args) {
		// j������ - �⺻ Ʋ�� ����� ���̴�
		JFrame frame = new JFrame("TEST");
		
		//������ ���� ��°�(��ٴ� ���� ������ ���� �� ���� > ���� ������(��)�� �ø� �� ����)
		Container c = frame.getContentPane();
		JLabel label = new JLabel("Hello GUI");		
		c.add(label);
		
		//��ġ ����
		frame.setLocation(1000,200);//���� ������ġ
		
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack();//������ ����
		
		Font font = new Font(null,Font.ITALIC,32); //�۲�, ����,ũ��
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		//�⺻Ʋ�� ������ / �����Ѱ͵��� ������
		frame.setVisible(true);
		
		//â�� x�� ������ �ý��۵� ���� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i=0;;i++)
		label.setText(i+"�ȳ��ϼ���");//���� �ֱ�
	}

}
