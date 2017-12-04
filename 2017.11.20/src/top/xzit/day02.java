package top.xzit;

import java.util.Scanner;
//int 无法存储一些值可以用long改进，一次试到22出现溢出
public class day02 {
	public static void main(String[] args) {
		System.out.println("阶乘计算器");
		System.out.println("-----------------------");
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
	    for(;;) {
	    	System.out.println("输入250表示结束该程序");
	    	System.out.println("输入一个数来计算他的阶乘或者退出");
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
