package Quiz1;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends Thread{
	Date date;
	SimpleDateFormat simpl;

	public void run() {
		JFrame jframe = new JFrame("time");
		Container c = jframe.getContentPane();
		JLabel label = new JLabel("test");
		c.add(label);

		jframe.setLocation(1000, 200);
		jframe.setPreferredSize(new Dimension(500, 200));
		jframe.pack();// 크기 변경한거 적용함

		Font font = new Font(null, 0, 40);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);

		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i=0;;i++) {
			label.setText(time());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public String getDate() {
		return simpl.format(date);
	}

	public void setDate() {
		date = new Date();
		simpl = new SimpleDateFormat("aa hh시 mm분 ss초 ");

	}
	public String time() {
		
			setDate();
			String s = getDate();
			return s;
		
	}

}
