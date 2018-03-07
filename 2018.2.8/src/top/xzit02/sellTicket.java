package top.xzit02;

public class sellTicket implements Runnable {
	private int ticket = 100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+"正在售出第"+(ticket--)+"票");
			
			}
		}
	}

}
