package top.xzit01;

public class MyThread extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			//super.run();
			for(int x = 0;x<200;x++) {
				System.out.println(getName()+":"+ x);
			}
		}
}
