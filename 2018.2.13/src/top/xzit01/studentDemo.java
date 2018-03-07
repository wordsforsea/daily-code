package top.xzit01;

public class studentDemo {
	public static void main(String[] args) {
		student s = new student();
		
		getThread gt = new getThread(s);
		setThread st = new setThread(s);
		
		Thread t1 = new Thread(st, "获取");
		Thread t2 = new Thread(gt, "设置");//根本用不上线程名，因为。。。。没有为什么
		
		t1.start();
		t2.start();
	}
}
