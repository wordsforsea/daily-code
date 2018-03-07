package top.xzit01;

public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		
		my1.setName("大学");
		my2.setName("高中");
		my1.start();
		my2.start();//第一次实现了多线程
		System.out.println(Thread.currentThread().getName());
	}
}
