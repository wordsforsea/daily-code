package top.xzit01;

public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		
		my1.setName("��ѧ");
		my2.setName("����");
		my1.start();
		my2.start();//��һ��ʵ���˶��߳�
		System.out.println(Thread.currentThread().getName());
	}
}
