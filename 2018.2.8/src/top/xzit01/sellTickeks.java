package top.xzit01;
//���̵߳ĵ�һ�ַ�ʽ
public class sellTickeks extends Thread {
	private static int ticket = 100;//��Ϊ��̬��Ŀ����Ϊ����һ�������ڴ� 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		while(true) {
			if(ticket>0) {
				System.out.println(getName()+"�����۳���"+(ticket--)+"Ʊ");
			
			}
		}
	}
}
