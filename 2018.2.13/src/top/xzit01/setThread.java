package top.xzit01;

public class setThread implements Runnable {
	student s = new student();
	int x = 0;
	//��д���췽��
	public setThread(student ss) {
		this.s=ss;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized(s) {
				if(s.flag) {
					//s.flag��true������Ҫ�ȴ���������
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}//if����
				if(x%2==0) {
					s.age=120;
					s.name="δ��";
				}else {
					s.age=21;
					s.name="��ȥ";
				}
				x++;
				s.flag=false;
				s.notify();
			}
		}
	}

}
