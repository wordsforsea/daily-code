package top.xzit01;

public class setThread implements Runnable {
	student s = new student();
	int x = 0;
	//重写构造方法
	public setThread(student ss) {
		this.s=ss;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized(s) {
				if(s.flag) {
					//s.flag是true所以需要等待，有数据
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}//if结束
				if(x%2==0) {
					s.age=120;
					s.name="未来";
				}else {
					s.age=21;
					s.name="过去";
				}
				x++;
				s.flag=false;
				s.notify();
			}
		}
	}

}
