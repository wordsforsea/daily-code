package top.xzit;
//不死神兔
//找规律 1，1，2，3，5，8，13，21.。。。。。。
public class day01 {
	public static void main(String[] args) {
		int[] arr = new int[20];
		arr[0]=1;
		arr[1]=1;
		for(int x=2;x<arr.length;x++) {
			arr[x] = arr[x-2]+arr[x-1];
		}
		System.out.println(arr[19]);
		
		
		int a = 1;
		int b = 1;
		for(int x=1;x<19;x++) {
			int temp=a;
			a=b;
			b=temp+b;
		}
		System.out.println(b);
	}
}
