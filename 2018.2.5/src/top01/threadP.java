package top01;

import java.util.Date;

public class threadP extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int x = 0; x<100;x++) {
			System.out.println(getName()+":"+x+"Ê±¼ä:"+ new Date());
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}
}
