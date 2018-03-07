package top.xzit01;
//多线程的第一种方式
public class sellTickeks extends Thread {
	private static int ticket = 100;//设为静态的目的是为了先一步进入内存 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		while(true) {
			if(ticket>0) {
				System.out.println(getName()+"正在售出第"+(ticket--)+"票");
			
			}
		}
	}
}
