package top01;

public class threadDemo {
	public static void main(String[] args) {
		threadP tp1 = new threadP();
		threadP tp2 = new threadP();
		threadP tp3 = new threadP();
		tp1.setName("���������");
		tp2.setName("������ĺܰ�");
		tp3.setName("��ȷʵ�ܰ�");
		
		tp1.setPriority(10);
		tp2.setPriority(5);
		tp3.setPriority(7); 
		
		tp1.start();
		try {
			tp1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tp2.start();
		tp3.start();
	}
}
