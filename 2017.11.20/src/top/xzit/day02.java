package top.xzit;

import java.util.Scanner;
//int �޷��洢һЩֵ������long�Ľ���һ���Ե�22�������
public class day02 {
	public static void main(String[] args) {
		System.out.println("�׳˼�����");
		System.out.println("-----------------------");
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
	    for(;;) {
	    	System.out.println("����250��ʾ�����ó���");
	    	System.out.println("����һ�������������Ľ׳˻����˳�");
	    	n = sc.nextInt();
	    	if(n==250) {
	    		System.exit(0);
	    	}
	    	System.out.println(jieCheng(n));
	    	
	    }
		}
	public static int jieCheng(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*jieCheng(n-1);
		}
	}
}
