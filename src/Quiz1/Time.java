package Quiz1;

import java.text.*;
import java.util.Date;

public class Time {
	private Date date;
	private SimpleDateFormat simpl;
	
	
	public String getDate() {
		return simpl.format(date);
	}

	public void setDate() {
		date = new Date();
		simpl =new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초 ");
		
	}
	public Time() {
		for(int i=0;i<10;i++) {
			setDate();
			String s = getDate();
			System.out.println((i+1)+": "+s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


}
