package top.xzit01;

public class sellTickeksDemo {
	public static void main(String[] args) {
		sellTickeks at1 = new sellTickeks();
		sellTickeks at2 = new sellTickeks();
		sellTickeks at3 = new sellTickeks();
		
		at1.setName("����1");
		at2.setName("����2");
		at3.setName("����3");
		
		at1.start();
		at2.start();
		at3.start();
	}
}
