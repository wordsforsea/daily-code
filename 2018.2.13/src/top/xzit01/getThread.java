package top.xzit01;

public class getThread implements Runnable {
	student s = new student();
	//重写构造方法
	public getThread(student ss) {
		this.s=ss;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized (s) {
				if(!s.flag) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(s.name+"-----"+s.age);
				s.flag=false;
				s.notify();
				
			}
		
		}
	}

}
