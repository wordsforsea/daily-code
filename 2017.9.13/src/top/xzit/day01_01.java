package top.xzit;

public class day01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try {
		System.out.println(a/b);
		}catch(ArithmeticException ae) {
			System.out.println("除数不能为零");
		}

	}

}
