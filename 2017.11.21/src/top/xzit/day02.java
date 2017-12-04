package top.xzit;

public class day02 {
	public static void main(String[] args) {
		
	System.out.println(tuZi(20));
	
	}
	public static int tuZi(int n) {
		if(n==1||n==2) {
			return 1;
			
		}else {
			return tuZi(n-1)+tuZi(n-2);
		}
	}
}
