package top.xzit01;

public class studentDemo {
	public static void main(String[] args) {
		student s = new student();
		
		getThread gt = new getThread(s);
		setThread st = new setThread(s);
		
		Thread t1 = new Thread(st, "��ȡ");
		Thread t2 = new Thread(gt, "����");//�����ò����߳�������Ϊ��������û��Ϊʲô
		
		t1.start();
		t2.start();
	}
}
